package patter

object Example1 extends App {

  val x: Int = 2

  x match {
    case 1 => {
      println(1)
      println("assas")
    }
    case 1 =>
      println(333)
    case 2 => println(2)
    case _ => println(x)
  }

  try {
    x match {
      case 1 => println(1)
    }
  } catch {
    case ex: Exception => println(ex.getMessage)
  }

  "Helli" match {
    case "helli" => println("Assa")
    case xit => println(xit.toUpperCase)
  }

  x match {
    case _: Int if x > 0 && x < 10 => println(x)
    case y: Int if y > 10 && y < 20 => println("fuck")
    case _: Int => println("asas")
  }

  "hello" match {
    case x: String if x.length > 1 => println("SAss")
  }

  val x1: Int = "Helli" match {
    case y if y.length > 5 => 5
    case y => y.length
  }
}
