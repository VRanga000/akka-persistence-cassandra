organization := "com.github.krasserm"

name := "akka-persistence-cassandra-12"

version := "0.3.4"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.0")

fork in Test := true

javaOptions in Test += "-Xmx2500M"

parallelExecution in Test := false

libraryDependencies ++= Seq(
  "com.datastax.cassandra"  % "cassandra-driver-core"             % "2.0.1",
  "com.typesafe.akka"      %% "akka-persistence-experimental"     % "2.3.6",
  "com.typesafe.akka"      %% "akka-persistence-tck-experimental" % "2.3.6"   % "test",
  "org.scalatest"          %% "scalatest"                         % "2.1.4"   % "test",
  "org.cassandraunit"       % "cassandra-unit"                    % "1.2.0.1" % "test" exclude("com.datastax.cassandra","cassandra-driver-core") exclude("org.apache.cassandra","cassandra-all"),
  "org.apache.cassandra" % "cassandra-all"  % "1.2.13"
)


