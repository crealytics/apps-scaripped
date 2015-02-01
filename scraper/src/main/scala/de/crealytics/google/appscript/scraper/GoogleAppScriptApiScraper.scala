package de.crealytics.google.appscript.scraper
import net.ruippeixotog.scalascraper.browser.Browser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import org.jsoup.nodes._
import org.jsoup.select._
import de.crealytics.google.appscript.api._
import scala.util._

object GoogleAppScriptClassScraper {
  def scrapeOverview(url: String): Seq[String] = {
    val browser = new Browser
    val doc = browser.get(url)
    (doc >> elements("table.member.type tr td a")).map(_.attr("href"))
  }
  def scrapeAllFromOverview(url: String): Seq[ApiClass] = {
    val detailUrls = scrapeOverview(url)
    detailUrls.flatMap { du =>
      Try {
        scrapeClass(url + du)
      }.recoverWith {
        case e => Failure(new RuntimeException(s"Could not scrape $du" ))
      }.toOption
    }
  }
  def scrapeClass(url: String): ApiClass = {
    val browser = new Browser
    val doc = browser.get(url)
    val apiClassText = (doc >> element("h1.page-title")).text
    val Array(tpe, apiClassName) = apiClassText.split(" ")
    val classDescription = doc >> text("div.type.doc")
    val methodElements = (doc >?> elementList("div.function.doc"))
    val apiMethods = methodElements.getOrElse(List()).map { div =>
      val name = """\(.*\)""".r.replaceAllIn(div >> text("h3 code"), "")
      val description = (div >?> text("p")).getOrElse("")
      val returnType = (div >?> text("h4 + p > code")).getOrElse("void")
      val paramRows = (div >> elementList("table.function.param tr")).drop(1)
      val params = paramRows.flatMap { row =>
        row >> texts("td") match {
          case Seq(name, tpe, description) => Some(ApiParam(name, tpe, description))
          case _ => None
        }
      }
      ApiMethod(name, params, returnType, description)
    }.toSeq
    ApiClass(apiClassName, tpe, apiMethods, classDescription)
  }
}