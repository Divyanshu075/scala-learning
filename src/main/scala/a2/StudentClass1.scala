package a2

class StudentClass1(val name: String, val rollNumber: Int) {

  override def toString: String = s"StudentClass1($name,$rollNumber)"

  override def equals(obj: Any): Boolean = obj != null && obj.isInstanceOf[StudentClass1] && {
    val objCast: StudentClass1 = obj.asInstanceOf[StudentClass1]
    objCast.name == name && objCast.rollNumber == rollNumber
  }

  def add(a: Int): Int = rollNumber + a

//  ==, eq final can't be overrided
}
