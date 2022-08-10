package DbReader

import java.util.logging.Logger

object DbReader {

  val log = Logger.getLogger("DbReader")
  def readTable(tableName: String): Unit = tableName match {
    case "books" => log.info("get books")
    case "authors" => log.info("get authors")
    case _ => throw new IllegalArgumentException(s"can't resolve table ${tableName}")
  }

  def main(args: Array[String]): Unit = {

    readTable("books")
    readTable("authors")
  }
}
