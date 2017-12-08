import java.util.concurrent.atomic.AtomicReference

object ReadModifyWrite extends App{

  for (i <- 1 to 100) {
    new Thread(() => println(FactorialProvider.next)).start()
  }

}

object FactorialProvider {
  private[this] val lastNumber = new AtomicReference[BigInt](BigInt(0))
  private[this] val lastFactional = new AtomicReference[BigInt](BigInt(1))

  def next: BigInt = synchronized{
    val currentNum = lastNumber.get()
    Thread.sleep(100)
    val nextNum = currentNum + 1
    lastNumber.set(nextNum)

    val currentFact = lastFactional.get()
    Thread.sleep(100)
    val nextFact = currentFact * nextNum
    lastFactional.set(nextFact)
    nextFact
  }

}
