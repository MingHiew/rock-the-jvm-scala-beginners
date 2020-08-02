package lectures.part3fp

object AnonymousFunctions extends App {

  val doubler: Int => Int = (x: Int) => x*2
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a+ b

  val justdoSomething: () => Int = () => 3

  println(justdoSomething)
  println(justdoSomething())

  val stringToInt = {
    (str: String) => str.toInt
  }

  val niceIncrementer: Int => Int = _ + 1
  val niceAdder: (Int,Int) => Int = _ + _


}
