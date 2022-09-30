package a2

// private, private[_], protected
class StudentClass(name: String,
                   val rollNumber: Int,
                   var mobile: String = "",
                   private val id: String = "323") {

  override def toString: String = s"StudentClass($name, $rollNumber, $mobile, $id)"
  //  def compare(obj: StudentClass): Int = {
  //    obj.id.compareTo(id) + obj.rollNumber.compareTo(rollNumber) + obj.name.toInt
  //  }


}
