name := "Basic SBT ScalaTest Test"

version := "1.1"

scalaVersion := "2.10.4"


libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.1.0" % "test"

instrumentSettings

CoverallsPlugin.coverallsSettings