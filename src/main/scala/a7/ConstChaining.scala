package a7

object ConstChaining extends App {

  class Student(name: String, rollNumber: Int) {

    def this(name: String) = {
      this(name, -1)
    }

    //    def this(name: String, rollNumber: Int) = {
    //      this(name, rollNumber)
    //    }
  }


  val a = new Student("sasas", 323)
  val b = new Student("assas")

  class A(a: Int, b: Int = 344)


  val a1 = new A(2, 3)
  val a2 = new A(323)

}
