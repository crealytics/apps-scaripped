package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a sitelink that has been added to a campaign as an ad sitelink extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 * page for more information on sitelinks and other types of ad extensions.
 */
trait CampaignSitelink extends js.Object with HasStatistics {
  /**
   * Clears the first description line of the campaign-level sitelink description.
   * <p>Returns nothing.</p>
   */
  def clearDescription1(): Unit = js.native
  /**
   * Clears the second description line of the campaign-level sitelink description.
   * <p>Returns nothing.</p>
   */
  def clearDescription2(): Unit = js.native
  /**
   * Clears the link URL of the campaign-level sitelink. To upgrade campaign-level sitelinks to final URL, first clear the link URL, then set the final URL with
   * <a href="adwordsapp_sitelinkurls.html#setFinalUrl_1">SitelinkUrls.setFinalUrl</a>
   * .
   * <p>Returns nothing.</p>
   */
  def clearLinkUrl(): Unit = js.native
  /** Returns the campaign to which this campaign-level sitelink belongs. */
  def getCampaign(): Campaign = js.native
  /** Returns the first description line of the campaign-level sitelink description. */
  def getDescription1(): String = js.native
  /** Returns the second description line of the campaign-level sitelink description. */
  def getDescription2(): String = js.native
  /**
   * Returns the end date of the campaign-level sitelink. For instance, if the end date of the campaign-level sitelink is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"CampaignSitelink"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the campaign-level sitelink. */
  def getId(): Long = js.native
  /** Returns the link text of the campaign-level sitelink. */
  def getLinkText(): String = js.native
  /**
   * Returns the link URL of the campaign-level sitelink.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method is deprecated. Link URLs will become read-only on July 1, 2015. We recommend that you upgrade to using final URLs instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def getLinkUrl(): String = js.native
  /** Returns the scheduling of the campaign-level sitelink. */
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  /**
   * Returns the start date of the campaign-level sitelink. For instance, if the start date of the campaign-level sitelink is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate(): AdWordsDate = js.native
  /**
   * Returns
   * <code>true</code>
   * if the campaign-level sitelink specifies mobile device preference.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   * Sets the first description line of the campaign-level sitelink description.
   * <p>Returns nothing.</p>
   */
  def setDescription1(description1: String): Unit = js.native
  /**
   * Sets the second description line of the campaign-level sitelink description.
   * <p>Returns nothing.</p>
   */
  def setDescription2(description2: String): Unit = js.native
  /**
   * Sets the campaign-level sitelink's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>campaignSitelink.setEndDate("20130503");</code>
   * is equivalent to
   * <code>campaignSitelink.setEndDate({year: 2013, month: 5, day: 3});</code>
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
   * Sets the link text of the campaign-level sitelink.
   * <p>Returns nothing.</p>
   */
  def setLinkText(linkText: String): Unit = js.native
  /**
   * Sets the link URL of the campaign-level sitelink.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when link URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_sitelinkurls.html#setFinalUrl_1">SitelinkUrls.setFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   * <p>Returns nothing.</p>
   */
  def setLinkUrl(linkUrl: String): Unit = js.native
  /**
   * Sets the campaign-level sitelink's device preference.
   * <p>Returns nothing.</p>
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   * Sets the campaign-level sitelink scheduling. Scheduling of a campaign-level sitelink allows you to control the days of week and times of day during which the campaign-level sitelink will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the campaign-level sitelink to run at all times.</p>
   * <p>The following example sets the campaign-level sitelink to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *  campaignSitelink.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   * <p>Returns nothing.</p>
   */
  def setSchedules(schedules: js.Array[ExtensionSchedule]): Unit = js.native
  /**
   * Sets the campaign-level sitelink's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>campaignSitelink.setStartDate("20130503");</code>
   * is equivalent to
   * <code>campaignSitelink.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the campaign-level sitelink's end date.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def setStartDate(date: AnyRef): Unit = js.native
  /**
   * Provides access to the URL fields of this campaign-level sitelink. See
   * <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a>
   * for more information.
   */
  def urls(): SitelinkUrls = js.native
}
