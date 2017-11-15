import scala.annotation.tailrec

object Main {

  @tailrec
  def series(n:Int,acc:Int): Int = {
    if(n==0) {
      acc
    } else {
      series(n - 1,acc + n)
    }
  }

  @tailrec
  def fact(n:Int,acc:Int): Int = if(n == 1) 1 else fact(n-1, acc * n)
}

class Switch(var isOn: Boolean)

def toggle(switch: Switch): Switch = {
  if (switch.isOn) Switch(false) else Switch(true)
}

