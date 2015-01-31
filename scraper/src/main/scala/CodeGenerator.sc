import de.crealytics.google.appscript.api._
object CodeGenerator {
  println("Welcome to the Scala worksheet")
  import treehugger.forest._
  import definitions._
  import treehuggerDSL._
  val apiClasses = List(ApiClass("SpreadsheetApp",Seq(ApiMethod("setActiveSpreadsheet",Seq("newActiveSpreadsheet"), "void","Sets the active spreadsheet."))))
  apiClasses.map { cls =>
    val methodDefs = cls.methods.map { m =>
      val withoutParams = DEF(m.name.replace("\\(.*\\)", ""), m.returnType.replace("void", "Unit"))
      val withParams = m.parameters.foldLeft(withoutParams) { (meth, param) => meth.withParams(PARAM(param, "Any"))}
      ((withParams := REF("???")): Tree).withDoc(m.description)
    }
    
    TRAITDEF(cls.name) := BLOCK(methodDefs)
    
  }.foreach(m => println(treeToString(m)))
  val tree: Tree = (Predef_println APPLY LIT("Hello, world!")).withDoc("comments")

}