package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents an AdWords display keyword.
 */
trait DisplayKeyword extends js.Object {
  /**  Provides access to this display keyword's bidding fields. */
  def bidding: DisplayKeywordBidding = js.native
  /**  Returns the ad group to which this display keyword belongs. */
  def getAdGroup: AdGroup = js.native
  /**  Returns the campaign to which this display keyword belongs. */
  def getCampaign: Campaign = js.native
  /**  Returns the ID of the display keyword. */
  def getId: Long = js.native
  /**
   *  Returns stats for the specified date range. Supported values:
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example:
   * <pre class="prettyprint">
   *  var stats = displayKeyword.getStatsFor("THIS_MONTH");</pre>
   */
  def getStatsFor(dateRange: String): Stats = js.native
  /**
   *  Returns stats for the specified custom date range. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  form. For instance,
   * <code>March 24th, 2013</code>
   *  is represented as either
   * <code>{year: 2013, month: 3, day: 24}</code>
   *  or
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so
   * <code>forDateRange("20130324", "20130324")</code>
   *  defines a range of a single day.
   */
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = js.native
  /**  Returns the text of the display keyword. */
  def getText: String = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the display keyword is enabled.
   */
  def isEnabled: Boolean = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the display keyword is paused.
   */
  def isPaused: Boolean = js.native
  /**
   *  Removes the display keyword from the account.
   * <p>Returns nothing.</p>
   *
   */
  def remove: Unit = js.native
}