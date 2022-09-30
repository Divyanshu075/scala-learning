package a1

object DefaultArguments extends App {

  def increment(a: Int, x: Int): Int = a + x

  def increment(a: Int): Int = increment(a, 1)

  println(increment(1))
  println(increment(1, 2))

  def incre(a: Int, x: Int = 1): Int = a + x

  println(incre(1, 2))
  println(incre(1))

  def increme(a: Int = 1, x: Int) = a + x

  println(increme(2, 3))

  def increment1(a: Int = 1, x: Int = 2) = a + x

  println(increment1())
  //  println(increment1)
}
