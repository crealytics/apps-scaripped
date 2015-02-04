package com.google.appsscript.base

import scala.scalajs.js

/**
 * Ui An instance of the user-interface environment for a Google App that allows the script to add features like menus, dialogs, and sidebars. A script can only interact with the UI for the current instance of an open editor, and only if the script is container-bound to the editor. 
 *  // Display a dialog box with a title, message, input field, and "Yes" and "No" buttons. The
 *  // user can also close the dialog by clicking the close button in its title bar.
 *  var ui = SpreadsheetApp.getUi();
 *  var response = ui.prompt('Getting to know you', 'May I know your name?', ui.ButtonSet.YES_NO);
 * 
 *  // Process the user's response.
 *  if (response.getSelectedButton() == ui.Button.YES) {
 *    Logger.log('The user\'s name is %s.', response.getResponseText());
 *  } else if (response.getSelectedButton() == ui.Button.NO) {
 *    Logger.log('The user didn\'t want to provide a name.');
 *  } else {
 *    Logger.log('The user clicked the close button in the dialog\'s title bar.');
 *  }
 */
trait Ui extends js.Object {
  /** Opens a dialog box in the user's editor with the given message and an "OK" button. This method suspends the server-side script while the dialog is open. The script will resume after the user dismisses the dialog, but Jdbc connections will not persist across the suspension. For more information, see the guide to dialogs and sidebars. */
  def alert(prompt: String): Button = js.native
  /** Opens a dialog box in the user's editor with the given message and set of buttons. This method suspends the server-side script while the dialog is open. The script will resume after the user dismisses the dialog, but Jdbc connections will not persist across the suspension. For more information, see the guide to dialogs and sidebars. */
  def alert(prompt: String, buttons: ButtonSet): Button = js.native
  /** Opens a dialog box in the user's editor with the given title, message, and set of buttons. This method suspends the server-side script while the dialog is open. The script will resume after the user dismisses the dialog, but Jdbc connections will not persist across the suspension. For more information, see the guide to dialogs and sidebars. */
  def alert(title: String, prompt: String, buttons: ButtonSet): Button = js.native
  /** Creates a builder that can be used to insert a sub-menu into the editor's Add-on menu. The menu will not actually be updated until Menu.addToUi() is called. If the script is running as an add-on, the sub-menu name will match the add-on's name in the web store; if the script is bound to the document directly, the sub-menu name will match the script's name. For more information, see the guide to menus. */
  def createAddonMenu(): Menu = js.native
  /** Creates a builder that can be used to add a menu to the editor's user interface. The menu will not actually be added until Menu.addToUi() is called. For more information, see the guide to menus. The label for a top-level menu should be in headline case (all major words capitalized), although the label for a sub-menu should be in sentence case (only the first word capitalized). If the script is published as an add-on, the caption parameter is ignored and the menu is added as a sub-menu of the Add-ons menu, equivalent to createAddonMenu(). */
  def createMenu(caption: String): Menu = js.native
  /** Opens an input dialog box in the user's editor with the given message and an "OK" button. This method suspends the server-side script while the dialog is open. The script will resume after the user dismisses the dialog, but Jdbc connections will not persist across the suspension. For more information, see the guide to dialogs and sidebars. */
  def prompt(prompt: String): PromptResponse = js.native
  /** Opens an input dialog box in the user's editor with the given message and set of buttons. This method suspends the server-side script while the dialog is open. The script will resume after the user dismisses the dialog, but Jdbc connections will not persist across the suspension. For more information, see the guide to dialogs and sidebars. */
  def prompt(prompt: String, buttons: ButtonSet): PromptResponse = js.native
  /** Opens an input dialog box in the user's editor with the given title, message, and set of buttons. This method suspends the server-side script while the dialog is open. The script will resume after the user dismisses the dialog, but Jdbc connections will not persist across the suspension. For more information, see the guide to dialogs and sidebars. */
  def prompt(title: String, prompt: String, buttons: ButtonSet): PromptResponse = js.native
  /** Opens a modal dialog box in the user's editor with custom client-side content. This method does not suspend the server-side script while the dialog is open. To communicate with the server-side script, the client-side component must make asynchronous callbacks using either the google.script API for HtmlService or server handlers for UiApp. To close the dialog programmatically, call google.script.host.close() on the client side of an HtmlService web app or UiInstance.close() from a UiApp web app. For more information, see the guide to dialogs and sidebars. */
  def showModalDialog(userInterface: AnyRef, title: String): Unit = js.native
  /** Opens a modeless dialog box in the user's editor with custom client-side content. This method does not suspend the server-side script while the dialog is open. To communicate with the server-side script, the client-side component must make asynchronous callbacks using either the google.script API for HtmlService or server handlers for UiApp. To close the dialog programmatically, call google.script.host.close() on the client side of an HtmlService web app or UiInstance.close() from a UiApp web app. For more information, see the guide to dialogs and sidebars. */
  def showModelessDialog(userInterface: AnyRef, title: String): Unit = js.native
  /** Opens a sidebar in the user's editor with custom client-side content. This method does not suspend the server-side script while the sidebar is open. To communicate with the server-side script, the client-side component must make asynchronous callbacks using either the google.script API for HtmlService or server handlers for UiApp. To close the sidebar programmatically, call google.script.host.close() on the client side of an HtmlService web app or UiInstance.close() from a UiApp web app. For more information, see the guide to dialogs and sidebars. */
  def showSidebar(userInterface: AnyRef): Unit = js.native
  /** Deprecated. As of March 2014, this method is deprecated. The direct replacement is showModelessDialog(userInterface, title), but showModalDialog(userInterface, title) is a better choice in almost all cases. */
  def showDialog(userInterface: AnyRef): Unit = js.native
}
