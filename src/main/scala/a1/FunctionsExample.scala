package a1

object FunctionsExample extends App {

  // def add(a, b): Int = ???

  def add(a: Int, b: Int): Int = a + b

  def add1(a: Int, b: Int) = a + b

  def sub(a: Int, b: Int): Int = {
    println("Asas")
    a - b
  }

  def One(): Int = {
    return 1
  }

  def two(): Int = {

    2
  }

  println(add(1, 2))
  println(sub(1, 2))

  val x1: StudentScala = new StudentScala("Sas", 3232)
  val x2 = new StudentScala("Sas", 32323)

  val x3: StudentScala = x1.+(x1)

  val x4 = x1 + x2
}
