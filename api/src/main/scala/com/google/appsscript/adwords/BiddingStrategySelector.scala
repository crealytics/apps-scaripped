package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches bidding strategies. Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var biddingStrategySelector = AdWordsApp
 *      .biddingStrategies()
 *      .withCondition("Impressions &gt; 100")
 *      .forDateRange("LAST_MONTH")
 *      .orderBy("Clicks DESC");
 *  var biddingStrategyIterator = biddingStrategySelector.get();
 *  while (biddingStrategyIterator.hasNext()) {
 *    var biddingStrategy = biddingStrategyIterator.next();
 *  }</pre>
 */
trait BiddingStrategySelector extends js.Object with Selector[BiddingStrategySelector] with Location with OrderableSelector with HasStatistics {
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
  def forDateRange(dateFrom: AnyRef, dateTo: AnyRef): BiddingStrategySelector = js.native
  /** Fetches the requested bidding strategies and returns an iterator. */
  def get(): BiddingStrategyIterator = js.native
  /**
   * Restricts this selector to return only bidding strategies with the given bidding strategy IDs.
   * <pre class="prettyprint">
   *  var biddingStrategyIds = [12345, 23456, 34567];
   *  selector = selector.withIds(biddingStrategyIds);</pre>
   * <p>The resulting selector can be further refined by applying additional conditions to it. The ID-based condition will then be AND-ed together with all the other conditions, including any other ID-based conditions. So, for instance, the following selector: </p>
   * <pre class="prettyprint">
   *  AdWordsApp.biddingStrategies()
   *     .withIds([12345, 23456, 34567])
   *     .withIds([34567, 45678, 56789]);</pre>
   * will only get the bidding strategy with ID
   * <code>34567</code>
   * , since it would be the only bidding strategy that satisfies both ID conditions.
   * <p></p>
   * <p>The selector can only support up to 10,000 IDs. If more than 10,000 IDs are specified, the corresponding get() call will fail with a runtime error.</p>
   */
  def withIds(ids: js.Array[Long]): BiddingStrategySelector = js.native
}
