package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches excluded audiences. Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var adGroup = AdWordsApp.adGroups().get().next();
 *  var excludedAudienceSelector = adGroup.display().excludedAudiences();
 *  var excludedAudienceIterator = excludedAudienceSelector.get();
 *  while (excludedAudienceIterator.hasNext()) {
 *    var excludedAudience = excludedAudienceIterator.next();
 *  }</pre>
 */
trait ExcludedAudienceSelector extends js.Object with Selector[ExcludedAudienceSelector] {
  /** Fetches the requested excluded audiences and returns an iterator. */
  def get(): ExcludedAudienceIterator = js.native
  /**
   * Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   * parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("UserListName")</code> - orders results by UserListName, in ascending order.</li>
   *  <li><code>orderBy("UserListName ASC")</code> - orders results by UserListName, in ascending order.</li>
   *  <li><code>orderBy("UserListName DESC")</code> - orders results by UserListName, in descending order.</li>
   * </ul>
   * <p>See <a href="adwordsapp_excludedaudienceselector.html#withCondition_1">ExcludedAudienceSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   * <pre class="prettyprint">
   *  selector = selector.
   *      .orderBy("UserListName")
   *      .orderBy("AdGroupName");</pre>
   * <p>The results will be ordered by UserListName in ascending order. Results with equal UserListName value will be ordered by AdGroupName in ascending order.</p>
   */
  def orderBy(orderBy: String): ExcludedAudienceSelector = js.native
}
