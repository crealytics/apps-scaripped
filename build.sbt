name := "google-apps-script-scala-js"

organization in ThisBuild := "de.crealytics"

version in ThisBuild := "0.1.0"

scalaVersion in ThisBuild := "2.11.5"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

lazy val scraper = project

lazy val api = project.enablePlugins(ScalaJSPlugin)

lazy val generatorPath = settingKey[File]("The path in which to generate API sources.")

lazy val generateApi = taskKey[Unit]("Scrapes the APIs and generates the corresponding Scala code.")

generateApi in (Compile) := Def.taskDyn {
  val path = (generatorPath in Compile).value
  println(s"Generating API files in $path")
  (runMain in (scraper, Compile)).toTask(s" de.crealytics.google.appscript.scraper.BigTimeScraper ${path}")
}.value


generatorPath in Compile := (scalaSource in (api, Compile)).value
