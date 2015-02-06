package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import scala.scalajs.js

/** Spreadsheet This class allows users to access and modify Google Sheets files. Common operations are adding new sheets and adding collaborators. */
trait Spreadsheet extends js.Object {
  /** Adds the given user to the list of editors for the Spreadsheet. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(emailAddress: String): Unit = js.native
  /** Adds the given user to the list of editors for the Spreadsheet. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(user: User): Unit = js.native
  /** Adds the given array of users to the list of editors for the Spreadsheet. If any of the users were already on the list of viewers, this method promotes them out of the list of viewers. */
  def addEditors(emailAddresses: js.Array[String]): Unit = js.native
  /** Creates a new menu in the Spreadsheet UI. Each menu entry runs a user-defined function. Usually, you will want to call it from the onOpen function so that the menu is automatically created when the Spreadsheet is loaded. */
  def addMenu(name: String, subMenus: js.Array[AnyRef]): Unit = js.native
  /** Adds the given user to the list of viewers for the Spreadsheet. If the user was already on the list of editors, this method has no effect. */
  def addViewer(emailAddress: String): Unit = js.native
  /** Adds the given user to the list of viewers for the Spreadsheet. If the user was already on the list of editors, this method has no effect. */
  def addViewer(user: User): Unit = js.native
  /** Adds the given array of users to the list of viewers for the Spreadsheet. If any of the users were already on the list of editors, this method has no effect for them. */
  def addViewers(emailAddresses: js.Array[String]): Unit = js.native
  /** Appends a row to the spreadsheet. This operation is atomic; it prevents issues where a user asks for the last row, and then writes to that row, and an intervening mutation occurs between getting the last row and writing to it. */
  def appendRow(rowContents: js.Array[AnyRef]): Sheet = js.native
  /** Sets the width of the given column to fit its contents */
  def autoResizeColumn(columnPosition: Int): Sheet = js.native
  /** Copies the spreadsheet and returns the new one. */
  def copy(name: String): Spreadsheet = js.native
  /** Deletes the currently active sheet. */
  def deleteActiveSheet(): Sheet = js.native
  /** Deletes the column at the given column position. */
  def deleteColumn(columnPosition: Int): Sheet = js.native
  /** Deletes a number of columns starting at the given column position. */
  def deleteColumns(columnPosition: Int, howMany: Int): Unit = js.native
  /** Deletes the row at the given row position. */
  def deleteRow(rowPosition: Int): Sheet = js.native
  /** Deletes a number of rows starting at the given row position. */
  def deleteRows(rowPosition: Int, howMany: Int): Unit = js.native
  /** Deletes the specified sheet. */
  def deleteSheet(sheet: Sheet): Unit = js.native
  /** Duplicates the active sheet and makes it the active sheet. */
  def duplicateActiveSheet(): Sheet = js.native
  /** Returns the active cell in this sheet. */
  def getActiveCell(): Range = js.native
  /** Returns the active range for the active sheet. Returns the range of cells that is currently considered active. This generally means the range that a user has selected in the active sheet, but in a custom function it refers to the cell being actively recalculated. Note that when called on a SpreadsheetApp it effectively calls getActiveSpreadsheet and then getActiveSheet to act on the active Sheet. */
  def getActiveRange(): Range = js.native
  /** Gets the active sheet in a spreadsheet. The active sheet in a spreadsheet is the sheet that is being displayed in the spreadsheet UI. */
  def getActiveSheet(): Sheet = js.native
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = js.native
  /** Return the data inside this object as a blob. */
  def getBlob(): Blob = js.native
  /** Gets the width in pixels of the given column. */
  def getColumnWidth(columnPosition: Int): Int = js.native
  /** Returns a Range corresponding to the dimensions in which data is present. This is functionally equivalent to creating a Range bounded by A1 and (Range.getLastColumn(), Range.getLastRow()). */
  def getDataRange(): Range = js.native
  /** Gets the list of editors for this Spreadsheet. If the user who executes the script does not have edit access to the Spreadsheet, this method throws an exception. */
  def getEditors(): js.Array[User] = js.native
  /** Returns the url for the form attached to the spreadsheet, null if there is no form. */
  def getFormUrl(): String = js.native
  /** Returns the number of frozen columns. */
  def getFrozenColumns(): Int = js.native
  /** Returns the number of frozen rows. */
  def getFrozenRows(): Int = js.native
  /** Gets a unique identifier for this spreadsheet. A spreadsheet ID can be extracted from its URL. For example, the spreadsheet ID in the URL https://docs.google.com/spreadsheets/d/abc1234567/edit#gid=0 is "abc1234567". */
  def getId(): String = js.native
  /** Returns the position of the last column that has content. */
  def getLastColumn(): Int = js.native
  /** Returns the position of the last row that has content. */
  def getLastRow(): Int = js.native
  /** Gets the name of the document. */
  def getName(): String = js.native
  /** Returns the number of sheets in this spreadsheet. */
  def getNumSheets(): Int = js.native
  /** Returns the owner of the document. */
  def getOwner(): User = js.native
  /** Returns the range as specified in A1 notation or R1C1 notation. */
  def getRange(a1Notation: String): Range = js.native
  /** Returns a named range, or null if no range with the given name is found. If multiple sheets of the spreadsheet use the same range name, specify the sheet name without additional quotation marks — for example, getRangeByName('TaxRates') or getRangeByName('Sheet Name!TaxRates'), but not getRangeByName('"Sheet Name"!TaxRates'). */
  def getRangeByName(name: String): Range = js.native
  /** Gets the height in pixels of the given row. */
  def getRowHeight(rowPosition: Int): Int = js.native
  /** Returns a sheet with the given name. If multiple sheets have the same name, the leftmost one is returned. Returns null if there is no sheet with the given name. */
  def getSheetByName(name: String): Sheet = js.native
  /** Returns the ID of the sheet represented by this object. This is an ID for the sheet that is unique to the spreadsheet. The ID is a monotonically increasing integer assigned at sheet creation time that is independent of sheet position. This is useful in conjunction with methods such as Range.copyFormatToRange(gridId, column, columnEnd, row, rowEnd) that take a gridId parameter rather than a Sheet instance. */
  def getSheetId(): Int = js.native
  /** Returns the sheet name. */
  def getSheetName(): String = js.native
  /** Returns a PageProtection instance describing the permissions for the current sheet. */
  def getSheetProtection(): PageProtection = js.native
  /** Returns the rectangular grid of values for this range starting at the given coordinates. A -1 value given as the row or column position is equivalent to getting the very last row or column that has data in the sheet. */
  def getSheetValues(startRow: Int, startColumn: Int, numRows: Int, numColumns: Int): js.Array[js.Array[AnyRef]] = js.native
  /** Gets all the sheets in this spreadsheet. */
  def getSheets(): js.Array[Sheet] = js.native
  /** Gets the spreadsheet locale. */
  def getSpreadsheetLocale(): String = js.native
  /** Gets the time zone for the spreadsheet. */
  def getSpreadsheetTimeZone(): String = js.native
  /** Returns the url for the given spreadsheet. */
  def getUrl(): String = js.native
  /** Gets the list of viewers and commenters for this Spreadsheet. If the user who executes the script does not have edit access to the Spreadsheet, this method throws an exception. */
  def getViewers(): js.Array[User] = js.native
  /** Hides the columns in the given range. */
  def hideColumn(column: Range): Unit = js.native
  /** Hides the rows in the given range. */
  def hideRow(row: Range): Unit = js.native
  /** Inserts a column after the given column position. */
  def insertColumnAfter(afterPosition: Int): Sheet = js.native
  /** Inserts a column before the given column position. */
  def insertColumnBefore(beforePosition: Int): Sheet = js.native
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
  /** Inserts a number of rows after the given row position. */
  def insertRowsAfter(afterPosition: Int, howMany: Int): Sheet = js.native
  /** Inserts a number of rows before the given row position. */
  def insertRowsBefore(beforePosition: Int, howMany: Int): Sheet = js.native
  /** Inserts a new sheet in the spreadsheet, with a default name. As a side effect, it makes it the active sheet. */
  def insertSheet(): Sheet = js.native
  /** Inserts a new sheet in the spreadsheet at the given index. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetIndex: Int): Sheet = js.native
  /** Inserts a new sheet in the spreadsheet at the given index and uses optional advanced arguments. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetIndex: Int, options: AnyRef): Sheet = js.native
  /** Inserts a new sheet in the spreadsheet, with a default name and uses optional advanced arguments. As a side effect, it makes it the active sheet. */
  def insertSheet(options: AnyRef): Sheet = js.native
  /** Inserts a new sheet in the spreadsheet with the given name. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetName: String): Sheet = js.native
  /** Inserts a new sheet in the spreadsheet with the given name at the given index. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetName: String, sheetIndex: Int): Sheet = js.native
  /** Inserts a new sheet in the spreadsheet with the given name at the given index and uses optional advanced arguments. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetName: String, sheetIndex: Int, options: AnyRef): Sheet = js.native
  /** Inserts a new sheet in the spreadsheet with the given name and uses optional advanced arguments. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetName: String, options: AnyRef): Sheet = js.native
  /** Moves the active sheet to the given position in the list of sheets. Throws an exception if the position is negative or greater than the number of sheets. */
  def moveActiveSheet(pos: Int): Unit = js.native
  /** Removes the given user from the list of editors for the Spreadsheet. This method does not block users from accessing the Spreadsheet if they belong to a class of users who have general access — for example, if the Spreadsheet is shared with the user's entire domain. */
  def removeEditor(emailAddress: String): Unit = js.native
  /** Removes the given user from the list of editors for the Spreadsheet. This method does not block users from accessing the Spreadsheet if they belong to a class of users who have general access — for example, if the Spreadsheet is shared with the user's entire domain. */
  def removeEditor(user: User): Unit = js.native
  /** Removes a menu that was added by addMenu(name, subMenus). The name argument should have the same value as the corresponding call to addMenu(name, subMenus). */
  def removeMenu(name: String): Unit = js.native
  /** Deletes a named range with the given name. Throws an exception if no range with the given name is found in the spreadsheet. */
  def removeNamedRange(name: String): Unit = js.native
  /** Removes the given user from the list of viewers and commenters for the Spreadsheet. This method has no effect if the user is an editor, not a viewer or commenter. This method also does not block users from accessing the Spreadsheet if they belong to a class of users who have general access — for example, if the Spreadsheet is shared with the user's entire domain. */
  def removeViewer(emailAddress: String): Unit = js.native
  /** Removes the given user from the list of viewers and commenters for the Spreadsheet. This method has no effect if the user is an editor, not a viewer. This method also does not block users from accessing the Spreadsheet if they belong to a class of users who have general access — for example, if the Spreadsheet is shared with the user's entire domain. */
  def removeViewer(user: User): Unit = js.native
  /** Renames the document. */
  def rename(newName: String): Unit = js.native
  /** Renames the current active sheet to the given new name. */
  def renameActiveSheet(newName: String): Unit = js.native
  /** Sets the active range for the active sheet. */
  def setActiveRange(range: Range): Range = js.native
  /** Sets the active selection region for this sheet. */
  def setActiveSelection(range: Range): Range = js.native
  /** Sets the active selection, as specified in A1 notation or R1C1 notation. */
  def setActiveSelection(a1Notation: String): Range = js.native
  /** Sets the given sheet to be the active sheet in the spreadsheet. The spreadsheet UI will display the chosen sheet unless the sheet belongs to a different spreadsheet. */
  def setActiveSheet(sheet: Sheet): Sheet = js.native
  /** Sets the width of the given column in pixels. */
  def setColumnWidth(columnPosition: Int, width: Int): Sheet = js.native
  /** Freezes the given number of columns. If zero, no columns are frozen. */
  def setFrozenColumns(columns: Int): Unit = js.native
  /** Freezes the given number of rows. If zero, no rows are frozen. */
  def setFrozenRows(rows: Int): Unit = js.native
  /** Names a range. */
  def setNamedRange(name: String, range: Range): Unit = js.native
  /** Sets the row height of the given row in pixels. */
  def setRowHeight(rowPosition: Int, height: Int): Sheet = js.native
  /** Sets the permissions for the current sheet. */
  def setSheetProtection(permissions: PageProtection): Unit = js.native
  /** Sets the spreadsheet locale. */
  def setSpreadsheetLocale(locale: String): Unit = js.native
  /** Sets the time zone for the spreadsheet. */
  def setSpreadsheetTimeZone(timezone: String): Unit = js.native
  /** Displays a custom user interface component in a dialog centered in the user's browser's viewport. The server-side script's execution will not be suspended. To communicate with the server side, the user interface component must make asynchronous callbacks to the server-side script. */
  def show(userInterface: AnyRef): Unit = js.native
  /** Sorts a sheet by column, ascending. */
  def sort(columnPosition: Int): Sheet = js.native
  /** Sorts a sheet by column. Takes a parameter to specify ascending or descending. */
  def sort(columnPosition: Int, ascending: Boolean): Sheet = js.native
  /** Shows a popup window in the lower right corner of the spreadsheet with the given message. */
  def toast(msg: String): Unit = js.native
  /** Shows a popup window in the lower right corner of the spreadsheet with the given message and title. */
  def toast(msg: String, title: String): Unit = js.native
  /** Shows a popup window in the lower right corner of the spreadsheet with the given title and message, that stays visible for a certain length of time. */
  def toast(msg: String, title: String, timeoutSeconds: Number): Unit = js.native
  /** Unhides the column in the given range. */
  def unhideColumn(column: Range): Unit = js.native
  /** Unhides the row in the given range. */
  def unhideRow(row: Range): Unit = js.native
  /** Updates a menu that was added by addMenu(name, subMenus). Works exactly like addMenu(name, subMenus). */
  def updateMenu(name: String, subMenus: js.Array[AnyRef]): Unit = js.native
  /** Deprecated. As of January 2014 this function is deprecated and not available in the new version of Google Sheets. */
  def isAnonymousView(): Boolean = js.native
  /** Deprecated. As of January 2014 this function is deprecated and not available in the new version of Google Sheets. */
  def isAnonymousWrite(): Boolean = js.native
  /** Deprecated. As of January 2014 this function is deprecated and not available in the new version of Google Sheets. */
  def setAnonymousAccess(anonymousReadAllowed: Boolean, anonymousWriteAllowed: Boolean): Unit = js.native
}
