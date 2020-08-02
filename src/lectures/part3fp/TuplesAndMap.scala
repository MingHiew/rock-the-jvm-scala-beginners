package lectures.part3fp

object TuplesAndMap extends App {
  //tuples = finite ordered "list"
  val aTuple = new Tuple2(2,"hello, Scala")
  println(aTuple._1)
  println(aTuple.copy(_2= "goodbye Java"))
  println(aTuple.swap)

  // Maps - keys -> values
  val aMap: Map[String,Int] = Map()

  val phoneBook = Map(("Jim",5555),("Daniel",4335))

  println(phoneBook)
}
