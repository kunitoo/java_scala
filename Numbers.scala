object Numbers {
  private val dataList = (1 to 5).toList

  def searchData(number: Int): Option[String] = {
    if (dataList.exists(_ == number)) {
      Some(number.toString)
    } else {
      None
    }
  }
}

