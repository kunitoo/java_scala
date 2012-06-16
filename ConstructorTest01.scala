class ConstructorTest01(var id: Int, var name: String) {
  id *= 10

  def printId(): Unit = {
    println(id)
  }

  def printName(): Unit = {
    println(name)
  }
}

