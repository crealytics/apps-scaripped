package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents a review that has been added to a campaign as an ad review extension. Visit our 
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 *  page for more information on reviews and other types of ad extensions.
 */
trait CampaignReview {
  /**  Returns the campaign to which this campaign-level review belongs. */
  def getCampaign: Campaign = ???
  /**
   *  Returns the end date of the campaign-level review. For instance, if the end date of the campaign-level review is May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate: AdWordsDate = ???
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"CampaignReview"</code>
   * .
   */
  def getEntityType: String = ???
  /**  Returns the ID of the campaign-level review. */
  def getId: Long = ???
  /**  Returns the scheduling of the campaign-level review. */
  def getSchedules: Seq[ExtensionSchedule] = ???
  /**  Returns the name of the source of the campaign-level review. */
  def getSourceName: String = ???
  /**  Returns the source URL of the campaign-level review. */
  def getSourceUrl: String = ???
  /**
   *  Returns the start date of the campaign-level review. For instance, if the start date of the campaign-level review is May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate: AdWordsDate = ???
  /**
   *  Returns stats for the specified date range. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  var stats = campaignReview.getStatsFor("THIS_MONTH");</pre>
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
  /**  Returns the text of the campaign-level review. */
  def getText: String = ???
  /**
   *  Returns 
   * <code>true</code>
   *  if the text of the campaign-level review is exactly quoted, or 
   * <code>false</code>
   *  if the text is paraphrased.
   */
  def isExactlyQuoted: Boolean = ???
  /**
   *  Returns 
   * <code>true</code>
   *  if the campaign-level review specifies mobile device preference.
   */
  def isMobilePreferred: Boolean = ???
  /**
   *  Sets the campaign-level review's end date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>campaignReview.setEndDate("20130503");</code>
   *  is equivalent to 
   * <code>campaignReview.setEndDate({year: 2013, month: 5, day: 3});</code>
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
  def setEndDate(date: AnyRef): Unit = ???
  /**
   *  Sets the exactly quoted value of the campaign-level review. Specify 
   * <code>true</code>
   *  if the text of the review is exactly quoted, which will result in the text being rendered with quotation marks. Specify 
   * <code>false</code>
   *  if the text of the review is paraphrased, which will result in the text being rendered without quotation marks. 
   * <p>Returns nothing.</p>
   *  
   */
  def setExactlyQuoted(isExactlyQuoted: Boolean): Unit = ???
  /**
   *  Sets the campaign-level review's device preference. 
   * <p>Returns nothing.</p>
   *  
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = ???
  /**
   *  Sets the campaign-level review scheduling. Scheduling of a campaign-level review allows you to control the days of week and times of day during which the campaign-level review will show alongside your ads. 
   * <p>Passing in an empty array clears the scheduling field, causing the campaign-level review to run at all times.</p>
   *  
   * <p>The following example sets the campaign-level review to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  campaignReview.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setSchedules(schedules: Seq[ExtensionSchedule]): Unit = ???
  /**
   *  Sets the name of the source of the campaign-level review. The combined length of sourceName and text is limited to 67 characters. 
   * <p>Returns nothing.</p>
   *  
   */
  def setSourceName(sourceName: String): Unit = ???
  /**
   *  Sets the source URL of the campaign-level review. 
   * <p>Returns nothing.</p>
   *  
   */
  def setSourceUrl(sourceUrl: String): Unit = ???
  /**
   *  Sets the campaign-level review's start date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>campaignReview.setStartDate("20130503");</code>
   *  is equivalent to 
   * <code>campaignReview.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the given date is after the campaign-level review's end date.</li>
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setStartDate(date: AnyRef): Unit = ???
  /**
   *  Sets the text of the campaign-level review. The combined length of sourceName and text is limited to 67 characters. 
   * <p>Returns nothing.</p>
   *  
   */
  def setText(text: String): Unit = ???
}