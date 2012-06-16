import scala.collection.mutable.ListBuffer

var list01 = ListBuffer[Int]()

var list02 = ListBuffer("aaa", "bbb", "ccc")

list01 += 100
list02 += "eee"

list01.insert(0, 50)
list02.insert(3, "ddd")

println(list01.apply(1))
println(list02(3))

list01.update(0, 25)
list02.update(2, "???")

list01.remove(1)
list02.remove(3)

println(list01.size)
println(list02.length)

list01.clear()
list02.clear

