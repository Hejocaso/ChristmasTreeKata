import org.scalatest.{Matchers, WordSpecLike}

/**
  * Created by helen on 24/11/16.
  */
class ChristmasTreeSpec extends WordSpecLike with Matchers {
  "Calling ChristmasTree" should {
    "generate a decorated Christmas tree of an arbitary height and decors" in {
      val christmasTree = new ChristmasTree
      christmasTree.decoratedTree(7,2) should be ("")
    }

    "return 'That's not a Christmas Tree.' if height is 0" in {
      val christmasTree = new ChristmasTree
      christmasTree.decoratedTree(0,2) should be("That's not a Christmas Tree.")
    }

    "return 'That's not a Christmas Tree.' if height is 1 and deco is 0" in {
      val christmasTree = new ChristmasTree
      christmasTree.decoratedTree(1,0) should be("That's not a Christmas Tree.")
    }
  }
}
