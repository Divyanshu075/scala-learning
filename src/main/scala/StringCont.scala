object StringCont extends App {

  val a = "Arpit"
  val b = "Garg"

  val x = 3
  val y = 2

  val c = a + b
  val d = a + "   " + b

  val e = a.concat(b)
  val f = a.+(b)

  val g = "Firts name is $a and second name is $b"
  val h = s"Firts name is $a and second name is $b"

  println(g)

  println(s"Sum of $x & $y is $x+$y = ${x + y}")
  println(s"$a.toUpperCase\"\"")
  println(s"${a.concat("asas")}")

  def toUpper(s: String) = s.toUpperCase

  def zero(sa: Int) = sa.toString

  def one = "sas"

  println(s"${toUpper("sas")}")

//  println(s"$zero(2323)")

  println(s"$one")

  val a1 = "name \r \t \n is \"Arpit\""

  // raw strings
  val a2 =
    s"""kjsadfjsdf
      |${"\n"}dsafkhsalkjdfkjdsaf dsaflkdsajfdsajf "dfsdfdsf" dfs "F"dfdsfdsf "dsfdsfsdfsdf"""".stripMargin


  println(a2)

  val a3 = "{\n" + "\"name\": \"Arpit\"\n}"

  println(a3)

  val a4 =
    s"""
      |{
      |           "name": "$a"
      |           "sasas": "asassa"
      |}""".stripMargin

  println(a4)
}
