package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents a review that can be part of an ad review extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 *  page for more information on reviews and other types of ad extensions.
 */
trait Review extends js.Object {
  /**
   *  Returns the end date of the review. For instance, if the end date of the review is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate: AdWordsDate = js.native
  /**
   *  Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Review"</code>
   * .
   */
  def getEntityType: String = js.native
  /**  Returns the ID of the review. */
  def getId: Long = js.native
  /**  Returns the scheduling of the review. */
  def getSchedules: Seq[ExtensionSchedule] = js.native
  /**  Returns the name of the source of the review. */
  def getSourceName: String = js.native
  /**  Returns the source URL of the review. */
  def getSourceUrl: String = js.native
  /**
   *  Returns the start date of the review. For instance, if the start date of the review is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate: AdWordsDate = js.native
  /**
   *  Returns stats for the specified date range. Supported values:
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example:
   * <pre class="prettyprint">
   *  var stats = review.getStatsFor("THIS_MONTH");</pre>
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
  /**  Returns the text of the review. */
  def getText: String = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the text of the review is exactly quoted, or
   * <code>false</code>
   *  if the text is paraphrased.
   */
  def isExactlyQuoted: Boolean = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the review specifies mobile device preference.
   */
  def isMobilePreferred: Boolean = js.native
  /**
   *  Sets the review's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  format. For instance,
   * <code>review.setEndDate("20130503");</code>
   *  is equivalent to
   * <code>review.setEndDate({year: 2013, month: 5, day: 3});</code>
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
   *  Sets the exactly quoted value of the review. Specify
   * <code>true</code>
   *  if the text of the review is exactly quoted, which will result in the text being rendered with quotation marks. Specify
   * <code>false</code>
   *  if the text of the review is paraphrased, which will result in the text being rendered without quotation marks.
   * <p>Returns nothing.</p>
   *
   */
  def setExactlyQuoted(isExactlyQuoted: Boolean): Unit = js.native
  /**
   *  Sets the review's device preference.
   * <p>Returns nothing.</p>
   *
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   *  Sets the review scheduling. Scheduling of a review allows you to control the days of week and times of day during which the review will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the review to run at all times.</p>
   *
   * <p>The following example sets the review to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  review.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   *
   * <p>Returns nothing.</p>
   *
   */
  def setSchedules(schedules: Seq[ExtensionSchedule]): Unit = js.native
  /**
   *  Sets the name of the source of the review. The combined length of sourceName and text is limited to 67 characters.
   * <p>Returns nothing.</p>
   *
   */
  def setSourceName(sourceName: String): Unit = js.native
  /**
   *  Sets the source URL of the review.
   * <p>Returns nothing.</p>
   *
   */
  def setSourceUrl(sourceUrl: String): Unit = js.native
  /**
   *  Sets the review's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  format. For instance,
   * <code>review.setStartDate("20130503");</code>
   *  is equivalent to
   * <code>review.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the review's end date.</li>
   * </ul>
   *
   * <p>Returns nothing.</p>
   *
   */
  def setStartDate(date: AnyRef): Unit = js.native
  /**
   *  Sets the text of the review. The combined length of sourceName and text is limited to 67 characters.
   * <p>Returns nothing.</p>
   *
   */
  def setText(text: String): Unit = js.native
}