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

object GoogleAppScriptApiScraper {
  println("Welcome to the Scala worksheet")

  val wd = root / 'Users / 'moe / 'Workspaces / 'bidmanagement / 'google_apps_script_scala_js / 'api / 'src / 'main / 'scala
  rm ! wd
  def allFromPackage(pkg: String) = s"$pkg._"
  case class ImportLink(
    url: String,
    pkg: String = "",
    imports: Seq[String] = Seq(),
    scraper: ApiScraper = GoogleAppScriptClassScraper,
    extraClasses: Seq[ApiClass] = Seq())
  val baseApi = ImportLink(
    url = "https://developers.google.com/apps-script/reference/base/",
    pkg = "com.google.appsscript.base")
  val uiApi = ImportLink(
    url = "https://developers.google.com/apps-script/reference/ui/",
    pkg = "com.google.appsscript.ui")

  val chartsApi = ImportLink(
    url = "https://developers.google.com/apps-script/reference/charts/",
    pkg = "com.google.appsscript.charts",
    imports = Seq(allFromPackage(baseApi.pkg), allFromPackage(uiApi.pkg)))
  val driveApi = ImportLink(
    url = "https://developers.google.com/apps-script/reference/drive/",
    pkg = "com.google.appsscript.drive",
    imports = Seq(allFromPackage(baseApi.pkg)))
  val spreadsheetApi = ImportLink(
    url = "https://developers.google.com/apps-script/reference/spreadsheet/",
    pkg = "com.google.appsscript.spreadsheet",
    imports = Seq(allFromPackage(baseApi.pkg), allFromPackage(chartsApi.pkg), allFromPackage(driveApi.pkg), "java.util.Date"))

  val adwordsApi = ImportLink(
    url = "https://developers.google.com/adwords/scripts/docs/reference/adwordsapp/",
    pkg = "com.google.appsscript.adwords",
    imports = spreadsheetApi.imports ++ List(allFromPackage(spreadsheetApi.pkg), allFromPackage(driveApi.pkg)),
    scraper = GoogleAdWordsScriptScraper,
    extraClasses = Seq(ApiClass("Operation", tpe = "class", methods = Seq(), description = "Unknown type which is not further speficied in API")))

  val overviewUrls = List(
    baseApi,
    chartsApi,
    uiApi,
    spreadsheetApi,
    driveApi,
    adwordsApi)

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
      val code = CodeGenerator.codeForClass(scrapedClass, pkg, imports)
      val spkg = pkg.split("\\.").toList
      val path = spkg.foldLeft(wd)(_ / _)
      mkdir ! path
      val filePath = path / s"${scrapedClass.name}.scala"
      write.over(filePath, code)
      println(s"Wrote $filePath")
    }
  }
}