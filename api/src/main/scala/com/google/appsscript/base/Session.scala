package com.google.appsscript.base

import scala.scalajs.js

/** Session The Session class provides access to session information, such as the user's email address (in some circumstances) and language setting. */
trait Session extends js.Object {
  /** Gets information about the current user. If security policies do not allow access to the user's identity, User.getEmail() returns a blank string. The circumstances in which the email address is available vary: for example, the user's email address is not available in any context that allows a script to run without that user's authorization, like a simple onOpen(e) or onEdit(e) trigger, a custom function in Google Sheets, or a web app deployed to "execute as me" (that is, authorized by the developer instead of the user). However, these restrictions generally do not apply if the developer and the user belong to the same Google Apps for Business domain. */
  def getActiveUser: User = js.native
  /** Gets the language setting of the current user as a two-letter string — for example, en for English. */
  def getActiveUserLocale: String = js.native
  /** Gets information about the user under whose authority the script is running. If the script is a web app set to "execute as me" (the developer), this returns the developer's user account. If the script is running under an installable trigger, this returns the account of the user who created the trigger. In most other scenarios, this returns the same account as getActiveUser(). */
  def getEffectiveUser: User = js.native
  /** Gets the time zone of the script. New scripts default to the owner's time zone, but the script's time zone can be changed by clicking File > Project properties in the script editor. Note that spreadsheets have a separate time zone, which can be changed by clicking File > Spreadsheet settings in Google Sheets. Spreadsheet time zones that differ from the script time zone are a frequent source of scripting bugs. */
  def getScriptTimeZone: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTimeZone: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getUser: User = js.native
}