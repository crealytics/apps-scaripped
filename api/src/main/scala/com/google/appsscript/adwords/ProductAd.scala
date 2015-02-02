package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents an AdWords product ad. See the
 * <a href="https://support.google.com/adwords/answer/6080607">help center</a>
 *  for more information on product ads.
 */
trait ProductAd extends js.Object {
  /**
   *  Applies a label to the product ad.
   * <code>name</code>
   *  of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Note that the product ad cannot not have more than 50 labels. </p>
   * <p>Returns nothing.</p>
   *
   */
  def applyLabel(name: String): Unit = js.native
  /**
   *  Enables the product ad.
   * <p>Returns nothing.</p>
   *
   */
  def enable: Unit = js.native
  /**  Returns the shopping ad group to which this product ad belongs. */
  def getAdGroup: ShoppingAdGroup = js.native
  /**  Returns the shopping campaign to which this product ad belongs. */
  def getCampaign: ShoppingCampaign = js.native
  /**
   *  Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"ProductAd"</code>
   * .
   */
  def getEntityType: String = js.native
  /**
   *  Returns the ID of the product ad.
   * <p>Ad IDs may be shared across ad groups. In order to uniquely identify one ad, one must specify both its ad group ID and its creative ID.</p>
   */
  def getId: Long = js.native
  /**  Returns the promotion line of the product ad. */
  def getPromotionLine: String = js.native
  /**
   *  Returns stats for the specified date range. Supported values:
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example:
   * <pre class="prettyprint">
   *  var stats = productAd.getStatsFor("THIS_MONTH");</pre>
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
   *  Returns the type of the ad. For product ads, this is
   * <code>PRODUCT_AD</code>
   * .
   */
  def getType: String = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the product ad is enabled.
   */
  def isEnabled: Boolean = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the product ad specifies mobile device preference or
   * <code>false</code>
   *  otherwise.
   */
  def isMobilePreferred: Boolean = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the product ad is paused.
   */
  def isPaused: Boolean = js.native
  /**  Creates a selector of all labels applied to the product ad. */
  def labels: LabelSelector = js.native
  /**
   *  Pauses the product ad.
   * <p>Returns nothing.</p>
   *
   */
  def pause: Unit = js.native
  /**
   *  Removes the product ad from the account.
   * <p>Returns nothing.</p>
   *
   */
  def remove: Unit = js.native
  /**
   *  Removes a label from the product ad.
   * <code>name</code>
   *  of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Returns nothing.</p>
   *
   */
  def removeLabel(name: String): Unit = js.native
}