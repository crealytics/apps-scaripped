name := "apps-scaripped-scraper"

resolvers += Resolver.sonatypeRepo("public")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "net.ruippeixotog" %% "scala-scraper" % "0.1.1",
  "com.lihaoyi" %% "ammonite" % "0.1.4",
  "com.typesafe" % "config" % "1.2.1",
  "net.ceedubs" %% "ficus" % "1.1.2",
  "com.eed3si9n" %% "treehugger" % "0.3.0"
)

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
