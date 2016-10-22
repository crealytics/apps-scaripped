import org.json4s._
import org.json4s.native._
import org.json4s.native.Serialization.{ writePretty => toJson }
import org.json4s.native.Printer._
import native.JsonMethods.render
import com.crealytics.google.appscript.api._
object ApiToJson {
  def convert(theClass: ApiClass): String = {
    implicit val formats = Serialization.formats(NoTypeHints)
    toJson(theClass)
  }
}
