object BannerCreator {

  private val decor = ".｡:･・.｡:*･★.｡:･・.｡:*･★.｡:･・.｡:*･★.｡:･・.｡:*･★.｡:･・.｡:*･★"

  def create(message: String): Unit = {
    s"""${decor}
       |${message}
       |${decor}""".stripMargin
  }

}

object MessageContainer {
  var message = ""
}