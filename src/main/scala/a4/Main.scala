package a4

object Main extends App {

  val student: Student = new Student("Arpit", "Garg", 53)
  val stu: Student.type = Student

  Student.printFullName(student)
  stu.printFullName(student)
}
