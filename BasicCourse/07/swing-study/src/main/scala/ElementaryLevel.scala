object Main extends App {
  val a = 2
  val z = 3
  printMulti
  println("a = " + a)

  def printMulti: Unit = {
    println(s"答えは${a * z}")
  }
}