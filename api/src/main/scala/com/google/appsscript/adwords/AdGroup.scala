package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords ad group. */
trait AdGroup extends js.Object with HasStatistics {
  /** Creates a selector of all ad params in the ad group. */
  def adParams(): AdParamSelector = js.native
  /**
   * Adds a callout to this ad group. See also
   * <a href="adwordsapp_extensions.html#newCalloutBuilder_0">Extensions.newCalloutBuilder()</a>
   */
  def addCallout(calloutExtension: Callout): Operation[Callout] = js.native
  /**
   * Adds a mobile app to this ad group. See also
   * <a href="adwordsapp_extensions.html#newMobileAppBuilder_0">Extensions.newMobileAppBuilder()</a>
   */
  def addMobileApp(mobileAppExtension: MobileApp): Operation[MobileApp] = js.native
  /**
   * Adds a phone number to this ad group. See also
   * <a href="adwordsapp_extensions.html#newPhoneNumberBuilder_0">Extensions.newPhoneNumberBuilder()</a>
   */
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): Operation[PhoneNumber] = js.native
  /**
   * Adds a review to this ad group. See also
   * <a href="adwordsapp_extensions.html#newReviewBuilder_0">Extensions.newReviewBuilder()</a>
   */
  def addReview(reviewExtension: Review): Operation[Review] = js.native
  /**
   * Adds a sitelink to this ad group. See also
   * <a href="adwordsapp_extensions.html#newSitelinkBuilder_0">Extensions.newSitelinkBuilder()</a>
   */
  def addSitelink(sitelinkExtension: Sitelink): Operation[Sitelink] = js.native
  /** Returns the selector of all ads in the ad group. */
  def ads(): AdSelector = js.native
  /**
   * Applies a label to the ad group.
   * <code>name</code>
   * of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Note that the ad group cannot not have more than 50 labels. </p>
   * <p>Returns nothing.</p>
   */
  def applyLabel(name: String): Unit = js.native
  /** Provides access to this ad group's bidding fields. */
  def bidding(): AdGroupBidding = js.native
  /**
   * Clears the mobile bid modifier for this ad group. By clearing this value, the ad group will use its campaign's mobile bid modifier (if one is set).
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   * <p>Returns nothing.</p>
   */
  def clearMobileBidModifier(): Unit = js.native
  /**
   * Creates a new negative keyword with the specified text. Match type for the new negative keyword is specified as follows:
   * <ul>
   *  <li><code>createNegativeKeyword("shoes")</code> - broad match.</li>
   *  <li><code>createNegativeKeyword("\"shoes\"")</code> - phrase match.</li>
   *  <li><code>createNegativeKeyword("[leather shoes]")</code> - exact match.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def createNegativeKeyword(keywordText: String): Unit = js.native
  /**
   * Provides access to this ad group's display criteria:
   * <a href="adwordsapp_audience.html">Audience</a>
   * ,
   * <a href="adwordsapp_excludedaudience.html">ExcludedAudience</a>
   * ,
   * <a href="adwordsapp_displaykeyword.html">DisplayKeyword</a>
   * ,
   * <a href="adwordsapp_excludeddisplaykeyword.html">ExcludedDisplayKeyword</a>
   * ,
   * <a href="adwordsapp_placement.html">Placement</a>
   * ,
   * <a href="adwordsapp_excludedplacement.html">ExcludedPlacement</a>
   * ,
   * <a href="adwordsapp_topic.html">Topic</a>
   * , and
   * <a href="adwordsapp_excludedtopic.html">ExcludedTopic</a>
   * .
   */
  def display(): AdGroupDisplay = js.native
  /**
   * Enables the ad group.
   * <p>Returns nothing.</p>
   */
  def enable(): Unit = js.native
  /**
   * Provides access to this ad group's extensions:
   * <a href="adwordsapp_adgroupcallout.html">AdGroupCallout</a>
   * ,
   * <a href="adwordsapp_adgroupmobileapp.html">AdGroupMobileApp</a>
   * ,
   * <a href="adwordsapp_adgroupphonenumber.html">AdGroupPhoneNumber</a>
   * ,
   * <a href="adwordsapp_adgroupreview.html">AdGroupReview</a>
   * , and
   * <a href="adwordsapp_adgroupsitelink.html">AdGroupSitelink</a>
   * .
   */
  def extensions(): AdGroupExtensions = js.native
  /** Returns the campaign to which this ad group belongs. */
  def getCampaign(): Campaign = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"AdGroup"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the ad group. */
  def getId(): Long = js.native
  /**
   * Returns the mobile bid modifier for this ad group.
   * <p> The bid modifier is a multiplier applied to the ad group's bids on mobile devices. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to $5.50. </p>
   * <p> Note that when you set a mobile bid modifier at both campaign- and ad group-level in a single campaign, the ad group mobile bid modifier will be used when determining your bid UNLESS the campaign mobile bid modifier is set to -1 (i.e. -100%) which will opt the entire campaign out of mobile regardless of any ad group mobile bid modifiers that may have been set. </p>
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   */
  def getMobileBidModifier(): Double = js.native
  /** Returns the name of the ad group. */
  def getName(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * if the ad group is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the ad group is paused.
   */
  def isPaused(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the ad group is removed.
   */
  def isRemoved(): Boolean = js.native
  /** Returns the selector of all keywords in the ad group. */
  def keywords(): KeywordSelector = js.native
  /** Creates a selector of all labels applied to the ad group. */
  def labels(): LabelSelector = js.native
  /** Returns a selector of all negative keywords in the ad group. */
  def negativeKeywords(): NegativeKeywordSelector = js.native
  /** Returns a new keyword builder associated with this ad group. */
  def newKeywordBuilder(): KeywordBuilder = js.native
  /** Returns a new ad builder associated with this ad group. */
  def newTextAdBuilder(): AdBuilder = js.native
  /**
   * Pauses the ad group.
   * <p>Returns nothing.</p>
   */
  def pause(): Unit = js.native
  /**
   * Removes a callout extension from this ad group.
   * <p>Returns nothing.</p>
   */
  def removeCallout(calloutExtension: Callout): Unit = js.native
  /**
   * Removes a label from the ad group.
   * <code>name</code>
   * of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Returns nothing.</p>
   */
  def removeLabel(name: String): Unit = js.native
  /**
   * Removes a mobile app extension from this ad group.
   * <p>Returns nothing.</p>
   */
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  /**
   * Removes a phone number extension from this ad group.
   * <p>Returns nothing.</p>
   */
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): Unit = js.native
  /**
   * Removes a review extension from this ad group.
   * <p>Returns nothing.</p>
   */
  def removeReview(reviewExtension: Review): Unit = js.native
  /**
   * Removes a sitelink extension from this ad group.
   * <p>Returns nothing.</p>
   */
  def removeSitelink(sitelinkExtension: Sitelink): Unit = js.native
  /**
   * Sets the mobile bid modifier for this ad group to the specified value.
   * <p> The bid modifier is a multiplier applied to the ad group's bids on mobile devices. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to $5.50. </p>
   * <p> The operation will fail if the ad group's campaign has a mobile bid modifier of -1 (i.e. -100%). Setting a campaign mobile bid modifier to -1 will opt the entire campaign out of mobile.</p>
   * <p> Note that when you set a mobile bid modifier at both campaign- and ad group-level in a single campaign, the ad group mobile bid modifier will be used when determining your bid UNLESS the campaign mobile bid modifier is set to -1 (i.e. -100%) which will opt the entire campaign out of mobile regardless of any ad group mobile bid modifiers that may be set. </p>
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   * <p>Returns nothing.</p>
   */
  def setMobileBidModifier(modifier: Double): Unit = js.native
  /**
   * Sets the name of the ad group.
   * <p>Returns nothing.</p>
   */
  def setName(name: String): Unit = js.native
  /**
   * Provides access to this ad group's URL fields. See
   * <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a>
   * for more information.
   */
  def urls(): AdGroupUrls = js.native
}
