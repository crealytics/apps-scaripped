package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Access to account-level extensions. For example, to access all callouts belonging added to the account:
 * <pre class="prettyprint">
 *  var accountCalloutIterator =
 *      AdWordsApp.currentAccount().extensions().callouts().get();
 *  while (accountCalloutIterator.hasNext()) {
 *    var accountCallout = accountCalloutIterator.next();
 *  }</pre>
 */
trait AccountExtensions extends js.Object {
  /** Returns the selector of all callouts added to the account. */
  def callouts(): AccountCalloutSelector = js.native
  /** Returns the selector of all mobile apps added to the account. */
  def mobileApps(): AccountMobileAppSelector = js.native
  /** Returns the selector of all reviews added to the account. */
  def reviews(): AccountReviewSelector = js.native
}
