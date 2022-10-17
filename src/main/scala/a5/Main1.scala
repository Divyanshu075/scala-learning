package a5

object Main1 extends App {

  class StudentAbove18(age: Int) {

    if (age <= 18) {
      throw new Exception(s"Age is less than 18: $age")
    }
  }

  val a = new StudentAbove18(23)
  val a1 = new StudentAbove18(1)

  val a2 = new StudentAbove18(23)

}
