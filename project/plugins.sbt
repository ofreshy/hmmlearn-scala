import sbt.{Credentials, Path}

resolvers += "JBoss" at "https://repository.jboss.org"

credentials += Credentials(Path.userHome / ".sbt" / ".bintrayCredentialsSergio")

// Enabling publishing to Bintray org repos
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.2")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
