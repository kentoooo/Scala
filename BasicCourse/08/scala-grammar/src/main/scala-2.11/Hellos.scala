object Hellos extends App {

  def putHellosToCache(i: Int): Unit = {
    val hellos = Cache.map(i)
    Cache.map = Cache.map + ((i + 1) -> (hellos + "hello!"))
  }

  val count = 100000000
  for (i <- 0 to count) putHellosToCache(i)

  println(Cache.map(count))
}

object Cache {

  var map: Map[Int, String] = Map(0 -> "")

}