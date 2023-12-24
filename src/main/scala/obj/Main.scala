package obj

import scala.io.StdIn

// Task
//
// Given two strings of different length, determine which string is longer or shorter. Print both strings and their length, one on each line. Print the longer one first.
//
// Measure the length of your string in terms of bytes or characters, as appropriate for your language. If your language doesn't have an operator for measuring the length of a string, note it.
//
// Extra credit
//
// Given more than two strings:
// list = ["abcd","123456789","abcdef","1234567"]
// Show the strings in descending length order.

object Main {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()

    val list = ( 1 to n ).map(_ => io.StdIn.readLine ).toList

    val sorter = new Sorter()
    val sortedList = sorter.sortByLength(list)

    sortedList.foreach( (s:String) => { println("%d: %s".format(s.length, s))} )
  }
}

