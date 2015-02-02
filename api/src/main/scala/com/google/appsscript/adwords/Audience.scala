package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents an AdWords audience.
 */
trait Audience {
  /**  Provides access to this audience's bidding fields. */
  def bidding: AudienceBidding = ???
  /**  Returns the ad group to which this audience belongs. */
  def getAdGroup: AdGroup = ???
  /**  Returns the audience ID of the audience. User List IDs (List IDs) are available on the details page of a User List (found under the Audiences section of the Shared Library). */
  def getAudienceId: Long = ???
  /**
   *  Returns the type of the audience, either 
   * <code>USER_INTEREST</code>
   *  or 
   * <code>USER_LIST</code>
   * .
   */
  def getAudienceType: String = ???
  /**  Returns the campaign to which this audience belongs. */
  def getCampaign: Campaign = ???
  /**  Returns the ID of the audience. */
  def getId: Long = ???
  /**
   *  Returns stats for the specified date range. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  var stats = audience.getStatsFor("THIS_MONTH");</pre>
   */
  def getStatsFor(dateRange: String): Stats = ???
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
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = ???
  /**
   *  Returns 
   * <code>true</code>
   *  if the audience is enabled.
   */
  def isEnabled: Boolean = ???
  /**
   *  Returns 
   * <code>true</code>
   *  if the audience is paused.
   */
  def isPaused: Boolean = ???
  /**
   *  Removes the audience from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove: Unit = ???
}