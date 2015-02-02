package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Builder for an ad group under construction.
 * <p>Typical usage:</p>
 *
 * <pre class="prettyprint">
 *  var adGroupBuilder = campaign.newAdGroupBuilder();
 *  var adGroupOperation = adGroupBuilder
 *     .withName("ad group name")
 *     .withStatus("PAUSED")
 *     .build();
 *  var adGroup = adGroupOperation.getResult();</pre>
 */
trait AdGroupBuilder extends js.Object {
  /**
   *  Creates an
   * <a href="adwordsapp_adgroup.html">AdGroup</a>
   * . Returns an
   * <a href="adwordsapp_adgroupoperation.html">AdGroupOperation</a>
   *  that can be used to get the new ad group (or access any associated errors if creation failed).
   */
  def build: AdGroupOperation = js.native
  /**
   *  Returns the newly created ad group.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use
   *  <a href="adwordsapp_adgroupbuilder.html#build_0">AdGroupBuilder.build()</a> instead.
   * </aside>
   */
  def create: AdGroup = js.native
  /**  Sets the bidding strategy of the new ad group to the specified value. */
  def withBiddingStrategy(biddingStrategy: BiddingStrategy): AdGroupBuilder = js.native
  /**
   *  Sets the bidding strategy of the new ad group to the specified anonymous bidding strategy.
   * <p>The supported anonymous bidding strategies are as follows: </p>
   * <ul>
   *  <li><code>"BUDGET_OPTIMIZER"</code>: In budget optimizer, Google automatically places bids for the user based on their daily/monthly budget.</li>
   *  <li><code>"CONVERSION_OPTIMIZER"</code>: Conversion optimizer bidding strategy helps you maximize your return on investment (ROI) by automatically getting you the most possible conversions for your budget. For more information on conversion optimizer, visit the <a href="https://support.google.com/adwords/answer/2471188">Conversion Optimizer help center</a></li>
   *  <li><code>"MANUAL_CPC"</code>: Manual click based bidding where user pays per click.</li>
   *  <li><code>"MANUAL_CPM"</code>: Manual impression based bidding where user pays per thousand impressions. This can only be used for "Display Network only" campaigns.</li>
   * </ul>
   *
   * <p></p>
   */
  def withBiddingStrategy(biddingStrategy: String): AdGroupBuilder = js.native
  /**
   *  Sets the max CPA bid of the new ad group to the specified value.
   * <p>If the bid is not set, the ad group will assume a default max CPA bid of $0.01.</p>
   */
  def withCpa(cpa: Double): AdGroupBuilder = js.native
  /**
   *  Sets the max CPC bid of the new ad group to the specified value.
   * <p>If the bid is not set, the ad group will assume a default max CPC bid of $0.01.</p>
   */
  def withCpc(cpc: Double): AdGroupBuilder = js.native
  /**
   *  Sets the max CPM bid of the new ad group to the specified value.
   * <p>If the bid is not set, the ad group will assume a default max CPM bid of $0.25.</p>
   */
  def withCpm(cpm: Double): AdGroupBuilder = js.native
  /**
   *  Sets the default keyword max cpc bid of the new ad group to the specified value. If the bid is not set, the ad group will assume a default bid that depends on the campaign's bidding strategy:
   * <ul>
   *  <li><code>MANUAL_CPM</code>: $0.25</li>
   *  <li>Other types: $0.01</li>
   * </ul>
   *  If you try to specify the keyword max cpc bid when the campaign's bidding strategy is not
   * <code>MANUAL_CPC</code>
   * , creation of the ad group will fail.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use
   *  <a href="adwordsapp_adgroupbuilder.html#withCpc_1">AdGroupBuilder.withCpc(double)</a>.
   * </aside>
   */
  def withKeywordMaxCpc(keywordMaxCpc: Double): AdGroupBuilder = js.native
  /**  Sets the name of the new ad group to the specified value. If ad group name is not set, the ad group will assume a default name ('Ad Group #5'). */
  def withName(name: String): AdGroupBuilder = js.native
  /**
   *  Sets the status of the new ad group to the specified value. If the status is not set, it will default to
   * <code>ENABLED</code>
   * .
   */
  def withStatus(status: String): AdGroupBuilder = js.native
}