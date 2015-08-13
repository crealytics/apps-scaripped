package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches excluded topics. Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var adGroup = AdWordsApp.adGroups().get().next();
 *  var excludedTopicSelector = adGroup.display().excludedTopics();
 *  var excludedTopicIterator = excludedTopicSelector.get();
 *  while (excludedTopicIterator.hasNext()) {
 *    var excludedTopic = excludedTopicIterator.next();
 *  }</pre>
 */
trait ExcludedTopicSelector extends js.Object with Selector[ExcludedTopicSelector] {
  /** Fetches the requested excluded topics and returns an iterator. */
  def get(): ExcludedTopicIterator = js.native
  /**
   * Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   * parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("AdGroupName")</code> - orders results by AdGroupName, in ascending order.</li>
   *  <li><code>orderBy("AdGroupName ASC")</code> - orders results by AdGroupName, in ascending order.</li>
   *  <li><code>orderBy("AdGroupName DESC")</code> - orders results by AdGroupName, in descending order.</li>
   * </ul>
   * <p>See <a href="adwordsapp_excludedtopicselector.html#withCondition_1">ExcludedTopicSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   * <pre class="prettyprint">
   *  selector = selector.
   *      .orderBy("AdGroupName")
   *      .orderBy("CampaignName");</pre>
   * <p>The results will be ordered by AdGroupName in ascending order. Results with equal AdGroupName value will be ordered by CampaignName in ascending order.</p>
   */
  def orderBy(orderBy: String): ExcludedTopicSelector = js.native
}
