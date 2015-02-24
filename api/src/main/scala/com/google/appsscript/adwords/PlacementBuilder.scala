package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Builder for 
 * <a href="adwordsapp_placement.html">Placement</a>
 *  objects. 
 * <p>Example usage:</p>
 *  
 * <pre class="prettyprint">
 *  var placementBuilder = adGroup.display().newPlacementBuilder()
 *      .withUrl("http://www.site.com")  // required
 *      .withCpc(0.50)                   // optional
 *      .build()                         // create the placement</pre>
 */
trait PlacementBuilder extends Builder[Placement] {
  /**
   *  Builds the placement. Returns a 
   * <a href="adwordsapp_placementoperation.html">PlacementOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_placement.html">Placement</a>
   * .
   */
  override def build(): Operation[Placement] = js.native
  /**
   *  Builds the excluded placement. Returns an 
   * <a href="adwordsapp_excludedplacementoperation.html">ExcludedPlacementOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_excludedplacement.html">ExcludedPlacement</a>
   * .
   */
  def exclude(): Operation[ExcludedPlacement] = js.native
  /**  Sets the max CPC bid of the new placement to the specified value. */
  def withCpc(cpc: Double): PlacementBuilder = js.native
  /**  Sets the max CPM bid of the new placement to the specified value. */
  def withCpm(cpm: Double): PlacementBuilder = js.native
  /**  Sets the URL of the placement. This field is required. */
  def withUrl(url: String): PlacementBuilder = js.native
}
