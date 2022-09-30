package a1

object LazyEvaluation extends App {

  class Example {

    val a: Int = {
      println("val >>")
      12
    }

    def b: Int = {
      println("def <<")
      32
    }

    lazy val c: Int = {
      println("lazy val [[")
      34
    }
  }

  val example = new Example

  println(example.a)
  println(example.b)
  println(example.c)

  println(example.c)
  println(example.c)
  println(example.c)

  println(example.b)

}
