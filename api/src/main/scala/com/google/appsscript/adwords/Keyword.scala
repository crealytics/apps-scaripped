package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords keyword. */
trait Keyword extends js.Object with HasStatistics {
  /** Creates a selector of all ad params belonging to this keyword. */
  def adParams(): AdParamSelector = js.native
  /**
   * Applies a label to the keyword.
   * <code>name</code>
   * of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Note that the keyword cannot not have more than 50 labels. </p>
   * <p>Returns nothing.</p>
   */
  def applyLabel(name: String): Unit = js.native
  /** Provides access to this keyword's bidding fields. */
  def bidding(): KeywordBidding = js.native
  /**
   * Clears the destination URL of the keyword. To upgrade keywords to final URL, first clear the destination URL, then set the final URL with
   * <a href="adwordsapp_keywordurls.html#setFinalUrl_1">KeywordUrls.setFinalUrl</a>
   * .
   * <p>Returns nothing.</p>
   */
  def clearDestinationUrl(): Unit = js.native
  /**
   * Enables the keyword.
   * <p>Returns nothing.</p>
   */
  def enable(): Unit = js.native
  /** Returns the ad group to which this keyword belongs. */
  def getAdGroup(): AdGroup = js.native
  /**
   * Returns the approval status of the keyword. Possible values:
   * <code>APPROVED, PENDING_REVIEW, UNDER_REVIEW, DISAPPROVED</code>
   * .
   */
  def getApprovalStatus(): String = js.native
  /** Returns the campaign to which this keyword belongs. */
  def getCampaign(): Campaign = js.native
  /**
   * Returns the destination URL of the keyword.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method is deprecated. Destination URLs will become read-only on July 1, 2015. We recommend that you upgrade to using final URLs instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def getDestinationUrl(): String = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Keyword"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the first page cpc for the keyword. */
  def getFirstPageCpc(): Double = js.native
  /**
   * Returns the ID of the keyword.
   * <p>Keyword IDs may be shared across ad groups. In order to uniquely identify one keyword, one must specify both its ad group ID and the keyword ID.</p>
   */
  def getId(): Long = js.native
  /**
   * Returns the match type of the keyword. Possible values:
   * <code>BROAD, PHRASE, EXACT</code>
   * .
   */
  def getMatchType(): String = js.native
  /**
   * Returns the quality score of the keyword, in
   * <code>1..10</code>
   * range.
   */
  def getQualityScore(): Int = js.native
  /**
   * Returns the text of the keyword. The returned value will be formatted as follows, depending on the match type:
   * <ul>
   *  <li><code>shoes</code> - broad match</li>
   *  <li><code>"shoes"</code> - phrase match</li>
   *  <li><code>[leather shoes]</code> - exact match</li>
   * </ul>
   */
  def getText(): String = js.native
  /** Returns the top of page cpc for the keyword. */
  def getTopOfPageCpc(): Double = js.native
  /**
   * Returns
   * <code>true</code>
   * if the keyword is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the keyword is paused.
   */
  def isPaused(): Boolean = js.native
  /** Creates a selector of all labels applied to the keyword. */
  def labels(): LabelSelector = js.native
  /**
   * Pauses the keyword.
   * <p>Returns nothing.</p>
   */
  def pause(): Unit = js.native
  /**
   * Removes the keyword.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
  /**
   * Removes a label from the keyword.
   * <code>name</code>
   * of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Returns nothing.</p>
   */
  def removeLabel(name: String): Unit = js.native
  /**
   * Creates an ad param for this keyword with the specified index and insertion text.
   * <p>Returns nothing.</p>
   */
  def setAdParam(index: Int, insertionText: String): Unit = js.native
  /**
   * Sets destination URL of the keyword to the specified value.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when destination URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_keywordurls.html#setFinalUrl_1">KeywordUrls.setFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   * <p>Returns nothing.</p>
   */
  def setDestinationUrl(destinationUrl: String): Unit = js.native
  /**
   * Provides access to this keyword's URL fields. See
   * <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a>
   * for more information.
   */
  def urls(): KeywordUrls = js.native
}
