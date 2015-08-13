package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a sitelink that can be part of an ad sitelink extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 * page for more information on sitelinks and other types of ad extensions.
 */
trait Sitelink extends js.Object with HasStatistics {
  /**
   * Clears the first description line of the sitelink description.
   * <p>Returns nothing.</p>
   */
  def clearDescription1(): Unit = js.native
  /**
   * Clears the second description line of the sitelink description.
   * <p>Returns nothing.</p>
   */
  def clearDescription2(): Unit = js.native
  /**
   * Clears the link URL of the sitelink. To upgrade sitelinks to final URL, first clear the link URL, then set the final URL with
   * <a href="adwordsapp_sitelinkurls.html#setFinalUrl_1">SitelinkUrls.setFinalUrl</a>
   * .
   * <p>Returns nothing.</p>
   */
  def clearLinkUrl(): Unit = js.native
  /** Returns the first description line of the sitelink description. */
  def getDescription1(): String = js.native
  /** Returns the second description line of the sitelink description. */
  def getDescription2(): String = js.native
  /**
   * Returns the end date of the sitelink. For instance, if the end date of the sitelink is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Sitelink"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the sitelink. */
  def getId(): Long = js.native
  /** Returns the link text of the sitelink. */
  def getLinkText(): String = js.native
  /**
   * Returns the link URL of the sitelink.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method is deprecated. Link URLs will become read-only on July 1, 2015. We recommend that you upgrade to using final URLs instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def getLinkUrl(): String = js.native
  /** Returns the scheduling of the sitelink. */
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  /**
   * Returns the start date of the sitelink. For instance, if the start date of the sitelink is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate(): AdWordsDate = js.native
  /**
   * Returns
   * <code>true</code>
   * if the sitelink specifies mobile device preference.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   * Sets the first description line of the sitelink description.
   * <p>Returns nothing.</p>
   */
  def setDescription1(description1: String): Unit = js.native
  /**
   * Sets the second description line of the sitelink description.
   * <p>Returns nothing.</p>
   */
  def setDescription2(description2: String): Unit = js.native
  /**
   * Sets the sitelink's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>sitelink.setEndDate("20130503");</code>
   * is equivalent to
   * <code>sitelink.setEndDate({year: 2013, month: 5, day: 3});</code>
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
   * Sets the link text of the sitelink.
   * <p>Returns nothing.</p>
   */
  def setLinkText(linkText: String): Unit = js.native
  /**
   * Sets the link URL of the sitelink.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when link URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_sitelinkurls.html#setFinalUrl_1">SitelinkUrls.setFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   * <p>Returns nothing.</p>
   */
  def setLinkUrl(linkUrl: String): Unit = js.native
  /**
   * Sets the sitelink's device preference.
   * <p>Returns nothing.</p>
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   * Sets the sitelink scheduling. Scheduling of a sitelink allows you to control the days of week and times of day during which the sitelink will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the sitelink to run at all times.</p>
   * <p>The following example sets the sitelink to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  sitelink.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   * <p>Returns nothing.</p>
   */
  def setSchedules(schedules: js.Array[ExtensionSchedule]): Unit = js.native
  /**
   * Sets the sitelink's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>sitelink.setStartDate("20130503");</code>
   * is equivalent to
   * <code>sitelink.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the sitelink's end date.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def setStartDate(date: AnyRef): Unit = js.native
  /**
   * Provides access to the URL fields of this sitelink. See
   * <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a>
   * for more information.
   */
  def urls(): SitelinkUrls = js.native
}
