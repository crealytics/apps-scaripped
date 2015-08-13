package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a callout that has been added to a campaign as an ad callout extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 * page for more information on callouts and other types of ad extensions.
 */
trait CampaignCallout extends js.Object with HasStatistics {
  /** Returns the campaign to which this campaign-level callout belongs. */
  def getCampaign(): Campaign = js.native
  /**
   * Returns the end date of the campaign-level callout. For instance, if the end date of the campaign-level callout is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"CampaignCallout"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the campaign-level callout. */
  def getId(): Long = js.native
  /** Returns the scheduling of the campaign-level callout. */
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  /**
   * Returns the start date of the campaign-level callout. For instance, if the start date of the campaign-level callout is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate(): AdWordsDate = js.native
  /** Returns the text of the campaign-level callout. */
  def getText(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * if the campaign-level callout specifies mobile device preference.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   * Sets the campaign-level callout's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>campaignCallout.setEndDate("20130503");</code>
   * is equivalent to
   * <code>campaignCallout.setEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the start date now comes after the end date, or</li>
   *  <li>it's a date in the past.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def setEndDate(date: AnyRef): Unit = js.native
  /**
   * Sets the campaign-level callout's device preference.
   * <p>Returns nothing.</p>
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   * Sets the campaign-level callout scheduling. Scheduling of a campaign-level callout allows you to control the days of week and times of day during which the campaign-level callout will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the campaign-level callout to run at all times.</p>
   * <p>The following example sets the campaign-level callout to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  campaignCallout.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   * <p>Returns nothing.</p>
   */
  def setSchedules(schedules: js.Array[ExtensionSchedule]): Unit = js.native
  /**
   * Sets the campaign-level callout's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>campaignCallout.setStartDate("20130503");</code>
   * is equivalent to
   * <code>campaignCallout.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the campaign-level callout's end date.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def setStartDate(date: AnyRef): Unit = js.native
  /**
   * Sets the text of the campaign-level callout.
   * <p>Returns nothing.</p>
   */
  def setText(text: String): Unit = js.native
}
