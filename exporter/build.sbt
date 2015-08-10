name := "apps-scaripped-exporter"

libraryDependencies ++= Seq(
  "org.scalameta" %% "scalameta" % "0.1.0-SNAPSHOT",
  "org.json4s" %% "json4s-native" % "3.2.11"
)

resolvers += Resolver.sonatypeRepo("snapshots")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
