import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import wikipedia.WikipediaRanking.{langs, rankLangs, timed, wikiRdd}
import wikipedia._

println("-- INITIALISING")
//val langList : List[String] = WikipediaRanking.langs

val o = WikipediaRanking
val langs = o.langs

//val rdd = WikipediaRanking.wikiRdd
//rdd.count()

val a : List[(String,Int)] = List(("a", 1), ("b",2), ("c", 999))
val b : List[Int] = List(5, 8, 3, 14, 77)

val x = b.map( e => List("Test", (e, e*2)))
val y1 = x.flatten
val y2 = x.flatMap( e => e)
y2 == y1
y2.eq(y1)
x++y2



//val articleCount: Long = WikipediaRanking.wikiRdd.count()




