class User(private val name: String, private val age : Int) {

  override def toString = s"User($name,$age)"

}

object User {

  def printAge(user: User): Unit = println(user.age)

  def apply(string: String): User = {
    val parts = string.split(",")
    val name = parts(0)
    val age = parts(1).toInt
    new User(name,age)
  }

}

object Cache {

  var map: Map[Int, String] = Map(0 -> "")

}