@throws(classOf[ArithmeticException])
def tenDiv2(iVal: Int): Double = {
  if (iVal == 0) {
    throw new ArithmeticException()
  }
  10. / iVal
}

tenDiv2(0)
