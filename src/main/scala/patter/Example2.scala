package patter

object Example2 extends App {

  trait Animal {
    def sound(): Unit
  }
  class Dog extends Animal {
    override def sound(): Unit = println("Bark")

    def bark(): Unit = println("barking")
  }
  class Cat extends Animal {
    override def sound(): Unit = println("Meow")
  }
  class Mouse extends Animal {
    override def sound(): Unit = println("chew")
  }

  def print(animal: Animal): String =  {
    println(animal.toString)

    animal match {
      case dog: Dog =>
        println(dog)
        "Dog"
      case _: Cat => "Cat"
      case mouse: Mouse => "Mouse"
      case _: Animal => "Animal"
    }
  }

  def sound(animal: Animal): Unit = animal.sound()

  val animal: Animal = new Dog // upcasting

  println(animal.isInstanceOf[Cat])

  val cat: Cat = animal.asInstanceOf[Cat] // down casting

}
