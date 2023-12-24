package obj

import org.scalatest.funsuite.AnyFunSuiteLike

class SortByLengthTest extends AnyFunSuiteLike {
  val sorter = new Sorter()

  test("testSortByLength") {
    assert(sorter.sortByLength(List("tom", "anna")) == List("anna", "tom"))
    assert(sorter.sortByLength(List("tom", "anna", "alex")) == List("anna", "alex", "tom"))
    assert(sorter.sortByLength(List("tom", "alex", "anna")) == List("alex", "anna", "tom"))
    assert(sorter.sortByLength(List("tom", "anna", "alex", "steven")) == List("steven", "anna", "alex", "tom"))
  }

}
