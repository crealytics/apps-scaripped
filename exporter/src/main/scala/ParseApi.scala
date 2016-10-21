import scala.meta._
import scala.language.reflectiveCalls
import scala.meta.dialects.Scala211
import scala.collection.mutable.HashMap
import org.json4s._
import org.json4s.JsonDSL._
import org.json4s.native.Serialization

object ParseApi extends App {
println("Welcome to the Scala worksheet")
  val res = io.Source.fromFile("/Users/moe/Workspaces/scala/apps_scaripped/api/src/main/scala/com/google/appsscript/adwords/AdGroup.scala").mkString
  val parsed = res.parse[Source]
/*
  def getValsInMethods(tree: Tree) = {
    val classesWithMethods = new HashMap[Term.Name, List[Term.Name]]()
    var currentFunc: Term.Name = null
    traverse(tree) {
        case f: Defn.Def =>
          val oldFunc = currentFunc
          currentFunc = f.name
          super.traverse(tree, m)
          currentFunc = oldFunc
        case Defn.Val(_, (b: Term.Name) :: Nil, _, rhs) if currentFunc != null =>
          val content = classesWithMethods.getOrElse(currentFunc, Nil)
          classesWithMethods += (currentFunc -> (b :: content))
          super.traverse(tree, m)
        case _ => super.traverse(tree, m)
      }
    }
    classesWithMethods.toMap
  }
  println(getValsInMethods(parsed))
*/
}
