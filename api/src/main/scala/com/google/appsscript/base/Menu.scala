package com.google.appsscript.base

/**
 * Menu A custom menu in an instance of the user interface for a Google App. A script can only interact with the UI for the current instance of an open document or form, and only if the script is container-bound to the document or form. For more information, see the guide to menus. 
 *  // Add a custom menu to the active spreadsheet, including a separator and a sub-menu.
 *  function onOpen(e) {
 *    SpreadsheetApp.getUi()
 *        .createMenu('My Menu')
 *        .addItem('My Menu Item', 'myFunction')
 *        .addSeparator()
 *        .addSubMenu(SpreadsheetApp.getUi().createMenu('My Submenu')
 *            .addItem('One Submenu Item', 'mySecondFunction')
 *            .addItem('Another Submenu Item', 'myThirdFunction'))
 *        .addToUi();
 *  }
 */
trait Menu {
  /** Adds an item to the menu. The label for a menu item should be in sentence case (only the first word capitalized). */
  def addItem(caption: String, functionName: String): Menu = ???
  /** Adds a visual separator to the menu. */
  def addSeparator: Menu = ???
  /** Adds a sub-menu to the menu. */
  def addSubMenu(menu: Menu): Menu = ???
  /** Inserts the menu into the instance of the editor's user interface. */
  def addToUi: Unit = ???
}