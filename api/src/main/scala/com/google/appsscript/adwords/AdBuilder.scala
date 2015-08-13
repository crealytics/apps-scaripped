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
trait AdBuilder extends Builder[Ad] {
  /**
   * Creates an
   * <a href="adwordsapp_ad.html">Ad</a>
   * . Returns an
   * <code>AdOperation</code>
   * that can be used to get the new ad (or access any associated errors if creation failed).
   */
  override def build(): Operation[Ad] = js.native
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
  /** Sets the headline of the new ad to the specified value. This field is required. */
  def withHeadline(headline: String): AdBuilder = js.native
  /**
   * Sets the new ad's device preference to mobile or clears it. This field is optional and defaults to
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): AdBuilder = js.native
}
