package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Miscellaneous information about the current script execution. */
trait ExecutionInfo extends js.Object {
  /** Returns the remaining number of AdWords entities the script is allowed to create in this execution. See the 'Limits' page for more information. */
  def getRemainingCreateQuota(): Int = js.native
  /** Returns the remaining number of AdWords entities the script is allowed to fetch in this execution. See the 'Limits' page for more information. */
  def getRemainingGetQuota(): Int = js.native
  /** Returns the remaining time in seconds the script is allowed to execute. See the 'Limits' page for more information. */
  def getRemainingTime(): Int = js.native
  /**
   * Returns
   * <code>true</code>
   * if the script is currently being previewed, or
   * <code>false</code>
   * if it is a live execution.
   */
  def isPreview(): Boolean = js.native
}
