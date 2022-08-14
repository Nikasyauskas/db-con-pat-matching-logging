package DbReader

import org.slf4j.LoggerFactory

object DbReader {
  private val logger = LoggerFactory.getLogger(this.getClass)

  def readTable(tableName: String): Unit = tableName match {
    case "books" => logger.debug("get books")
    case "authors" => logger.debug("get authors")
    case _ => throw new IllegalArgumentException(s"can't resolve table ${tableName}")
  }

}

object ReadDb{
  def main(args: Array[String]): Unit = {

    val logger = LoggerFactory.getLogger("DbReader.ReadDb")
    logger.info("Start application")

    DbReader.readTable("books")

    logger.info("Stop application")
  }

}



