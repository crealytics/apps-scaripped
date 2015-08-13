package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a sitelink that has been added to an ad group as an ad sitelink extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 * page for more information on sitelinks and other types of ad extensions.
 */
trait AdGroupSitelink extends js.Object {
  /** Returns the ad group to which this ad group-level sitelink belongs. */
  def getAdGroup(): AdGroup = js.native
  /** Returns the campaign to which this ad group-level sitelink belongs. */
  def getCampaign(): Campaign = js.native
  /** Returns the first description line of the ad group-level sitelink description. */
  def getDescription1(): String = js.native
  /** Returns the second description line of the ad group-level sitelink description. */
  def getDescription2(): String = js.native
  /**
   * Returns the end date of the ad group-level sitelink. For instance, if the end date of the ad group-level sitelink is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"AdGroupSitelink"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the ad group-level sitelink. */
  def getId(): Long = js.native
  /** Returns the link text of the ad group-level sitelink. */
  def getLinkText(): String = js.native
  /**
   * Returns the link URL of the ad group-level sitelink.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method is deprecated. Link URLs will become read-only on July 1, 2015. We recommend that you upgrade to using final URLs instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def getLinkUrl(): String = js.native
  /** Returns the scheduling of the ad group-level sitelink. */
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  /**
   * Returns the start date of the ad group-level sitelink. For instance, if the start date of the ad group-level sitelink is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate(): AdWordsDate = js.native
  /**
   * Returns stats for the specified custom date range. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * form. For instance,
   * <code>March 24th, 2013</code>
   * is represented as either
   * <code>{year: 2013, month: 3, day: 24}</code>
   * or
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so
   * <code>forDateRange("20130324", "20130324")</code>
   * defines a range of a single day.
   */
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = js.native
  /**
   * Returns
   * <code>true</code>
   * if the ad group-level sitelink specifies mobile device preference.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   * Sets the first description line of the ad group-level sitelink description.
   * <p>Returns nothing.</p>
   */
  def setDescription1(description1: String): Unit = js.native
  /**
   * Sets the second description line of the ad group-level sitelink description.
   * <p>Returns nothing.</p>
   */
  def setDescription2(description2: String): Unit = js.native
  /**
   * Sets the ad group-level sitelink's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>adGroupSitelink.setEndDate("20130503");</code>
   * is equivalent to
   * <code>adGroupSitelink.setEndDate({year: 2013, month: 5, day: 3});</code>
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
   * Sets the link text of the ad group-level sitelink.
   * <p>Returns nothing.</p>
   */
  def setLinkText(linkText: String): Unit = js.native
  /**
   * Sets the link URL of the ad group-level sitelink.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when link URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_sitelinkurls.html#setFinalUrl_1">SitelinkUrls.setFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   * <p>Returns nothing.</p>
   */
  def setLinkUrl(linkUrl: String): Unit = js.native
  /**
   * Sets the ad group-level sitelink's device preference.
   * <p>Returns nothing.</p>
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   * Sets the ad group-level sitelink scheduling. Scheduling of a ad group-level sitelink allows you to control the days of week and times of day during which the ad group-level sitelink will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the ad group-level sitelink to run at all times.</p>
   * <p>The following example sets the ad group-level sitelink to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  adGroupSitelink.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   * <p>Returns nothing.</p>
   */
  def setSchedules(schedules: js.Array[ExtensionSchedule]): Unit = js.native
  /**
   * Sets the ad group-level sitelink's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>adGroupSitelink.setStartDate("20130503");</code>
   * is equivalent to
   * <code>adGroupSitelink.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the ad group-level sitelink's end date.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def setStartDate(date: AnyRef): Unit = js.native
}
