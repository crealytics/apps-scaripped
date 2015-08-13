package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches negative keywords (except from shared libraries).
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var adGroup = AdWordsApp.adGroups().get().next();
 *  var negativeKeywordSelector = adGroup.negativeKeywords();
 *  var negativeKeywordIterator = negativeKeywordSelector.get();
 *  while (negativeKeywordIterator.hasNext()) {
 *    var negativeKeyword = negativeKeywordIterator.next();
 *  }</pre>
 */
trait NegativeKeywordSelector extends js.Object with Selector[NegativeKeywordSelector] {
  /** Fetches the requested negative keywords and returns an iterator. */
  def get(): NegativeKeywordIterator = js.native
  /**
   * Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   * parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("Text")</code> - orders results by Text, in ascending order.</li>
   *  <li><code>orderBy("Text ASC")</code> - orders results by Text, in ascending order.</li>
   *  <li><code>orderBy("Text DESC")</code> - orders results by Text, in descending order.</li>
   * </ul>
   * <p>See <a href="adwordsapp_negativekeywordselector.html#withCondition_1">NegativeKeywordSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   * <pre class="prettyprint">
   *  selector = selector.
   *      .orderBy("Text")
   *      .orderBy("KeywordMatchType");</pre>
   * <p>The results will be ordered by Text in ascending order. Results with equal Text value will be ordered by KeywordMatchType in ascending order.</p>
   */
  def orderBy(orderBy: String): NegativeKeywordSelector = js.native
}
