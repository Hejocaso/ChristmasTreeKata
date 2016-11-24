def tree(height: Int) = {
  for(i <- 0 until height) {
    for (j <- 1 to height - i) {
      print(" ")
    }
    for (j <- 1 to (2 * i + 1)) {
      print("~")
//      if ((j == (2 * i + 1)/2) && i == height - 1) {
//        print("#")
//      }
    }
    println("")
  }
}

def star(height: Int) = {
  for(i <- 0 until 1) {
    for (j <- 1 to height - i) {
      print(" ")
    }
    println("@")
  }
}

star(7)
tree(7)



def pascal(c: Int, r: Int): Int = {
  if  (c == 0 || c == r || r == 0)  1
  else
    pascal(c - 1, r - 1) + pascal(c, r - 1)
}
