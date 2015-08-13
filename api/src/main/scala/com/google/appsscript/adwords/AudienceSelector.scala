package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches audiences. Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var audienceSelector = AdWordsApp.display()
 *      .audiences()
 *      .withCondition("Impressions &gt; 100")
 *      .forDateRange("LAST_MONTH")
 *      .orderBy("Clicks DESC");
 *  var audienceIterator = audienceSelector.get();
 *  while (audienceIterator.hasNext()) {
 *    var audience = audienceIterator.next();
 *  }</pre>
 */
trait AudienceSelector extends js.Object with Selector[AudienceSelector] with Location with OrderableSelector with HasStatistics {
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
  def forDateRange(dateFrom: AnyRef, dateTo: AnyRef): AudienceSelector = js.native
  /** Fetches the requested audiences and returns an iterator. */
  def get(): AudienceIterator = js.native
  /**
   * Restricts this selector to return only Audiences with the given IDs.
   * <p>All Audiences are uniquely identified by the combination of their ad group ID and their individual ID (obtained using <a href="adwordsapp_audience.html#getId_0">Audience.getId()</a>). The IDs for this selector are thus represented as two-element arrays, with the first element being the ad group ID and the second being the individial audience ID: </p>
   * <pre class="prettyprint">
   *  var ids = [
   *    [12345, 987987],
   *    [23456, 876876],
   *    [34567, 765765],
   *  ];
   *  selector = selector.withIds(ids);</pre>
   * <p></p>
   * Restricts this selector to return only audiences with the given IDs.
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
   *  AdWordsApp.display().audiences()
   *     .withIds(ids1)
   *     .withIds(ids2);</pre>
   * will only get the audience with ID
   * <code>[34567, 765765]</code>
   * , since it would be the only audience that satisfies both ID conditions.
   * <p></p>
   */
  def withIds(ids: js.Array[js.Array[Long]]): AudienceSelector = js.native
}
