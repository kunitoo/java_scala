def intToString01(i: Int): String = {
  i.toString
}

def intToString02(i: Int) = {
  i.toString
}

def intToString03(i: Int):String = i.toString
def intToString04(i: Int) = i.toString

val intToString05: (Int) => String = (i: Int) => {
  i.toString
}: String
val intToString06: (Int) => String = (i: Int) => {
  i.toString
}
val intToString07: (Int) => String = (i: Int) => i.toString: String
val intToString08: (Int) => String = (i: Int) => i.toString
val intToString16 = (i: Int) => i.toString

println(intToString01(1))
println(intToString02(2))
println(intToString03(3))
println(intToString04(4))

println(intToString05(5))
println(intToString06(6))
println(intToString07(7))
println(intToString08(8))
println(intToString16(16))
