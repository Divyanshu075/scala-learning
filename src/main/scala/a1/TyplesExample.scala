package a1

object TyplesExample extends App {

  //22
  val a: (Int, String, Boolean, Double) = (1, "sasas", true, 1.2)

  val a1: Int = a._1
  val a2: String = a._2
  val a3: Boolean = a._3
  val a4: Double = a._4

  val point: (Int, Int) = (1, 2)

  val (x, y) = point

  println(a.toString)

  def anyFxn(a: Int, b: Int): (Int, String, String) = (a + b, s"$a $b", s"$a")

  def params(a: (Int, String)) = println(a._1, a._2)

  params((1, "sas"))

  val b: (Int, String, String) = anyFxn(1, 2)

  println(b._1, b._2, b._3)

  val (x1, x2, x3, x4) = a
  val (x5: Int, x6: String, x7: Boolean, x8: Double) = a

  val (_, f1: String, _, _) = a

  println(x5)
  println(x1)
  println(a1)
  println(f1)
}
