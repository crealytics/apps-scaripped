package com.google.appsscript.base

import scala.scalajs.js

/** User Representation of a user, suitable for scripting. */
trait User extends js.Object {
  /** Gets the user's email address, if available. If security policies do not allow access to the user's email address, this method returns a blank string. The circumstances in which the email address is available vary: for example, the user's email address is not available in any context that allows a script to run without that user's authorization, like a simple onOpen(e) or onEdit(e) trigger, a custom function in Google Sheets, or a web app deployed to "execute as me" (that is, authorized by the developer instead of the user). However, these restrictions generally do not apply if the developer and the user belong to the same Google Apps for Business domain. */
  def getEmail: String = js.native
  /** Deprecated. As of June 24, 2013, replaced by getEmail() */
  def getUserLoginId: String = js.native
}