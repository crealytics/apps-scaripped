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

object GoogleAppScriptApiScraper {
  println("Welcome to the Scala worksheet")
  val overviewUrls = List("https://developers.google.com/apps-script/reference/base/", "https://developers.google.com/apps-script/reference/charts/", "https://developers.google.com/apps-script/reference/spreadsheet/")
  overviewUrls.foreach { url =>
    val detailPages = GoogleAppScriptClassScraper.scrapeOverview(url)
    detailPages.foreach { dp =>
      val scrapedClass = GoogleAppScriptClassScraper.scrapeClass(url + dp)
      println(scrapedClass)
      val code = CodeGenerator.codeForClass(scrapedClass)
      Files.write(Paths.get(s"/Users/moe/Workspaces/bidmanagement/google_apps_script_scala_js/api/src/main/scala/${scrapedClass.name}.scala"), code.getBytes(StandardCharsets.UTF_8))
    }
  }
}