package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Miscellaneous information about AdWords Accounts. When accessed by
 * <a href="adwordsapp.html#currentAccount_0">AdWordsApp.currentAccount()</a>
 * , it will provide information about the account in which the script is currently running.
 */
trait Account extends js.Object {
  /**
   * Adds a callout extension to this account. See also
   * <a href="adwordsapp_extensions.html#newCalloutBuilder_0">Extensions.newCalloutBuilder()</a>
   */
  def addCallout(calloutExtension: Callout): Operation[Callout] = js.native
  /**
   * Adds a mobile app extension to this account. See also
   * <a href="adwordsapp_extensions.html#newMobileAppBuilder_0">Extensions.newMobileAppBuilder()</a>
   */
  def addMobileApp(mobileAppExtension: MobileApp): Operation[MobileApp] = js.native
  /**
   * Adds a review extension to this account. See also
   * <a href="adwordsapp_extensions.html#newReviewBuilder_0">Extensions.newReviewBuilder()</a>
   */
  def addReview(reviewExtension: Review): Operation[Review] = js.native
  /**
   * Provides access to account-level extensions:
   * <a href="adwordsapp_accountcallout.html">AccountCallout</a>
   * ,
   * <a href="adwordsapp_accountmobileapp.html">AccountMobileApp</a>
   * , and
   * <a href="adwordsapp_accountreview.html">AccountReview</a>
   * .
   */
  def extensions(): AccountExtensions = js.native
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
   */
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = js.native
  /**
   * Returns the POSIX time zone of the account.
   * <p>Returned values are in the standard time zone identifier form, such as <code>'America/Los_Angeles'</code>.</p>
   * <p>Please refer to <a href="/adwords/api/docs/appendix/timezones">AdWords API Timezones</a> for the full list of possible return values.</p>
   */
  def getTimeZone(): String = js.native
  /**
   * Removes a callout extension from this account.
   * <p>Returns nothing.</p>
   */
  def removeCallout(calloutExtension: Callout): Unit = js.native
  /**
   * Removes a mobile app extension from this account.
   * <p>Returns nothing.</p>
   */
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  /**
   * Removes a review extension from this account.
   * <p>Returns nothing.</p>
   */
  def removeReview(reviewExtension: Review): Unit = js.native
}
