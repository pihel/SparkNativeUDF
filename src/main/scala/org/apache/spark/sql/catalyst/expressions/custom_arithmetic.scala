package org.apache.spark.sql.catalyst.expressions

import org.apache.spark.sql.catalyst.expressions.codegen._
import org.apache.spark.sql.catalyst.util.TypeUtils
import org.apache.spark.sql.types._

case class Mynativefunc(child: Expression)
  extends UnaryExpression with ExpectsInputTypes with NullIntolerant {

  override def inputTypes: Seq[AbstractDataType] = Seq(NumericType)

  override def dataType: DataType = child.dataType

  private lazy val numeric = TypeUtils.getNumeric(dataType)

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = dataType match {
    case _ =>
      defineCodeGen(ctx, ev, c => s"$c + 777")
  }

  protected override def nullSafeEval(input: Any): Any = numeric.plus(input, 777)
}
