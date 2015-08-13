package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Miscellaneous information about MCC Managed Accounts. */
trait ManagedAccount extends js.Object with AccountLike with HasStatistics {
  /**
   * Applies an account label to the managed account. The label name is case-sensitive. The operation will fail if the account label with the specified name does not already exist in the MCC account.
   * <p>Note that an account-level label cannot be applied to more than 1,000 accounts. </p>
   * <p>Returns nothing.</p>
   */
  def applyLabel(name: String): Unit = js.native
  /**
   * Returns the POSIX time zone of the account.
   * <p>Returned values are in the standard time zone identifier form, such as <code>'America/Los_Angeles'</code>.</p>
   * <p>Please refer to <a href="/adwords/api/docs/appendix/timezones">AdWords API Timezones</a> for the full list of possible return values.</p>
   */
  def getTimeZone(): String = js.native
  /** Creates a selector of all account labels that exist in the MCC account. */
  def labels(): AccountLabelSelector = js.native
  /**
   * Removes an account label from the managed account. The label name is case-sensitive. The operation will fail if the account label with the specified name does not already exist in the MCC account.
   * <p>Returns nothing.</p>
   */
  def removeLabel(name: String): Unit = js.native
}
