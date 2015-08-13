package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches labels. Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var labelSelector = AdWordsApp.labels()
 *      .withCondition("CampaignsCount &gt; 5")
 *      .orderBy("CampaignsCount DESC");
 *  var labelIterator = labelSelector.get();
 *  while (labelIterator.hasNext()) {
 *    var label = labelIterator.next();
 *  }</pre>
 */
trait LabelSelector extends js.Object with Selector[LabelSelector] {
  /** Fetches the requested labels and returns an iterator. */
  def get(): LabelIterator = js.native
  /**
   * Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   * parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("Name")</code> - orders results by Name, in ascending order.</li>
   *  <li><code>orderBy("CampaignsCount ASC")</code> - orders results by the number of Campaigns this label is applied to, in ascending order.</li>
   *  <li><code>orderBy("AdGroupsCount DESC")</code> - orders results by the number of Ad Groups this label is applied to, in descending order.</li>
   * </ul>
   * <p>See <a href="adwordsapp_labelselector.html#withCondition_1">LabelSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   * <pre class="prettyprint">
   *  selector = selector.orderBy("CampaignsCount DESC").orderBy("Name");</pre>
   * <p>The results will be ordered by CampaignsCount in descending order. Results with equal CampaignsCount value will be ordered by Name in ascending order.</p>
   */
  def orderBy(orderBy: String): LabelSelector = js.native
}
