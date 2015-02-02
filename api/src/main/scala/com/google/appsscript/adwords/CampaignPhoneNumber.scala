package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents a phone number that has been added to a campaign as an ad call extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 *  page for more information on phone numbers and other types of ad extensions.
 */
trait CampaignPhoneNumber extends js.Object {
  /**  Returns the campaign to which this campaign-level phone number belongs. */
  def getCampaign: Campaign = js.native
  /**  Returns the two character country code of the advertiser's phone number. */
  def getCountry: String = js.native
  /**
   *  Returns the end date of the campaign-level phone number. For instance, if the end date of the campaign-level phone number is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate: AdWordsDate = js.native
  /**
   *  Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"CampaignPhoneNumber"</code>
   * .
   */
  def getEntityType: String = js.native
  /**  Returns the ID of the campaign-level phone number. */
  def getId: Long = js.native
  /**  Returns the advertiser's phone number that gets appended to the ad. */
  def getPhoneNumber: String = js.native
  /**  Returns the scheduling of the campaign-level phone number. */
  def getSchedules: Seq[ExtensionSchedule] = js.native
  /**
   *  Returns the start date of the campaign-level phone number. For instance, if the start date of the campaign-level phone number is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate: AdWordsDate = js.native
  /**
   *  Returns stats for the specified date range. Supported values:
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example:
   * <pre class="prettyprint">
   *  var stats = campaignPhoneNumber.getStatsFor("THIS_MONTH");</pre>
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
   *  if this campaign-level phone number is call only. If
   * <code>true</code>
   * , only the advertiser's phone number will get displayed. If
   * <code>false</code>
   * , the link to the advertiser's website will be shown alongside.
   */
  def isCallOnly: Boolean = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the campaign-level phone number specifies mobile device preference.
   */
  def isMobilePreferred: Boolean = js.native
  /**
   *  If set to
   * <code>true</code>
   * , only the advertiser's phone number will get displayed. If set to
   * <code>false</code>
   * , the link to the advertiser's website will be shown as well.
   * <p>Returns nothing.</p>
   *
   */
  def setCallOnly(callOnly: Boolean): Unit = js.native
  /**
   *  Sets the two character country code of the advertiser's phone number.
   * <p>Returns nothing.</p>
   *
   */
  def setCountry(country: String): Unit = js.native
  /**
   *  Sets the campaign-level phone number's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  format. For instance,
   * <code>campaignPhoneNumber.setEndDate("20130503");</code>
   *  is equivalent to
   * <code>campaignPhoneNumber.setEndDate({year: 2013, month: 5, day: 3});</code>
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
   *  Sets the campaign-level phone number's device preference.
   * <p>Returns nothing.</p>
   *
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   *  Sets the advertiser's phone number that gets appended to the ad.
   * <p>Returns nothing.</p>
   *
   */
  def setPhoneNumber(phoneNumber: String): Unit = js.native
  /**
   *  Sets the campaign-level phone number scheduling. Scheduling of a campaign-level phone number allows you to control the days of week and times of day during which the campaign-level phone number will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the campaign-level phone number to run at all times.</p>
   *
   * <p>The following example sets the campaign-level phone number to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  campaignPhoneNumber.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   *
   * <p>Returns nothing.</p>
   *
   */
  def setSchedules(schedules: Seq[ExtensionSchedule]): Unit = js.native
  /**
   *  Sets the campaign-level phone number's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  format. For instance,
   * <code>campaignPhoneNumber.setStartDate("20130503");</code>
   *  is equivalent to
   * <code>campaignPhoneNumber.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the campaign-level phone number's end date.</li>
   * </ul>
   *
   * <p>Returns nothing.</p>
   *
   */
  def setStartDate(date: AnyRef): Unit = js.native
}