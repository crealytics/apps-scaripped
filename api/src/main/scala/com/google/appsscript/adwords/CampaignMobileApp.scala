package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a mobile app that has been added to a campaign as an ad app extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 * page for more information on mobile apps and other types of ad extensions.
 */
trait CampaignMobileApp extends js.Object {
  /** Returns the application store-specific ID of the campaign-level mobile app. */
  def getAppId(): String = js.native
  /** Returns the campaign to which this campaign-level mobile app belongs. */
  def getCampaign(): Campaign = js.native
  /**
   * Returns the end date of the campaign-level mobile app. For instance, if the end date of the campaign-level mobile app is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"CampaignMobileApp"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the campaign-level mobile app. */
  def getId(): Long = js.native
  /** Returns the link text of the campaign-level mobile app. */
  def getLinkText(): String = js.native
  /**
   * Returns the link URL of the campaign-level mobile app.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method is deprecated. Link URLs will become read-only on July 1, 2015. We recommend that you upgrade to using final URLs instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def getLinkUrl(): String = js.native
  /** Returns the scheduling of the campaign-level mobile app. */
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  /**
   * Returns the start date of the campaign-level mobile app. For instance, if the start date of the campaign-level mobile app is May 3, 2013, this would return the following object:
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
   * Returns the application store to which the application belongs. Possible return values:
   * <code>"iOS", "Android"</code>
   * .
   */
  def getStore(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * if the campaign-level mobile app specifies mobile device preference.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   * Sets the application store-specific ID of the campaign-level mobile app.
   * <p>Returns nothing.</p>
   */
  def setAppId(appId: String): Unit = js.native
  /**
   * Sets the campaign-level mobile app's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>campaignMobileApp.setEndDate("20130503");</code>
   * is equivalent to
   * <code>campaignMobileApp.setEndDate({year: 2013, month: 5, day: 3});</code>
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
   * Sets the link text of the campaign-level mobile app.
   * <p>Returns nothing.</p>
   */
  def setLinkText(linkText: String): Unit = js.native
  /**
   * Sets the link URL of the campaign-level mobile app.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when link URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_mobileappurls.html#setFinalUrl_1">MobileAppUrls.setFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   * <p>Returns nothing.</p>
   */
  def setLinkUrl(linkUrl: String): Unit = js.native
  /**
   * Sets the campaign-level mobile app's device preference.
   * <p>Returns nothing.</p>
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   * Sets the campaign-level mobile app scheduling. Scheduling of a campaign-level mobile app allows you to control the days of week and times of day during which the campaign-level mobile app will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the campaign-level mobile app to run at all times.</p>
   * <p>The following example sets the campaign-level mobile app to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  campaignMobileApp.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   * <p>Returns nothing.</p>
   */
  def setSchedules(schedules: js.Array[ExtensionSchedule]): Unit = js.native
  /**
   * Sets the campaign-level mobile app's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>campaignMobileApp.setStartDate("20130503");</code>
   * is equivalent to
   * <code>campaignMobileApp.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the campaign-level mobile app's end date.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def setStartDate(date: AnyRef): Unit = js.native
  /**
   * Sets the application store to which the application belongs. Possible parameter values:
   * <code>"iOS", "Android"</code>
   * .
   * <p>Returns nothing.</p>
   */
  def setStore(store: String): Unit = js.native
}
