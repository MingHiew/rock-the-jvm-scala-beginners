package lectures.part1basics

object Functions extends App{

  def aFunc(a: String, b: Int) :String = {
    a + " " + b
  }

  println(aFunc("hello",5))

  def aNoParamFunc():Int = 42

  println(aNoParamFunc())

  def aRepeatedFunc(aString:String,n:Int): String = {
    if(n==1) aString
    else aString + " " + aRepeatedFunc(aString,n-1)
  }

  println(aRepeatedFunc("hello",5))

  def aFunctionWithSE(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n,n-1)
  }

  println(aBigFunction(10))

  def greetingForKids(name: String, name1: String): String = {
    "Hi, my name is " + name + " and I love " + name1
  }
  println(greetingForKids("Hieu", "KA"))
}
