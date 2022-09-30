package a2

object ScalaMain1 extends App {

  val a: StudentClass1 = new StudentClass1("Arpit", 1)
  val b: StudentClass1 = new StudentClass1("Arpit", 1)
  val c: StudentClass1 = new StudentClass1("Arpit", 2)

  println(a, b, c)

  println(a == a)
  println(a == b)
  println(a == c)

  println(">>>>>>>>>>>>>>>>>>>")

  println(a.equals(a))
  println(a.equals(b))
  println(a.equals(c))

  println(a equals b)

  println(a eq b)

  println(a add 1)

  println(a add(1))

  println(a.add(1))

  println(">>>>>>>>>>>>>>>>>>")

  println(a.eq(a))
  println(a.eq(b))
  println(a.eq(c))

  println(">>>>>>>>>>>")

  println(a == null)
  println(a.equals(null))

  println("[[[[[[[[[[[[[[[[[")

  println(null == a)
  println(null.==(a))
  println(null.equals(a))
}
