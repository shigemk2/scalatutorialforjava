// 従って関数を引数として渡したり、変数に格納したり、他の関数からの戻り値にしたりできます。関数を値として扱うこの能力は、 関数プログラミング と呼ばれる大変興味深いプログラミング・パラダイムの基礎の一部です
object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def timeFiles() {
    println("time files like an arrow...")
  }
  def main(args: Array[String]) {
    oncePerSecond(timeFiles)
  }
}
