object h1 extends App {

  val as = "[0-9]+".r
  for (as <- as.findAllIn("231r442,qwdqd23")) print(as)

  def sum(a:Int,b:Int,c:Int) = a+b+c
  val fa = sum _
  val fac = sum (1,2,_:Int)
  print(fac(9))

  (1 to 9).map("*"*_)foreach(println)

  for(i <- 1 to 9)
    print("、"+i)


  println((1 to 100).reduceLeft(_+_))



  println((1 to 9).sortWith(_>_))

  def add(x:Int) = (y:Int) =>x+y
  val a= add(1)(3)
  print(a)

  val sum =(x:Int,y:Int) =>x+y
  val sum1 =(x:Int) =>x+1
  (1 to 10).map(sum(1,_)).foreach(println _)

  (1 to 10).map((f:Int) =>3*f).foreach(println _)

  val am = (x:Int,y:Int) =>x+y
  println(am(1,2))

  def hj(x:Int =>Int) =x(3)
  println(hj((f:Int)=>4+f))
  println(hj(f=>4+f))
  println(hj((4+_)))

  def hjh(x:(Int)=>Int,y:Int=>Int) = x(2)*y(4)
  print(hjh((x)=>41+x,(y:Int)=>4+y))
  println(hjh(x=>41+x,(y:Int)=>4+y))

  val m1 = 3 * (_:Int)
  println(m1(2))

  def sum12(a:Int,b:Int,c:Int) = a+b+c
  val fac1 = sum12(1,2,_:Int)
  fac1(4)

  //柯里化
  def curring(x:Int)(y:Int) = x * y
  println("柯里化："+curring(2)(2))
  //闭包
  def add3(x:Int) = (y:Int) =>x+y
  println("闭包："+add3(1)(2))


  "hjd !" foreach(e => println( e match {
    case ' ' => "空格"
    case m =>m
  }))



  def itemTest(item:Item) = item match {
    case B(_,_,k@ A(a1,a2)) =>println(k.a)
    case B(_,_,A(m,_))=>println(m)
    case B(_,_,A(m,_),_*)=>println(m+"1")
    case _=>println("NO")
  }

  itemTest(B("a",1,A("b",2),B("A",10,A("B",20))))
  itemTest(A("c",3))
  itemTest(B("c",3,A("M",10)))

  val ites= Some("a")
  println(ites.get)

  println(List.range(1,10))
}
abstract  class Item
case class A(a:String,b:Int) extends Item
case class B(a:String,b:Int,items:Item*) extends Item


