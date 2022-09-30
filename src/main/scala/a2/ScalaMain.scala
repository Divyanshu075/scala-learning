package a2

object ScalaMain extends App {

  val studentClass = new StudentClass("Arpit", 23, "123333333333", "myid")
  val studentClass1 = new StudentClass("Arpit", 23, "123333333333", "myid")
  val studentClass2 = new StudentClass("Arpit", 232, "123333333333", "myid")

//  println(studentClass.name)

  println(studentClass)
  println(studentClass.rollNumber)
  println(studentClass.mobile)
  studentClass.mobile = "32323232323"
  println(studentClass.mobile)

//  println(studentClass.id)
}
