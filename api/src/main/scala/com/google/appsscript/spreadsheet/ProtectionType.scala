package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * ProtectionType An enumeration representing the parts of a spreadsheet that can be protected from edits. 
 *  
 * 
 *  // Remove all range protections in the spreadsheet that the user has permission to edit.
 *  var ss = SpreadsheetApp.getActive();
 *  var protections = ss.getProtections(SpreadsheetApp.ProtectionType.RANGE);
 *  for (var i = 0; i < protections.length; i++) {
 *    var protection = protections[i];
 *    if (protection.canEdit()) {
 *      protection.remove();
 *    }
 *  }
 *  
 *  
 *  
 * 
 *  // Removes sheet protection from the active sheet, if the user has permission to edit it.
 *  var sheet = SpreadsheetApp.getActiveSheet();
 *  var protection = sheet.getProtections(SpreadsheetApp.ProtectionType.SHEET)[0];
 *  if (protection && protection.canEdit()) {
 *    protection.remove();
 *  }
 */
trait ProtectionType extends js.Object {
  ()
}
