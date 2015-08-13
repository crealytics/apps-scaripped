package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches excluded display keywords. Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var adGroup = AdWordsApp.adGroups().get().next();
 *  var excludedDisplayKeywordSelector = adGroup.display().excludedKeywords();
 *  var excludedDisplayKeywordIterator = excludedDisplayKeywordSelector.get();
 *  while (excludedDisplayKeywordIterator.hasNext()) {
 *    var excludedDisplayKeyword = excludedDisplayKeywordIterator.next();
 *  }</pre>
 */
trait ExcludedDisplayKeywordSelector extends js.Object with Selector[ExcludedDisplayKeywordSelector] {
  /** Fetches the requested excluded display keywords and returns an iterator. */
  def get(): ExcludedDisplayKeywordIterator = js.native
  /**
   * Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   * parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("Text")</code> - orders results by Text, in ascending order.</li>
   *  <li><code>orderBy("Text ASC")</code> - orders results by Text, in ascending order.</li>
   *  <li><code>orderBy("Text DESC")</code> - orders results by Text, in descending order.</li>
   * </ul>
   * <p>See <a href="adwordsapp_excludeddisplaykeywordselector.html#withCondition_1">ExcludedDisplayKeywordSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   * <pre class="prettyprint">
   *  selector = selector.
   *      .orderBy("Text")
   *      .orderBy("KeywordMatchType");</pre>
   * <p>The results will be ordered by Text in ascending order. Results with equal Text value will be ordered by KeywordMatchType in ascending order.</p>
   */
  def orderBy(orderBy: String): ExcludedDisplayKeywordSelector = js.native
}
