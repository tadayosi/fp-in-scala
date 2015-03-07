name := "fp-in-scala"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % Test,
  "org.hamcrest" % "hamcrest-library" % "1.3" % Test,
  "com.novocode" % "junit-interface" % "0.10" % Test,
  "org.scalacheck" %% "scalacheck" % "1.12.2" % Test
)

scalariformSettings
