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

object GoogleAppScriptApiScraper {
  println("Welcome to the Scala worksheet")

  val wd = root / 'Users / 'moe / 'Workspaces / 'bidmanagement / 'google_apps_script_scala_js / 'api / 'src / 'main / 'scala
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

  val conf = ConfigFactory.load()
  val scrapingConfigs = conf.as[Map[String, ImportLink]]("scraping")

  rm ! wd
  def allFromPackage(pkg: String) = s"$pkg._"

  val overviewUrls = scrapingConfigs.values.toList

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
    (importLink.extraClasses ++ classes).foreach { scrapedClass =>
      val code = CodeGenerator.codeForClass(scrapedClass, pkg, imports.map(allFromPackage))
      val spkg = pkg.split("\\.").toList
      val path = spkg.foldLeft(wd)(_ / _)
      mkdir ! path
      val filePath = path / s"${scrapedClass.name}.scala"
      write.over(filePath, code)
      println(s"Wrote $filePath")
    }
  }
}