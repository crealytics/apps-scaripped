scalaVersion := "2.11.5"

resolvers += Resolver.sonatypeRepo("public")

libraryDependencies ++= Seq(
  "net.ruippeixotog" %% "scala-scraper" % "0.1.1",
  "com.lihaoyi" %% "ammonite" % "0.1.4",
  "com.eed3si9n" %% "treehugger" % "0.3.0"
)
