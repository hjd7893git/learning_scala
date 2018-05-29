package com.hjd.test1

object A1 {
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 2;j<-1 to 2 if (i!= j)) print(i+","+j)
    
    var s =Array(1,2,3,4,5,6)
    var p =s.filter(_%2==0).map(2*_)
    p.foreach((f:Int)=>print(f))
  
  }
}