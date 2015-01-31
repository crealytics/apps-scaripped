name := "google-apps-script-scala-js"

organization := "de.crealytics"

version := "0.1.0"

scalaVersion := "2.11.5"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

lazy val scraper = project

lazy val api = project
