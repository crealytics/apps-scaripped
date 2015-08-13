package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for a keyword under construction.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var keywordOperation = adGroup.newKeywordBuilder()
 *     .withText("text")
 *     .withCpc(1.5)
 *     .withFinalUrl("http://www.example.com")
 *     .build();
 *  var keyword = keywordOperation.getResult();</pre>
 * <p> Note that it is only necessary to call <a href="adwordsapp_keywordoperation.html#getResult_0">KeywordOperation.getResult()</a> if you need to access the actual keyword for further processing (for instance, one can attach a label to the newly created keyword), otherwise, calling <a href="adwordsapp_keywordbuilder.html#build_0">KeywordBuilder.build()</a> on the <code>KeywordBuilder</code> is sufficient to ensure that the Keyword is created.</p>
 */
trait KeywordBuilder extends Builder[Keyword] {
  /**
   * Creates a
   * <a href="adwordsapp_keyword.html">Keyword</a>
   * . Returns a
   * <a href="adwordsapp_keywordoperation.html">KeywordOperation</a>
   * that can be used to get the new keyword (or access any associated errors if creation failed).
   */
  override def build(): Operation[Keyword] = js.native
  /** Sets the bidding strategy of the new keyword to the specified value. */
  def withBiddingStrategy(biddingStrategy: BiddingStrategy): KeywordBuilder = js.native
  /** Sets the max CPC bid of the new keyword to the specified value. */
  def withCpc(cpc: Double): KeywordBuilder = js.native
  /**
   * Sets the CPM bid of the new keyword to the specified value.
   * <p>See <a href="https://support.google.com/adwords/answer/6310"> Cost-per-thousand impressions (CPM)</a> for more information.</p>
   */
  def withCpm(cpm: Double): KeywordBuilder = js.native
  /**
   * Sets the custom parameters of the new keyword to the specified value.
   * <p>Custom parameters enable you to create your own <a href="//support.google.com/adwords/answer/2375447">ValueTrack</a> parameters that you can assign your own IDs to.</p>
   * <p>The name of a custom parameter can contain only alphanumeric characters, and custom parameter values may not contain white space. When referring to the custom parameter in final URLs and tracking template, you should surround the custom parameter in braces, and prefix an underscore to its name, e.g. <code>{_param}</code>.</p>
   * <p>You can have up to 3 custom parameters for an entity. The key and value must not exceed 16 and 200 bytes respectively.</p>
   * <p>Custom parameters specified at a lower level entity will override the setting specified at a higher level entity, e.g., setting custom parameters at the ad group level overrides the setting at the campaign level, and and custom parameters specified at the ad level override the setting at the ad group level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withCustomParameters(customParameters: AnyRef): KeywordBuilder = js.native
  /**
   * Sets the destination URL of the keyword to the specified value.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when destination URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_keywordbuilder.html#withFinalUrl_1">KeywordBuilder.withFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def withDestinationUrl(destinationUrl: String): KeywordBuilder = js.native
  /**
   * Sets the final URL of the new keyword to the specified value.
   * <p>The final URL represents the actual landing page for your keyword. The final URL must be the URL of the page that the user ends up on after clicking on your ad, once all the redirects have taken place.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withFinalUrl(finalUrl: String): KeywordBuilder = js.native
  /**
   * Sets the mobile final URL of the new keyword to the specified value.
   * <p>The mobile final URL represents the actual landing page for your keyword on a mobile device. The final mobile URL must be the URL of the page that the user ends up on after clicking on your ad on a mobile device, once all the redirects have taken place.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withMobileFinalUrl(mobileFinalUrl: String): KeywordBuilder = js.native
  /**
   * Sets the text of the new keyword to the specified value. This field is required. Match type for the new keyword is specified as follows:
   * <ul>
   *  <li><code>keywordBuilder.withText("shoes")</code> - broad match.</li>
   *  <li><code>keywordBuilder.withText("\"shoes\"")</code> - phrase match.</li>
   *  <li><code>keywordBuilder.withText("[leather shoes]")</code> - exact match.</li>
   * </ul>
   */
  def withText(text: String): KeywordBuilder = js.native
  /**
   * Sets the tracking template of the new keyword to the specified value.
   * <p>You can optionally use the tracking template to specify additional tracking parameters or redirects. AdWords will use this template to assemble the actual destination URL to associate with the ad.</p>
   * <p>A tracking template specified at a lower level entity will override the setting specified at a higher level entity, e.g., a tracking template set at the ad group level overrides the setting at the campaign level, and a tracking template specified at the ad level overrides the setting at the ad group level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withTrackingTemplate(trackingTemplate: String): KeywordBuilder = js.native
}
