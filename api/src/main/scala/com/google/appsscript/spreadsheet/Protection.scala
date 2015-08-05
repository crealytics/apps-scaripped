package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Protection Access and modify protected ranges and sheets. A protected range can protect either a static range of cells or a named range. A protected sheet may include unprotected regions. For spreadsheets created with the older version of Google Sheets, use the PageProtection class instead. 
 *  
 * 
 *  // Protect range A1:B10, then remove all other users from the list of editors.
 *  var ss = SpreadsheetApp.getActive();
 *  var range = ss.getRange('A1:B10');
 *  var protection = range.protect().setDescription('Sample protected range');
 * 
 *  // Ensure the current user is an editor before removing others. Otherwise, if the user's edit
 *  // permission comes from a group, the script will throw an exception upon removing the group.
 *  var me = Session.getEffectiveUser();
 *  protection.addEditor(me);
 *  protection.removeEditors(protection.getEditors());
 *  if (protection.canDomainEdit()) {
 *    protection.setDomainEdit(false);
 *  }
 *  
 *  
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
 *  // Protect the active sheet, then remove all other users from the list of editors.
 *  var sheet = SpreadsheetApp.getActiveSheet();
 *  var protection = sheet.protect().setDescription('Sample protected sheet');
 * 
 *  // Ensure the current user is an editor before removing others. Otherwise, if the user's edit
 *  // permission comes from a group, the script will throw an exception upon removing the group.
 *  var me = Session.getEffectiveUser();
 *  protection.addEditor(me);
 *  protection.removeEditors(protection.getEditors());
 *  if (protection.canDomainEdit()) {
 *    protection.setDomainEdit(false);
 *  }
 */
trait Protection extends js.Object {
  /** Adds the given user to the list of editors for the protected sheet or range. This method does not automatically give the user permission to edit the spreadsheet itself; to do that in addition, call Spreadsheet.addEditor(emailAddress). */
  def addEditor(emailAddress: String): Protection = js.native
  /** Adds the given user to the list of editors for the protected sheet or range. This method does not automatically give the user permission to edit the spreadsheet itself; to do that in addition, call Spreadsheet.addEditor(user). */
  def addEditor(user: User): Protection = js.native
  /** Adds the given array of users to the list of editors for the protected sheet or range. This method does not automatically give the users permission to edit the spreadsheet itself; to do that in addition, call Spreadsheet.addEditors(emailAddresses). */
  def addEditors(emailAddresses: js.Array[String]): Protection = js.native
  /** Determines whether all users in the domain that owns the spreadsheet have permission to edit the protected range or sheet. Throws an exception if the user does not have permission to edit the protected range or sheet. */
  def canDomainEdit(): Boolean = js.native
  /** Determines whether the user has permission to edit the protected range or sheet. The spreadsheet owner is always able to edit protected ranges and sheets. */
  def canEdit(): Boolean = js.native
  /** Gets the description of the protected range or sheet. If no description is set, this method returns an empty string. */
  def getDescription(): String = js.native
  /** Gets the list of editors for the protected range or sheet. Throws an exception if the user does not have permission to edit the protected range or sheet. */
  def getEditors(): js.Array[User] = js.native
  /** Gets the type of the protected area, either SpreadsheetApp.ProtectionType.RANGE or SpreadsheetApp.ProtectionType.SHEET. */
  def getProtectionType(): ProtectionType = js.native
  /** Gets the range that is being protected. If the protection applies to the sheet instead of a range, this method returns a range that spans the entire sheet. */
  def getRange(): Range = js.native
  /** Gets the name of the protected range if it is associated with a named range. Returns null if the protection is not associated with a named range. Note that scripts must explicitly call setRangeName(rangeName) to associate a protected range with a named range; calling Range.protect() to create a protection from a Range that happens to be a named range, without calling setRangeName(rangeName), is not sufficient to associate them. However, creating a protected range from a named range in the Google Sheets UI will associate them automatically. */
  def getRangeName(): String = js.native
  /** Gets an array of unprotected ranges within a protected sheet. If the Protection object corresponds to a protected range instead of a protected sheet, this method returns an empty array. To change the unprotected ranges, use setUnprotectedRanges(ranges) to set a new array of ranges; to re-protect the entire sheet, set an empty array. */
  def getUnprotectedRanges(): js.Array[Range] = js.native
  /** Unprotects the range or sheet. */
  def remove(): Unit = js.native
  /** Removes the given user from the list of editors for the protected sheet or range. Note that if the user is a member of a Google Group that has edit permission, or if all users in the domain have edit permission, the user will still be able to edit the protected area. Neither the owner of the spreadsheet nor the current user can be removed. */
  def removeEditor(emailAddress: String): Protection = js.native
  /** Removes the given user from the list of editors for the protected sheet or range. Note that if the user is a member of a Google Group that has edit permission, or if all users in the domain have edit permission, the user will still be able to edit the protected area as well. Neither the owner of the spreadsheet nor the current user can be removed. */
  def removeEditor(user: User): Protection = js.native
  /** Removes the given array of users from the list of editors for the protected sheet or range. Note that if any of the users are members of a Google Group that has edit permission, or if all users in the domain have edit permission, those users will still be able to edit the protected area. Neither the owner of the spreadsheet nor the current user can be removed. */
  def removeEditors(emailAddresses: js.Array[String]): Protection = js.native
  /** Sets the description of the protected range or sheet. */
  def setDescription(description: String): Protection = js.native
  /** Sets whether all users in the domain that owns the spreadsheet have permission to edit the protected range or sheet. Note that any users who have explicit edit permission will be able to edit the protected area regardless of this setting. Throws an exception if the spreadsheet does not belong to a Google Apps domain (that is, if it is owned by a gmail.com account). */
  def setDomainEdit(editable: Boolean): Protection = js.native
  /** Adjusts the range that is being protected. If the given range covers a different area from the current protected range, this method moves the protection to cover the new range instead. */
  def setRange(range: Range): Protection = js.native
  /** Associates the protected range with an existing named range. If the named range covers a different area from the current protected range, this method moves the protection to cover the the named range instead. The named range must be on the same sheet as the current protected range. Note that scripts must explicitly call this method to associate a protected range with a named range; calling Range.protect() to create a protection from a Range that happens to be a named range, without calling setRangeName(rangeName), is not sufficient to associate them. However, creating a protected range from a named range in the Google Sheets UI will associate them automatically. */
  def setRangeName(rangeName: String): Protection = js.native
  /** Unprotects the given array of ranges within a protected sheet. Throws an exception if the Protection object corresponds to a protected range instead of a protected sheet or if any of the ranges are not on the protected sheet. To change the unprotected ranges, set a new array of ranges; to re-protect the entire sheet, set an empty array. */
  def setUnprotectedRanges(ranges: js.Array[Range]): Protection = js.native
}
