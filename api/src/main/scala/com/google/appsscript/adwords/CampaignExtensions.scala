package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Access to campaign-level extensions. For example, to access all sitelinks belonging to a campaign:
 * <pre class="prettyprint">
 *  var campaignSitelinkIterator = campaign.extensions().sitelinks().get();
 *  while (campaignSitelinkIterator.hasNext()) {
 *    var campaignSitelink = campaignSitelinkIterator.next();
 *  }</pre>
 */
trait CampaignExtensions extends js.Object {
  /**  Returns the selector of all callouts in the campaign. */
  def callouts: CampaignCalloutSelector = js.native
  /**  Returns the selector of all mobile apps in the campaign. */
  def mobileApps: CampaignMobileAppSelector = js.native
  /**  Returns the selector of all phone numbers in the campaign. */
  def phoneNumbers: CampaignPhoneNumberSelector = js.native
  /**  Returns the selector of all reviews in the campaign. */
  def reviews: CampaignReviewSelector = js.native
  /**  Returns the selector of all sitelinks in the campaign. */
  def sitelinks: CampaignSitelinkSelector = js.native
}