object ExceptionTest02 {
  def main(args: Array[String]): Unit = {
    if (args.length == 0) {
      throw new IllegalArgumentException("引数なし")
    }
  }
}

