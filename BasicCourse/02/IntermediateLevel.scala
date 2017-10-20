object IntermediateLevel extends App {
    val value = 129512
    val tax = 1.08
    val amount = value * tax
    println(s"PCは${amount.toInt}です")
}