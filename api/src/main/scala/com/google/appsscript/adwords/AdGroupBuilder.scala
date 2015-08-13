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
  /** Sets the bidding strategy of the new ad group to the specified value. */
  def withBiddingStrategy(biddingStrategy: BiddingStrategy): AdGroupBuilder = js.native
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
   * Sets the custom parameters of the new ad group to the specified value.
   * <p>Custom parameters enable you to create your own <a href="//support.google.com/adwords/answer/2375447">ValueTrack</a> parameters that you can assign your own IDs to.</p>
   * <p>The name of a custom parameter can contain only alphanumeric characters, and custom parameter values may not contain white space. When referring to the custom parameter in final URLs and tracking template, you should surround the custom parameter in braces, and prefix an underscore to its name, e.g. <code>{_param}</code>.</p>
   * <p>You can have up to 3 custom parameters for an entity. The key and value must not exceed 16 and 200 bytes respectively.</p>
   * <p>Custom parameters specified at a lower level entity will override the setting specified at a higher level entity, e.g., setting custom parameters at the ad group level overrides the setting at the campaign level, and and custom parameters specified at the ad level override the setting at the ad group level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withCustomParameters(customParameters: AnyRef): AdGroupBuilder = js.native
  /** Sets the name of the new ad group to the specified value. If ad group name is not set, the ad group will assume a default name ('Ad Group #5'). */
  def withName(name: String): AdGroupBuilder = js.native
  /**
   * Sets the status of the new ad group to the specified value. If the status is not set, it will default to
   * <code>ENABLED</code>
   * .
   */
  def withStatus(status: String): AdGroupBuilder = js.native
  /**
   * Sets the tracking template of the new ad group to the specified value.
   * <p>You can optionally use the tracking template to specify additional tracking parameters or redirects. AdWords will use this template to assemble the actual destination URL to associate with the ad.</p>
   * <p>A tracking template specified at a lower level entity will override the setting specified at a higher level entity, e.g., a tracking template set at the ad group level overrides the setting at the campaign level, and a tracking template specified at the ad level overrides the setting at the ad group level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withTrackingTemplate(trackingTemplate: String): AdGroupBuilder = js.native
}
