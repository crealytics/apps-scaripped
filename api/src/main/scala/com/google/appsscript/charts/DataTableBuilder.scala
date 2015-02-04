package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/**
 * DataTableBuilder Builder of DataTable objects. Building a data table consists of first specifying its columns, and then adding its rows, one at a time. Example: 
 *  var data = Charts.newDataTable()
 *      .addColumn(Charts.ColumnType.STRING, "Month")
 *      .addColumn(Charts.ColumnType.NUMBER, "In Store")
 *      .addColumn(Charts.ColumnType.NUMBER, "Online")
 *      .addRow(["January", 10, 1])
 *      .addRow(["February", 12, 1])
 *      .addRow(["March", 20, 2])
 *      .addRow(["April", 25, 3])
 *      .addRow(["May", 30, 4])
 *      .build();
 */
trait DataTableBuilder extends js.Object {
  /** Adds a column to the data table. Columns will be added from 0 to n. */
  def addColumn(`type`: ColumnType, label: String): DataTableBuilder = js.native
  /** Adds a row to the data table. */
  def addRow(values: Seq[AnyRef]): DataTableBuilder = js.native
  /** Builds and returns a data table. */
  def build(): DataTable = js.native
  /** Sets a specific value in the table. */
  def setValue(row: Int, column: Int, value: AnyRef): DataTableBuilder = js.native
}
