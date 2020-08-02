package lectures.part2oop

object OOBasics extends App {
  val person = new Person("Hieu",30)
  println(person.age)
  person.greet()
  person.greet("Daniel")

}

class Person(name: String,val age: Int) {
  val x = 2

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greet(): Unit = println(s"Hi, I am $name")

  def this(name:String) = this(name, 0)
  def this() = this("John Doe")
}
