package de.crealytics.google.appscript.scraper

import de.crealytics.google.appscript.api._
import de.crealytics.google.appscript.scraper._
import de.crealytics.google.appscript.codegen._
import net.ruippeixotog.scalascraper.browser.Browser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import org.jsoup.nodes._
import org.jsoup.select._
import java.nio.file.{ Paths, Files }
import java.nio.charset.StandardCharsets
import ammonite.all._
import net.ceedubs.ficus.Ficus._
import net.ceedubs.ficus.readers.ArbitraryTypeReader._

object BigTimeScraper extends App {
  if (args.length < 1)
    throw new IllegalArgumentException("Provide the path in which sources should be generated")
  import com.typesafe.config.ConfigFactory
  case class ImportLink(
    url: String,
    pkg: String = "",
    imports: Seq[String] = Seq(),
    scraperClass: String = "GoogleAppScriptClassScraper",
    extraClasses: Seq[ApiClass] = Seq()) {
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
  def scrapeOverviewUrls(overviewUrls: List[ImportLink], path: String): Unit = {
    println(s"Scraping the following API URLs:\n${overviewUrls.map(_.url).mkString("\n")}")
    val wd = path.replaceFirst("^/", "").split("/").foldLeft(root)(_ / _)
    rm ! wd

    overviewUrls.par.foreach { importLink =>
      import importLink._
      val detailPages = scraper.scrapeOverview(url)
      val basePage = new java.net.URL(url)
      val classes = detailPages.par.map { dp =>
        import basePage._
        val subUrl = if (dp.startsWith("/")) {
          getProtocol + "://" + getHost +
            (if (getPort == -1) "" else ":" + getPort) + dp
        } else {
          url + dp
        }
        println(s"Scraping $subUrl")
        scraper.scrapeClass(subUrl)
      }
      def generateCode(classes: Seq[ApiClass]): String = {
        CodeGenerator.codeForClass(classes, pkg, imports.map(allFromPackage))
      }
      def persistWith(w: (ammonite.ops.Path, String) => Unit)(classes: Seq[ApiClass]): Unit = {
        val code = generateCode(classes)
        val spkg = pkg.split("\\.").toList
        val path = spkg.foldLeft(wd)(_ / _)
        mkdir ! path
        val filePath = path / s"${classes.head.name}.scala"
        w(filePath, code)
        println(s"Wrote $filePath")
      }
      val groupedClasses = (classes ++ importLink.extraClasses).toSeq.groupBy(_.name).values.map(_.toList.distinct)
      groupedClasses.foreach(persistWith(write.over(_, _)))
    }
  }

}
