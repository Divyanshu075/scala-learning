package a5

object Main extends App {

  class Student {

    println("Hello")

    val a = 3

    println("hhhhh")

    override def toString: String = "Student-ToString"

    println("saasasas")

    println(toString)

    val b: Int = {
      println("Val")
      33
    }
  }

  object Student

  val a = new Student

  println(">>>>>>>>>>>>")

  val b = new Student
}
