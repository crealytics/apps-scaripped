package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents a sitelink that has been added to a campaign as an ad sitelink extension. Visit our 
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 *  page for more information on sitelinks and other types of ad extensions.
 */
trait CampaignSitelink extends js.Object {
  /**  Returns the campaign to which this campaign-level sitelink belongs. */
  def getCampaign(): Campaign = js.native
  /**  Returns the first description line of the campaign-level sitelink description. */
  def getDescription1(): String = js.native
  /**  Returns the second description line of the campaign-level sitelink description. */
  def getDescription2(): String = js.native
  /**
   *  Returns the end date of the campaign-level sitelink. For instance, if the end date of the campaign-level sitelink is May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"CampaignSitelink"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**  Returns the ID of the campaign-level sitelink. */
  def getId(): Long = js.native
  /**  Returns the link text of the campaign-level sitelink. */
  def getLinkText(): String = js.native
  /**  Returns the link URL of the campaign-level sitelink. */
  def getLinkUrl(): String = js.native
  /**  Returns the scheduling of the campaign-level sitelink. */
  def getSchedules(): Seq[ExtensionSchedule] = js.native
  /**
   *  Returns the start date of the campaign-level sitelink. For instance, if the start date of the campaign-level sitelink is May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate(): AdWordsDate = js.native
  /**
   *  Returns stats for the specified date range. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  var stats = campaignSitelink.getStatsFor("THIS_MONTH");</pre>
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
   *  Returns 
   * <code>true</code>
   *  if the campaign-level sitelink specifies mobile device preference.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   *  Sets the first description line of the campaign-level sitelink description. 
   * <p>Returns nothing.</p>
   *  
   */
  def setDescription1(description1: String): Unit = js.native
  /**
   *  Sets the second description line of the campaign-level sitelink description. 
   * <p>Returns nothing.</p>
   *  
   */
  def setDescription2(description2: String): Unit = js.native
  /**
   *  Sets the campaign-level sitelink's end date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>campaignSitelink.setEndDate("20130503");</code>
   *  is equivalent to 
   * <code>campaignSitelink.setEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the start date now comes after the end date, or</li> 
   *  <li>it's a date in the past.</li>
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setEndDate(date: AnyRef): Unit = js.native
  /**
   *  Sets the link text of the campaign-level sitelink. 
   * <p>Returns nothing.</p>
   *  
   */
  def setLinkText(linkText: String): Unit = js.native
  /**
   *  Sets the link URL of the campaign-level sitelink. 
   * <p>Returns nothing.</p>
   *  
   */
  def setLinkUrl(linkUrl: String): Unit = js.native
  /**
   *  Sets the campaign-level sitelink's device preference. 
   * <p>Returns nothing.</p>
   *  
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   *  Sets the campaign-level sitelink scheduling. Scheduling of a campaign-level sitelink allows you to control the days of week and times of day during which the campaign-level sitelink will show alongside your ads. 
   * <p>Passing in an empty array clears the scheduling field, causing the campaign-level sitelink to run at all times.</p>
   *  
   * <p>The following example sets the campaign-level sitelink to run on Mondays and Tuesday from 8:00 to 11:00.</p>
   *  
   * <pre class="prettyprint">
   *  var mondayMorning = {
   *    dayOfWeek: "MONDAY",
   *    startHour: 8,
   *    startMinute: 0,
   *    endHour: 11,
   *    endMinute: 0
   *  };
   *  var tuesdayMorning = {
   *    dayOfWeek: "TUESDAY",
   *    startHour: 8,
   *    startMinute: 0,
   *    endHour: 11,
   *    endMinute: 0
   *  };
   * 
   *  campaignSitelink.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setSchedules(schedules: Seq[ExtensionSchedule]): Unit = js.native
  /**
   *  Sets the campaign-level sitelink's start date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>campaignSitelink.setStartDate("20130503");</code>
   *  is equivalent to 
   * <code>campaignSitelink.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the given date is after the campaign-level sitelink's end date.</li>
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setStartDate(date: AnyRef): Unit = js.native
}