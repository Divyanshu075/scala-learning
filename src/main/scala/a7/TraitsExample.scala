package a7

object TraitsExample extends App {

  trait A {

    var b: Int

    val a: Int

    def add(a: Int, b: Int): Int

    def printSum(a: Int, b: Int): Unit = println(add(a, b))
  }

  abstract class Name(a: Int) {

    def add(a: Int, b: Int): Int
  }


  abstract class Name1 {

    def add(a: Int, b: Int): Int
  }

  class AImpl extends A {
    override def add(a: Int, b: Int): Int = a + b

    override val a: Int = 34
    override var b: Int = 33
  }

  class NameImpl(a: Int) extends Name(a) {
    override def add(a: Int, b: Int): Int = a + b
  }

//  val a = new A

  val a: A = new AImpl


  Calculator.printSum(new Calculator {
    override def add(a: Int, b: Int): Int = a + b
  })
}
