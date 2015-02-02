package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents a flexible bidding strategy. Bidding strategies store shared bidding configuration data and are account-level objects. For more information, refer to 
 * <a href="https://support.google.com/adwords/answer/2979071"> Using flexible bid strategies</a>
 * .
 */
trait BiddingStrategy {
  /**  Returns the selector of all ad groups that use this bidding strategy. */
  def adGroups: AdGroupSelector = ???
  /**  Returns the selector of all campaigns that use this bidding strategy. */
  def campaigns: CampaignSelector = ???
  /**  Returns the ID of the bidding strategy. */
  def getId: Long = ???
  /**  Returns the name of the bidding strategy. */
  def getName: String = ???
  /**
   *  Returns stats for the specified date range. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  var stats = biddingStrategy.getStatsFor("THIS_MONTH");</pre>
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
  /**  Returns the type of the bidding strategy. */
  def getType: String = ???
  /**  Returns the selector of all keywords that use this bidding strategy. */
  def keywords: KeywordSelector = ???
  /**  Returns the selector of all shopping ad groups that use this bidding strategy. */
  def shoppingAdGroups: ShoppingAdGroupSelector = ???
  /**  Returns the selector of all shopping campaigns that use this bidding strategy. */
  def shoppingCampaigns: ShoppingCampaignSelector = ???
}