package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

/** Range Access and modify spreadsheet ranges. This class allows users to access and modify ranges in Google Sheets. A range can be a single cell in a sheet or a range of cells in a sheet. */
trait Range {
  /** Make this range the active range. */
  def activate: Range = ???
  /** Break any multi-column cells in the range into individual cells again. Calling this function on a range is equivalent to selecting a range and clicking Format -> Merge -> Unmerge. */
  def breakApart: Range = ???
  /** Clears the range of contents, formats, and data-validation rules. */
  def clear: Range = ???
  /** Clears the range of contents, format, data-validation rules, and/or comments, as specified with the given advanced options. By default all data will be cleared. */
  def clear(options: AnyRef): Range = ???
  /** Clears the content of the range, leaving the formatting intact. */
  def clearContent: Range = ???
  /** Clears the data-validation rules for the range. */
  def clearDataValidations: Range = ???
  /** Clears formatting for this range. This clears text formatting for the cell or cells in the range, but does not reset any number formatting rules. */
  def clearFormat: Range = ???
  /** Clears the note in the given cell or cells. */
  def clearNote: Range = ???
  /** Copy the formatting of the range to the given location. If the destination is larger or smaller than the source range then the source will be repeated or truncated accordingly. Note that this method copies the formatting only. For a detailed description of the gridId parameter, see getGridId(). */
  def copyFormatToRange(gridId: Int, column: Int, columnEnd: Int, row: Int, rowEnd: Int): Unit = ???
  /** Copy the formatting of the range to the given location. If the destination is larger or smaller than the source range then the source will be repeated or truncated accordingly. Note that this method copies the formatting only. */
  def copyFormatToRange(sheet: Sheet, column: Int, columnEnd: Int, row: Int, rowEnd: Int): Unit = ???
  /** Copies the data from a range of cells to another range of cells. Both the values and formatting are copied. */
  def copyTo(destination: Range): Unit = ???
  /** Copies the data from a range of cells to another range of cells. By default both the values and formatting are copied, but this can be overridden using advanced arguments. */
  def copyTo(destination: Range, options: AnyRef): Unit = ???
  /** Copy the content of the range to the given location. If the destination is larger or smaller than the source range then the source will be repeated or truncated accordingly. For a detailed description of the gridId parameter, see getGridId(). */
  def copyValuesToRange(gridId: Int, column: Int, columnEnd: Int, row: Int, rowEnd: Int): Unit = ???
  /** Copy the content of the range to the given location. If the destination is larger or smaller than the source range then the source will be repeated or truncated accordingly. */
  def copyValuesToRange(sheet: Sheet, column: Int, columnEnd: Int, row: Int, rowEnd: Int): Unit = ???
  /** Returns a string description of the range, in A1 notation. */
  def getA1Notation: String = ???
  /** Returns the background color of the top-left cell in the range (i.e., '#ffffff'). */
  def getBackground: String = ???
  /** Returns the background colors of the cells in the range (i.e., '#ffffff'). */
  def getBackgrounds: Seq[Seq[String]] = ???
  /** Returns a given cell within a range. */
  def getCell(row: Int, column: Int): Range = ???
  /** Returns the starting column position for this range. */
  def getColumn: Int = ???
  /** Returns a URL for the data in this range, which can be used to create charts and queries. */
  def getDataSourceUrl: String = ???
  /** Return the data inside this object as a DataTable. */
  def getDataTable: DataTable = ???
  /** Return the data inside this Range as a DataTable. */
  def getDataTable(firstRowIsHeader: Boolean): DataTable = ???
  /** Returns the data-validation rule for the top-left cell in the range. If data validation has not been set on the cell, this method returns null. */
  def getDataValidation: DataValidation = ???
  /** Returns the data-validation rules for all cells in the range. If data validation has not been set on a given cell, this method returns null for that cell's position in the array. */
  def getDataValidations: Seq[Seq[DataValidation]] = ???
  /** Returns the font color of the cell in the top-left corner of the range, in CSS notation (like '#ffffff' or 'white'). */
  def getFontColor: String = ???
  /** Returns the font colors of the cells in the range in CSS notation (like '#ffffff' or 'white'). */
  def getFontColors: Seq[Seq[String]] = ???
  /** Returns the font families of the cells in the range. */
  def getFontFamilies: Seq[Seq[String]] = ???
  /** Returns the font family of the cell in the top-left corner of the range. */
  def getFontFamily: String = ???
  /** Gets the line style of the cell in the top-left corner of the range ('underline', 'line-through', or 'none'). */
  def getFontLine: String = ???
  /** Gets the line style of the cells in the range ('underline', 'line-through', or 'none'). */
  def getFontLines: Seq[Seq[String]] = ???
  /** Returns the font size in point size of the cell in the top-left corner of the range. */
  def getFontSize: Int = ???
  /** Returns the font sizes of the cells in the range. */
  def getFontSizes: Seq[Seq[Int]] = ???
  /** Returns the font style ('italic' or 'normal' of the cell in the top-left corner of the range. */
  def getFontStyle: String = ???
  /** Returns the font styles of the cells in the range. */
  def getFontStyles: Seq[Seq[String]] = ???
  /** Returns the font weight (normal/bold) of the cell in the top-left corner of the range. */
  def getFontWeight: String = ???
  /** Returns the font weights of the cells in the range. */
  def getFontWeights: Seq[Seq[String]] = ???
  /** Returns the formula (A1 notation) for the top-left cell of the range, or an empty string if the cell is empty or doesn't contain a formula. */
  def getFormula: String = ???
  /** Returns the formula (R1C1 notation) for a given cell, or null if none. */
  def getFormulaR1C1: String = ???
  /** Returns the formulas (A1 notation) for the cells in the range. Entries in the 2D array will be an empty string for cells with no formula. */
  def getFormulas: Seq[Seq[String]] = ???
  /** Returns the formulas (R1C1 notation) for the cells in the range. Entries in the 2D array will be null for cells with no formula. */
  def getFormulasR1C1: Seq[Seq[String]] = ???
  /** Returns the grid ID of the range's parent sheet. The first sheet created in a spreadsheet has a grid ID of 0, and each sheet created thereafter increments the ID. The ID does not necessarily correspond to a sheet's tab position because sheets may have been reordered or deleted. If a sheet is deleted, the grid ID for subsequent sheets continues to increment, and the grid ID of the deleted sheet is not reused. */
  def getGridId: Int = ???
  /** Returns the height of the range. */
  def getHeight: Int = ???
  /** Returns the horizontal alignment of the text (left/center/right) of the cell in the top-left corner of the range. */
  def getHorizontalAlignment: String = ???
  /** Returns the horizontal alignments of the cells in the range. */
  def getHorizontalAlignments: Seq[Seq[String]] = ???
  /** Returns the end column position. */
  def getLastColumn: Int = ???
  /** Returns the end row position. */
  def getLastRow: Int = ???
  /** Returns the note associated with the given range. */
  def getNote: String = ???
  /** Returns the notes associated with the cells in the range. */
  def getNotes: Seq[Seq[String]] = ???
  /** Returns the number of columns in this range. */
  def getNumColumns: Int = ???
  /** Returns the number of rows in this range. */
  def getNumRows: Int = ???
  /** Get the number formatting of the top-left cell of the given range. The number format corresponds to a formatting created when a user clicks Format -> Number. */
  def getNumberFormat: String = ???
  /** Returns the number formats for the cells in the range. */
  def getNumberFormats: Seq[Seq[String]] = ???
  /** Returns the row position for this range. */
  def getRow: Int = ???
  /** Returns the row position for this range. */
  def getRowIndex: Int = ???
  /** Returns the sheet this range belongs to. */
  def getSheet: Sheet = ???
  /** Returns the value of the top-left cell in the range. The value may be of type Number, Boolean, Date, or String depending on the value of the cell. Empty cells will return an empty string. */
  def getValue: AnyRef = ???
  /** Returns the rectangular grid of values for this range. Returns a two-dimensional array of values, indexed by row, then by column. The values may be of type Number, Boolean, Date, or String, depending on the value of the cell. Empty cells will be represented by an empty string in the array. Remember that while a range index starts at 1, 1, the JavaScript array will be indexed from [0][0]. */
  def getValues: Seq[Seq[AnyRef]] = ???
  /** Returns the vertical alignment (top/middle/bottom) of the cell in the top-left corner of the range. */
  def getVerticalAlignment: String = ???
  /** Returns the vertical alignments of the cells in the range. */
  def getVerticalAlignments: Seq[Seq[String]] = ???
  /** Returns the width of the range in columns. */
  def getWidth: Int = ???
  /** Returns the wrapping policy of the cell in the top-left corner of the range. true if the text wraps, false if the text does not. */
  def getWrap: Boolean = ???
  /** Returns the wrapping policy of the cells in the range. */
  def getWraps: Seq[Seq[Boolean]] = ???
  /** Returns true if the range is totally blank. */
  def isBlank: Boolean = ???
  /** Merges the cells in the range together into a single block. */
  def merge: Range = ???
  /** Merge the cells in the range across the columns of the range. */
  def mergeAcross: Range = ???
  /** Merges the cells in the range together. */
  def mergeVertically: Range = ???
  /** Cut and paste (both format and values) from this range to the target range. */
  def moveTo(target: Range): Unit = ???
  /** Returns a new range that is offset from this range by the given number of rows and columns (which can be negative). The new range will be the same size as the original range. */
  def offset(rowOffset: Int, columnOffset: Int): Range = ???
  /** Returns a new range that is relative to the current range, whose upper left point is offset from the current range by the given rows and columns, and with the given height in cells. */
  def offset(rowOffset: Int, columnOffset: Int, numRows: Int): Range = ???
  /** Returns a new range that is relative to the current range, whose upper left point is offset from the current range by the given rows and columns, and with the given height and width in cells. */
  def offset(rowOffset: Int, columnOffset: Int, numRows: Int, numColumns: Int): Range = ???
  /** Sets the background color of all cells in the range in CSS notation (like '#ffffff' or 'white'). */
  def setBackground(color: String): Range = ???
  /** Sets the background to the given RGB color. This is a convenience wrapper for the setBackground call that takes a string color. */
  def setBackgroundRGB(red: Int, green: Int, blue: Int): Range = ???
  /** Sets a rectangular grid of background colors (must match dimensions of this range). The colors are in CSS notation (like '#ffffff' or 'white'). */
  def setBackgrounds(color: Seq[Seq[String]]): Range = ???
  /** Sets the border property. Valid values are true (on), false (off) and null (no change). */
  def setBorder(top: Boolean, left: Boolean, bottom: Boolean, right: Boolean, vertical: Boolean, horizontal: Boolean): Range = ???
  /** Sets one data-validation rule for all cells in the range. */
  def setDataValidation(rule: DataValidation): Range = ???
  /** Sets the data-validation rules for all cells in the range. This method takes a two-dimensional array of data validations, indexed by row then by column. The array dimensions must correspond to the range dimensions. */
  def setDataValidations(rules: Seq[Seq[DataValidation]]): Range = ???
  /** Sets the font color in CSS notation (like '#ffffff' or 'white'). */
  def setFontColor(color: String): Range = ???
  /** Sets a rectangular grid of font colors (must match dimensions of this range). The colors are in CSS notation (like '#ffffff' or 'white'). */
  def setFontColors(colors: Seq[Seq[AnyRef]]): Range = ???
  /** Sets a rectangular grid of font families (must match dimensions of this range). Examples of font families are "Arial" or "Helvetica". */
  def setFontFamilies(fontFamilies: Seq[Seq[AnyRef]]): Range = ???
  /** Sets the font family, such as "Arial" or "Helvetica". */
  def setFontFamily(fontFamily: String): Range = ???
  /** Sets the line style of the given range ('underline', 'line-through', or 'none'). */
  def setFontLine(fontLine: String): Range = ???
  /** Sets a rectangular grid of line styles (must match dimensions of this range). */
  def setFontLines(fontLines: Seq[Seq[AnyRef]]): Range = ???
  /** Sets the font size, with the size being the point size to use. */
  def setFontSize(size: Int): Range = ???
  /** Sets a rectangular grid of font sizes (must match dimensions of this range). The sizes are in points. */
  def setFontSizes(sizes: Seq[Seq[AnyRef]]): Range = ???
  /** Set the font style for the given range ('italic' or 'normal'). */
  def setFontStyle(fontStyle: String): Range = ???
  /** Sets a rectangular grid of font styles (must match dimensions of this range). */
  def setFontStyles(fontStyles: Seq[Seq[AnyRef]]): Range = ???
  /** Set the font weight for the given range (normal/bold). */
  def setFontWeight(fontWeight: String): Range = ???
  /** Sets a rectangular grid of font weights (must match dimensions of this range). An example of a font weight is "bold". */
  def setFontWeights(fontWeights: Seq[Seq[AnyRef]]): Range = ???
  /** Updates the formula for this range. The given formula must be in A1 notation. */
  def setFormula(formula: String): Range = ???
  /** Updates the formula for this range. The given formula must be in R1C1 notation. */
  def setFormulaR1C1(formula: String): Range = ???
  /** Sets a rectangular grid of formulas (must match dimensions of this range). The given formulas must be in A1 notation. This method takes a two-dimensional array of formulas, indexed by row, then by column. The array dimensions must correspond to the range dimensions. */
  def setFormulas(formulas: Seq[Seq[String]]): Range = ???
  /** Sets a rectangular grid of formulas (must match dimensions of this range). The given formulas must be in R1C1 notation. */
  def setFormulasR1C1(formulas: Seq[Seq[String]]): Range = ???
  /** Set the horizontal (left to right) alignment for the given range (left/center/right). */
  def setHorizontalAlignment(alignment: String): Range = ???
  /** Sets a rectangular grid of horizontal alignments. see setHorizontalAlignment(alignment) */
  def setHorizontalAlignments(alignments: Seq[Seq[AnyRef]]): Range = ???
  /** Sets the note to the given value. */
  def setNote(note: String): Range = ???
  /** Sets a rectangular grid of notes (must match dimensions of this range). */
  def setNotes(notes: Seq[Seq[AnyRef]]): Range = ???
  /** Sets the number or date format to the given formatting string. Date formats follow the SimpleDateFormat specification. */
  def setNumberFormat(numberFormat: String): Range = ???
  /** Sets a rectangular grid of number or date formats (must match dimensions of this range). The values are formatting strings, see setNumberFormat(numberFormat). Date formats follow the SimpleDateFormat specification. */
  def setNumberFormats(numberFormats: Seq[Seq[AnyRef]]): Range = ???
  /** Sets the value of the range. The value can be numeric, string, boolean or date. If it begins with '=' it is interpreted as a formula. */
  def setValue(value: AnyRef): Range = ???
  /** Sets a rectangular grid of values (must match dimensions of this range). */
  def setValues(values: Seq[Seq[AnyRef]]): Range = ???
  /** Set the vertical (top to bottom) alignment for the given range (top/middle/bottom). */
  def setVerticalAlignment(alignment: String): Range = ???
  /** Sets a rectangular grid of vertical alignments (must match dimensions of this range). */
  def setVerticalAlignments(alignments: Seq[Seq[AnyRef]]): Range = ???
  /** Set the cell wrap of the given range. Cells with wrap enabled (the default) will resize to display their full content. Cells with wrap disabled will display as much as possible in the cell without resizing or running to multiple lines. */
  def setWrap(isWrapEnabled: Boolean): Range = ???
  /** Sets a rectangular grid of word wrap policies (must match dimensions of this range). Cells with wrap enabled (the default) will resize to display their full content. Cells with wrap disabled will display as much as possible in the cell without resizing or running to multiple lines. */
  def setWraps(isWrapEnabled: Seq[Seq[AnyRef]]): Range = ???
  /** Sorts the cells in the given range. Sorts the cells in a given range, by column and order specified. */
  def sort(sortSpecObj: AnyRef): Range = ???
}