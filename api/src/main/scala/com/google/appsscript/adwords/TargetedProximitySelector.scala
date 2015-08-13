package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches targeted proximities. Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var proximitySelector = AdWordsApp.targeting()
 *      .proximities()
 *      .withCondition("Impressions &gt; 100")
 *      .forDateRange("LAST_MONTH")
 *      .orderBy("Clicks DESC");
 *  var proximityIterator = proximitySelector.get();
 *  while (proximityIterator.hasNext()) {
 *    var proximity = proximityIterator.next();
 *  }</pre>
 */
trait TargetedProximitySelector extends js.Object with Selector[TargetedProximitySelector] with Location with OrderableSelector with HasStatistics {
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
  def forDateRange(dateFrom: AnyRef, dateTo: AnyRef): TargetedProximitySelector = js.native
  /** Fetches the requested targeted proximities and returns an iterator. */
  def get(): TargetedProximityIterator = js.native
  /**
   * Restricts this selector to return only targeted proximities with the given targeted proximity IDs.
   * <p>All targeted proximities are uniquely identified by the combination of their campaign ID and targeted proximity ID. The IDs for this selector are thus represented as two-element arrays, with the first element being the campaign ID and the second being the targeted proximity ID: </p>
   * <pre class="prettyprint">
   *  var proximityIds = [
   *    [12345, 987987],
   *    [23456, 876876],
   *    [34567, 765765],
   *  ];
   *  selector = selector.withIds(proximityIds);</pre>
   * <p></p>
   * <p>In cases where the campaign ID is already known, the IDs for this selector can then be just an array of targeted proximity IDs. Any provided campaign ID and targeted proximity ID combination will override the embedded campaign ID. For instance, the following will select the targeted proximities with the given targeted proximity IDs in the given campaign: </p>
   * <pre class="prettyprint">
   *  var ids = [12345, 23456, 34567];
   *  var proximities = campaign.targeting().targetedProximities().withIds(ids);</pre>
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
   *  AdWordsApp.proximities()
   *     .withIds(ids1)
   *     .withIds(ids2);</pre>
   * will only get the targeted proximity with ID
   * <code>[34567, 765765]</code>
   * , since it would be the only targeted proximity that satisfies both ID conditions.
   * <p></p>
   */
  def withIds(ids: js.Array[js.Array[Long]]): TargetedProximitySelector = js.native
}
