package de.crealytics.google.appscript.parser

import scala.meta._
import scala.meta.tql._
import scala.meta.internal.ast.Defn
import scala.language.reflectiveCalls
import scala.meta.dialects.Scala211
import scala.collection.mutable.HashMap
import de.crealytics.google.appscript.api._
import ammonite.ops._
import scala.util.Try

class ApiParser(path: Path) {
  implicit class RichDefnDef(d: Defn.Def) {
    def scalaDoc: Option[String] = {
      val ptokens = d.parent.get.tokens
      val maybeComment = ptokens.filter(t => t.isInstanceOf[Token.Comment] || t.isInstanceOf[Token.`def`]).sliding(2).collect { case Seq(c, m) if c.isInstanceOf[Token.Comment] && m.start == d.tokens.head.start => c }.toList.headOption
      maybeComment.map { tc =>
        tc.code.split("\n").map(_.replaceFirst("""^\s*(/\*\*?|\* |\*/?)""", "")).filterNot(_.isEmpty).mkString("\n")
      }
    }
  }
  def readClasses: Seq[ApiClass] = {
    val files = ls.rec! path |? (_.ext == "scala")
    files.flatMap { file =>
      val code = read ! file
      val parsed = Try { code.parse[Source] }.recover {
        case t: Throwable => throw new RuntimeException(s"Could not parse $file:\n$code", t)
      }.get
      val traitExtractor = topDown(collect { case c: Defn.Trait => c })
      val traits = traitExtractor(parsed)
      val classes: List[ApiClass] = traits.get._2.map { t =>
        def methods = t.templ.stats.toList.flatMap { stats =>
          stats.collect {
            case d: Defn.Def =>
              val params = d.paramss.flatten.map(p => ApiParam(p.name.toString, p.decltpe.get.toString, p.default.map(_.toString).getOrElse("")))
              ApiMethod(d.name.toString, params, d.decltpe.get.toString, d.scalaDoc.getOrElse(""))
          }
        }
        ApiClass(t.name.toString, "", methods.map(m => (m.name, m)).toMap, "", t.templ.parents.map(_.toString)/*.filterNot(_ == "js.Object")*/)
      }
      classes
    }
  }
}
