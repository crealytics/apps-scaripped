package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Access to campaign-level extensions. For example, to access all sitelinks belonging to a campaign: 
 * <pre class="prettyprint">
 *  var campaignSitelinkIterator = campaign.extensions().sitelinks().get();
 *  while (campaignSitelinkIterator.hasNext()) {
 *    var campaignSitelink = campaignSitelinkIterator.next();
 *  }</pre>
 */
trait CampaignExtensions {
  /**  Returns the selector of all callouts in the campaign. */
  def callouts: CampaignCalloutSelector = ???
  /**  Returns the selector of all mobile apps in the campaign. */
  def mobileApps: CampaignMobileAppSelector = ???
  /**  Returns the selector of all phone numbers in the campaign. */
  def phoneNumbers: CampaignPhoneNumberSelector = ???
  /**  Returns the selector of all reviews in the campaign. */
  def reviews: CampaignReviewSelector = ???
  /**  Returns the selector of all sitelinks in the campaign. */
  def sitelinks: CampaignSitelinkSelector = ???
}