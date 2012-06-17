import scala.xml.XML.save
import scala.xml.dtd.DocType
import scala.xml.dtd.PublicID

val xml00 =
  <members>
    <member gneder="male">
      <id>1</id>
      <name>Taro</name>
    </member>
    <member gneder="female">
      <id>2</id>
      <name>Hanako</name>
    </member>
  </members>

save("xml01.xml", xml00)
save("xml02.xml", xml00, "UTF-8")
save("xml03.xml", xml00, "UTF-8", true)

