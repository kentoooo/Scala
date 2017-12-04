name := "scala-fp"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

scalacOptions in Global += "-language:experimental.macros"