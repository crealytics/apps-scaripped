package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Builder for a product ad under construction.
 * <p>Typical usage:</p>
 *
 * <pre class="prettyprint">
 *  var adOperation = shoppingAdGroup.newAdBuilder()
 *     .withPromotionLine("Holiday sale!")
 *     .build();
 *  var ad = adOperation.getResult();</pre>
 *
 * <p>Note that it is only necessary to call <a href="adwordsapp_productadoperation.html#getResult_0">ProductAdOperation.getResult()</a> if you need to access the actual product ad for further processing (for instance, one can attach a label to the newly created product ad), otherwise, calling <a href="adwordsapp_productadbuilder.html#build_0">ProductAdBuilder.build()</a> on the <code>ProductAdBuilder</code> is sufficient to ensure that the product ad is created. </p>
 */
trait ProductAdBuilder extends js.Object {
  /**
   *  Creates a
   * <a href="adwordsapp_productad.html">ProductAd</a>
   * . Returns a
   * <code>ProductAdOperation</code>
   *  that can be used to get the new product ad (or access any associated errors if creation failed).
   */
  def build: ProductAdOperation = js.native
  /**
   *  Sets the new product ad's device preference to mobile or clears it. This field is optional and defaults to
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): ProductAdBuilder = js.native
  /**  Specifies the promotion line of the new product ad. This is an optional field. */
  def withPromotionLine(promotionLine: String): ProductAdBuilder = js.native
}