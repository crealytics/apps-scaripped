package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords campaign. */
trait Campaign extends js.Object with CampaignLike {
  /** Returns the selector of all ad groups in the campaign. */
  def adGroups(): AdGroupSelector = js.native
  /**
   * Adds a callout extension to this campaign. See also
   * <a href="adwordsapp_extensions.html#newCalloutBuilder_0">Extensions.newCalloutBuilder()</a>
   */
  def addCallout(calloutExtension: Callout): Operation[Callout] = js.native
  /**
   * Adds a mobile app extension to this campaign. See also
   * <a href="adwordsapp_extensions.html#newMobileAppBuilder_0">Extensions.newMobileAppBuilder()</a>
   */
  def addMobileApp(mobileAppExtension: MobileApp): Operation[MobileApp] = js.native
  /**
   * Adds a phone number extension to this campaign. See also
   * <a href="adwordsapp_extensions.html#newPhoneNumberBuilder_0">Extensions.newPhoneNumberBuilder()</a>
   */
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): Operation[PhoneNumber] = js.native
  /**
   * Adds a review extension to this campaign. See also
   * <a href="adwordsapp_extensions.html#newReviewBuilder_0">Extensions.newReviewBuilder()</a>
   */
  def addReview(reviewExtension: Review): Operation[Review] = js.native
  /**
   * Adds a sitelink extension to this campaign. See also
   * <a href="adwordsapp_extensions.html#newSitelinkBuilder_0">Extensions.newSitelinkBuilder()</a>
   */
  def addSitelink(sitelinkExtension: Sitelink): Operation[Sitelink] = js.native
  /** Returns the selector of all ads in the campaign. */
  def ads(): AdSelector = js.native
  /** Provides access to this campaign's bidding fields. */
  def bidding(): CampaignBidding = js.native
  /**
   * Provices access to this campaign's display criteria:
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
  def display(): CampaignDisplay = js.native
  /**
   * Provides access to this campaign's extensions:
   * <a href="adwordsapp_campaigncallout.html">CampaignCallout</a>
   * ,
   * <a href="adwordsapp_campaignmobileapp.html">CampaignMobileApp</a>
   * ,
   * <a href="adwordsapp_campaignphonenumber.html">CampaignPhoneNumber</a>
   * ,
   * <a href="adwordsapp_campaignreview.html">CampaignReview</a>
   * , and
   * <a href="adwordsapp_campaignsitelink.html">CampaignSitelink</a>
   * .
   */
  def extensions(): CampaignExtensions = js.native
  /**
   * Returns
   * <code>true</code>
   * if the campaign is removed.
   */
  def isRemoved(): Boolean = js.native
  /** Returns the selector of all keywords in the campaign. */
  def keywords(): KeywordSelector = js.native
  /**
   * Returns a new ad group builder for this campaign. Once
   * <code>builder.create()</code>
   * is called, the ad group will be created in this campaign.
   */
  def newAdGroupBuilder(): AdGroupBuilder = js.native
  /**
   * Removes a callout extension from this campaign.
   * <p>Returns nothing.</p>
   */
  def removeCallout(calloutExtension: Callout): Unit = js.native
  /**
   * Removes a mobile app extension from this campaign.
   * <p>Returns nothing.</p>
   */
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  /**
   * Removes a phone number extension from this campaign.
   * <p>Returns nothing.</p>
   */
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): Unit = js.native
  /**
   * Removes a review extension from this campaign.
   * <p>Returns nothing.</p>
   */
  def removeReview(reviewExtension: Review): Unit = js.native
  /**
   * Removes a sitelink extension from this campaign.
   * <p>Returns nothing.</p>
   */
  def removeSitelink(sitelinkExtension: Sitelink): Unit = js.native
  /**
   * Provides access to this campaign's URL fields. See
   * <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a>
   * for more information.
   */
  def urls(): CampaignUrls = js.native
}
