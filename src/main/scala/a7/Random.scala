package a7

object Random extends App {

  def printOne(): Unit = println(1)

  def printTwo(): Unit = ()

  printOne()

  val a: Unit = printOne()

  println(a)

  val a1: Int = 1

  val a2: Unit = ()

  println(a2.toString)

  println(">>>>>>>>>>>>>>")
  println(printOne())

  trait A{
    def printOne(): Unit
    def printSomething(): Unit
  }

  class AImpl extends A {
    override def printOne(): Unit = println(1)

    override def printSomething(): Unit = ???
  }

  val b: A = new AImpl

  b.printOne()

  try{
    b.printSomething()
  } catch {
    case ex: Exception => println(ex.getMessage)
  }

  def fxn(a: Int, b: Int): Int = ???

  def fxn1(a: Int, b: Int): Int = throw new Exception("Not implemeted")

  fxn(1, 2)
}
