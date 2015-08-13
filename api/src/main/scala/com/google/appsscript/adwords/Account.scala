package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Miscellaneous information about AdWords Accounts. When accessed by
 * <a href="adwordsapp.html#currentAccount_0">AdWordsApp.currentAccount()</a>
 * , it will provide information about the account in which the script is currently running.
 */
trait Account extends js.Object with AccountLike with HasStatistics {
  /**
   * Adds a callout extension to this account. See also
   * <a href="adwordsapp_extensions.html#newCalloutBuilder_0">Extensions.newCalloutBuilder()</a>
   */
  def addCallout(calloutExtension: Callout): Operation[Callout] = js.native
  /**
   * Adds a mobile app extension to this account. See also
   * <a href="adwordsapp_extensions.html#newMobileAppBuilder_0">Extensions.newMobileAppBuilder()</a>
   */
  def addMobileApp(mobileAppExtension: MobileApp): Operation[MobileApp] = js.native
  /**
   * Adds a review extension to this account. See also
   * <a href="adwordsapp_extensions.html#newReviewBuilder_0">Extensions.newReviewBuilder()</a>
   */
  def addReview(reviewExtension: Review): Operation[Review] = js.native
  /**
   * Returns the POSIX time zone of the account.
   * <p>Returned values are in the standard time zone identifier form, such as <code>'America/Los_Angeles'</code>.</p>
   * <p>Please refer to <a href="/adwords/api/docs/appendix/timezones">AdWords API Timezones</a> for the full list of possible return values.</p>
   */
  def getTimeZone(): String = js.native
  /**
   * Removes a callout extension from this account.
   * <p>Returns nothing.</p>
   */
  def removeCallout(calloutExtension: Callout): Unit = js.native
  /**
   * Removes a mobile app extension from this account.
   * <p>Returns nothing.</p>
   */
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  /**
   * Removes a review extension from this account.
   * <p>Returns nothing.</p>
   */
  def removeReview(reviewExtension: Review): Unit = js.native
}
