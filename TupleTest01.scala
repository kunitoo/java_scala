val tuple01 = (1, "Taro", 68.0)
print(tuple01._1)
print(tuple01._2)
println(tuple01._3)

def getTuple(): (Int, String, Double) = {
  val no = 2
  val name = "Hanako"
  val weight = 45.8
  (no, name, weight)
}

def getTuple2(): (Int, String, Double) = {
  (3, "Jiro", 70.2)
}

val myTuple = getTuple()
print(myTuple._1)
print(myTuple._2)
println(myTuple._3)

val (no, name, weight) = getTuple2()
print(no)
print(name)
println(weight)

