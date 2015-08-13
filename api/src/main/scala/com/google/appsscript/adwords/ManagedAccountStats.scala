package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Statistics for MCC Managed Accounts. Managed accounts are accessed via
 * <code>MccApp.accounts()</code>
 * . For accounts accessed by
 * <code>AdWordsApp.currentAccount()</code>
 * , please see
 * <a href="../adwordsapp/adwordsapp_stats.html">Stats</a>
 * .
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var stats = account.getStatsFor("LAST_MONTH");
 *  var impressions = stats.getImpressions();
 *  var clicks = stats.getClicks();
 *  // etc.</pre>
 */
trait ManagedAccountStats extends js.Object {
  /**
   * Returns the conversion rate for clicks, in
   * <code>0..1</code>
   * range.
   */
  def getClickConversionRate(): Double = js.native
  /** Returns the number of clicks. */
  def getClicks(): Long = js.native
  /**
   * Returns the conversion rate, in
   * <code>0..1</code>
   * range.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use
   *  <a href="mccapp_managedaccountstats.html#getClickConversionRate_0">ManagedAccountStats.getClickConversionRate()</a> instead.
   * </aside>
   */
  def getConversionRate(): Double = js.native
  /**
   * Returns the number of conversions.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use
   *  <a href="mccapp_managedaccountstats.html#getConvertedClicks_0">ManagedAccountStats.getConvertedClicks()</a> instead.
   * </aside>
   */
  def getConversions(): Long = js.native
  /** Returns the number of clicks that converted. */
  def getConvertedClicks(): Long = js.native
  /** Returns the cost in the default currency of the account. */
  def getCost(): Double = js.native
  /**
   * Returns the click through rate of the entity, in
   * <code>0..1</code>
   * range.
   */
  def getCtr(): Double = js.native
  /** Returns the number of impressions. */
  def getImpressions(): Long = js.native
}
