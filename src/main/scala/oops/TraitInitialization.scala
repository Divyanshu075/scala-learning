package oops

object TraitInitialization extends App {

  trait A {
    def add(a: Int, b: Int): Int

    def printSome() = println(add(1, 1))
  }

  class AImpl extends A {
    override def add(a: Int, b: Int): Int =  {
      println("AImpl")
      a + b
    }
  }

  val a: A = new AImpl
  val a1: A = new A {
    override def add(a: Int, b: Int): Int = {
      println("anonymous")
      a + b
    }
  }

  val a2: A = (a: Int, b: Int) => {
    println("new Way")
    a + b
  }

  val a3: A = (a, b) => a + b

  println(a.add(1, 2))
  println(a1.add(1, 2))
  println(a2.add(1, 2))
  println(a3.add(1, 2))

  trait B {
    def add(a: Int, b: Int): Int
    def sub(a: Int, b: Int): Int
  }

  val b = new B {
    override def add(a: Int, b: Int): Int = ???

    override def sub(a: Int, b: Int): Int = ???
  }

}
