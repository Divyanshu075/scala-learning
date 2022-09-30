package a1

import scala.annotation.tailrec

object TailRec extends App {

  //  @tailrec
  def fact(n: Int): Int = if (n == 1) 1 else n * fact(n - 1)

  @tailrec
  def fact1(n: Int, output: Int = 1): Int = if (n == 1) output else fact1(n - 1, n * output)

  def rec(n: Int, output: Int): Unit = {
    if (n == 1) {
      output
    } else {
      println(rec(n - 1, n * output))
    }
  }

  def rec1(n: Int): Int = {
    if (n == 1)
      throw new Exception("Hello")
    else n * rec1(n - 1)
  }


  @tailrec
  def rec2(n: Int): Int = {
    if (n == 1)
      throw new Exception("Hello")
    else rec2(n - 1)
  }

  /**
   * 4 * fact(3)
   * 3 * fact(2)
   * 2 * fact(1)
   * 1
   */
  println(fact(4))

  /**
   * f(4, 1) => f(3, 4) => f(2, 12) => f(1, 24) => 24
   */
  println(fact1(4))

  try {
    rec1(10000)
  } catch {
    case ex: Exception => ex.printStackTrace()
  }

  try {
    rec2(40)
  } catch {
    case ex: Exception => ex.printStackTrace()
  }
}
