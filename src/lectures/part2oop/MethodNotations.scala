package lectures.part2oop

object MethodNotations  extends App{
  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie==favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def isAlive: Boolean = true
    def apply():String = s"Hi, I am ${this.name} and I like ${this.favoriteMovie}"
  }

  val mary = new Person("Mary","Inception")

  println(mary.likes("Inception"))
  println(mary likes "Inception")

  val tom = new Person("Tom","Fight club")

  println(mary + tom)
  //prefix notation
  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary())


}
