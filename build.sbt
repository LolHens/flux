name := "flux"
organization := "org.lolhens"
version := "0.0.0"

scalaVersion := "2.12.3"

externalResolvers := Seq(
  "artifactory-maven" at "http://lolhens.no-ip.org/artifactory/maven-public/",
  Resolver.url("artifactory-ivy", url("http://lolhens.no-ip.org/artifactory/ivy-public/"))(Resolver.ivyStylePatterns)
)

libraryDependencies ++= Seq(
  "org.reactivestreams" % "reactive-streams" % "1.0.1"
)

scalacOptions ++= Seq("-Xmax-classfile-name", "254")
