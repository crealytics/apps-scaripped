package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for
 * <a href="adwordsapp_placement.html">Placement</a>
 * objects.
 * <p>Example usage:</p>
 * <pre class="prettyprint">
 *  var placementBuilder = adGroup.display().newPlacementBuilder()
 *      .withUrl("http://www.site.com")  // required
 *      .withCpc(0.50)                   // optional
 *      .build()                         // create the placement</pre>
 */
trait PlacementBuilder extends js.Object with Builder[Placement] {
  /**
   * Builds the excluded placement. Returns an
   * <a href="adwordsapp_excludedplacementoperation.html">ExcludedPlacementOperation</a>
   * that corresponds to the creation of the
   * <a href="adwordsapp_excludedplacement.html">ExcludedPlacement</a>
   * .
   */
  def exclude(): Operation[ExcludedPlacement] = js.native
  /** Sets the max CPC bid of the new placement to the specified value. */
  def withCpc(cpc: Double): PlacementBuilder = js.native
  /**
   * Sets the CPM bid of the new placement to the specified value.
   * <p>See <a href="https://support.google.com/adwords/answer/6310"> Cost-per-thousand impressions (CPM)</a> for more information.</p>
   */
  def withCpm(cpm: Double): PlacementBuilder = js.native
  /** Sets the URL of the placement. This field is required. */
  def withUrl(url: String): PlacementBuilder = js.native
}
