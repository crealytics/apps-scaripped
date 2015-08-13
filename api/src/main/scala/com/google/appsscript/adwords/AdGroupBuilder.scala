package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for an ad group under construction.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var adGroupBuilder = campaign.newAdGroupBuilder();
 *  var adGroupOperation = adGroupBuilder
 *     .withName("ad group name")
 *     .withStatus("PAUSED")
 *     .build();
 *  var adGroup = adGroupOperation.getResult();</pre>
 */
trait AdGroupBuilder extends Builder[AdGroup] {
  /**
   * Creates an
   * <a href="adwordsapp_adgroup.html">AdGroup</a>
   * . Returns an
   * <a href="adwordsapp_adgroupoperation.html">AdGroupOperation</a>
   * that can be used to get the new ad group (or access any associated errors if creation failed).
   */
  override def build(): Operation[AdGroup] = js.native
  /**
   *  Returns the newly created ad group.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_adgroupbuilder.html#build_0">AdGroupBuilder.build()</a> instead.
   * </aside>
   */
  def create(): AdGroup = js.native
  /** Sets the bidding strategy of the new ad group to the specified value. */
  def withBiddingStrategy(biddingStrategy: String): AdGroupBuilder = js.native
  /**
   * Sets the max CPA bid of the new ad group to the specified value.
   * <p>If the bid is not set, the ad group will assume a default max CPA bid of $0.01.</p>
   */
  def withCpa(cpa: Double): AdGroupBuilder = js.native
  /**
   * Sets the max CPC bid of the new ad group to the specified value.
   * <p>If the bid is not set, the ad group will assume a default max CPC bid of $0.01.</p>
   */
  def withCpc(cpc: Double): AdGroupBuilder = js.native
  /**
   * Sets the CPM bid of the new ad group to the specified value.
   * <p>See <a href="https://support.google.com/adwords/answer/6310"> Cost-per-thousand impressions (CPM)</a> for more information.</p>
   * <p>If the bid is not set, the ad group will assume a default CPM bid of $0.25.</p>
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
  /** Sets the name of the new ad group to the specified value. If ad group name is not set, the ad group will assume a default name ('Ad Group #5'). */
  def withName(name: String): AdGroupBuilder = js.native
  /**
   * Sets the status of the new ad group to the specified value. If the status is not set, it will default to
   * <code>ENABLED</code>
   * .
   */
  def withStatus(status: String): AdGroupBuilder = js.native
}
