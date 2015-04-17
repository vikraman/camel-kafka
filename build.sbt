name := "camel-kafka"

organization := "org.apache.camel"

version := "2.15.1"

scalaVersion := "2.11.6"

parallelExecution in Test := false

libraryDependencies ++= Seq(
  "org.apache.camel" %  "camel-core"      % "2.15.1",
  "org.apache.kafka" %% "kafka"           % "0.8.2.1",
  "org.apache.camel" %  "camel-test"      % "2.15.1" % "test",
  "org.mockito"      %  "mockito-core"    % "1.9.5"  % "test",
  "org.slf4j"        %  "slf4j-log4j12"   % "1.7.10" % "test",
  "com.novocode"     %  "junit-interface" % "0.11"   % "test"
)
