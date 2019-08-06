import scala.collection.mutable

object h2 extends App{
  val list1 = List(2,3,4)
  var list2 = 3::4::5::6::Nil
  val list3 = "a1"::"b2"::"c3"::Nil
  val list4 = list1:::list2

  val List(a,b,c) = list1
  val a1::a2 =list2

  println(a)
  println(a2)
  println(list4)
  println("take:"+ (list2 take 2))
  println("drop:"+(list2 drop 1))
  println("splitAt:" +(list4 splitAt(2)))
  println(list3 apply(2))
  println(list3(2))
  println("indices:"+(list1.indices))
  println("zip:"+list1.indices zip list2) // 拉链操作
  println(list1)    //都不会改变集合内部值
  println(list1.toString())    //都不会改变集合内部值
  println("zipWithIndex:"+list1.zipWithIndex) // 索引配对
  println(list1.mkString("[",",","]"))
  println(list1.mkString("|"))
  println(list1.mkString)

  val sb = new StringBuilder
  list2 addString(sb,"[",",","]")
  println("sb:"+sb)

  val array = list2.toArray
  println("array:"+array(1))
  println("arraytoList:"+array.toList)

  val array2 = new Array[String](10)
  list3.copyToArray(array2,6)
  array2.foreach(print)

  println("\n--------------------")
  val iterator = list2.toIterator
  println(iterator.next())
  for (ele<-iterator) println(ele)

  //集合常用方法
  println(list2.map(_+1))
  println(list3.map(_.length))
  println(list3.map(_.toList))
  println(list3.flatMap(_.toList))
  println(List.range(1,10))

  println((1 to 9) reduce(_+_))

  println(List(1,2,3,4,5).partition(_%2 ==0))

  println(List(1,2,3,1,2,4,5).takeWhile(_<=3))//取出符合条件的第一次
  println(List(1,2,3,4,5).dropWhile(_<=3)) //保留符合条件的第一次
  println(List(1,2,1,3,4,5).span(_<=1))//分离成两个集合
  println(List(1,1,1,1,1,1).forall(_<=1)) //条件全部符合的 真假判断

  //叠加
  println((1 to 6).foldLeft(10)(_+_))
  println((10/:(1 to 6)){case (a,b)=>
    println("a:"+a)
    println("b:"+b)
    a+b})
println("============")

  println((1 to 6).foldRight(10)(_+_))
  println(((1 to 6):\10){case (a,b)=>
    println("a:"+a)
    println("b:"+b)
    a+b})

  println((1 to 6).fold(10)(_+_))

  //排序
  println(List(1,2,3,1,-1,-2,4,5).sortWith(_<_))
  println(List(1,2,1,3,-1,-2,4,5).sortWith(_>_))


  println("-----------------------")
  println(List.apply(1,2,3))
  println(List.fill(3)("A"))
  println(List.range(1,9,2))
  val nsd = "abcde".toList zip List.range(1,6) //拉链
  println(nsd)
  println(nsd.unzip)    //解拉
  println(List(List(1,2),List(3,4),List(5,6)).flatten)    //多个小list构成大的list
  println(List.concat(List(1,2),List(3,4),List(5,6)))    //多个小list构成大的list


  import scala.collection.mutable.ListBuffer
  val listBuffer = new ListBuffer[Int] //ArrayBuffer 也是如此
  listBuffer += 1
  listBuffer += 2
  println(listBuffer)

  import scala.collection.immutable.Queue //不可变

  var empt = Queue.empty[List[String]]
  var empt2 = Queue[Int]()
  val q1 = empt.enqueue(1)
  val q2 = q1.enqueue(List("1","2","3"))
  val qm = q2.enqueue(List("a","b","b"))
  val (q3,q4) = qm.dequeue
  println(q3+"、"+q4.dequeue)

  val q = scala.collection.mutable.Queue[String]() //可变
  q += "a"
  q += "b"
  println(q.dequeue) //返回第一个，弹出来
  q.enqueue("1")
  println(q.dequeue)

  val stack1 =  new mutable.Stack[Int]
  stack1.push(1)
  stack1.push(2)
  stack1.push(3)
  println(stack1.top)
  println(stack1)
  println(stack1.pop())
  println(stack1)

  //Set里面的元素不能重复
  val set1 = scala.collection.mutable.Set.empty[Int] //TreeSet -》排序
  set1 ++= List(1,2,3,4)
  set1 +=5
  println("Set:"+set1)
  set1 --= List(1,3)
  println("Set:"+set1)
  set1.clear()

  val Map2 = mutable.Map("123"->"124")      //TreeMap     -》排序
  val Map3 = Map("123"->"124")
  println(Map2)
  println(Map3.get("123"))
  println(Map3("123"))






}
