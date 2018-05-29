import scala.io.Source

/**
  * Created by hjd on 2017/6/1.
  */
object studet_Trait extends App{
//  val se = Source.fromFile("C:\\Users\\hjd\\Desktop\\Jquer.txt","GBK")
//  se.foreach(print)

  val list = List(1,2,3,4,5,6)
  list.foreach((f:Int)=>print(f))
  list.foreach((f)=>print(f))
  list.foreach(f=>print(f))
  list.foreach(_=>print(_))
  list.foreach(print(_))
  list.foreach(print _)
  list.foreach(print)

  val map=Map("a"->1,"b"->2,"c"->3,"d"->4)
  map.foreach((f:(String,Int))=>print(f._1,f._2))
  map.foreach((f)=>print(f._1,f._2))
  map.foreach(f=>print(f._1,f._2))
  println("----------")
    val sd =(x:Int,y:Int)=>x+y
   def sum(a:Int,b:Int,c:Int)=a+b+c
   val ssum = sum _
  val fun = sum(1,_:Int,4)
}

