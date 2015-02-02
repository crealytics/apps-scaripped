package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents an AdWords topic.
 */
trait Topic extends js.Object {
  /**  Provides access to this topic's bidding fields. */
  def bidding: TopicBidding = js.native
  /**  Returns the ad group to which this topic belongs. */
  def getAdGroup: AdGroup = js.native
  /**  Returns the campaign to which this topic belongs. */
  def getCampaign: Campaign = js.native
  /**  Returns the ID of the topic. */
  def getId: Long = js.native
  /**
   *  Returns stats for the specified date range. Supported values:
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example:
   * <pre class="prettyprint">
   *  var stats = topic.getStatsFor("THIS_MONTH");</pre>
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
  /**
   *  Returns the topic ID of the topic. The topic ID identifies the topic category. A list of valid topic IDs is available on our
   * <a href="/adwords/api/docs/appendix/verticals">Verticals</a>
   *  page.
   */
  def getTopicId: Long = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the topic is enabled.
   */
  def isEnabled: Boolean = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the topic is paused.
   */
  def isPaused: Boolean = js.native
  /**
   *  Removes the topic from the account.
   * <p>Returns nothing.</p>
   *
   */
  def remove: Unit = js.native
}