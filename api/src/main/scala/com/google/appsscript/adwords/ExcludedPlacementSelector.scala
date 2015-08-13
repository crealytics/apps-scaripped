package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches excluded placements. Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var adGroup = AdWordsApp.adGroups().get().next();
 *  var excludedPlacementSelector = adGroup.display().excludedPlacements();
 *  var excludedPlacementIterator = excludedPlacementSelector.get();
 *  while (excludedPlacementIterator.hasNext()) {
 *    var excludedPlacement = excludedPlacementIterator.next();
 *  }</pre>
 */
trait ExcludedPlacementSelector extends js.Object with Selector[ExcludedPlacementSelector] {
  /** Fetches the requested excluded placements and returns an iterator. */
  def get(): ExcludedPlacementIterator = js.native
  /**
   * Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   * parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("PlacementUrl")</code> - orders results by PlacementUrl, in ascending order.</li>
   *  <li><code>orderBy("PlacementUrl ASC")</code> - orders results by PlacementUrl, in ascending order.</li>
   *  <li><code>orderBy("PlacementUrl DESC")</code> - orders results by PlacementUrl, in descending order.</li>
   * </ul>
   * <p>See <a href="adwordsapp_excludedplacementselector.html#withCondition_1">ExcludedPlacementSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   * <pre class="prettyprint">
   *  selector = selector.
   *      .orderBy("PlacementUrl")
   *      .orderBy("AdGroupName");</pre>
   * <p>The results will be ordered by PlacementUrl in ascending order. Results with equal PlacementUrl value will be ordered by AdGroupName in ascending order.</p>
   */
  def orderBy(orderBy: String): ExcludedPlacementSelector = js.native
}
