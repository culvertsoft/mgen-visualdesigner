// Remember, sbt needs empty lines between active settings

name := "mgen-visualdesigner"

organization := "se.culvertsoft"

version := scala.util.Properties.envOrElse("MGEN_VERSION", "SNAPSHOT")

scalaVersion := "2.11.4"

isSnapshot := version.value.contains("SNAPSHOT")

crossPaths := false

unmanagedSourceDirectories in Compile += baseDirectory.value / "src_generated/main/java"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "se.culvertsoft" % "mgen-compiler" % version.value

libraryDependencies += "se.culvertsoft" % "mgen-javalib" % version.value

libraryDependencies += "se.culvertsoft" % "mgen-idlgenerator" % version.value

libraryDependencies += "se.culvertsoft" % "mgen-idlparser" % version.value

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

libraryDependencies += "com.miglayout" % "miglayout-swing" % "4.2"

EclipseKeys.withSource := true
