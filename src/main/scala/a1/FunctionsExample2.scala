package a1

import scala.util.Random

object FunctionsExample2 extends App {

  def one: Int = 1

  val two = 2

  def onee(): Unit = println("Sas")

  def three = {
    println("def")
    3 + new Random().nextInt(20)
  }

  val four = {
    println("val")
    3 + new Random().nextInt(20)
  }

  println("SAsas")
  println(one)
  println(two)

  println(three)
  println(four)

  println(three)
  println(four)


  println(three)
  println(four)

  println(onee())
  println(onee())
  println(onee)

  //  println(one())
}
