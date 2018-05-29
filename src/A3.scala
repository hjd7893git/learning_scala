package com.hjd.test1
trait tr{
  def a
}
trait tras {
  def as =println(123131231)
}
class tra extends tr {
  override def a =println(123)
}
trait qw extends tra{
  
}

abstract class h1{
  def hjd
}
class h2 extends h1{
  def hjd=println("hjd")
}
object A3 {
  def main(args: Array[String]): Unit = {
		  val as = new tra with tras
				  as.as
				  as.a
			val h = new h2
			h.hjd
  }
}