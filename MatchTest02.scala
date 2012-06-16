def checkDataType(obj: Any): String = {
  obj match {
    case _: Int => "type Int"
    case _: String => "type String"
    case _ => "not match"
  }
}

println(checkDataType(123))
println(checkDataType("abc"))
println(checkDataType(1000L))
