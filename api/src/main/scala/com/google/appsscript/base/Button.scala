package com.google.appsscript.base

import scala.scalajs.js

/**
 * Button An enum representing predetermined, localized dialog buttons returned by an alert or PromptResponse.getSelectedButton() to indicate which button in a dialog the user clicked. These values cannot be set; to add buttons to an alert or prompt, use ButtonSet instead. 
 *  // Display a dialog box with a message and "Yes" and "No" buttons.
 *  var ui = DocumentApp.getUi();
 *  var response = ui.alert('Are you sure you want to continue?', ui.ButtonSet.YES_NO);
 * 
 *  // Process the user's response.
 *  if (response == ui.Button.YES) {
 *    Logger.log('The user clicked "Yes."');
 *  } else {
 *    Logger.log('The user clicked "No" or the dialog\'s close button.');
 *  }
 */
trait Button extends js.Object {
  ()
}