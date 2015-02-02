package de.crealytics.google.appscript.scraper
import net.ruippeixotog.scalascraper.browser.Browser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import org.jsoup.nodes._
import org.jsoup.select._
import de.crealytics.google.appscript.api._
import scala.util._
import scala.collection.JavaConverters._

trait ApiScraper {
  def scrapeOverview(url: String): Seq[String]
  def scrapeClass(url: String): ApiClass
  implicit class RichNodes(val nodes: Seq[Node]) {
    def splitAtType(tpe: String) = nodes.span(!_.nodeName().equals(tpe))
    def findElement(elemType: String) = nodes.find(_.nodeName().equals(elemType)).map(_.asInstanceOf[Element])
  }
  val ClassRenamings =
    Map(
      "void" -> "Unit",
      "Integer" -> "Int",
      "int" -> "Int",
      "long" -> "Long",
      "boolean" -> "Boolean",
      "double" -> "Double",
      "Date" -> "scala.scalajs.js.Date",
      "Object" -> "AnyRef").withDefault(identity)
  def renameType(tpe: String): String = {
    val strippedType = stripNamespace(tpe)
    val typeRegex = """(.*?)(\[\]|\.\.\.)?""".r
    val typeRegex(className, arrayBrackets) = strippedType
    val renamedClass = ClassRenamings(className)
    Option(arrayBrackets) match {
      case None => renamedClass
      case Some("[]") => s"Seq[${renameType(renamedClass)}]"
      case Some("...") => s"${renameType(renamedClass)}*"
      case _ => throw new RuntimeException(s"Unknown type: tpe")
    }
  }
  def stripMethodArguments(str: String) = """\(.*\)""".r.replaceAllIn(str, "")
  def stripNamespace(str: String) = """\w*\.(\w)""".r.replaceAllIn(str, "$1")

}

object GoogleAppScriptClassScraper extends ApiScraper {
  def scrapeOverview(url: String): Seq[String] = {
    val browser = new Browser
    val doc = browser.get(url)
    (doc >> elements("table.member.type tr td a")).map(_.attr("href")).filter(_.endsWith(".html"))
  }
  def scrapeAllFromOverview(url: String): Seq[ApiClass] = {
    val detailUrls = scrapeOverview(url)
    detailUrls.flatMap { du =>
      Try {
        scrapeClass(url + du)
      }.recoverWith {
        case e => Failure(new RuntimeException(s"Could not scrape $du"))
      }.toOption
    }
  }
  def scrapeClass(url: String): ApiClass = {
    val browser = new Browser
    val doc = browser.get(url)
    val apiClassText = (doc >> element("h1.page-title")).text
    val (tpe, apiClassName) = apiClassText.split(" ") match {
      case Array(tpe, apiClassName) => (renameType(tpe), apiClassName)
      case Array(apiClassName) => ("class", apiClassName)
      case _ => ("FAIL", "FAIL")

    }
    val classDescription = doc >> text("div.type.doc")
    val methodElements = (doc >?> elementList("div.function.doc"))
    val apiMethods = methodElements.getOrElse(List()).map { div =>
      val name = stripMethodArguments(div >> text("h3 code"))
      val description = (div >?> text("p")).getOrElse("")
      val returnType = renameType((div >?> text("h4 + p > code")).getOrElse("void"))
      val paramRows = (div >> elementList("table.function.param tr")).drop(1)
      val params = paramRows.flatMap { row =>
        row >> texts("td") match {
          case Seq(name, tpe, description) => Some(ApiParam(name, renameType(tpe), description))
          case _ => None
        }
      }
      ApiMethod(name, params, returnType, description)
    }.toSeq
    ApiClass(apiClassName, tpe, apiMethods, classDescription)
  }
}

object GoogleAdWordsScriptScraper extends ApiScraper {
  def scrapeOverview(url: String): Seq[String] = {
    val browser = new Browser
    val doc = browser.get(url)
    val treeRoot = new Elements((doc >> element("[title=AdWordsApp]")).parent)
    (treeRoot >> elements("a")).map(_.attr("href"))
  }
  def scrapeClass(url: String): ApiClass = {
    val browser = new Browser
    val doc = browser.get(url)
    val apiClassText = (doc >> element("h1.page-title")).text
    val (surroundingClass, apiClassName) = apiClassText.split("\\.") match {
      case Array(surroundingClass, apiClassName) => (surroundingClass, apiClassName)
      case Array(apiClassName) => ("", apiClassName)

    }
    val classElement = (doc >> element("[itemprop=articleBody]"))
    val children = classElement.childNodes().asScala
    def isEndOfClassDescription(n: Node): Boolean = {
      List("Related", "Methods").exists(p => n.toString().contains(p))
    }
    val (descriptionNodes, contentNodes) = children.span(n => !isEndOfClassDescription(n))
    val classDescription = descriptionNodes.mkString("\n")
    val methodNameElements = doc >> elementList("h2 code")
    def readApiMethod(thisMethod: Element): ApiMethod = {
      val name = stripMethodArguments(thisMethod.text)
      val currentIndex = thisMethod.parent.elementSiblingIndex()
      val parent = thisMethod.parent
      val followingNodes = parent.parent.childNodes().dropWhile(n => !n.equals(parent)).drop(1)
      val rightNodes = followingNodes.takeWhile(n => !n.nodeName().equals("h2"))
      val (descriptionNodes, signatureNodes) = rightNodes.splitAtType("h3")
      val (parameterNodes, returnTypeNodes) = signatureNodes.span(n => !(n.nodeName().equals("h3") && n.toString().contains("Return")))
      //println(s"Description nodes for $thisMethod:\n$descriptionNodes\nParameter nodes:\n$parameterNodes\nReturn type Nodes:\n$returnTypeNodes")
      val returnType = renameType(returnTypeNodes.findElement("table").map(t => stripNamespace(t >> text("tr td"))).getOrElse("void"))
      val description = descriptionNodes.mkString("\n")
      val params = parameterNodes.findElement("table").map { table =>
        (table >> elementList("tr")).flatMap { row =>
          row >> texts("td") match {
            case Seq(name, tpe, description) => Some(ApiParam(name, renameType(tpe), description))
            case _ => None
          }
        }
      }.getOrElse(Seq())
      ApiMethod(name, params, returnType, description)
    }
    val apiMethods = methodNameElements.map(readApiMethod)
    ApiClass(apiClassName, "class", apiMethods, classDescription)
  }
}