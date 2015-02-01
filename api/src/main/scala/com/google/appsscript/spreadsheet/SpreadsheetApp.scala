package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import java.util.Date

/** SpreadsheetApp This class allows users to open Google Sheets files and to create new ones. This class is the parent class for the Spreadsheet service. */
trait SpreadsheetApp {
  /** Creates a new spreadsheet with the given name. */
  def create(name: String): Spreadsheet = ???
  /** Creates a new spreadsheet with the given name and the specified number of rows and columns. */
  def create(name: String)(rows: Int)(columns: Int): Spreadsheet = ???
  /** Applies all pending Spreadsheet changes. Spreadsheet operations are sometimes bundled together to improve performance, such as when doing multiple calls to Range.getValue(). However, sometimes you may want to make sure that all pending changes are made right away, for instance to show users data as a script is executing. */
  def flush: Unit = ???
  /** Returns the currently active spreadsheet, or null if there is none. Functions that are run in the context of a spreadsheet can get a reference to the corresponding Spreadsheet object by calling this function. */
  def getActive: Spreadsheet = ???
  /** Returns the range of cells that is currently considered active. This generally means the range that a user has selected in the active sheet, but in a custom function it refers to the cell being actively recalculated. */
  def getActiveRange: Range = ???
  /** Gets the active sheet in a spreadsheet. The active sheet in a spreadsheet is the sheet that is being displayed in the spreadsheet UI. */
  def getActiveSheet: Sheet = ???
  /** Returns the currently active spreadsheet, or null if there is none. Functions that are run in the context of a spreadsheet can get a reference to the corresponding Spreadsheet object by calling this function. */
  def getActiveSpreadsheet: Spreadsheet = ???
  /** Returns an instance of the spreadsheet's user-interface environment that allows the script to add features like menus, dialogs, and sidebars. A script can only interact with the UI for the current instance of an open spreadsheet, and only if the script is bound to the spreadsheet. For more information, see the guides to menus and dialogs and sidebars. */
  def getUi: Ui = ???
  /** Creates a builder for a data-validation rule. */
  def newDataValidation: DataValidationBuilder = ???
  /** Opens the spreadsheet with the given ID. A spreadsheet ID can be extracted from its URL. For example, the spreadsheet ID in the URL https://docs.google.com/spreadsheets/d/abc1234567/edit#gid=0 is "abc1234567". */
  def openById(id: String): Spreadsheet = ???
  /** Opens the spreadsheet with the given url. */
  def openByUrl(url: String): Spreadsheet = ???
  /** Sets the active range for the application. The spreadsheet UI will display the sheet that contains the chosen range and will select the cells defined in the chosen range. */
  def setActiveRange(range: Range): Range = ???
  /** Sets the active sheet in a spreadsheet. The spreadsheet UI will display the chosen sheet unless the sheet belongs to a different spreadsheet. */
  def setActiveSheet(sheet: Sheet): Sheet = ???
  /** Sets the active spreadsheet. */
  def setActiveSpreadsheet(newActiveSpreadsheet: Spreadsheet): Unit = ???
}