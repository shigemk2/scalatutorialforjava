// yScala はオブジェクト指向言語であり、それゆえにクラスの概念があります。Scala のクラスは、Java の構文と似た構文で宣言します。重要な違いは Scala のクラスはパラメータを持てるということ
class Complex(real: Double, imaginary: Double) {
  def re() = real
  def im() = imaginary

  override def toString() =
    "" + re + (if (im < 0) "-" else "+") + im + "i"
}

object ComplexNumbers {
  def main(args: Array[String]) {
    val c = new Complex(1.2, 3.4)
    println("imaginary part: " + c.toString())
  }
}
