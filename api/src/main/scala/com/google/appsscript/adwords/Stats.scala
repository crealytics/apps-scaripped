package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Statistics common to various entity types.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var stats = campaign.getStatsFor("LAST_MONTH");
 *  var impressions = stats.getImpressions();
 *  var clicks = stats.getClicks();
 *  // etc.</pre>
 * <p> Note that Analytics-related stats (<a href="adwordsapp_stats.html#getAveragePageviews_0">Stats.getAveragePageviews()</a>, <a href="adwordsapp_stats.html#getAverageTimeOnSite_0">Stats.getAverageTimeOnSite()</a> and <a href="adwordsapp_stats.html#getBounceRate_0">Stats.getBounceRate()</a>) are only available for Campaigns, Ad groups, Keywords, and Ads. The method calls will return <code>null</code> for other entity types. </p>
 * Entities with stats:
 * <ul>
 *  <li>AdWords entities: <a href="adwordsapp_campaign.html">Campaign</a>, <a href="adwordsapp_adgroup.html">AdGroup</a>, <a href="adwordsapp_ad.html">Ad</a>, <a href="adwordsapp_keyword.html">Keyword</a>, <a href="adwordsapp_budget.html">Budget</a>.</li>
 *  <li>Targeting: <a href="adwordsapp_adschedule.html">AdSchedule</a>, <a href="adwordsapp_targetedlocation.html">TargetedLocation</a>, <a href="adwordsapp_targetedproximity.html">TargetedProximity</a>.</li>
 *  <li>Extensions:
 *   <ul>
 *    <li>Sitelinks: <a href="adwordsapp_sitelink.html">Sitelink</a>, <a href="adwordsapp_campaignsitelink.html">CampaignSitelink</a>, <a href="adwordsapp_adgroupsitelink.html">AdGroupSitelink</a>.</li>
 *    <li>Phone numbers: <a href="adwordsapp_phonenumber.html">PhoneNumber</a>, <a href="adwordsapp_campaignphonenumber.html">CampaignPhoneNumber</a>, <a href="adwordsapp_adgroupphonenumber.html">AdGroupPhoneNumber</a>.</li>
 *    <li>Mobile apps: <a href="adwordsapp_mobileapp.html">MobileApp</a>, <a href="adwordsapp_campaignmobileapp.html">CampaignMobileApp</a>, <a href="adwordsapp_adgroupmobileapp.html">AdGroupMobileApp</a>.</li>
 *   </ul> </li>
 * </ul>
 */
trait Stats extends js.Object {
  /** Returns the average cost per click. */
  def getAverageCpc(): Double = js.native
  /** Returns the average cost per thousand impressions. */
  def getAverageCpm(): Double = js.native
  /**
   * Returns the average number of pages viewed per visit. Returns
   * <code>null</code>
   * if the account is not linked to Analytics.
   */
  def getAveragePageviews(): Double = js.native
  /**
   * Returns the average position. Returns
   * <code>null</code>
   * if this is a Display entity that doesn't have an average position.
   */
  def getAveragePosition(): Double = js.native
  /**
   * Returns the average time a visitor spent on site, in seconds. Returns
   * <code>null</code>
   * if the account is not linked to Analytics.
   */
  def getAverageTimeOnSite(): Double = js.native
  /**
   * Returns the bounce rate of the entity, in
   * <code>0..1</code>
   * range. When a visitor to your site sees only one page or triggers only one event, Analytics considers this visit a "bounce." Returns
   * <code>null</code>
   * if the account is not linked to Analytics.
   */
  def getBounceRate(): Double = js.native
  /**
   * Returns the conversion rate for clicks, in
   * <code>0..1</code>
   * range.
   */
  def getClickConversionRate(): Double = js.native
  /** Returns the number of clicks. */
  def getClicks(): Long = js.native
  /**
   * Returns the conversion rate, in
   * <code>0..1</code>
   * range.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use
   *  <a href="adwordsapp_stats.html#getClickConversionRate_0">Stats.getClickConversionRate()</a> instead.
   * </aside>
   */
  def getConversionRate(): Double = js.native
  /**
   * Returns the number of conversions.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use
   *  <a href="adwordsapp_stats.html#getConvertedClicks_0">Stats.getConvertedClicks()</a> instead.
   * </aside>
   */
  def getConversions(): Long = js.native
  /** Returns the number of clicks that converted. */
  def getConvertedClicks(): Long = js.native
  /** Returns the cost in the default currency of the account. */
  def getCost(): Double = js.native
  /**
   * Returns the click through rate of the entity, in
   * <code>0..1</code>
   * range.
   */
  def getCtr(): Double = js.native
  /** Returns the number of impressions. */
  def getImpressions(): Long = js.native
}
