package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import java.util.Date

/** Spreadsheet This class allows users to access and modify Google Sheets files. Common operations are adding new sheets and adding collaborators. */
trait Spreadsheet {
  /** Adds the given user to the list of editors for the Spreadsheet. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(emailAddress: String): Unit = ???
  /** Adds the given user to the list of editors for the Spreadsheet. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(user: User): Unit = ???
  /** Adds the given array of users to the list of editors for the Spreadsheet. If any of the users were already on the list of viewers, this method promotes them out of the list of viewers. */
  def addEditors(emailAddresses: Seq[String]): Unit = ???
  /** Creates a new menu in the Spreadsheet UI. Each menu entry runs a user-defined function. Usually, you will want to call it from the onOpen function so that the menu is automatically created when the Spreadsheet is loaded. */
  def addMenu(name: String)(subMenus: Seq[Object]): Unit = ???
  /** Adds the given user to the list of viewers for the Spreadsheet. If the user was already on the list of editors, this method has no effect. */
  def addViewer(emailAddress: String): Unit = ???
  /** Adds the given user to the list of viewers for the Spreadsheet. If the user was already on the list of editors, this method has no effect. */
  def addViewer(user: User): Unit = ???
  /** Adds the given array of users to the list of viewers for the Spreadsheet. If any of the users were already on the list of editors, this method has no effect for them. */
  def addViewers(emailAddresses: Seq[String]): Unit = ???
  /** Appends a row to the spreadsheet. This operation is atomic; it prevents issues where a user asks for the last row, and then writes to that row, and an intervening mutation occurs between getting the last row and writing to it. */
  def appendRow(rowContents: Seq[Object]): Sheet = ???
  /** Sets the width of the given column to fit its contents */
  def autoResizeColumn(columnPosition: Int): Sheet = ???
  /** Copies the spreadsheet and returns the new one. */
  def copy(name: String): Spreadsheet = ???
  /** Deletes the currently active sheet. */
  def deleteActiveSheet: Sheet = ???
  /** Deletes the column at the given column position. */
  def deleteColumn(columnPosition: Int): Sheet = ???
  /** Deletes a number of columns starting at the given column position. */
  def deleteColumns(columnPosition: Int)(howMany: Int): Unit = ???
  /** Deletes the row at the given row position. */
  def deleteRow(rowPosition: Int): Sheet = ???
  /** Deletes a number of rows starting at the given row position. */
  def deleteRows(rowPosition: Int)(howMany: Int): Unit = ???
  /** Deletes the specified sheet. */
  def deleteSheet(sheet: Sheet): Unit = ???
  /** Duplicates the active sheet and makes it the active sheet. */
  def duplicateActiveSheet: Sheet = ???
  /** Returns the active cell in this sheet. */
  def getActiveCell: Range = ???
  /** Returns the active range for the active sheet. Returns the range of cells that is currently considered active. This generally means the range that a user has selected in the active sheet, but in a custom function it refers to the cell being actively recalculated. Note that when called on a SpreadsheetApp it effectively calls getActiveSpreadsheet and then getActiveSheet to act on the active Sheet. */
  def getActiveRange: Range = ???
  /** Gets the active sheet in a spreadsheet. The active sheet in a spreadsheet is the sheet that is being displayed in the spreadsheet UI. */
  def getActiveSheet: Sheet = ???
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = ???
  /** Return the data inside this object as a blob. */
  def getBlob: Blob = ???
  /** Gets the width in pixels of the given column. */
  def getColumnWidth(columnPosition: Int): Int = ???
  /** Returns a Range corresponding to the dimensions in which data is present. This is functionally equivalent to creating a Range bounded by A1 and (Range.getLastColumn(), Range.getLastRow()). */
  def getDataRange: Range = ???
  /** Gets the list of editors for this Spreadsheet. If the user who executes the script does not have edit access to the Spreadsheet, this method throws an exception. */
  def getEditors: Seq[User] = ???
  /** Returns the url for the form attached to the spreadsheet, null if there is no form. */
  def getFormUrl: String = ???
  /** Returns the number of frozen columns. */
  def getFrozenColumns: Int = ???
  /** Returns the number of frozen rows. */
  def getFrozenRows: Int = ???
  /** Gets a unique identifier for this spreadsheet. A spreadsheet ID can be extracted from its URL. For example, the spreadsheet ID in the URL https://docs.google.com/spreadsheets/d/abc1234567/edit#gid=0 is "abc1234567". */
  def getId: String = ???
  /** Returns the position of the last column that has content. */
  def getLastColumn: Int = ???
  /** Returns the position of the last row that has content. */
  def getLastRow: Int = ???
  /** Gets the name of the document. */
  def getName: String = ???
  /** Returns the number of sheets in this spreadsheet. */
  def getNumSheets: Int = ???
  /** Returns the owner of the document. */
  def getOwner: User = ???
  /** Returns the range as specified in A1 notation or R1C1 notation. */
  def getRange(a1Notation: String): Range = ???
  /** Returns a named range, or null if no range with the given name is found. If multiple sheets of the spreadsheet use the same range name, specify the sheet name without additional quotation marks — for example, getRangeByName('TaxRates') or getRangeByName('Sheet Name!TaxRates'), but not getRangeByName('"Sheet Name"!TaxRates'). */
  def getRangeByName(name: String): Range = ???
  /** Gets the height in pixels of the given row. */
  def getRowHeight(rowPosition: Int): Int = ???
  /** Returns a sheet with the given name. If multiple sheets have the same name, the leftmost one is returned. Returns null if there is no sheet with the given name. */
  def getSheetByName(name: String): Sheet = ???
  /** Returns the ID of the sheet represented by this object. This is an ID for the sheet that is unique to the spreadsheet. The ID is a monotonically increasing integer assigned at sheet creation time that is independent of sheet position. This is useful in conjunction with methods such as Range.copyFormatToRange(gridId, column, columnEnd, row, rowEnd) that take a gridId parameter rather than a Sheet instance. */
  def getSheetId: Int = ???
  /** Returns the sheet name. */
  def getSheetName: String = ???
  /** Returns a PageProtection instance describing the permissions for the current sheet. */
  def getSheetProtection: PageProtection = ???
  /** Returns the rectangular grid of values for this range starting at the given coordinates. A -1 value given as the row or column position is equivalent to getting the very last row or column that has data in the sheet. */
  def getSheetValues(startRow: Int)(startColumn: Int)(numRows: Int)(numColumns: Int): Seq[Seq[AnyRef]] = ???
  /** Gets all the sheets in this spreadsheet. */
  def getSheets: Seq[Sheet] = ???
  /** Gets the spreadsheet locale. */
  def getSpreadsheetLocale: String = ???
  /** Gets the time zone for the spreadsheet. */
  def getSpreadsheetTimeZone: String = ???
  /** Returns the url for the given spreadsheet. */
  def getUrl: String = ???
  /** Gets the list of viewers and commenters for this Spreadsheet. If the user who executes the script does not have edit access to the Spreadsheet, this method throws an exception. */
  def getViewers: Seq[User] = ???
  /** Hides the columns in the given range. */
  def hideColumn(column: Range): Unit = ???
  /** Hides the rows in the given range. */
  def hideRow(row: Range): Unit = ???
  /** Inserts a column after the given column position. */
  def insertColumnAfter(afterPosition: Int): Sheet = ???
  /** Inserts a column before the given column position. */
  def insertColumnBefore(beforePosition: Int): Sheet = ???
  /** Inserts a number of columns after the given column position. */
  def insertColumnsAfter(afterPosition: Int)(howMany: Int): Sheet = ???
  /** Inserts a number of columns before the given column position. */
  def insertColumnsBefore(beforePosition: Int)(howMany: Int): Sheet = ???
  /** Inserts a Blob as an image in the document at a given row and column. The image size is retrieved from the blob contents. */
  def insertImage(blob: Blob)(column: Int)(row: Int): Unit = ???
  /** Inserts a Blob as an image in the document at a given row and column, with a pixel offset. The image size is retrieved from the blob contents. */
  def insertImage(blob: Blob)(column: Int)(row: Int)(offsetX: Int)(offsetY: Int): Unit = ???
  /** Inserts an image in the document at a given row and column. */
  def insertImage(url: String)(column: Int)(row: Int): Unit = ???
  /** Inserts an image in the document at a given row and column, with a pixel offset. */
  def insertImage(url: String)(column: Int)(row: Int)(offsetX: Int)(offsetY: Int): Unit = ???
  /** Inserts a row after the given row position. */
  def insertRowAfter(afterPosition: Int): Sheet = ???
  /** Inserts a row before the given row position. */
  def insertRowBefore(beforePosition: Int): Sheet = ???
  /** Inserts a number of rows after the given row position. */
  def insertRowsAfter(afterPosition: Int)(howMany: Int): Sheet = ???
  /** Inserts a number of rows before the given row position. */
  def insertRowsBefore(beforePosition: Int)(howMany: Int): Sheet = ???
  /** Inserts a new sheet in the spreadsheet, with a default name. As a side effect, it makes it the active sheet. */
  def insertSheet: Sheet = ???
  /** Inserts a new sheet in the spreadsheet at the given index. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetIndex: Int): Sheet = ???
  /** Inserts a new sheet in the spreadsheet at the given index and uses optional advanced arguments. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetIndex: Int)(options: Object): Sheet = ???
  /** Inserts a new sheet in the spreadsheet, with a default name and uses optional advanced arguments. As a side effect, it makes it the active sheet. */
  def insertSheet(options: Object): Sheet = ???
  /** Inserts a new sheet in the spreadsheet with the given name. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetName: String): Sheet = ???
  /** Inserts a new sheet in the spreadsheet with the given name at the given index. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetName: String)(sheetIndex: Int): Sheet = ???
  /** Inserts a new sheet in the spreadsheet with the given name at the given index and uses optional advanced arguments. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetName: String)(sheetIndex: Int)(options: Object): Sheet = ???
  /** Inserts a new sheet in the spreadsheet with the given name and uses optional advanced arguments. As a side effect, it makes it the active sheet. */
  def insertSheet(sheetName: String)(options: Object): Sheet = ???
  /** Moves the active sheet to the given position in the list of sheets. Throws an exception if the position is negative or greater than the number of sheets. */
  def moveActiveSheet(pos: Int): Unit = ???
  /** Removes the given user from the list of editors for the Spreadsheet. This method does not block users from accessing the Spreadsheet if they belong to a class of users who have general access — for example, if the Spreadsheet is shared with the user's entire domain. */
  def removeEditor(emailAddress: String): Unit = ???
  /** Removes the given user from the list of editors for the Spreadsheet. This method does not block users from accessing the Spreadsheet if they belong to a class of users who have general access — for example, if the Spreadsheet is shared with the user's entire domain. */
  def removeEditor(user: User): Unit = ???
  /** Removes a menu that was added by addMenu(name, subMenus). The name argument should have the same value as the corresponding call to addMenu(name, subMenus). */
  def removeMenu(name: String): Unit = ???
  /** Deletes a named range with the given name. Throws an exception if no range with the given name is found in the spreadsheet. */
  def removeNamedRange(name: String): Unit = ???
  /** Removes the given user from the list of viewers and commenters for the Spreadsheet. This method has no effect if the user is an editor, not a viewer or commenter. This method also does not block users from accessing the Spreadsheet if they belong to a class of users who have general access — for example, if the Spreadsheet is shared with the user's entire domain. */
  def removeViewer(emailAddress: String): Unit = ???
  /** Removes the given user from the list of viewers and commenters for the Spreadsheet. This method has no effect if the user is an editor, not a viewer. This method also does not block users from accessing the Spreadsheet if they belong to a class of users who have general access — for example, if the Spreadsheet is shared with the user's entire domain. */
  def removeViewer(user: User): Unit = ???
  /** Renames the document. */
  def rename(newName: String): Unit = ???
  /** Renames the current active sheet to the given new name. */
  def renameActiveSheet(newName: String): Unit = ???
  /** Sets the active range for the active sheet. */
  def setActiveRange(range: Range): Range = ???
  /** Sets the active selection region for this sheet. */
  def setActiveSelection(range: Range): Range = ???
  /** Sets the active selection, as specified in A1 notation or R1C1 notation. */
  def setActiveSelection(a1Notation: String): Range = ???
  /** Sets the given sheet to be the active sheet in the spreadsheet. The spreadsheet UI will display the chosen sheet unless the sheet belongs to a different spreadsheet. */
  def setActiveSheet(sheet: Sheet): Sheet = ???
  /** Sets the width of the given column in pixels. */
  def setColumnWidth(columnPosition: Int)(width: Int): Sheet = ???
  /** Freezes the given number of columns. If zero, no columns are frozen. */
  def setFrozenColumns(columns: Int): Unit = ???
  /** Freezes the given number of rows. If zero, no rows are frozen. */
  def setFrozenRows(rows: Int): Unit = ???
  /** Names a range. */
  def setNamedRange(name: String)(range: Range): Unit = ???
  /** Sets the row height of the given row in pixels. */
  def setRowHeight(rowPosition: Int)(height: Int): Sheet = ???
  /** Sets the permissions for the current sheet. */
  def setSheetProtection(permissions: PageProtection): Unit = ???
  /** Sets the spreadsheet locale. */
  def setSpreadsheetLocale(locale: String): Unit = ???
  /** Sets the time zone for the spreadsheet. */
  def setSpreadsheetTimeZone(timezone: String): Unit = ???
  /** Displays a custom user interface component in a dialog centered in the user's browser's viewport. The server-side script's execution will not be suspended. To communicate with the server side, the user interface component must make asynchronous callbacks to the server-side script. */
  def show(userInterface: Object): Unit = ???
  /** Sorts a sheet by column, ascending. */
  def sort(columnPosition: Int): Sheet = ???
  /** Sorts a sheet by column. Takes a parameter to specify ascending or descending. */
  def sort(columnPosition: Int)(ascending: Boolean): Sheet = ???
  /** Shows a popup window in the lower right corner of the spreadsheet with the given message. */
  def toast(msg: String): Unit = ???
  /** Shows a popup window in the lower right corner of the spreadsheet with the given message and title. */
  def toast(msg: String)(title: String): Unit = ???
  /** Shows a popup window in the lower right corner of the spreadsheet with the given title and message, that stays visible for a certain length of time. */
  def toast(msg: String)(title: String)(timeoutSeconds: Number): Unit = ???
  /** Unhides the column in the given range. */
  def unhideColumn(column: Range): Unit = ???
  /** Unhides the row in the given range. */
  def unhideRow(row: Range): Unit = ???
  /** Updates a menu that was added by addMenu(name, subMenus). Works exactly like addMenu(name, subMenus). */
  def updateMenu(name: String)(subMenus: Seq[Object]): Unit = ???
  /** Deprecated. As of January 2014 this function is deprecated and not available in the new version of Google Sheets. */
  def isAnonymousView: Boolean = ???
  /** Deprecated. As of January 2014 this function is deprecated and not available in the new version of Google Sheets. */
  def isAnonymousWrite: Boolean = ???
  /** Deprecated. As of January 2014 this function is deprecated and not available in the new version of Google Sheets. */
  def setAnonymousAccess(anonymousReadAllowed: Boolean)(anonymousWriteAllowed: Boolean): Unit = ???
}