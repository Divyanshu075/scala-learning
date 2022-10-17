package a7

trait Calculator {

  def add(a: Int, b: Int): Int
}

object Calculator {

  def printSum(calculator: Calculator): Unit = {
    println(calculator.add(1, 2))
  }
}
