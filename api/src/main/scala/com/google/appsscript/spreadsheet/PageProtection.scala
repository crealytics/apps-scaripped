package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import scala.scalajs.js

/** PageProtection Deprecated. For spreadsheets created in the newer version of Google Sheets, use the more powerful Protection class instead. Although this class is deprecated, it will remain available for compatibility with the older version of Sheets. Access and modify protected sheets in the older version of Google Sheets. */
trait PageProtection extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addUser(email: String): Unit = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getUsers(): js.Array[String] = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def isProtected(): Boolean = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def removeUser(user: String): Unit = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setProtected(protection: Boolean): Unit = js.native
}
