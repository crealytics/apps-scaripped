package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a mobile app that has been added to an account as an ad app extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 * page for more information on mobile apps and other types of ad extensions.
 */
trait AccountMobileApp extends js.Object {
  /**
   * Clears the link URL of the account-level mobile app. To upgrade account-level mobile apps to final URL, first clear the link URL, then set the final URL with
   * <a href="adwordsapp_mobileappurls.html#setFinalUrl_1">MobileAppUrls.setFinalUrl</a>
   * .
   * <p>Returns nothing.</p>
   */
  def clearLinkUrl(): Unit = js.native
  /** Returns the application store-specific ID of the account-level mobile app. */
  def getAppId(): String = js.native
  /**
   * Returns the end date of the account-level mobile app. For instance, if the end date of the account-level mobile app is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"AccountMobileApp"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the account-level mobile app. */
  def getId(): Long = js.native
  /** Returns the link text of the account-level mobile app. */
  def getLinkText(): String = js.native
  /**
   * Returns the link URL of the account-level mobile app.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method is deprecated. Link URLs will become read-only on July 1, 2015. We recommend that you upgrade to using final URLs instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def getLinkUrl(): String = js.native
  /** Returns the scheduling of the account-level mobile app. */
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  /**
   * Returns the start date of the account-level mobile app. For instance, if the start date of the account-level mobile app is May 3, 2013, this would return the following object:
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
   * if the account-level mobile app specifies mobile device preference.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   * Sets the application store-specific ID of the account-level mobile app.
   * <p>Returns nothing.</p>
   */
  def setAppId(appId: String): Unit = js.native
  /**
   * Sets the account-level mobile app's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>accountMobileApp.setEndDate("20130503");</code>
   * is equivalent to
   * <code>accountMobileApp.setEndDate({year: 2013, month: 5, day: 3});</code>
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
   * Sets the link text of the account-level mobile app.
   * <p>Returns nothing.</p>
   */
  def setLinkText(linkText: String): Unit = js.native
  /**
   * Sets the link URL of the account-level mobile app.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when link URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_mobileappurls.html#setFinalUrl_1">MobileAppUrls.setFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   * <p>Returns nothing.</p>
   */
  def setLinkUrl(linkUrl: String): Unit = js.native
  /**
   * Sets the account-level mobile app's device preference.
   * <p>Returns nothing.</p>
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   * Sets the account-level mobile app scheduling. Scheduling of a account-level mobile app allows you to control the days of week and times of day during which the account-level mobile app will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the account-level mobile app to run at all times.</p>
   * <p>The following example sets the account-level mobile app to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  accountMobileApp.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   * <p>Returns nothing.</p>
   */
  def setSchedules(schedules: js.Array[ExtensionSchedule]): Unit = js.native
  /**
   * Sets the account-level mobile app's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>accountMobileApp.setStartDate("20130503");</code>
   * is equivalent to
   * <code>accountMobileApp.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the account-level mobile app's end date.</li>
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
  /**
   * Provides access to the URL fields of this account-level mobile app. See
   * <a href="//support.google.com/adwords/answer/6049217">Using upgraded URLs</a>
   * for more information.
   */
  def urls(): MobileAppUrls = js.native
}
