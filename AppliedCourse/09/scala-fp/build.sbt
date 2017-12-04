name := "scala-fp"

version := "0.1"

scalaVersion := "2.11.4"

scalastyleSources in Compile := (unmanagedSourceDirectories in Compile).value

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

libraryDependencies += "org.mockito" % "mockito-core" % "1.10.19" % "test"