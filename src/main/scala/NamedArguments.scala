object NamedArguments extends App {

  def increment(a: Int, x: Int) = {
    println(a, x)
    a + x
  }

  println(increment(1, 2))

  println(increment(x = 1, a = 2))
  println(increment(a = 1, x = 2))

  def increment1(a: Int = 1, x: Int) = a + x

  println(increment1(1, 2))
  println(increment1(x = 3))

  def add(a: Int, b: Int = 1, c: Int, d: Int) = a + b + c + d

  println(add(1, 2, 3, 4))
  println(add(a = 3, c = 33, d = 45))

//  println(add(b = 3, 1, 2, 2))
    println(add(a = 3, 1, 2, 2))

  println(add(1, 2, 3, d = 45))
}
