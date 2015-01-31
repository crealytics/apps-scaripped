package de.crealytics.google.appscript.scraper
import net.ruippeixotog.scalascraper.browser.Browser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import org.jsoup.nodes._
import org.jsoup.select._
import de.crealytics.google.appscript.api._

object GoogleAppScriptClassScraper {
  def scrapeClass(url: String): ApiClass = {
    val browser = new Browser
    val doc = browser.get(url)
    val apiClassElement = doc >> element("h1.page-title")
    val apiClassName = apiClassElement.text.replace("Class ", "")
    val classDescription = doc >> text("div.type.doc")
    val methodElements = doc >> elementList("div.function.doc")
    val apiMethods = methodElements.map { div =>
      val name = """\(.*\)""".r.replaceAllIn(div >> text("h3 code"), "")
      val description = div >> text("p")
      val returnType = div >> text("h4 + p > code")
      val paramRows = (div >> elementList("table.function.param tr")).drop(1)
      val params = paramRows.flatMap { row =>
        row >> texts("td") match {
          case Seq(name, tpe, description) => Some(ApiParam(name, tpe, description))
          case _ => None
        }
      }
      ApiMethod(name, params, returnType, description)
    }.toSeq
    ApiClass(apiClassName, apiMethods, classDescription)
  }
}