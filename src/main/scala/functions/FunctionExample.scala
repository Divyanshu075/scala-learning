package functions

object FunctionExample extends App {

  def add(a: Int, b: Int): Int = a + b


  println(add(1, 2))

  val add1: (Int, Int) => Int = (a: Int, b: Int) => a + b
  val increment: Int => Int = a => a + 1

  val add2: (Int, Int) => Int = add

  println(add1(1, 2))
  println(increment(1))


    // fyunctions either input or output

  def calculate(a: Int, b: Int, fxn: (Int, Int) => Int): Int = fxn(a, b)

  println(calculate(1, 2, (a, b) => {
    println("sas")
    a + b
  }))
  println(calculate(1, 2, (a, b) => a - b))
  println(calculate(1, 2, add))


}
