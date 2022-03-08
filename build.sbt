lazy val root = (project in file(".")).
  settings(
    name := "scala-request",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      "com.typesafe" % "config" % "1.3.3",
      "org.scalaj" %% "scalaj-http" % "2.4.2"
    )
  )