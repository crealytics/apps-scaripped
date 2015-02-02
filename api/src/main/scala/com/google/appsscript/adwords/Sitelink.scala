package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents a sitelink that can be part of an ad sitelink extension. Visit our 
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 *  page for more information on sitelinks and other types of ad extensions.
 */
trait Sitelink {
  /**  Returns the first description line of the sitelink description. */
  def getDescription1: String = ???
  /**  Returns the second description line of the sitelink description. */
  def getDescription2: String = ???
  /**
   *  Returns the end date of the sitelink. For instance, if the end date of the sitelink is May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate: AdWordsDate = ???
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"Sitelink"</code>
   * .
   */
  def getEntityType: String = ???
  /**  Returns the ID of the sitelink. */
  def getId: Long = ???
  /**  Returns the link text of the sitelink. */
  def getLinkText: String = ???
  /**  Returns the link URL of the sitelink. */
  def getLinkUrl: String = ???
  /**  Returns the scheduling of the sitelink. */
  def getSchedules: Seq[ExtensionSchedule] = ???
  /**
   *  Returns the start date of the sitelink. For instance, if the start date of the sitelink is May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate: AdWordsDate = ???
  /**
   *  Returns stats for the specified date range. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  var stats = sitelink.getStatsFor("THIS_MONTH");</pre>
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
   *  if the sitelink specifies mobile device preference.
   */
  def isMobilePreferred: Boolean = ???
  /**
   *  Sets the first description line of the sitelink description. 
   * <p>Returns nothing.</p>
   *  
   */
  def setDescription1(description1: String): Unit = ???
  /**
   *  Sets the second description line of the sitelink description. 
   * <p>Returns nothing.</p>
   *  
   */
  def setDescription2(description2: String): Unit = ???
  /**
   *  Sets the sitelink's end date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>sitelink.setEndDate("20130503");</code>
   *  is equivalent to 
   * <code>sitelink.setEndDate({year: 2013, month: 5, day: 3});</code>
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
   *  Sets the link text of the sitelink. 
   * <p>Returns nothing.</p>
   *  
   */
  def setLinkText(linkText: String): Unit = ???
  /**
   *  Sets the link URL of the sitelink. 
   * <p>Returns nothing.</p>
   *  
   */
  def setLinkUrl(linkUrl: String): Unit = ???
  /**
   *  Sets the sitelink's device preference. 
   * <p>Returns nothing.</p>
   *  
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = ???
  /**
   *  Sets the sitelink scheduling. Scheduling of a sitelink allows you to control the days of week and times of day during which the sitelink will show alongside your ads. 
   * <p>Passing in an empty array clears the scheduling field, causing the sitelink to run at all times.</p>
   *  
   * <p>The following example sets the sitelink to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  sitelink.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setSchedules(schedules: Seq[ExtensionSchedule]): Unit = ???
  /**
   *  Sets the sitelink's start date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>sitelink.setStartDate("20130503");</code>
   *  is equivalent to 
   * <code>sitelink.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the given date is after the sitelink's end date.</li>
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setStartDate(date: AnyRef): Unit = ???
}