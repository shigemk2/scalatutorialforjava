// Java プログラマにとって馴染みが薄いのは、main メソッドを囲んでいる object という宣言でしょう。このような宣言によって、 シングルトンオブジェクト として知られるただ一つのインスタンスしか持たないクラスを導入できます。
// Scala プログラミングでは、静的メンバを定義するのではなくて、シングルトンオブジェクトのメンバを宣言
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
  }
}
