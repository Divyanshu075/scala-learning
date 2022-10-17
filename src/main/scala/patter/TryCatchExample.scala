package patter

object TryCatchExample extends App {

  try {
    1 / 0
  } catch {

    case ex: ArithmeticException => println(ex.getMessage)
    case ex: Exception => println("sas")
  } finally {
    println("SAs")
  }

  try {
    throw new Throwable()
  } catch {
    case ex: ArithmeticException => println(ex)
    case ex: Exception => println("SAs")
    case ex => println(ex)
  }
}
