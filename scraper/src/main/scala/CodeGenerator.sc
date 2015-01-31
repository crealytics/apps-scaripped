import de.crealytics.google.appscript.api._
import de.crealytics.google.appscript.scraper.GoogleAppScriptClassScraper
object CodeGenerator {
  println("Welcome to the Scala worksheet")
  import treehugger.forest._
  import definitions._
  import treehuggerDSL._
  val apiClasses = List(GoogleAppScriptClassScraper.scrapeClass("https://developers.google.com/apps-script/reference/spreadsheet/data-validation-builder"))
  apiClasses.map { cls =>
    val methodDefs = cls.methods.map { m =>
      val withoutParams = DEF(m.name.replace("\\(.*\\)", ""), m.returnType.replace("void", "Unit"))
      val withParams = m.parameters.foldLeft(withoutParams) { (meth, param) => meth.withParams(PARAM(param.name, param.tpe))}
      ((withParams := REF("???")): Tree).withDoc(m.description)
    }
    
    (TRAITDEF(cls.name) := BLOCK(methodDefs)).withDoc(cls.description)
    
  }.foreach(m => println(treeToString(m)))
}