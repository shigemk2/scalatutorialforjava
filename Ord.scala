class Date(y: Int, m: Int, d: Int)  {
  def year = y
  def month = m
  def day = d
  override def toString(): String = year + "" + month + "" + day
}
object Ord {
  // trait Ord {
  //   def < (that: Any): Boolean
  //   def <=(that: Any): Boolean = (this < that) || (this == that)
  //   def > (that: Any): Boolean = !(this <= that)
  //   def >=(that: Any): Boolean = !(this < that)
  // }

  // class Date(y: Int, m: Int, d: Int) extends Ord {

  // // Object から継承している equals メソッドを再定義し、個々のフィールドを比較することで正しく日付を比較するようにします
  // override def equals(that: Any): Boolean =
  //   that.isInstanceOf[Date] && {
  //     val o = that.asInstanceOf[Date]
  //     o.day == day && o.month == month && o.year == year
  //   }

  // def <(that: Any): Boolean = {
  //   if (!that.isInstanceOf[Date])
  //     error("cannot compare " + that + " and a Date")

  //   val o = that.asInstanceOf[Date]
  //   (year < o.year) ||
  //   (year == o.year && (month < o.month ||
  //     (month == o.month && day < o.day)))
  // }

  def main(args: Array[String]) {
    val d1 = new Date(2014, 10, 11)
    println(d1)
  }
}
