package com.google.appsscript.base

import scala.scalajs.js

/**
 * ButtonSet An enum representing predetermined, localized sets of one or more dialog buttons that can be added to an alert or a prompt. To determine which button the user clicked, use Button. 
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
trait ButtonSet extends js.Object {
  ()
}
