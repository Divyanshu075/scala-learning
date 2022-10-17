package a4

class Student(val fName: String, val lName: String, val rollNumber: Int) {
  
  println(Student.a)

  private val fullName = fName + " " + lName
}

object Student {

  private val a = 34

  def printFullName(student: Student): Unit = println(student.fullName)
}
