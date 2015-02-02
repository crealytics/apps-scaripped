package de.crealytics.google.appscript.codegen

import de.crealytics.google.appscript.api._
import de.crealytics.google.appscript.scraper.GoogleAppScriptClassScraper
import treehugger.forest._
import definitions._
import treehuggerDSL._

object CodeGenerator {
  
  def codeForClass(cls: ApiClass, pkg: String = "", imports: Seq[String] = Seq()): String = {
    val methodDefs = cls.methods.map { m =>
      val withoutParams = DEF(m.name.replace("\\(.*\\)", ""), m.returnType)
      val params = m.parameters.map { param => PARAM(param.name, param.tpe): ValDef }
      val withParams = withoutParams.withParams(params)
      ((withParams := REF("???")): Tree).withDoc(m.description)
    }
    val traitDef = (TRAITDEF(cls.name) := BLOCK(methodDefs)).withDoc(cls.description)
    val compilationUnitDef = BLOCK(
      imports.map(i => IMPORT(i)) ++
        Seq(traitDef)) inPackage (pkg)
    treeToString(compilationUnitDef)
  }
}