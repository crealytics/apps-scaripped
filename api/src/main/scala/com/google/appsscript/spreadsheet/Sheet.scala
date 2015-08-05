package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Sheet Access and modify spreadsheet sheets. Common operations are renaming a sheet and accessing range objects from the sheet. */
trait Sheet extends js.Object {
  /** Activates this sheet. Does not alter the sheet itself, only the parent's notion of the active sheet. */
  def activate(): Sheet = js.native
  /** Appends a row to the spreadsheet. This operation is atomic; it prevents issues where a user asks for the last row, and then writes to that row, and an intervening mutation occurs between getting the last row and writing to it. */
  def appendRow(rowContents: js.Array[AnyRef]): Sheet = js.native
  /** Sets the width of the given column to fit its contents */
  def autoResizeColumn(columnPosition: Int): Sheet = js.native
  /** Clears the sheet of content and formatting information. */
  def clear(): Sheet = js.native
  /** Clears the sheet of contents and/or format, as specified with the given advanced options. The advanced options are: */
  def clear(options: AnyRef): Sheet = js.native
  /** Clears the sheet of contents, while preserving formatting information. */
  def clearContents(): Sheet = js.native
  /** Clears the sheet of formatting, while preserving contents. Formatting refers to how data is formatted as allowed by choices under the "Format" menu (ex: bold, italics, conditional formatting) and not width or height of cells. */
  def clearFormats(): Sheet = js.native
  /** Clears the sheet of all notes. */
  def clearNotes(): Sheet = js.native
  /** Copies the sheet to a given spreadsheet, which can be the same spreadsheet as the source. The copied sheet will be named "Copy of [original name]". */
  def copyTo(spreadsheet: Spreadsheet): Sheet = js.native
  /** Deletes the column at the given column position. */
  def deleteColumn(columnPosition: Int): Sheet = js.native
  /** Deletes a number of columns starting at the given column position. */
  def deleteColumns(columnPosition: Int, howMany: Int): Unit = js.native
  /** Deletes the row at the given row position. */
  def deleteRow(rowPosition: Int): Sheet = js.native
  /** Deletes a number of rows starting at the given row position. */
  def deleteRows(rowPosition: Int, howMany: Int): Unit = js.native
  /** Returns the active cell in this sheet. */
  def getActiveCell(): Range = js.native
  /** Returns the active range for the active sheet. Returns the range of cells that is currently considered active. This generally means the range that a user has selected in the active sheet, but in a custom function it refers to the cell being actively recalculated. Note that when called on a SpreadsheetApp it effectively calls getActiveSpreadsheet and then getActiveSheet to act on the active Sheet. */
  def getActiveRange(): Range = js.native
  /** Returns an array of charts on this sheet. */
  def getCharts(): js.Array[EmbeddedChart] = js.native
  /** Gets the width in pixels of the given column. */
  def getColumnWidth(columnPosition: Int): Int = js.native
  /** Returns a Range corresponding to the dimensions in which data is present. This is functionally equivalent to creating a Range bounded by A1 and (Range.getLastColumn(), Range.getLastRow()). */
  def getDataRange(): Range = js.native
  /** Returns the number of frozen columns. */
  def getFrozenColumns(): Int = js.native
  /** Returns the number of frozen rows. */
  def getFrozenRows(): Int = js.native
  /** Gets the position of the sheet in its parent spreadsheet. Starts at 1. */
  def getIndex(): Int = js.native
  /** Returns the position of the last column that has content. */
  def getLastColumn(): Int = js.native
  /** Returns the position of the last row that has content. */
  def getLastRow(): Int = js.native
  /** The maximum width of the sheet, regardless of content. */
  def getMaxColumns(): Int = js.native
  /** The maximum height of the sheet, regardless of content. */
  def getMaxRows(): Int = js.native
  /** Returns the name of the sheet. */
  def getName(): String = js.native
  /** Returns the Spreadsheet that contains this sheet. */
  def getParent(): Spreadsheet = js.native
  /** Gets an array of objects representing all protected ranges in the sheet, or a single-element array representing the protection on the sheet itself. */
  def getProtections(`type`: ProtectionType): js.Array[Protection] = js.native
  /** Returns the range with the top left cell at the given coordinates. */
  def getRange(row: Int, column: Int): Range = js.native
  /** Returns the range with the top left cell at the given coordinates, and with the given number of rows. */
  def getRange(row: Int, column: Int, numRows: Int): Range = js.native
  /** Returns the range with the top left cell at the given coordinates with the given number of rows and columns. */
  def getRange(row: Int, column: Int, numRows: Int, numColumns: Int): Range = js.native
  /** Returns the range as specified in A1 notation or R1C1 notation. */
  def getRange(a1Notation: String): Range = js.native
  /** Gets the height in pixels of the given row. */
  def getRowHeight(rowPosition: Int): Int = js.native
  /** Returns the ID of the sheet represented by this object. This is an ID for the sheet that is unique to the spreadsheet. The ID is a monotonically increasing integer assigned at sheet creation time that is independent of sheet position. This is useful in conjunction with methods such as Range.copyFormatToRange(gridId, column, columnEnd, row, rowEnd) that take a gridId parameter rather than a Sheet instance. */
  def getSheetId(): Int = js.native
  /** Returns the sheet name. */
  def getSheetName(): String = js.native
  /** Returns the rectangular grid of values for this range starting at the given coordinates. A -1 value given as the row or column position is equivalent to getting the very last row or column that has data in the sheet. */
  def getSheetValues(startRow: Int, startColumn: Int, numRows: Int, numColumns: Int): js.Array[js.Array[AnyRef]] = js.native
  /** Hides the columns in the given range. */
  def hideColumn(column: Range): Unit = js.native
  /** Hides the column at the given index. */
  def hideColumns(columnIndex: Int): Unit = js.native
  /** Hides one or more consecutive columns starting at the given index. */
  def hideColumns(columnIndex: Int, numColumns: Int): Unit = js.native
  /** Hides the rows in the given range. */
  def hideRow(row: Range): Unit = js.native
  /** Hides the row at the given index. */
  def hideRows(rowIndex: Int): Unit = js.native
  /** Hides one or more consecutive rows starting at the given index. */
  def hideRows(rowIndex: Int, numRows: Int): Unit = js.native
  /** Hides this sheet. Has no effect if the sheet is already hidden. If this method is called on the only visible sheet, it will throw an exception. */
  def hideSheet(): Sheet = js.native
  /** Adds a new chart to this sheet. */
  def insertChart(chart: EmbeddedChart): Unit = js.native
  /** Inserts a column after the given column position. */
  def insertColumnAfter(afterPosition: Int): Sheet = js.native
  /** Inserts a column before the given column position. */
  def insertColumnBefore(beforePosition: Int): Sheet = js.native
  /** Inserts a blank column in a sheet at the specified location. */
  def insertColumns(columnIndex: Int): Unit = js.native
  /** Inserts one or more consecutive blank columns in a sheet starting at the specified location. */
  def insertColumns(columnIndex: Int, numColumns: Int): Unit = js.native
  /** Inserts a number of columns after the given column position. */
  def insertColumnsAfter(afterPosition: Int, howMany: Int): Sheet = js.native
  /** Inserts a number of columns before the given column position. */
  def insertColumnsBefore(beforePosition: Int, howMany: Int): Sheet = js.native
  /** Inserts a Blob as an image in the document at a given row and column. The image size is retrieved from the blob contents. */
  def insertImage(blob: Blob, column: Int, row: Int): Unit = js.native
  /** Inserts a Blob as an image in the document at a given row and column, with a pixel offset. The image size is retrieved from the blob contents. */
  def insertImage(blob: Blob, column: Int, row: Int, offsetX: Int, offsetY: Int): Unit = js.native
  /** Inserts an image in the document at a given row and column. */
  def insertImage(url: String, column: Int, row: Int): Unit = js.native
  /** Inserts an image in the document at a given row and column, with a pixel offset. */
  def insertImage(url: String, column: Int, row: Int, offsetX: Int, offsetY: Int): Unit = js.native
  /** Inserts a row after the given row position. */
  def insertRowAfter(afterPosition: Int): Sheet = js.native
  /** Inserts a row before the given row position. */
  def insertRowBefore(beforePosition: Int): Sheet = js.native
  /** Inserts a blank row in a sheet at the specified location. */
  def insertRows(rowIndex: Int): Unit = js.native
  /** Inserts one or more consecutive blank rows in a sheet starting at the specified location. */
  def insertRows(rowIndex: Int, numRows: Int): Unit = js.native
  /** Inserts a number of rows after the given row position. */
  def insertRowsAfter(afterPosition: Int, howMany: Int): Sheet = js.native
  /** Inserts a number of rows before the given row position. */
  def insertRowsBefore(beforePosition: Int, howMany: Int): Sheet = js.native
  /** Returns true if the sheet is currently hidden. */
  def isSheetHidden(): Boolean = js.native
  /** Returns a builder to create a new chart for this sheet. */
  def newChart(): EmbeddedChartBuilder = js.native
  /** Creates an object that can protect the sheet from being edited except by users who have permission. Until the script actually changes the list of editors for the sheet (by calling Protection.removeEditor(emailAddress), Protection.removeEditor(user), Protection.removeEditors(emailAddresses), Protection.addEditor(emailAddress), Protection.addEditor(user), Protection.addEditors(emailAddresses), or setting a new value for Protection.setDomainEdit(editable)), the permissions will mirror those of the spreadsheet itself, which effectively means that the sheet remains unprotected. If the sheet is already protected, this method returns an object representing its existing protection settings. A protected sheet may include unprotected regions. */
  def protect(): Protection = js.native
  /** Removes a chart from the parent sheet. */
  def removeChart(chart: EmbeddedChart): Unit = js.native
  /** Sets the active range for the active sheet. */
  def setActiveRange(range: Range): Range = js.native
  /** Sets the active selection region for this sheet. */
  def setActiveSelection(range: Range): Range = js.native
  /** Sets the active selection, as specified in A1 notation or R1C1 notation. */
  def setActiveSelection(a1Notation: String): Range = js.native
  /** Sets the width of the given column in pixels. */
  def setColumnWidth(columnPosition: Int, width: Int): Sheet = js.native
  /** Freezes the given number of columns. If zero, no columns are frozen. */
  def setFrozenColumns(columns: Int): Unit = js.native
  /** Freezes the given number of rows. If zero, no rows are frozen. */
  def setFrozenRows(rows: Int): Unit = js.native
  /** Sets the sheet name. */
  def setName(name: String): Sheet = js.native
  /** Sets the row height of the given row in pixels. */
  def setRowHeight(rowPosition: Int, height: Int): Sheet = js.native
  /** Unhides the column at the given index. */
  def showColumns(columnIndex: Int): Unit = js.native
  /** Unhides one or more consecutive columns starting at the given index. */
  def showColumns(columnIndex: Int, numColumns: Int): Unit = js.native
  /** Unhides the row at the given index. */
  def showRows(rowIndex: Int): Unit = js.native
  /** Unhides one or more consecutive rows starting at the given index. */
  def showRows(rowIndex: Int, numRows: Int): Unit = js.native
  /** Makes the sheet visible. Has no effect if the sheet is already visible. */
  def showSheet(): Sheet = js.native
  /** Sorts a sheet by column, ascending. */
  def sort(columnPosition: Int): Sheet = js.native
  /** Sorts a sheet by column. Takes a parameter to specify ascending or descending. */
  def sort(columnPosition: Int, ascending: Boolean): Sheet = js.native
  /** Unhides the column in the given range. */
  def unhideColumn(column: Range): Unit = js.native
  /** Unhides the row in the given range. */
  def unhideRow(row: Range): Unit = js.native
  /** Updates the chart on this sheet. */
  def updateChart(chart: EmbeddedChart): Unit = js.native
  /** Deprecated. For spreadsheets created in the newer version of Google Sheets, use getProtections(type), which returns the more powerful Protection class. Although this method is deprecated, it will remain available for compatibility with the older version of Sheets */
  def getSheetProtection(): PageProtection = js.native
  /** Deprecated. For spreadsheets created in the newer version of Google Sheets, use protect(), which returns the more powerful Protection class. Although this method is deprecated, it will remain available for compatibility with the older version of Sheets */
  def setSheetProtection(permissions: PageProtection): Unit = js.native
}
