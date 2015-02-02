package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

/** Sheet Access and modify spreadsheet sheets. Common operations are renaming a sheet and accessing range objects from the sheet. */
trait Sheet {
  /** Activates this sheet. Does not alter the sheet itself, only the parent's notion of the active sheet. */
  def activate: Sheet = ???
  /** Appends a row to the spreadsheet. This operation is atomic; it prevents issues where a user asks for the last row, and then writes to that row, and an intervening mutation occurs between getting the last row and writing to it. */
  def appendRow(rowContents: Seq[AnyRef]): Sheet = ???
  /** Sets the width of the given column to fit its contents */
  def autoResizeColumn(columnPosition: Int): Sheet = ???
  /** Clears the sheet of content and formatting information. */
  def clear: Sheet = ???
  /** Clears the sheet of contents and/or format, as specified with the given advanced options. The advanced options are: */
  def clear(options: AnyRef): Sheet = ???
  /** Clears the sheet of contents, while preserving formatting information. */
  def clearContents: Sheet = ???
  /** Clears the sheet of formatting, while preserving contents. Formatting refers to how data is formatted as allowed by choices under the "Format" menu (ex: bold, italics, conditional formatting) and not width or height of cells. */
  def clearFormats: Sheet = ???
  /** Clears the sheet of all notes. */
  def clearNotes: Sheet = ???
  /** Copies the sheet to a given spreadsheet, which can be the same spreadsheet as the source. The copied sheet will be named "Copy of [original name]". */
  def copyTo(spreadsheet: Spreadsheet): Sheet = ???
  /** Deletes the column at the given column position. */
  def deleteColumn(columnPosition: Int): Sheet = ???
  /** Deletes a number of columns starting at the given column position. */
  def deleteColumns(columnPosition: Int, howMany: Int): Unit = ???
  /** Deletes the row at the given row position. */
  def deleteRow(rowPosition: Int): Sheet = ???
  /** Deletes a number of rows starting at the given row position. */
  def deleteRows(rowPosition: Int, howMany: Int): Unit = ???
  /** Returns the active cell in this sheet. */
  def getActiveCell: Range = ???
  /** Returns the active range for the active sheet. Returns the range of cells that is currently considered active. This generally means the range that a user has selected in the active sheet, but in a custom function it refers to the cell being actively recalculated. Note that when called on a SpreadsheetApp it effectively calls getActiveSpreadsheet and then getActiveSheet to act on the active Sheet. */
  def getActiveRange: Range = ???
  /** Returns an array of charts on this sheet. */
  def getCharts: Seq[EmbeddedChart] = ???
  /** Gets the width in pixels of the given column. */
  def getColumnWidth(columnPosition: Int): Int = ???
  /** Returns a Range corresponding to the dimensions in which data is present. This is functionally equivalent to creating a Range bounded by A1 and (Range.getLastColumn(), Range.getLastRow()). */
  def getDataRange: Range = ???
  /** Returns the number of frozen columns. */
  def getFrozenColumns: Int = ???
  /** Returns the number of frozen rows. */
  def getFrozenRows: Int = ???
  /** Gets the position of the sheet in its parent spreadsheet. Starts at 1. */
  def getIndex: Int = ???
  /** Returns the position of the last column that has content. */
  def getLastColumn: Int = ???
  /** Returns the position of the last row that has content. */
  def getLastRow: Int = ???
  /** The maximum width of the sheet, regardless of content. */
  def getMaxColumns: Int = ???
  /** The maximum height of the sheet, regardless of content. */
  def getMaxRows: Int = ???
  /** Returns the name of the sheet. */
  def getName: String = ???
  /** Returns the Spreadsheet that contains this sheet. */
  def getParent: Spreadsheet = ???
  /** Returns the range with the top left cell at the given coordinates. */
  def getRange(row: Int, column: Int): Range = ???
  /** Returns the range with the top left cell at the given coordinates, and with the given number of rows. */
  def getRange(row: Int, column: Int, numRows: Int): Range = ???
  /** Returns the range with the top left cell at the given coordinates with the given number of rows and columns. */
  def getRange(row: Int, column: Int, numRows: Int, numColumns: Int): Range = ???
  /** Returns the range as specified in A1 notation or R1C1 notation. */
  def getRange(a1Notation: String): Range = ???
  /** Gets the height in pixels of the given row. */
  def getRowHeight(rowPosition: Int): Int = ???
  /** Returns the ID of the sheet represented by this object. This is an ID for the sheet that is unique to the spreadsheet. The ID is a monotonically increasing integer assigned at sheet creation time that is independent of sheet position. This is useful in conjunction with methods such as Range.copyFormatToRange(gridId, column, columnEnd, row, rowEnd) that take a gridId parameter rather than a Sheet instance. */
  def getSheetId: Int = ???
  /** Returns the sheet name. */
  def getSheetName: String = ???
  /** Returns a PageProtection instance describing the permissions for the current sheet. */
  def getSheetProtection: PageProtection = ???
  /** Returns the rectangular grid of values for this range starting at the given coordinates. A -1 value given as the row or column position is equivalent to getting the very last row or column that has data in the sheet. */
  def getSheetValues(startRow: Int, startColumn: Int, numRows: Int, numColumns: Int): Seq[Seq[AnyRef]] = ???
  /** Hides the columns in the given range. */
  def hideColumn(column: Range): Unit = ???
  /** Hides the column at the given index. */
  def hideColumns(columnIndex: Int): Unit = ???
  /** Hides one or more consecutive columns starting at the given index. */
  def hideColumns(columnIndex: Int, numColumns: Int): Unit = ???
  /** Hides the rows in the given range. */
  def hideRow(row: Range): Unit = ???
  /** Hides the row at the given index. */
  def hideRows(rowIndex: Int): Unit = ???
  /** Hides one or more consecutive rows starting at the given index. */
  def hideRows(rowIndex: Int, numRows: Int): Unit = ???
  /** Hides this sheet. Has no effect if the sheet is already hidden. If this method is called on the only visible sheet, it will throw an exception. */
  def hideSheet: Sheet = ???
  /** Adds a new chart to this sheet. */
  def insertChart(chart: EmbeddedChart): Unit = ???
  /** Inserts a column after the given column position. */
  def insertColumnAfter(afterPosition: Int): Sheet = ???
  /** Inserts a column before the given column position. */
  def insertColumnBefore(beforePosition: Int): Sheet = ???
  /** Inserts a blank column in a sheet at the specified location. */
  def insertColumns(columnIndex: Int): Unit = ???
  /** Inserts one or more consecutive blank columns in a sheet starting at the specified location. */
  def insertColumns(columnIndex: Int, numColumns: Int): Unit = ???
  /** Inserts a number of columns after the given column position. */
  def insertColumnsAfter(afterPosition: Int, howMany: Int): Sheet = ???
  /** Inserts a number of columns before the given column position. */
  def insertColumnsBefore(beforePosition: Int, howMany: Int): Sheet = ???
  /** Inserts a Blob as an image in the document at a given row and column. The image size is retrieved from the blob contents. */
  def insertImage(blob: Blob, column: Int, row: Int): Unit = ???
  /** Inserts a Blob as an image in the document at a given row and column, with a pixel offset. The image size is retrieved from the blob contents. */
  def insertImage(blob: Blob, column: Int, row: Int, offsetX: Int, offsetY: Int): Unit = ???
  /** Inserts an image in the document at a given row and column. */
  def insertImage(url: String, column: Int, row: Int): Unit = ???
  /** Inserts an image in the document at a given row and column, with a pixel offset. */
  def insertImage(url: String, column: Int, row: Int, offsetX: Int, offsetY: Int): Unit = ???
  /** Inserts a row after the given row position. */
  def insertRowAfter(afterPosition: Int): Sheet = ???
  /** Inserts a row before the given row position. */
  def insertRowBefore(beforePosition: Int): Sheet = ???
  /** Inserts a blank row in a sheet at the specified location. */
  def insertRows(rowIndex: Int): Unit = ???
  /** Inserts one or more consecutive blank rows in a sheet starting at the specified location. */
  def insertRows(rowIndex: Int, numRows: Int): Unit = ???
  /** Inserts a number of rows after the given row position. */
  def insertRowsAfter(afterPosition: Int, howMany: Int): Sheet = ???
  /** Inserts a number of rows before the given row position. */
  def insertRowsBefore(beforePosition: Int, howMany: Int): Sheet = ???
  /** Returns true if the sheet is currently hidden. */
  def isSheetHidden: Boolean = ???
  /** Returns a builder to create a new chart for this sheet. */
  def newChart: EmbeddedChartBuilder = ???
  /** Removes a chart from the parent sheet. */
  def removeChart(chart: EmbeddedChart): Unit = ???
  /** Sets the active range for the active sheet. */
  def setActiveRange(range: Range): Range = ???
  /** Sets the active selection region for this sheet. */
  def setActiveSelection(range: Range): Range = ???
  /** Sets the active selection, as specified in A1 notation or R1C1 notation. */
  def setActiveSelection(a1Notation: String): Range = ???
  /** Sets the width of the given column in pixels. */
  def setColumnWidth(columnPosition: Int, width: Int): Sheet = ???
  /** Freezes the given number of columns. If zero, no columns are frozen. */
  def setFrozenColumns(columns: Int): Unit = ???
  /** Freezes the given number of rows. If zero, no rows are frozen. */
  def setFrozenRows(rows: Int): Unit = ???
  /** Sets the sheet name. */
  def setName(name: String): Sheet = ???
  /** Sets the row height of the given row in pixels. */
  def setRowHeight(rowPosition: Int, height: Int): Sheet = ???
  /** Sets the permissions for the current sheet. */
  def setSheetProtection(permissions: PageProtection): Unit = ???
  /** Unhides the column at the given index. */
  def showColumns(columnIndex: Int): Unit = ???
  /** Unhides one or more consecutive columns starting at the given index. */
  def showColumns(columnIndex: Int, numColumns: Int): Unit = ???
  /** Unhides the row at the given index. */
  def showRows(rowIndex: Int): Unit = ???
  /** Unhides one or more consecutive rows starting at the given index. */
  def showRows(rowIndex: Int, numRows: Int): Unit = ???
  /** Makes the sheet visible. Has no effect if the sheet is already visible. */
  def showSheet: Sheet = ???
  /** Sorts a sheet by column, ascending. */
  def sort(columnPosition: Int): Sheet = ???
  /** Sorts a sheet by column. Takes a parameter to specify ascending or descending. */
  def sort(columnPosition: Int, ascending: Boolean): Sheet = ???
  /** Unhides the column in the given range. */
  def unhideColumn(column: Range): Unit = ???
  /** Unhides the row in the given range. */
  def unhideRow(row: Range): Unit = ???
  /** Updates the chart on this sheet. */
  def updateChart(chart: EmbeddedChart): Unit = ???
}