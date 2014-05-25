name := "timetracker"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "postgresql" % "postgresql" % "9.1-902.jdbc4",
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
