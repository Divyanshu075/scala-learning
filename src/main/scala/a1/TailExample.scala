package a1

import scala.annotation.tailrec

class TailExample {

  @tailrec
  final def rec(n: Int): Int = if (n == 1) throw new Exception("asas") else rec(n - 1)
}
