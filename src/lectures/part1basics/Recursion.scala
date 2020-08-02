package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n: Int): Int =
    if(n<=1) 1
    else {
      println("Computing factorial of "+ n + " - I first need the factorial of " + (n-1))
      val result = n*factorial(n-1)
      println("Computed factorial of "+ n)
      result
    }

  println(factorial(10))

  def anotherFactorial(n: BigInt): BigInt = {
    def factHelper(x: BigInt, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x-1,x*accumulator)
    factHelper(n,1)
  }
  println(anotherFactorial(5000))

  @tailrec
  def concatenateTailrec(aString: String,n: Int,accumulator: String): String =
    if(n<=0) accumulator
    else concatenateTailrec(aString,n-1,aString+accumulator)

  println(concatenateTailrec("hello",3," "))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if(!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t-1, n% t != 0 && isStillPrime)

    isPrimeTailRec(n/2,true)
  }

  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    def fiboTailRec(i: Int,last: Int,nextLast: Int): Int =
      if(i>=n) last
      else fiboTailRec(i+1,last+nextLast,last)

    if (n<=2) 1 else
      fiboTailRec(2,1,1)
  }
  println(fibonacci(8))
}
