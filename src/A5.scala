package com.hjd.test1

trait action{
  def doAction
}
trait tc extends action{
  abstract override def doAction{
    println("1ian")
    super.doAction
    println("hou")
  }
}
class work extends action{
  override def doAction =println("work...")
}

object A5  extends App{
  val work = new work with tc
  work.doAction
}