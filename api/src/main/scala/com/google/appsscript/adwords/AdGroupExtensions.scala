package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Access to ad group-level extensions. For example, to access all sitelinks belonging to an ad group: 
 * <pre class="prettyprint">
 *  var adGroupSitelinkIterator = adGroup.extensions().sitelinks().get();
 *  while (adGroupSitelinkIterator.hasNext()) {
 *    var adGroupSitelink = adGroupSitelinkIterator.next();
 *  }</pre>
 */
trait AdGroupExtensions extends js.Object {
  /**  Returns the selector of all callouts in the ad group. */
  def callouts(): AdGroupCalloutSelector = js.native
  /**  Returns the selector of all mobile apps in the ad group. */
  def mobileApps(): AdGroupMobileAppSelector = js.native
  /**  Returns the selector of all phone numbers in the ad group. */
  def phoneNumbers(): AdGroupPhoneNumberSelector = js.native
  /**  Returns the selector of all reviews in the ad group. */
  def reviews(): AdGroupReviewSelector = js.native
  /**  Returns the selector of all sitelinks in the ad group. */
  def sitelinks(): AdGroupSitelinkSelector = js.native
}
