package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import java.util.Date

/** PageProtection Access and modify the state of protection permissions on a sheet. This class allows users to access and modify sheet protection permissions on a sheet. */
trait PageProtection {
  /** Adds a user to the list of users who can edit the sheet, if it is protected. */
  def addUser(email: String): Unit = ???
  /** Returns a list of the email addresses of the users who can edit this sheet. If sheet protection is disabled, the value returned by this call is meaningless. */
  def getUsers: Seq[String] = ???
  /** Indicates whether the sheet has sheet protection enabled or not. */
  def isProtected: Boolean = ???
  /** Removes a user from the list of users who can edit the sheet. */
  def removeUser(user: String): Unit = ???
  /** Sets the protection status for the sheet. */
  def setProtected(protection: Boolean): Unit = ???
}