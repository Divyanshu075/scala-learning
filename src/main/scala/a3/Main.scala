package a3

object Main extends App {

//  val a = new ScalaMain1

  val a: ScalaMain1.type = ScalaMain1
  val b = ScalaMain1

  println(a.variable)
  ScalaMain1.variable = 3444
  println(a.variable)
  println(ScalaMain1.variable)
  println(b.variable)

  println(a.isInstanceOf[ScalaMain1.type])

  println(ScalaMain1.add(1, 2))

  println(a.add(1, 2))
}
