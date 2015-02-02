package com.google.appsscript.base

import scala.scalajs.js

/**
 * PromptResponse A response to a prompt dialog displayed in the user-interface environment for a Google App. The response contains any text the user entered in the dialog's input field and indicates which button the user clicked to dismiss the dialog.
 *  // Display a dialog box with a title, message, input field, and "Yes" and "No" buttons. The
 *  // user can also close the dialog by clicking the close button in its title bar.
 *  var ui = DocumentApp.getUi();
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
trait PromptResponse extends js.Object {
  /** Gets the text that the user entered in the dialog's input field. The text is available even if the user closed the dialog by clicking a button with a negative connotation, like "Cancel" or the close button in the dialog's title bar. getSelectedButton() can help to determine whether the user intended the response text to be valid. */
  def getResponseText: String = js.native
  /** Gets the button that the user clicked to dismiss the dialog. If the user clicked the close button that is included in every dialog's title bar, this method returns Button.CLOSE. */
  def getSelectedButton: Button = js.native
}