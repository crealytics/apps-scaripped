package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches platforms. Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var platformSelector = AdWordsApp.targeting()
 *      .platforms()
 *      .withCondition("Impressions &gt; 100")
 *      .forDateRange("LAST_MONTH")
 *      .orderBy("Clicks DESC");
 *  var platformIterator = platformSelector.get();
 *  while (platformIterator.hasNext()) {
 *    var platform = platformIterator.next();
 *  }</pre>
 */
trait PlatformSelector extends js.Object with Selector[PlatformSelector] with OrderableSelector with HasStatistics {
  /** Restricts this selector to only select desktop targets. */
  def desktop(): PlatformSelector = js.native
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
  def forDateRange(dateFrom: AnyRef, dateTo: AnyRef): PlatformSelector = js.native
  /** Fetches the requested platforms and returns an iterator. */
  def get(): PlatformIterator = js.native
  /** Restricts this selector to only select mobile targets. */
  def mobile(): PlatformSelector = js.native
  /** Restricts this selector to only select tablet targets. */
  def tablet(): PlatformSelector = js.native
  /**
   * Restricts this selector to return only platforms with the given platform IDs.
   * <p>All platforms are uniquely identified by the combination of their campaign ID and platform ID. The IDs for this selector are thus represented as two-element arrays, with the first element being the campaign ID and the second being the platform ID: </p>
   * <pre class="prettyprint">
   *  var platformIds = [
   *    [12345, 987987],
   *    [23456, 876876],
   *    [34567, 765765],
   *  ];
   *  selector = selector.withIds(platformIds);</pre>
   * <p></p>
   * <p>In cases where the campaign ID is already known, the IDs for this selector can then be just an array of platform IDs. Any provided campaign ID and platform ID combination will override the embedded campaign ID. For instance, the following will select the platforms with the given platform IDs in the given campaign: </p>
   * <pre class="prettyprint">
   *  var ids = [12345, 23456, 34567];
   *  var platforms = campaign.targeting().platforms().withIds(ids);</pre>
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
   *  AdWordsApp.platforms()
   *     .withIds(ids1)
   *     .withIds(ids2);</pre>
   * will only get the platform with ID
   * <code>[34567, 765765]</code>
   * , since it would be the only platform that satisfies both ID conditions.
   * <p></p>
   */
  def withIds(ids: js.Array[js.Array[Long]]): PlatformSelector = js.native
}
