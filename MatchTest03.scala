def checkInt(iVal: Int): String = {
  iVal match {
    case n if n > 0 => "sei-suu"
    case 0 => "zero"
    case _ => "fu-suu"
  }
}

println(checkInt(123))
println(checkInt(0))
println(checkInt(-123))

