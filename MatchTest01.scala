def checkArray(array: Array[Int]): String = {
  array match {
    case Array(1, 2) => "Array(1, 2)"
    case Array(2, _) => "array first 2"
    case _ => "not match"
  }
}

println(checkArray(Array(1, 2)))
println(checkArray(Array(2, 3)))
println(checkArray(Array(3, 4)))
