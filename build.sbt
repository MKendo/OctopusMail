import com.github.play2war.plugin._

name := "onepage"

version := "a"

Play2WarPlugin.play2WarSettings

Play2WarKeys.servletVersion := "3.1"

scalaVersion := "2.11.6"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
jdbc,
  anorm,
  cache,
  ws
)