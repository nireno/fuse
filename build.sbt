name := "Fuse"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.30",
//  "postgresql" % "postgresql" % "9.1-902.jdbc4",
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
