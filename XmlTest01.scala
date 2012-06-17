val xml1 = <name>Taro</name>

val xml2 =
  <names>
    <name>Taro</name>
    <name>Hanako</name>
  </names>

val name = "Jiro"
val xml3 = <name>{ name }</name>

val id = 100
val xml4 = <member>
  <id>{ id }</id>
  <name>{ name }</name>
</member>

def makeXml(name: String) = {
  <name>{ name }</name>
}
val xml5 = makeXml("Momoko")

println(xml1)
println(xml2)
println(xml3)
println(xml4)
println(xml5)
