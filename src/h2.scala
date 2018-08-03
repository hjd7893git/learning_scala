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

  println(list2.map(_+1))
  println(list3.map(_.length))
  println(list3.map(_.toList))
  println(list3.flatMap(_.toList))
  println(List.range(1,10))
}
