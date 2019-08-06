class Outer{
  private val x =10
  class Inner{
    private val y = x +10
    def m(x:Int) = x+2
  }
}
//内部类
object NeiBuNei {
  def main(args: Array[String]): Unit = {
    val outer = new Outer
    val outer1 = new Outer
    val inner = new outer.Inner
    val inner2 = new outer.Inner
    val v = inner.m(4)
    println(inner2 == outer1 ) //false

    val o:Outer#Inner = new outer.Inner //类型投影
  }

  //中值类型
  class Infix_Type[A,B]
  val infix:Int Infix_Type String = null
  val infix1:Infix_Type[Int,String] = null

  case class A(a:Int,b:String)
  val ca = A(1,"a")
  ca match {case 2 A "m" =>println("---")}

//self类型-------------
  class Self {
    self => //self是this别名
    val tmp="Scala"
    def foo = self.tmp + this.tmp
  }

  trait S1
  class S2 { this:S1 => } //限定：实例化S2时，必须混入S1类型
  class S3 extends S2 with S1
  class s4 {this:{def init():Unit} =>} //也能用于结构类型限定

  trait T { this:S1 => } //也能用于trait
  object S4 extends T with S1
  object Self_Types {

    def main(args: Array[String]) {
      class Outer { outer =>
        val v1 = "Spark"
        class Inner {
          println(outer.v1)  //使用外部类的属性
        }
      }
      val c = new S2 with S1 //实例化S2时必须混入S1类型
    }

  }
}
