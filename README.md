Usage: 
<pre>bin\spark-shell --jars file://target/scala-2.12/nativeudftest_2.12-1.0.jar</pre>

<pre>import org.apache.spark.sql.custom_functions.mynativefunc
df.agg(sum(mynativefunc($"id"))).collect</pre>

More info: http://blog.skahin.ru/2021/01/spark-scala-udf.html
