package a1

object TuplesExamples1 extends App {

  class MyTuple1[A, B](val _1: A, val _2: B) {

    override def toString: String = s"(${_1}, ${_2})"
  }

  //  Tuple1
  //  Tuple2
  //  Tuple22
  val a: MyTuple1[Int, String] = new MyTuple1[Int, String](1, "222")

  println(a)
  println(a._1)
  println(a._2)

  val b: (Int, String, Boolean, Double) = new Tuple4[Int, String, Boolean, Double](1, "asa", false, 34.4)
  val b1: Tuple4[Int, Int, Int, Int] = (1, 2, 3, 4)

  println(b.isInstanceOf[Tuple4[Int, String, Boolean, Double]])
  println(b.isInstanceOf[(Int, String, Boolean, Double)])

  println(b1.isInstanceOf[Tuple4[Int, String, Boolean, Double]])
  println(b1.isInstanceOf[(Int, String, Boolean, Double)])

  val d: (Int, Int) = (1, 2)
  val d1: Tuple2[Int, Int] = (1, 2)

  val e = (1, 2, 3)
  val e1 = new Tuple3(1, 2, 3)


  println(b._1)

  val a23: (Int, MyTuple1[Int, Int]) = (1, new MyTuple1(2, 3))

  val (_, f, _, _) = b

  println(f)
}
