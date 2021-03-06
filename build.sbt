name := """fuse"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.30",
//  "postgresql" % "postgresql" % "9.1-902.jdbc4",
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
