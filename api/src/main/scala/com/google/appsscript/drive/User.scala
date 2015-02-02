package com.google.appsscript.drive

import com.google.appsscript.base._

import scala.scalajs.js

/**
 * User A user associated with a file in Google Drive. Users can be accessed from File.getEditors(), Folder.getViewers(), and other methods.
 *
 *
 *  // Log the email address of all users who have edit access to a file.
 *  var file = DriveApp.getFileById('1234567890abcdefghijklmnopqrstuvwxyz');
 *  var editors = file.getEditors();
 *  for (var i = 0; i < editors.length; i++) {
 *    Logger.log(editors[i].getEmail());
 *  }
 */
trait User extends js.Object {
  /** Gets the domain name associated with the user's account. */
  def getDomain: String = js.native
  /** Gets the user's email address. The user's email address is only available if the user has chosen to share the address from the Google+ account settings page, or if the user belongs to the same domain as the user running the script and the domain administrator has allowed all users within the domain to see other users' email addresses. */
  def getEmail: String = js.native
  /** Gets the user's name. This method returns null if the user's name is not available. */
  def getName: String = js.native
  /** Gets the URL for the user's photo. This method returns null if the user's photo is not available. */
  def getPhotoUrl: String = js.native
  /** Deprecated. As of June 24, 2013, replaced by getEmail() */
  def getUserLoginId: String = js.native
}