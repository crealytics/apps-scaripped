package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Access to ad group-level extensions. For example, to access all sitelinks belonging to an ad group: 
 * <pre class="prettyprint">
 *  var adGroupSitelinkIterator = adGroup.extensions().sitelinks().get();
 *  while (adGroupSitelinkIterator.hasNext()) {
 *    var adGroupSitelink = adGroupSitelinkIterator.next();
 *  }</pre>
 */
trait AdGroupExtensions {
  /**  Returns the selector of all callouts in the ad group. */
  def callouts: AdGroupCalloutSelector = ???
  /**  Returns the selector of all mobile apps in the ad group. */
  def mobileApps: AdGroupMobileAppSelector = ???
  /**  Returns the selector of all phone numbers in the ad group. */
  def phoneNumbers: AdGroupPhoneNumberSelector = ???
  /**  Returns the selector of all reviews in the ad group. */
  def reviews: AdGroupReviewSelector = ???
  /**  Returns the selector of all sitelinks in the ad group. */
  def sitelinks: AdGroupSitelinkSelector = ???
}