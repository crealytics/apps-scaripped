package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents an AdWords ad group.
 */
trait AdGroup extends js.Object {
  /**  Creates a selector of all ad params in the ad group. */
  def adParams(): AdParamSelector = js.native
  /**
   *  Adds a callout to this ad group. See also 
   * <a href="adwordsapp_extensions.html#newCalloutBuilder_0">Extensions.newCalloutBuilder()</a>
   */
  def addCallout(calloutExtension: Callout): CalloutOperation = js.native
  /**
   *  Adds a mobile app to this ad group. See also 
   * <a href="adwordsapp_extensions.html#newMobileAppBuilder_0">Extensions.newMobileAppBuilder()</a>
   */
  def addMobileApp(mobileAppExtension: MobileApp): MobileAppOperation = js.native
  /**
   *  Adds a phone number to this ad group. See also 
   * <a href="adwordsapp_extensions.html#newPhoneNumberBuilder_0">Extensions.newPhoneNumberBuilder()</a>
   */
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): PhoneNumberOperation = js.native
  /**
   *  Adds a review to this ad group. See also 
   * <a href="adwordsapp_extensions.html#newReviewBuilder_0">Extensions.newReviewBuilder()</a>
   */
  def addReview(reviewExtension: Review): ReviewOperation = js.native
  /**
   *  Adds a sitelink to this ad group. See also 
   * <a href="adwordsapp_extensions.html#newSitelinkBuilder_0">Extensions.newSitelinkBuilder()</a>
   */
  def addSitelink(sitelinkExtension: Sitelink): SitelinkOperation = js.native
  /**  Returns the selector of all ads in the ad group. */
  def ads(): AdSelector = js.native
  /**
   *  Applies a label to the ad group. 
   * <code>name</code>
   *  of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account. 
   * <p>Note that the ad group cannot not have more than 50 labels. </p>
   * <p>Returns nothing.</p>
   *  
   */
  def applyLabel(name: String): Unit = js.native
  /**  Provides access to this ad group's bidding fields. */
  def bidding(): AdGroupBidding = js.native
  /**
   *  Creates a new keyword in the ad group with a default bid. The new keyword will use the ad group's default keyword bid. Match type for the new keyword is specified as follows: 
   * <ul> 
   *  <li><code>createKeyword("shoes")</code> - broad match.</li> 
   *  <li><code>createKeyword("\"shoes\"")</code> - phrase match.</li> 
   *  <li><code>createKeyword("[leather shoes]")</code> - exact match.</li> 
   * </ul>
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_adgroup.html#newKeywordBuilder_0">AdGroup.newKeywordBuilder()</a>.
   * </aside>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def createKeyword(keywordText: String): Unit = js.native
  /**
   *  Creates a new keyword in the ad group with the specified bid. The specified bid will be used in place of ad group's default. Match type for the new keyword is specified as follows: 
   * <ul> 
   *  <li><code>createKeyword("shoes", 1.5)</code> - broad match.</li> 
   *  <li><code>createKeyword("\"shoes\"", 1.5)</code> - phrase match.</li> 
   *  <li><code>createKeyword("[leather shoes]", 1.5)</code> - exact match.</li> 
   * </ul>
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_adgroup.html#newKeywordBuilder_0">AdGroup.newKeywordBuilder()</a>.
   * </aside>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def createKeyword(keywordText: String, maxCpc: Double): Unit = js.native
  /**
   *  Creates a new keyword in the ad group with the specified bid and destination URL. The specified bid will be used in place of ad group's default. Match type for the new keyword is specified as follows: 
   * <ul> 
   *  <li><code>createKeyword("shoes", 2.5, "http://www.example.com")</code> - broad match.</li> 
   *  <li><code>createKeyword("\"shoes\"", 2.5, "http://www.example.com")</code> - phrase match.</li> 
   *  <li><code>createKeyword("[leather shoes]", 2.5, "http://www.example.com")</code> - exact match.</li> 
   * </ul>
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_adgroup.html#newKeywordBuilder_0">AdGroup.newKeywordBuilder()</a>.
   * </aside>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def createKeyword(keywordText: String, maxCpc: Double, destinationUrl: String): Unit = js.native
  /**
   *  Creates a new negative keyword with the specified text. Match type for the new negative keyword is specified as follows: 
   * <ul> 
   *  <li><code>createNegativeKeyword("shoes")</code> - broad match.</li> 
   *  <li><code>createNegativeKeyword("\"shoes\"")</code> - phrase match.</li> 
   *  <li><code>createNegativeKeyword("[leather shoes]")</code> - exact match.</li> 
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def createNegativeKeyword(keywordText: String): Unit = js.native
  /**
   *  Creates a new text ad in the ad group.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_adgroup.html#newTextAdBuilder_0">AdGroup.newTextAdBuilder()</a>.
   * </aside>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def createTextAd(headline: String, description1: String, description2: String, displayUrl: String, destinationUrl: String): Unit = js.native
  /**
   *  Creates a new text ad in the ad group, with some additional parameters. 
   * <code>optArgs</code>
   *  is used to denote the ad as mobile-preferred: 
   * <pre class="prettyprint">
   *  var optArgs = {
   *    isMobilePreferred: true
   *  };
   *  adGroup.createTextAd('headline', 'line1', 'line2', 'example.com', 'http://www.example.com',
   *      optArgs);</pre>
   *  
   * <p><code>optArgs</code> is an optional parameter and may be omitted.</p>
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_adgroup.html#newTextAdBuilder_0">AdGroup.newTextAdBuilder()</a>.
   * </aside>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def createTextAd(headline: String, description1: String, description2: String, displayUrl: String, destinationUrl: String, optArgs: AnyRef): Unit = js.native
  /**
   *  Provides access to this ad group's display criteria: 
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
   *  Enables the ad group. 
   * <p>Returns nothing.</p>
   *  
   */
  def enable(): Unit = js.native
  /**
   *  Provides access to this ad group's extensions: 
   * <a href="adwordsapp_adgroupsitelink.html">AdGroupSitelink</a>
   * , 
   * <a href="adwordsapp_adgroupphonenumber.html">AdGroupPhoneNumber</a>
   * , 
   * <a href="adwordsapp_adgroupmobileapp.html">AdGroupMobileApp</a>
   * .
   */
  def extensions(): AdGroupExtensions = js.native
  /**  Returns the campaign to which this ad group belongs. */
  def getCampaign(): Campaign = js.native
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"AdGroup"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**  Returns the ID of the ad group. */
  def getId(): Long = js.native
  /**
   *  Returns the default keyword max cpc bid of the ad group, in the currency of the account. Returns 
   * <code>null</code>
   *  if the 
   * <a href="adwordsapp_campaign.html#getBiddingStrategyType_0">campaign's bidding strategy</a>
   *  is not 
   * <code>MANUAL_CPC</code>
   * .
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_adgroupbidding.html#getCpc_0">AdGroupBidding.getCpc()</a>.
   * </aside>
   */
  def getKeywordMaxCpc(): Double = js.native
  /**
   *  Returns the mobile bid modifier for this ad group. 
   * <p> The bid modifier is a multiplier applied to the ad group's bids on mobile devices. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to $5.50. </p>
   *  
   * <p> Note that when you set a mobile bid modifier at both campaign- and ad group-level in a single campaign, the ad group mobile bid modifier will be used when determining your bid. </p>
   *  
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   */
  def getMobileBidModifier(): Double = js.native
  /**  Returns the name of the ad group. */
  def getName(): String = js.native
  /**
   *  Returns stats for the specified date range. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  var stats = adGroup.getStatsFor("THIS_MONTH");</pre>
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
   *  Returns 
   * <code>true</code>
   *  if the ad group is removed.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_adgroup.html#isRemoved_0">AdGroup.isRemoved()</a> instead.
   * </aside>
   */
  def isDeleted(): Boolean = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the ad group is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the ad group is paused.
   */
  def isPaused(): Boolean = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the ad group is removed.
   */
  def isRemoved(): Boolean = js.native
  /**  Returns the selector of all keywords in the ad group. */
  def keywords(): KeywordSelector = js.native
  /**  Creates a selector of all labels applied to the ad group. */
  def labels(): LabelSelector = js.native
  /**  Returns a selector of all negative keywords in the ad group. */
  def negativeKeywords(): NegativeKeywordSelector = js.native
  /**  Returns a new keyword builder associated with this ad group. */
  def newKeywordBuilder(): KeywordBuilder = js.native
  /**  Returns a new ad builder associated with this ad group. */
  def newTextAdBuilder(): AdBuilder = js.native
  /**
   *  Pauses the ad group. 
   * <p>Returns nothing.</p>
   *  
   */
  def pause(): Unit = js.native
  /**
   *  Removes a callout extension from this ad group. 
   * <p>Returns nothing.</p>
   *  
   */
  def removeCallout(calloutExtension: Callout): Unit = js.native
  /**
   *  Removes a label from the ad group. 
   * <code>name</code>
   *  of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def removeLabel(name: String): Unit = js.native
  /**
   *  Removes a mobile app extension from this ad group. 
   * <p>Returns nothing.</p>
   *  
   */
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  /**
   *  Removes a phone number extension from this ad group. 
   * <p>Returns nothing.</p>
   *  
   */
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): Unit = js.native
  /**
   *  Removes a review extension from this ad group. 
   * <p>Returns nothing.</p>
   *  
   */
  def removeReview(reviewExtension: Review): Unit = js.native
  /**
   *  Removes a sitelink extension from this ad group. 
   * <p>Returns nothing.</p>
   *  
   */
  def removeSitelink(sitelinkExtension: Sitelink): Unit = js.native
  /**
   *  Sets the default keyword max cpc bid of the ad group to the specified value. The change will take effect only if the 
   * <a href="adwordsapp_campaign.html#getBiddingStrategyType_0">campaign's bidding strategy</a>
   *  is 
   * <code>MANUAL_CPC</code>
   * .
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_adgroupbidding.html#setCpc_1">AdGroupBidding.setCpc(double)</a>.
   * </aside>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setKeywordMaxCpc(keywordMaxCpc: Double): Unit = js.native
  /**
   *  Sets the mobile bid modifier for this ad group to the specified value. 
   * <p> The bid modifier is a multiplier applied to the ad group's bids on mobile devices. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to $5.50. </p>
   *  
   * <p> Note that when you set a mobile bid modifier at both campaign- and ad group-level in a single campaign, the ad group mobile bid modifier will be used when determining your bid. </p>
   *  
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setMobileBidModifier(modifier: Double): Unit = js.native
  /**
   *  Sets the name of the ad group. 
   * <p>Returns nothing.</p>
   *  
   */
  def setName(name: String): Unit = js.native
}
