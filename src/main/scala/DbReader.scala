package DbReader

object DbReader {

  def readTable(tableName: String): Unit = tableName match {
    case "books" => println("<<< books >>>")
    case "authors" => println("<<< authors >>>")
    case _ => throw new IllegalArgumentException(s"can't resolve table ${tableName}")
  }

  def main(args: Array[String]): Unit = {

    readTable("authors")
    readTable("actors")
  }
}
