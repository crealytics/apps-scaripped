import scala.meta._
import scala.meta.tql.ScalaMetaTraverser._
import scala.meta.internal.ast.Defn
import scala.meta.ui._
import scala.meta.syntactic._
import scala.language.reflectiveCalls
import scala.meta.dialects.Scala211
import scala.collection.mutable.HashMap
import tools.Traverser
import de.crealytics.google.appscript.api._
import ammonite.all._

import org.json4s._
import org.json4s.JsonDSL._
import org.json4s.native.Serialization

object ParseAdWordsApi {
  println("Welcome to the Scala worksheet")
  val appsScarippedDir = root / "Users" / "moe" / "Workspaces" / "scala" / "apps_scaripped"
  val adWordsFiles = ls.rec! appsScarippedDir / "api" / "src" / "main" / "scala" / "com" / "google" / "appsscript" |? (_.ext == "scala")
  val fileContents = adWordsFiles.map(read ! _)
  val allClasses = fileContents.flatMap { code =>
    val parsed = code.parse[Source]
    val traitExtractor = topDown(collect { case c: Defn.Trait => c })
    val traits = traitExtractor(parsed)
    val classes: List[ApiClass] = traits.get._2.map { t =>
      def methods = t.templ.stats.flatMap {
        case d: Defn.Def =>
          val params = d.paramss.flatten.map(p => ApiParam(p.name.get.toString, p.decltpe.get.toString, p.default.map(_.toString).getOrElse("")))
          List(ApiMethod(d.name.toString, params, d.decltpe.get.toString, ""))
        case _ => List()
      }
      ApiClass(t.name.toString, "", methods, "", t.templ.parents.map(_.toString).filterNot(_ == "js.Object"))
    }
    classes
  }

}
