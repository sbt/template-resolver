val scalatest = "org.scalatest" %% "scalatest" % "3.0.0"

lazy val root = (project in file(".")).
  enablePlugins(SonatypePublish).
  settings(
    inThisBuild(List(
      organization := "org.scala-sbt",
      licenses += "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"),
      scalaVersion := "2.11.8",
      organizationHomepage := Some(url("http://scala-sbt.org/")),
      homepage := Some(url("https://github.com/sbt/template-resolver")),
      scmInfo := Some(ScmInfo(url("https://github.com/sbt/template-resolver"), "git@github.com:sbt/template-resolver")),
      developers := List(
        Developer("eed3si9n", "Eugene Yokota", "@eed3si9n", url("https://github.com/eed3si9n"))
      ),
      description := "template-resolver is a contract API for template resolvers."
    )),

    name := "template-resolver",
    version := "0.1",
    libraryDependencies ++= Seq(scalatest % Test),

    // disable using the Scala version in output paths and artifacts
    crossPaths := false,
    autoScalaLibrary := false,
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := { _ => false }
  )
