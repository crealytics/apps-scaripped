package de.crealytics.google.appscript.codegen

import de.crealytics.google.appscript.api._
import de.crealytics.google.appscript.scraper.GoogleAppScriptClassScraper
import treehugger.forest._
import definitions._
import treehuggerDSL._

object CodeGenerator {
  val ClassRenamings =
    Map(
      "void" -> "Unit",
      "Integer" -> "Int",
      "Object[]" -> "Seq[AnyRef]",
      "String[]" -> "Seq[String]").withDefault(identity)
  def renameType(tpe: String): String = {
    val typeRegex = """(.*?)(\[\]|\.\.\.)?""".r
    val typeRegex(className, arrayBrackets) = tpe
    val renamedClass = ClassRenamings(className)
    Option(arrayBrackets) match {
      case None => renamedClass
      case Some("[]") => s"Seq[${renameType(renamedClass)}]"
      case Some("...") => s"${renameType(renamedClass)}*"
      case _ => throw new RuntimeException(s"Unknown type: tpe")
    }
  }
  def codeForClass(cls: ApiClass, pkg: String = "", imports: Seq[String] = Seq()): String = {
    val methodDefs = cls.methods.map { m =>
      val withoutParams = DEF(m.name.replace("\\(.*\\)", ""), renameType(m.returnType))
      val withParams = m.parameters.foldLeft(withoutParams) { (meth, param) => meth.withParams(PARAM(param.name, renameType(param.tpe))) }
      ((withParams := REF("???")): Tree).withDoc(m.description)
    }
    val traitDef = (TRAITDEF(cls.name) := BLOCK(methodDefs)).withDoc(cls.description)
    val compilationUnitDef = BLOCK(
      imports.map(i => IMPORT(i)) ++
        Seq(traitDef)
        ) inPackage (pkg)
    treeToString(compilationUnitDef)
  }
}