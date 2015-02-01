import de.crealytics.google.appscript.api._
import de.crealytics.google.appscript.scraper._
import de.crealytics.google.appscript.codegen._
import net.ruippeixotog.scalascraper.browser.Browser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import org.jsoup.nodes._
import org.jsoup.select._
import java.nio.file.{ Paths, Files }
import java.nio.charset.StandardCharsets
import ammonite.all._

object GoogleAppScriptApiScraper {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val wd = root / 'Users / 'moe / 'Workspaces / 'bidmanagement / 'google_apps_script_scala_js / 'api / 'src / 'main / 'scala
                                                  //> wd  : ammonite.ops.Path = /Users/moe/Workspaces/bidmanagement/google_apps_sc
                                                  //| ript_scala_js/api/src/main/scala
  //rm! wd

  case class ImportLink(url: String, pkg: String = "", imports: Seq[String] = Seq())
  val baseApi = ImportLink(
    url = "https://developers.google.com/apps-script/reference/base/",
    pkg = "com.google.appsscript.base")           //> baseApi  : GoogleAppScriptApiScraper.ImportLink = ImportLink(https://develop
                                                  //| ers.google.com/apps-script/reference/base/,com.google.appsscript.base,List()
                                                  //| )
  val chartsApi = ImportLink(
    url = "https://developers.google.com/apps-script/reference/charts/",
    pkg = "com.google.appsscript.charts",
    imports = Seq(baseApi.pkg + "._"))            //> chartsApi  : GoogleAppScriptApiScraper.ImportLink = ImportLink(https://deve
                                                  //| lopers.google.com/apps-script/reference/charts/,com.google.appsscript.chart
                                                  //| s,List(com.google.appsscript.base._))
  val spreadsheetApi = ImportLink(
    url = "https://developers.google.com/apps-script/reference/spreadsheet/",
    pkg = "com.google.appsscript.spreadsheet",
    imports = Seq(baseApi.pkg + "._", chartsApi.pkg + "._", "java.util.Date"))
                                                  //> spreadsheetApi  : GoogleAppScriptApiScraper.ImportLink = ImportLink(https:/
                                                  //| /developers.google.com/apps-script/reference/spreadsheet/,com.google.appssc
                                                  //| ript.spreadsheet,List(com.google.appsscript.base._, com.google.appsscript.c
                                                  //| harts._, java.util.Date))
  val overviewUrls = List(
    baseApi,
    chartsApi,
    spreadsheetApi)                               //> overviewUrls  : List[GoogleAppScriptApiScraper.ImportLink] = List(ImportLin
                                                  //| k(https://developers.google.com/apps-script/reference/base/,com.google.apps
                                                  //| script.base,List()), ImportLink(https://developers.google.com/apps-script/r
                                                  //| eference/charts/,com.google.appsscript.charts,List(com.google.appsscript.ba
                                                  //| se._)), ImportLink(https://developers.google.com/apps-script/reference/spre
                                                  //| adsheet/,com.google.appsscript.spreadsheet,List(com.google.appsscript.base.
                                                  //| _, com.google.appsscript.charts._, java.util.Date)))
  overviewUrls.foreach { importLink =>
    import importLink._
    val detailPages = GoogleAppScriptClassScraper.scrapeOverview(url)
    detailPages.foreach { dp =>
      val scrapedClass = GoogleAppScriptClassScraper.scrapeClass(url + dp)
      //println(scrapedClass)
      val code = CodeGenerator.codeForClass(scrapedClass, pkg, imports)
      val spkg = pkg.split("\\.").toList
      val path = spkg.foldLeft(wd)(_ / _)
      mkdir ! path
      val filePath = path / s"${scrapedClass.name}.scala"
      write.over(filePath, code)
      println(s"Wrote $pkg to $filePath")
    }
  }                                               //> Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Blob
                                                  //| .scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Blob
                                                  //| Source.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Blob
                                                  //| .scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Brow
                                                  //| ser.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Butt
                                                  //| on.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Ui.s
                                                  //| cala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Prom
                                                  //| ptResponse.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Butt
                                                  //| onSet.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Ui.s
                                                  //| cala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Ui.s
                                                  //| cala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Logg
                                                  //| er.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Menu
                                                  //| .scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Mime
                                                  //| Type.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Mont
                                                  //| h.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Prom
                                                  //| ptResponse.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Ui.s
                                                  //| cala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Sess
                                                  //| ion.scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Ui.s
                                                  //| cala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/User
                                                  //| .scala
                                                  //| Wrote com.google.appsscript.base to /Users/moe/Workspaces/bidmanagement/goo
                                                  //| gle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/base/Week
                                                  //| day.scala
                                                  //| Wrote com.google.appsscript.charts to /Users/moe/Workspaces/bidmanagement/g
                                                  //| oogle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/charts/
                                                  //| AreaChartBuilder.scala
                                                  //| Wrote com.google.appsscript.charts to /Users/moe/Workspaces/bidmanagement/g
                                                  //| oogle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/charts/
                                                  //| BarChartBuilder.scala
                                                  //| Wrote com.google.appsscript.charts to /Users/moe/Workspaces/bidmanagement/g
                                                  //| oogle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/charts/
                                                  //| CategoryFilterBuilder.scala
                                                  //| Wrote com.google.appsscript.charts to /Users/moe/Workspaces/bidmanagement/g
                                                  //| oogle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/charts/
                                                  //| Chart.scala
                                                  //| Wrote com.google.appsscript.charts to /Users/moe/Workspaces/bidmanagement/g
                                                  //| oogle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/charts/
                                                  //| ChartOptions.scala
                                                  //| Wrote com.google.appsscript.charts to /Users/moe/Workspaces/bidmanagement/g
                                                  //| oogle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/charts/
                                                  //| Chart.scala
                                                  //| Wrote com.google.appsscript.charts to /Users/moe/Workspaces/bidmanagement/g
                                                  //| oogle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/charts/
                                                  //| ChartType.scala
                                                  //| Wrote com.google.appsscript.charts to /Users/moe/Workspaces/bidmanagement/g
                                                  //| oogle_apps_script_scala_js/api/src/main/scala/com/google/appsscript/charts/
                                                  //| Charts.scala
}