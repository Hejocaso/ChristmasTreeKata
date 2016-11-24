/**
  * Created by helen on 24/11/16.
  */
class ChristmasTree extends App {
  val Star = "@"
  val FirstRow = "~"
  val Trunk = "#"
  val list = List()

  def decoratedTree(height: Int, deco: Int) = height match {
    case 0 => "That's not a Christmas Tree."
    case _ => star(height); generateTree(height, deco); true
  }

  def star(height: Int) = {
    for(i <- 0 until 1) {
      for (j <- 1 to height - i) {
        print(" ")
      }
      println("@")
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
