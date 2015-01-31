import de.crealytics.google.appscript.api._
import de.crealytics.google.appscript.scraper._

object GoogleAppScriptApiScraper {
  println("Welcome to the Scala worksheet")
  GoogleAppScriptClassScraper.scrapeClass("https://developers.google.com/apps-script/reference/spreadsheet/data-validation-builder")
}