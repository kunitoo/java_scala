println(Numbers.searchData(1))
println(Numbers.searchData(10))

Numbers.searchData(2) match {
  case Some(x) => println(x)
  case _ => println("該当データなし")
}

Numbers.searchData(12) match {
  case Some(x) => println(x)
  case _ => println("該当データなし")
}

Numbers.searchData(2) match {
  case Some(x) => println(x)
  case None => println("該当データなし")
}
