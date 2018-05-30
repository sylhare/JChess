name := "Jchess"

organization := "com.github.sylhare"

version := "1.0"

scalaVersion := "2.10.4"

// Enables publishing to maven repo
publishMavenStyle := true

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

// Cucumber-java not working with sbt v1
//libraryDependencies += "io.cucumber" % "cucumber-java" % "3.0.0"


libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.1"
libraryDependencies += "info.cukes" % "cucumber-scala_2.11" % "1.2.4"
libraryDependencies += "info.cukes" % "cucumber-junit" % "1.2.4"
libraryDependencies += "junit" % "junit" % "4.12"

