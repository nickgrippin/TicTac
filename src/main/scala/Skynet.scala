package src.main.scala

/**
  * Created by grippinn on 7/1/16.
  */
trait Skynet {
  def printBoard(a: Array[String]): String = {
    a(0) + "|" + a(1) + "|" + a(2) +
    "\n-----\n" +
    a(3) + "|" + a(4) + "|" + a(5) +
    "\n-----\n" +
    a(6) + "|" + a(7) + "|" + a(8)
  }

  def checkWin(a: Array[String]): Boolean = {
    (a(0).equals(a(1)) && a(0).equals(a(2)) && !a(0).equals(" ")) ||
      (a(3).equals(a(4)) && a(3).equals(a(5)) && !a(3).equals(" ")) ||
      (a(6).equals(a(7)) && a(6).equals(a(8)) && !a(6).equals(" ")) ||
      (a(0).equals(a(3)) && a(0).equals(a(6)) && !a(0).equals(" ")) ||
      (a(1).equals(a(4)) && a(1).equals(a(7)) && !a(1).equals(" ")) ||
      (a(2).equals(a(5)) && a(2).equals(a(8)) && !a(2).equals(" ")) ||
      (a(0).equals(a(4)) && a(0).equals(a(8)) && !a(0).equals(" ")) ||
      (a(2).equals(a(4)) && a(2).equals(a(6)) && !a(2).equals(" "))
  }
}
