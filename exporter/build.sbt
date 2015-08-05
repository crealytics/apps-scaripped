name := "apps-scaripped-exporter"

libraryDependencies ++= Seq(
  "com.github.begeric" % "tqlscalameta_2.11" % "0.1-SNAPSHOT",
  "org.json4s" %% "json4s-native" % "3.2.11"
)

resolvers += Resolver.sonatypeRepo("snapshots")

seq(bintraySettings:_*)

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))