name := "NativeUdfTest"

version := "1.0"

scalaVersion := "2.12.10"

//libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.0"
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.0"

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.0-SNAPSHOT" from "file:///spark-master/core/target/scala-2.12/spark-core_2.12-3.1.0-SNAPSHOT.jar"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.0-SNAPSHOT" from "file:///spark-master/sql/core/target/scala-2.12/spark-sql_2.12-3.1.0-SNAPSHOT.jar"
libraryDependencies += "org.apache.spark" %% "spark-catalyst" % "3.1.0-SNAPSHOT" from "file:///spark-master/sql/catalyst/target/scala-2.12/spark-catalyst_2.12-3.1.0-SNAPSHOT.jar"
