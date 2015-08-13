package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for an ad under construction.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var adOperation = adGroup.newTextAdBuilder()
 *     .withHeadline("headline of ad")
 *     .withDescription1("first line of ad description")
 *     .withDescription2("second line of ad description")
 *     .withDisplayUrl("www.example.com")
 *     .withFinalUrl("http://www.example.com")
 *     .build();
 *  var ad = adOperation.getResult();</pre>
 * <p>Note that it is only necessary to call <a href="adwordsapp_adoperation.html#getResult_0">AdOperation.getResult()</a> if you need to access the actual ad for further processing (for instance, one can attach a label to the newly created ad), otherwise, calling <a href="adwordsapp_adbuilder.html#build_0">AdBuilder.build()</a> on the <code>AdBuilder</code> is sufficient to ensure that the ad is created. </p>
 */
trait AdBuilder extends js.Object with Builder[Ad] with BuilderWithCustomParameters {
  /** Sets the first line of the new ad's description to the specified value. This field is required. */
  def withDescription1(description1: String): AdBuilder = js.native
  /** Sets the second line of the new ad's description to the specified value. This field is required. */
  def withDescription2(description2: String): AdBuilder = js.native
  /**
   * Sets the destination URL of the new ad to the specified value. It is required to set either destination URL or
   * <a href="adwordsapp_adbuilder.html#withFinalUrl_1">final URL</a>
   * .
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when destination URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_adbuilder.html#withFinalUrl_1">AdBuilder.withFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def withDestinationUrl(destinationUrl: String): AdBuilder = js.native
  /** Sets the display URL of the new ad to the specified value. This field is required. */
  def withDisplayUrl(displayUrl: String): AdBuilder = js.native
  /**
   * Sets the final URL of the new ad to the specified value.
   * <p>The final URL represents the actual landing page for your ad. The final URL must be the URL of the page that the user ends up on after clicking on your ad, once all the redirects have taken place.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * This field is required.
   */
  def withFinalUrl(finalUrl: String): AdBuilder = js.native
  /** Sets the headline of the new ad to the specified value. This field is required. */
  def withHeadline(headline: String): AdBuilder = js.native
  /**
   * Sets the mobile final URL of the new ad to the specified value.
   * <p>The mobile final URL represents the actual landing page for your ad on a mobile device. The final mobile URL must be the URL of the page that the user ends up on after clicking on your ad on a mobile device, once all the redirects have taken place.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withMobileFinalUrl(mobileFinalUrl: String): AdBuilder = js.native
  /**
   * Sets the new ad's device preference to mobile or clears it. This field is optional and defaults to
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): AdBuilder = js.native
  /**
   * Sets the tracking template of the new ad to the specified value.
   * <p>You can optionally use the tracking template to specify additional tracking parameters or redirects. AdWords will use this template to assemble the actual destination URL to associate with the ad.</p>
   * <p>A tracking template specified at a lower level entity will override the setting specified at a higher level entity, e.g., a tracking template set at the ad group level overrides the setting at the campaign level, and a tracking template specified at the ad level overrides the setting at the ad group level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withTrackingTemplate(trackingTemplate: String): AdBuilder = js.native
}
