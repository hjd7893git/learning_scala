/**
  * Created by hjd on 2017/6/12.
  */
object highfunction extends App{
    val as =(x:Int,m:String)=>x+m //
    (1 to 9).map(as(_,"*")).foreach(println) //调用的函数若是一个参数的话，那么调用时可以省略次参数

  def highfun(x:Int=>Double)=x(10) //将函数参数
  println(highfun((x:Int)=>x*2))
  println(highfun((x)=>x*2))
  println(highfun(x=>x*2))
  println(highfun(_*2))

  def hightfun2(x:Int)=(y:String)=>x+y
  val asd=hightfun2(20) //or  val asd = hightfun2(20)("a")
  println(asd("a"))
}
