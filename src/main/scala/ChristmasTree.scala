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
    case _ => generateTree(height, deco)
  }

//  def generateTree(height: Int, deco: Int) = {
//    println(Star)
//    println(FirstRow)
//    for (i <- 1 to height) yield
//    println(Trunk)
//  }

  def generateTree(height:Int, deco: Int) = {
    if (height == 1 && deco == 0) {
      println("@\n" + "~\n" + "#")
    } else {
      println("@\n"+ "~")
      for (i <- 1 to height) {
        for (j <- 0 to i) yield print("~")
        println("")
      }
      println("#")
    }
  }
}
