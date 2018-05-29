package com.hjd.test1
class fuu{
  def a = println("fu")
}

class zii extends fuu{
 override def a = println("zii")
}

object A6 extends App{
  val zi = new zii
  zi.a
}