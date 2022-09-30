package a2

class StudentClass1(val name: String, val rollNumber: Int) {

  override def toString: String = s"StudentClass1($name,$rollNumber)"

  override def equals(obj: Any): Boolean = obj != null && obj.isInstanceOf[StudentClass1] && {
    val objCast: StudentClass1 = obj.asInstanceOf[StudentClass1]
    objCast.name == name && objCast.rollNumber == rollNumber
  }

  def addRollNumber(a: StudentClass1): Int = rollNumber + a.rollNumber
  def addRollNumber1(a: StudentClass1, b: StudentClass1): Int = rollNumber + a.rollNumber

//  ==, eq final can't be overrided
}
