package obj

class Sorter {
  def sortByLength(list: List[String]): List[String] = {
    list.sortWith( _.length > _.length )
  }
}
