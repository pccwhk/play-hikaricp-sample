name := "myApp"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  "com.zaxxer" % "HikariCP-java6" % "2.0.1",
  "commons-configuration" % "commons-configuration" % "1.10",
  "commons-collections" % "commons-collections" % "3.2.1"
)     

resolvers ++= Seq(
    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
    Resolver.url("jets3t", url("http://www.jets3t.org/maven2"))(Resolver.ivyStylePatterns),
    Resolver.url("Edulify Repository", url("http://edulify.github.io/modules/releases/"))(Resolver.ivyStylePatterns)
)



play.Project.playScalaSettings
