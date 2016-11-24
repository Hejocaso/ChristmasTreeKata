/**
  * Created by helen on 24/11/16.
  */
class ChristmasTree extends App {
  val star = "@"
  val trunk = "#"

  def decoratedTree(height: Int, deco: Int) = height match {
    case 0 => "That's not a Christmas Tree."
    case _ => decor(height, "@"); generateTree(height, deco); decor(height, "#"); true
  }

  def decor(height: Int, symbol: String) = {
    for (i <- 0 until 1) {
      for (j <- 1 to height - i) {
        print(" ")
      }
      println(symbol)
    }
  }

  def generateTree(height:Int, deco: Int) = {
    for (i <- 0 until height) {
      //prints how many spaces per line. The (height - i) will do the opposite of 1 to i
      for (j <- 1 to height - i) {
        print(" ")
      }
      for (j <- 1 to (2 * i + 1)) { //prints tildes
        /*
        * The (2 * i + 1) will add 2 to the previous line
        * e.g.
        * when i = 2 then result = 5
        * when i = 3 then result = 7
        * */
        print("~")
      }
      println("")
    }
  }
}
