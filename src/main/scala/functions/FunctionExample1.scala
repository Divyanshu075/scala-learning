package functions

object FunctionExample1 extends App {

  val add: (Int, Int) => Int = (a, b) => a + b
  val add1: Function2[Int, Int, Int] = (a, b) => a + b

  println(add(1, 2))
  println(add.apply(1, 2))

  println(add1(1, 2))
  println(add1.apply(1, 2))

  println(add.isInstanceOf[(Int, Int) => Int])
  println(add.isInstanceOf[Function2[Int, Int, Int]])

  println(add1.isInstanceOf[(Int, Int) => Int])
  println(add1.isInstanceOf[Function2[Int, Int, Int]])
}
