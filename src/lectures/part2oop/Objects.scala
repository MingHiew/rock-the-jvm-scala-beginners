package lectures.part2oop

object Objects {

  object Person { //type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    def from(mother: Person, father: Person): Person = new Person("Bookie")
  }



  class Person(val name: String) {
    // instance level functionality
  }

  def main(args: Array[String]): Unit = {

    println(Person.N_EYES)
    println(Person.canFly)

  //COMPANIONS

  //Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")

  println(mary == john)

  val bobbie = Person.from(mary, john)
}
  //Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
}
