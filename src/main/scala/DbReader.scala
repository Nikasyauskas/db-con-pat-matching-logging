package DbReader

object DbReader {

  def readTable(tableName: String): Unit = tableName match {
    case "books" => println("booksssss")
    case "authors" => println("suthorsssss")
    case _ =>
  }

  def main(args: Array[String]): Unit = {

    readTable("authors")
  }
}
