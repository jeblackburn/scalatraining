package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(col: Int, row: Int): Int = {
      if (col == 0 || col == row) 1
      else {
        pascal(col - 1, row - 1) + pascal(col, row - 1)
      }
  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      var parenscope = 0
      def checknextchar(ch: List[Char]): Boolean = {
        if (ch.isEmpty) return true
        if (ch.head == '(') parenscope += 1
        if (ch.head == ')') parenscope -= 1
        if (parenscope < 0) return false
        checknextchar(ch.tail)
      }
      checknextchar(chars) && parenscope == 0
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money < 0 || coins.isEmpty) return 0
      if (money == 0 ) return 1
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }

  }
