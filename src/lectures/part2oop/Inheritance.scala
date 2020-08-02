package lectures.part2oop

object Inheritance extends App{

  class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
      def crunch = {
        eat
        println("crunch crunch")
      }
  }

  val cat = new Cat
  cat.crunch

  //constructor
  class Person(name: String, age: Int) {
    def this(name: String) = this(name,0)
  }
  class Aldult(name: String, age: Int, idCard: String) extends Person(name)

  //overidding
//  class Dog(override val creatureType:String) extends Animal {
//    override val creatureType: String = "domestic"
//    override def eat = println("crunch, crunch")
//  }

  class Dog(dogType:String) extends Animal {
    override val creatureType: String = dogType
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  //super

}
