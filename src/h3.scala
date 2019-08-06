import scala.reflect.ClassTag

object h3 extends App {
  val mn = new hwe("a", 1)
  val mn2 = new hwe[Int, Int](2, 1)
  println(mn.nsdf)
  println(mn2.nsdf)

  println("----------------------")

  def foo[A, B](f: A => List[A], b: A) = f(b)
  println(new ti(1,2).po)
  println(new ti(1,2).poi("a","b"))

  println(new array().arrayMake(1,"2"))

  val list:List[_<:Any] =  List[String]("a")
}

class hwe[T, R](a: T, b: R) { //泛型
  val nsdf = a
}
//视图限定
class ti[T <% Ordered[T]](val f: T, val o: T) {
  def po = if (f < o) f else o
  def poi[M<% Ordered[M]](a1:M,a2:M) = if (a1 < a2) a1 else a2
}
//上下文界定，存在隐式转换
class ti2[T:Ordering](val f:T,val o:T){
  def po(implicit ord:Ordering[T]) = if (ord.compare(f,o)>0) f else o
}

//泛型数组
class array{
  def arrayMake[T:Manifest](f:T,o:T) = {
    val r = new Array[T](2);
    r(0) = f
    r(1) = o
  }
  //ClassTag[T]比泛型数组更有用
  def arrayMake[T:ClassTag](e:T*) = Array[T](e:_*)
}
//协变
class C[+T](val args:T)





