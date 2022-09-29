class StudentScala(val name: String, val rollNumber: Int) {

  val a = 333
  var b = 56

  override def toString: String = s"StudentScala($name,$rollNumber)"

  def +(obj: StudentScala) = new StudentScala(this.name + obj.name, this.rollNumber + obj.rollNumber)
}

object StudentScala {

  val defaultName: String = "String"
}
