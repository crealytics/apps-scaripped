package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents an AdWords keyword.
 */
trait Keyword {
  /**  Creates a selector of all ad params belonging to this keyword. */
  def adParams: AdParamSelector = ???
  /**
   *  Applies a label to the keyword. 
   * <code>name</code>
   *  of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account. 
   * <p>Note that the keyword cannot not have more than 50 labels. </p>
   * <p>Returns nothing.</p>
   *  
   */
  def applyLabel(name: String): Unit = ???
  /**  Provides access to this keyword's bidding fields. */
  def bidding: KeywordBidding = ???
  /**
   *  Enables the keyword. 
   * <p>Returns nothing.</p>
   *  
   */
  def enable: Unit = ???
  /**  Returns the ad group to which this keyword belongs. */
  def getAdGroup: AdGroup = ???
  /**
   *  Returns the approval status of the keyword. Possible values: 
   * <code>APPROVED, PENDING_REVIEW, UNDER_REVIEW, DISAPPROVED</code>
   * .
   */
  def getApprovalStatus: String = ???
  /**  Returns the campaign to which this keyword belongs. */
  def getCampaign: Campaign = ???
  /**  Returns the destination URL of the keyword. */
  def getDestinationUrl: String = ???
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"Keyword"</code>
   * .
   */
  def getEntityType: String = ???
  /**  Returns the first page cpc for the keyword. */
  def getFirstPageCpc: Double = ???
  /**
   *  Returns the ID of the keyword. 
   * <p>Keyword IDs may be shared across ad groups. In order to uniquely identify one keyword, one must specify both its ad group ID and the keyword ID.</p>
   */
  def getId: Long = ???
  /**
   *  Returns the match type of the keyword. Possible values: 
   * <code>BROAD, PHRASE, EXACT</code>
   * .
   */
  def getMatchType: String = ???
  /**
   *  Returns the max cpc bid of the keyword, in the currency of the account. Returns 
   * <code>null</code>
   *  if the 
   * <a href="adwordsapp_campaign.html#getBiddingStrategyType_0">campaign's bidding strategy</a>
   *  is not 
   * <code>MANUAL_CPC</code>
   * .
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_keywordbidding.html#getCpc_0">KeywordBidding.getCpc()</a>.
   * </aside>
   */
  def getMaxCpc: Double = ???
  /**
   *  Returns the quality score of the keyword, in 
   * <code>1..10</code>
   *  range.
   */
  def getQualityScore: Int = ???
  /**
   *  Returns stats for the specified date range. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  var stats = keyword.getStatsFor("THIS_MONTH");</pre>
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
   *  Returns the text of the keyword. The returned value will be formatted as follows, depending on the match type: 
   * <ul> 
   *  <li><code>shoes</code> - broad match</li> 
   *  <li><code>"shoes"</code> - phrase match</li> 
   *  <li><code>[leather shoes]</code> - exact match</li> 
   * </ul>
   */
  def getText: String = ???
  /**  Returns the top of page cpc for the keyword. */
  def getTopOfPageCpc: Double = ???
  /**
   *  Returns 
   * <code>true</code>
   *  if the keyword is enabled.
   */
  def isEnabled: Boolean = ???
  /**
   *  Returns 
   * <code>true</code>
   *  if the keyword is paused.
   */
  def isPaused: Boolean = ???
  /**  Creates a selector of all labels applied to the keyword. */
  def labels: LabelSelector = ???
  /**
   *  Pauses the keyword. 
   * <p>Returns nothing.</p>
   *  
   */
  def pause: Unit = ???
  /**
   *  Removes the keyword from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove: Unit = ???
  /**
   *  Removes a label from the keyword. 
   * <code>name</code>
   *  of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def removeLabel(name: String): Unit = ???
  /**
   *  Creates an ad param for this keyword with the specified index and insertion text. 
   * <p>Returns nothing.</p>
   *  
   */
  def setAdParam(index: Int, insertionText: String): Unit = ???
  /**
   *  Sets destination URL of the keyword to the specified value. 
   * <p>Returns nothing.</p>
   *  
   */
  def setDestinationUrl(destinationUrl: String): Unit = ???
  /**
   *  Sets the max cpc bid of the keyword to the specified value. The change will take effect only if the 
   * <a href="adwordsapp_campaign.html#getBiddingStrategyType_0">campaign's bidding strategy</a>
   *  is 
   * <code>MANUAL_CPC</code>
   * .
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_keywordbidding.html#setCpc_1">KeywordBidding.setCpc(double)</a>.
   * </aside>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setMaxCpc(maxCpc: Double): Unit = ???
}