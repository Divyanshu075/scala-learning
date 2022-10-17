package a6

object Main extends App {

  class Student (name: String) {

    def apply(): String = name

    def apply(a: Int, b: Int) = a + b
  }

  object Student {

    def apply(name: String): Student = {
      println("Dasdsad")
      new Student(name)
    }
  }

  class Something private ()

  object Something {

    def apply(): Unit = println("Sasas")
  }

  val student = new Student("Arpit")

  println(student.apply())

  println(student())

  println(student(1, 2))

  val student1: Student = Student.apply("sasas")

  val student2: Student = Student("sdadasd")

  Something.apply()
  Something.apply()

  val tuple1 = new Tuple3(1, 2, 3)
  val tuple2 = Tuple3(1, 2, 3)
  val tuple3 = Tuple3.apply(1, 2, 3)

  val x = new Student("Sas")
  val x1: Student = Student("sas")
  val x2 = Student.apply("1212")
}
