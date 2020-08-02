package lectures.part1basics

object Expressions extends App{
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1==x)

  var aVar = 2
  aVar +=3
  println(aVar)

  val aCond = true
  println(if(aCond) 5 else 3)
  var i = 0
  val aWhile = (while (i < 10){
    println(i)
    i+=1
  })

  val aWeirdValue = (aVar = 3)
  println(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y+1
    if(z>2) "hello" else "goodbye"
  }

}
