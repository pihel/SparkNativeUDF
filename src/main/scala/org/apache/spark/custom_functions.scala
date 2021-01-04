package org.apache.spark.sql

import org.apache.spark.sql.catalyst.expressions._

object custom_functions {
  def mynativefunc(e: Column): Column = Column { Mynativefunc(e.expr) }
}
