/**
  * Created by Administrator on 2017/4/26.
  */
object map extends App {
  val mapS: Map[String, Integer] = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4,"e"->null)
//  map.foreach((f: (String, Integer)) => println(f._2))
//  map.foreach((f: (_, _)) => println(f._2))
//  map.foreach(x => print(x._1))

  val key = mapS.map(x=>x._2).filter(_!=(null,"*")).toParArray
  print(key)

  //  println("---------------")
  //  val x = List(1, 2, 3, 4)
  //  x.foreach((i:Int) => println(i))
  //  x.foreach(i => println(i))
  //  x.foreach(println(_))

  for (i <- 1 to 5) yield i
}
abstract class a{
  var ab:Int
}

class b extends a{
  override var ab: Int = 12
}
