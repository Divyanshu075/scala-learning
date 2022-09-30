package a1

object InnerFunctions extends App {

  def add(a: Int, b: Int): Int = {

    def compute(c: Int) = a + b + c

    def compute0(c: Int) = compute3(22)

    def compute1(c: Int) = a + b + c

    def compute2(c: Int) = a + b + c

    def compute3(c: Int) = compute2(3)


    compute(0)
  }


  println(add(2, 3))
}
