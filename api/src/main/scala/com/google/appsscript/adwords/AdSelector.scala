package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches text ads (except from shared libraries). Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var adSelector = AdWordsApp
 *      .ads()
 *      .withCondition("Impressions &gt; 100")
 *      .forDateRange("LAST_MONTH")
 *      .orderBy("Clicks DESC");
 *  var adIterator = adSelector.get();
 *  while (adIterator.hasNext()) {
 *    var ad = adIterator.next();
 *  }</pre>
 */
trait AdSelector extends js.Object with Selector[AdSelector] with Location with OrderableSelector with HasStatistics {
  /**
   * Sets a custom date range onto the selector. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * form. For instance,
   * <code>March 24th, 2013</code>
   * is represented as either
   * <code>{year: 2013, month: 3, day: 24}</code>
   * or
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so
   * <code>forDateRange("20130324", "20130324")</code>
   * sets the range of one day.
   * <p>Date range must be specified if the selector has conditions or ordering for a stat field. Note that only the last date range specified for the selector will take effect.</p>
   */
  def forDateRange(dateFrom: AnyRef, dateTo: AnyRef): AdSelector = js.native
  /** Fetches the requested ads and returns an iterator. */
  def get(): AdIterator = js.native
  /**
   * Restricts this selector to return only ads with the given ad IDs.
   * <p>All ads are uniquely identified by the combination of their "ad group" ID and ad ID. The IDs for this selector are thus represented as two-element arrays, with the first element being the "ad group" ID and the second being the ad ID: </p>
   * <pre class="prettyprint">
   *  var adIds = [
   *    [12345, 987987],
   *    [23456, 876876],
   *    [34567, 765765],
   *  ];
   *  selector = selector.withIds(adIds);</pre>
   * <p></p>
   * <p>In cases where the ad group ID is already known, the IDs for this selector can then be just an array of ad IDs. Any provided ad group ID and ad ID combination will override the embedded ad group ID. For instance, the following will select the ads with the given ad IDs in the given ad group: </p>
   * <pre class="prettyprint">
   *  var ids = [12345, 23456, 34567];
   *  var ads = adGroup.ads().withIds(ids);</pre>
   * <p></p>
   * <p>The resulting selector can be further refined by applying additional conditions to it. The ID-based condition will then be AND-ed together with all the other conditions, including any other ID-based conditions. So, for instance, the following selector: </p>
   * <pre class="prettyprint">
   *  var ids1 = [
   *    [12345, 987987],
   *    [23456, 876876],
   *    [34567, 765765],
   *  ];
   *  var ids2 = [
   *    [34567, 765765],
   *    [45678, 654654],
   *    [56789, 543543],
   *  ];
   *  AdWordsApp.ads()
   *     .withIds(ids1)
   *     .withIds(ids2);</pre>
   * will only get the ad with ID
   * <code>[34567, 765765]</code>
   * , since it would be the only ad that satisfies both ID conditions.
   * <p></p>
   */
  def withIds(ids: js.Array[js.Array[Long]]): AdSelector = js.native
}
