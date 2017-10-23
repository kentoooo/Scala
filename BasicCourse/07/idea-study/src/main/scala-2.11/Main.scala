object Main extends App{
  val a = 2
  val b = 3

  println(s"a = ${a}")

  printMutli

  private def printMutli = {
    println(s"答えは${a * b}")
  }
}
