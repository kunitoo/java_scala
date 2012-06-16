val names = List("Taro", "Hanako", "Jiro", "Ichiro", "Momoko", "Takeshi")
val groupBy = names.groupBy(_.length())
groupBy.foreach(println)
