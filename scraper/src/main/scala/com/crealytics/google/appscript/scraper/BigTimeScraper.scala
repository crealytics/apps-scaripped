package com.crealytics.google.appscript.scraper

import com.crealytics.google.appscript.api._
import com.crealytics.google.appscript.scraper._
import com.crealytics.google.appscript.parser._
import com.crealytics.google.appscript.codegen._
import net.ruippeixotog.scalascraper.browser.Browser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import org.jsoup.Jsoup
import org.jsoup.nodes._
import org.jsoup.select._
import java.nio.file.{Files, Paths}
import java.nio.charset.StandardCharsets

import ammonite.ops.{RegexContextMaker => _, _}
import com.crealytics.google.appscript.codegen.CodeGenerator
import net.ceedubs.ficus.Ficus._
import net.ceedubs.ficus.readers.ArbitraryTypeReader._

object BigTimeScraper extends App {
  if (args.length < 1)
    throw new IllegalArgumentException("Provide the path in which sources should be generated")
  import com.typesafe.config.ConfigFactory
  case class Replacement(input: String, output: String)
  case class ClassModification(className: String, modification: String, argument: String)
  case class ImportLink(
    url: String,
    pkg: String = "",
    imports: Seq[String] = Seq(),
    scraperClass: String = "GoogleAppScriptClassScraper",
    extraClasses: Seq[ApiClass] = Seq(),
    classModifications: Seq[ClassModification] = Seq(),
    replacements: Seq[Replacement] = Seq()) {
    def scraper = {
      import scala.reflect.runtime.universe
      val runtimeMirror = universe.runtimeMirror(getClass.getClassLoader)
      val module = runtimeMirror.staticModule(scraperClass)
      val obj = runtimeMirror.reflectModule(module)
      obj.instance.asInstanceOf[ApiScraper]
    }
  }
  def loadConfigs: Map[String, ImportLink] = {
    val conf = ConfigFactory.load()
    conf.as[Map[String, ImportLink]]("scraping")
  }
  val scrapingConfigs = loadConfigs
  def allFromPackage(pkg: String) = s"$pkg._"
  val chosenApis = if(args.length < 2)
    scrapingConfigs.values.toList
  else
    args(1).split(",").map(scrapingConfigs).toList
  scrapeOverviewUrls(chosenApis.sortBy(_.url), args(0))
  def scrapeAndCache(url: String, cacheDir: Path) = {
    val pageName = url.split("/").last
    val cacheFilePath = cacheDir / pageName
    if(exists(cacheFilePath)) {
      println(s"Using cached file $cacheFilePath")
      Jsoup.parse(read(cacheFilePath))
    } else {
      println(s"Scraping $url")
      val browser = new Browser
      val scrapedDoc = browser.get(url)
      write.over(cacheFilePath, scrapedDoc.toString)
      scrapedDoc
    }

  }
  implicit class Regex(sc: StringContext) {
    def r = new util.matching.Regex(sc.parts.mkString, sc.parts.tail.map(_ => "x"): _*)
  }
  def scrapeOverviewUrl(importLink: ImportLink, cacheDir: Path) = {
    import importLink._
    val ovDoc = scrapeAndCache(url, cacheDir)
    val detailPages = scraper.scrapeOverview(ovDoc).distinct.sorted
    val basePage = new java.net.URL(url)
    detailPages.par.flatMap { dp =>
      import basePage._
      val subUrl = dp match {
        case r"^/.*" => getProtocol + "://" + getHost +
          (if (getPort == -1) "" else ":" + getPort) + dp
        case r"^http.*" => dp
        case _ => url + dp
      }
      scala.util.Try {
        val doc = scrapeAndCache(subUrl, cacheDir)
        scraper.scrapeClass(doc)
      }.toOption
    }
  }


  def scrapeOverviewUrls(overviewUrls: List[ImportLink], path: String): Unit = {
    println(s"Scraping the following API URLs:\n${overviewUrls.map(_.url).mkString("\n")}")
    val wd = path.replaceFirst("^/", "").split("/").foldLeft(root)(_ / _)
    //rm ! wd
    val cacheDir = wd / ".." / "resources"
    mkdir! cacheDir

    overviewUrls.par.foreach { importLink =>
      import importLink._
      val classes = scrapeOverviewUrl(importLink, cacheDir)
      val existingClasses = new ApiParser(wd).readClasses
      val groupedClasses = (classes ++ importLink.extraClasses).toSeq.groupBy(_.name).values.map(_.toList.distinct)
      groupedClasses.filterNot(_.isEmpty).foreach(cs => persistWith(write.over(_, _))(generateCode(cs, importLink, existingClasses), wd, pkg + "." + cs.head.name))
    }
  }

  def generateCode(classes: Seq[ApiClass], importLink: ImportLink, existingClasses: Seq[ApiClass] = Seq.empty): String = {
    val classesByName = existingClasses.map(c => (c.name, c)).toMap
    import importLink._
    val modifiedClasses = classes.flatMap { classToModify =>
      classModifications.foldLeft[Option[ApiClass]](Some(classToModify)) {
        case (None, _) => None
        case (Some(cl), mod) if mod.className.r.findFirstIn(cl.name).isDefined =>
          mod match {
            case ClassModification(_, "removeMethod", methodName) => Some(cl.copy(methods = cl.methods.filterNot(_._1 == methodName)))
            case ClassModification(_, "removeClass", _) => None
            case ClassModification(className, "extends", superClassName) =>
              val cleanedSuperClassName = superClassName.replaceAll("""\[.*?\]""", "")
              val classRegex = className.r
              val classRegex(subName) = cl.name
              val extendsClass = classRegex.replaceFirstIn(cl.name, superClassName)
              val superClass = classesByName(cleanedSuperClassName)
              Some(cl.copy(methods = cl.methods.filterNot { case (methodName, _) => superClass.methods.keys.toSet.contains(methodName)}, parents = cl.parents ++ Seq(extendsClass)))
            case _ => Some(cl)
          }
        case (unmatched, _) => unmatched
      }
    }
    val code = if(modifiedClasses.isEmpty)
      ""
    else
      CodeGenerator.codeForClass(modifiedClasses, pkg, imports.map(allFromPackage))

    replacements.foldLeft(code) { case (cod, rep) => rep.input.r.unanchored.replaceAllIn(cod, rep.output)}
  }

  def persistWith(w: (ammonite.ops.Path, String) => Unit)(code: String, wd: Path, fullClassName: String): Unit = {
    if (code.isEmpty) return ()
    val splitted = fullClassName.split("\\.").toList
    val className = splitted.last
    val spkg = splitted.dropRight(1)
    val path = spkg.foldLeft(wd)(_ / _)
    mkdir ! path
    val filePath = path / s"${className}.scala"
    w(filePath, code)
    println(s"Wrote $filePath")
  }
}
