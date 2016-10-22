name := "apps-scaripped"

organization in ThisBuild := "com.crealytics"

version in ThisBuild := "0.2.2"

scalaVersion in ThisBuild := "2.11.8"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

lazy val scraper = project

lazy val api = project.enablePlugins(ScalaJSPlugin)

lazy val exporter = project.dependsOn(scraper)

lazy val generatorPath = settingKey[File]("The path in which to generate API sources.")

lazy val generateApi = inputKey[Unit]("Scrapes the APIs and generates the corresponding Scala code.")

import sbt.complete.DefaultParsers._

generateApi in (Compile) := Def.inputTaskDyn {
  val apis: Seq[String] = spaceDelimited("<arg>").parsed
  val path = (generatorPath in Compile).value
  println(s"Generating API files for ${if (apis.isEmpty) "all" else apis.mkString(", ")} in $path")
  (runMain in (scraper, Compile)).toTask(s" de.crealytics.google.appscript.scraper.BigTimeScraper $path ${apis.mkString(",")}")
}.evaluated

pomExtra in Global :=
  <url>https://github.com/crealytics/apps-scaripped</url>
    <scm>
      <url>git@github.com:crealytics/apps-scaripped.git</url>
      <connection>scm:git:git@github.com:crealytics/apps-scaripped.git</connection>
    </scm>
    <developers>
      <developer>
        <id>nightscape</id>
        <name>Martin Mauch</name>
        <url>http://www.crealytics.com</url>
      </developer>
    </developers>

generatorPath in Compile := (scalaSource in (api, Compile)).value

bintrayOrganization in ThisBuild := Some("crealytics")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
