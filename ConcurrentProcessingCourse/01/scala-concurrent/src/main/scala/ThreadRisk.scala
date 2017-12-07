object ThreadRisk extends App{

  private var countar = 0

  def next(): Int =  synchronized{
    countar = countar + 1
    countar
  }

  for(i <- 1 to 10) {
    new Thread(() => for(j <- 1 to 100000) println(next())).start()
  }

}
