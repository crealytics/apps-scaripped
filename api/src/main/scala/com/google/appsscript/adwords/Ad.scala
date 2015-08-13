package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords ad. */
trait Ad extends js.Object with HasStatistics {
  /**
   * Applies a label to the ad.
   * <code>name</code>
   * of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Note that the ad cannot not have more than 50 labels. </p>
   * <p>Returns nothing.</p>
   */
  def applyLabel(name: String): Unit = js.native
  /**
   * Enables the ad.
   * <p>Returns nothing.</p>
   */
  def enable(): Unit = js.native
  /** Returns the ad group to which this ad belongs. */
  def getAdGroup(): AdGroup = js.native
  /**
   * Returns the approval status of the ad. Possible values:
   * <code>APPROVED, DISAPPROVED, FAMILY_SAFE, NON_FAMILY_SAFE, PORN, UNCHECKED</code>
   * .
   */
  def getApprovalStatus(): String = js.native
  /** Returns the campaign to which this ad belongs. */
  def getCampaign(): Campaign = js.native
  /**
   * Returns the first line of the ad description. May return
   * <code>null</code>
   * for some types of ads.
   */
  def getDescription1(): String = js.native
  /**
   * Returns the second line of the ad description. May return
   * <code>null</code>
   * for some types of ads.
   */
  def getDescription2(): String = js.native
  /**
   * Returns the destination URL of the ad.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method is deprecated. Destination URLs will become read-only on July 1, 2015. We recommend that you upgrade to using final URLs instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def getDestinationUrl(): String = js.native
  /**
   * Returns the array of disapproval reasons.
   * <p>The returned array will contain entries like 'Editorial Standards-Spacing', 'Inaccurate Display URL', etc. An empty array will be returned if the ad has not been disapproved.</p>
   */
  def getDisapprovalReasons(): js.Array[String] = js.native
  /**
   * Returns the display URL of the ad. May return
   * <code>null</code>
   * for some types of ads.
   */
  def getDisplayUrl(): String = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Ad"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**
   * Returns the headline of the ad. May return
   * <code>null</code>
   * for some types of ads.
   */
  def getHeadline(): String = js.native
  /**
   * Returns the ID of the ad.
   * <p>Ad IDs may be shared across ad groups. In order to uniquely identify one ad, one must specify both its ad group ID and its creative ID.</p>
   */
  def getId(): Long = js.native
  /**
   * Returns the type of the ad. Possible values:
   * <code>IMAGE_AD, MOBILE_AD, MOBILE_IMAGE_AD, PRODUCT_AD, RICH_MEDIA_AD, TEMPLATE_AD, TEXT_AD</code>
   * .
   */
  def getType(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * if the ad is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the ad specifies mobile device preference or
   * <code>false</code>
   * otherwise.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the ad is paused.
   */
  def isPaused(): Boolean = js.native
  /** Creates a selector of all labels applied to the ad. */
  def labels(): LabelSelector = js.native
  /**
   * Pauses the ad.
   * <p>Returns nothing.</p>
   */
  def pause(): Unit = js.native
  /**
   * Removes the ad.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
  /**
   * Removes a label from the ad.
   * <code>name</code>
   * of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Returns nothing.</p>
   */
  def removeLabel(name: String): Unit = js.native
  /**
   * Provides access to this ad's URL fields. See
   * <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a>
   * for more information.
   */
  def urls(): AdUrls = js.native
}
