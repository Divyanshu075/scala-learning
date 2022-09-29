object ControlExamples extends App {

  val cond: Boolean = true

  if (cond)
    println("Sas")
  else
    println("sdad")
  println("asas")


  val a: Int = if (cond) {
    3344
  } else {
    333
  }

  val cond1 = false

  val b = if (cond) {
    323
  } else if (cond1) {
    333
  } else {
    444
  }

  def fxn(a: Int) = {
    if (cond) {
      323
    } else {
      323
    }
  }

  def fxn1(a: Int) = if (cond) {
    333
  } else {
    333
  }

  def fxn1: Unit = {
    if (cond)
      println("sas")
    else
      println("Sassa")
  }

  val a1 = if (cond) 34 else 333
  val a2 = if (cond) 34 else if (cond) 444 else 333

  var i = 0

  while(i < 6) {
    println(i)
    i += 1
  }

  do {

    i -= 1
  } while (i > 4)

  for(x <- 1 to 6) {
    println(x)
  }

  println(">>>>>>>")

  for (x <- 1 until 6) {
    println(x)
  }

  println(">>>>")

  for(x <- 1 to 6 by 2) {
    println(x)
  }

  println(">>>>>>>>>>")

  for(x <- 6 to 1 by -1) {
    println(x)
  }

  println(">>>>>>>>>")

  def incre(x: Int) = x * 2

  val a = 1

  for(x <- 1 to 100 by incre(a)) {
    println(x)
  }
}
