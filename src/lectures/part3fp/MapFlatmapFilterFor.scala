package lectures.part3fp

object MapFlatmapFilterFor extends App {
  val list = List(1,2,3)

  println(list)
  println(list.map(_+1))
  println(list.map(_ + " is a number"))
  println(list.filter(_ % 2 == 0))


  //flatmap
  val toPair = (x: Int) => List(x,x+1)
  println(list.flatMap(toPair))

  val numbers = List(1,2,3,4)
  val chars = List('a','b','c','d')

  val combinations = numbers.flatMap(n => chars.map(c=> ""+c+n))
  println(combinations)

  //foreach
  list.foreach(println)

  //for-comprehensions
  val forCombinations = for {
    n <-numbers
    c <- chars

  } yield ""+c+n
  println(forCombinations)
}
