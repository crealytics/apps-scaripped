import net.ruippeixotog.scalascraper.browser.Browser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import org.jsoup.nodes._
import org.jsoup.select._
import de.crealytics.google.appscript.api._

object GoogleAppScriptApiScraper {
  println("Welcome to the Scala worksheet")
  val browser = new Browser
  val doc = browser.get("https://developers.google.com/apps-script/reference/spreadsheet/")
  val apiClassElements = doc >> elements("code.class.name"); println("Classes")
  val apiClassNames = apiClassElements.map(_ >> text("a"))
  val methodElements = doc >> elementList("div.class.toc")
  val apiMethods = methodElements.map { div =>
    val rows = (div >> elements("tr")).drop(1)
    rows.flatMap { row =>
      row >> texts("td") match {
        case Seq(name, returnType, description) => Some(ApiMethod(name, Seq(), returnType, description))
        case _ => None
      }
    }.toSeq
  }
  
  val classes = apiClassNames.zip(apiMethods).map(ApiClass.tupled)
  classes.last
}