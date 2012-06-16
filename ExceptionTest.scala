import java.io.IOException
import java.io.FileNotFoundException
import scala.io.Source

try {
  val src = Source.fromFile("TextFile.txt")
  for (line <- src.getLines()) {
    println(line)
  }
  src.close()
} catch {
  case ex: FileNotFoundException => println(ex)
  case ex: IOException => println(ex)
} finally {
  println("処理終了")
}

