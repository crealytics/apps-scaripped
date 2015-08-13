package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords account-level label. */
trait AccountLabel extends js.Object {
  /** Returns the selector of all accounts to which the account label is applied. */
  def accounts(): ManagedAccountSelector = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"AccountLabel"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the account label. */
  def getId(): String = js.native
  /** Returns the name of the account label. */
  def getName(): String = js.native
  /**
   * Removes the account label.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
  /**
   * Changes the name of the account label. The name must be unique, non-empty, and may not be longer than
   * <code>40</code>
   * characters. Any leading or trailing white spaces will be trimmed.
   * <p>Returns nothing.</p>
   */
  def setName(name: String): Unit = js.native
}
