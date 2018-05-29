package com.hjd.test1
class q1 {
  println("q1")
}
trait q2 extends q1{
  println("q2")
}

trait w1 {
  println("w1")
}
class q3 extends q1 with q2 with w1{
  println("q3")
}
object A4 extends App{
  val q = new q3
}