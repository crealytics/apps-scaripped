package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/** DataTableSource Interface for objects that can represent their data as a DataTable. Implementing classes Name Brief description DataTable A Data Table to be used in charts. Range Access and modify spreadsheet ranges. */
trait DataTableSource extends js.Object {
  /** Return the data inside this object as a DataTable. */
  def getDataTable: DataTable = js.native
}