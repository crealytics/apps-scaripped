package de.crealytics.google.appscript.codegen

import de.crealytics.google.appscript.api._
import de.crealytics.google.appscript.scraper.GoogleAppScriptClassScraper
import treehugger.forest._
import definitions._
import treehuggerDSL._

object CodeGenerator {

  def codeForClass(classes: Seq[ApiClass], pkg: String = "", imports: Seq[String] = Seq()): String = {
    val classDefs = classes.map { cls =>
      val methodDefs = cls.methods.map { m =>
        val withoutParams = DEF(m.name.replace("\\(.*\\)", ""), m.returnType)
        val paramsWithDummy = if (m.parameters.isEmpty)
          Seq(ApiParam("dummyDontUse", "String", ""))
        else
          m.parameters
        val params = paramsWithDummy.map { param =>
          PARAM(param.name, param.`type`): ValDef
        }
        val withParams = withoutParams.withParams(params)
        ((withParams := REF("js.native")): Tree).withDoc(m.description)
      }
      val baseClassDef = cls.`type` match {
        case "object" => OBJECTDEF(cls.name)
        case _ => TRAITDEF(cls.name)
      }
      (baseClassDef withParents (cls.parents) := BLOCK(methodDefs)).withDoc(cls.description)
    }
    val compilationUnitDef = BLOCK(
      imports.map(i => IMPORT(i)) ++
        Seq(IMPORT("scala.scalajs.js")) ++ classDefs) inPackage (pkg)
    treeToString(compilationUnitDef).replace("dummyDontUse: String", "") + "\n"
  }
}