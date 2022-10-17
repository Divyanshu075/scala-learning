package a3

abstract class Calculator {

  def add(a: Int, b: Int): Int

  def printSumOneAndTwo(): Unit = println(add(1, 2))
}

object CalculatorImpl extends Calculator {

  var a= 2

  override def add(a: Int, b: Int): Int = {
    println("scala obj")
    a + this.a
  }
}

class CalculatorImpl1 extends Calculator {

  var a= 2

  override def add(a: Int, b: Int): Int = a + this.a
}

object CalcMain extends App {

  val calculator: Calculator = CalculatorImpl

  val cal1: Calculator = new CalculatorImpl1
  val cal2: Calculator = new CalculatorImpl1


  println(CalculatorImpl.add(1, 2))
  println(CalculatorImpl.printSumOneAndTwo())

  println(calculator.add(1, 2))
  println(calculator.printSumOneAndTwo())
  println(cal1.add(1, 2))
}
//
//class A extends CalculatorImpl
//
//val a: Calu = new A
