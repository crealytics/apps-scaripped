package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Miscellaneous information about MCC Managed Accounts. */
trait ManagedAccount extends js.Object {
  /**
   * Applies an account label to the managed account. The label name is case-sensitive. The operation will fail if the account label with the specified name does not already exist in the MCC account.
   * <p>Note that an account-level label cannot be applied to more than 1,000 accounts. </p>
   * <p>Returns nothing.</p>
   */
  def applyLabel(name: String): Unit = js.native
  /**
   * Returns the currency code of the account. The returned values are in the three-letter ISO 4217 format, e.g.
   * <code>'USD'</code>
   * ,
   * <code>'CAD'</code>
   * ,
   * <code>'JPY'</code>
   * , etc.
   * <p>Please refer to <a href="/adwords/api/docs/appendix/currencycodes">AdWords API Currency Codes</a> for the full list of possible return values.</p>
   */
  def getCurrencyCode(): String = js.native
  /**
   * Returns the customer ID of the account.
   * <p>The returned value is in the standard AdWords format, e.g. <code>'123-456-7890'</code>.</p>
   */
  def getCustomerId(): String = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Account"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the name of the account. */
  def getName(): String = js.native
  /**
   * Returns stats for the specified custom date range. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * form. For instance,
   * <code>March 24th, 2013</code>
   * is represented as either
   * <code>{year: 2013, month: 3, day: 24}</code>
   * or
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so
   * <code>forDateRange("20130324", "20130324")</code>
   * defines a range of a single day.
   * <aside class="warning">
   *   Note that managed accounts only keep stats for the most recent 90 days. Statistics older than 90 days come back as
   *  <code>0</code>.
   * </aside>
   */
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): ManagedAccountStats = js.native
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
