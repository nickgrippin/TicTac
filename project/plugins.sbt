resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0-SNAPSHOT")

//Revolver plugin
addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")

//SBT Assembly Plugin
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.1")
