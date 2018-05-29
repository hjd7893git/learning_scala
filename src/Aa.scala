package com.hjd.test1


object Aa {
  def apply()={
    new Aa()
  }
  private val a=0
   val a1=1
   private def de{
    print("私有的")
  }
}
class Aa(){
  def apply()={
   println(12121)
  }
  val b =Aa.a
  var c=Aa.de
}
object man{
  def main(args: Array[String]): Unit = {
    val b =  Aa()
    b.c
    println(b())
    
  }
}