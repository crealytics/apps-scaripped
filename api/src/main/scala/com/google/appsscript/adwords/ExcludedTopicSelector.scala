package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Fetches excluded topics. Supports filtering and sorting.
 * <p>Typical usage:</p>
 *
 * <pre class="prettyprint">
 *  var adGroup = AdWordsApp.adGroups().get().next();
 *  var excludedTopicSelector = adGroup.display().excludedTopics();
 *
 *  var excludedTopicIterator = excludedTopicSelector.get();
 *  while (excludedTopicIterator.hasNext()) {
 *    var excludedTopic = excludedTopicIterator.next();
 *  }</pre>
 */
trait ExcludedTopicSelector extends js.Object {
  /**  Fetches the requested excluded topics and returns an iterator. */
  def get: ExcludedTopicIterator = js.native
  /**
   *  Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   *  parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("AdGroupName")</code> - orders results by AdGroupName, in ascending order.</li>
   *  <li><code>orderBy("AdGroupName ASC")</code> - orders results by AdGroupName, in ascending order.</li>
   *  <li><code>orderBy("AdGroupName DESC")</code> - orders results by AdGroupName, in descending order.</li>
   * </ul>
   *
   * <p>See <a href="adwordsapp_excludedtopicselector.html#withCondition_1">ExcludedTopicSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   *
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   *
   * <pre class="prettyprint">
   *  selector = selector.
   *      .orderBy("AdGroupName")
   *      .orderBy("CampaignName");</pre>
   *
   * <p>The results will be ordered by AdGroupName in ascending order. Results with equal AdGroupName value will be ordered by CampaignName in ascending order.</p>
   */
  def orderBy(orderBy: String): ExcludedTopicSelector = js.native
  /**
   *  Adds the specified condition to the selector in order to narrow down the results.
   * <p>Multiple conditions may be added to the same selector: </p>
   * <pre class="prettyprint">
   *  selector = selector
   *      .withCondition("AdGroupStatus NOT_IN [PAUSED]")
   *      .withCondition("CampaignName = 'Campaign 1'");</pre>
   *  All specified conditions are
   * <code>AND</code>
   * -ed together. The above example will retrieve excluded topics in Campaign 1 that are in ad groups that are not paused.
   * <p></p>
   *
   * <p>The parameter to be passed into this method must be of the following form: </p>
   * <pre class="prettyprint">
   *  "COLUMN_NAME OPERATOR VALUE"</pre>
   *
   * <p></p>
   *
   * <h4>Operators</h4>
   *  The operator that can be used in a condition depends on the type of column.
   * <ul>
   *  <li>For <code>String</code> columns (e.g. AdGroupName): <strong><pre class="prettyprint">=  !=  STARTS_WITH  STARTS_WITH_IGNORE_CASE  CONTAINS
   *  CONTAINS_IGNORE_CASE  DOES_NOT_CONTAIN  DOES_NOT_CONTAIN_IGNORE_CASE</pre></strong></li>
   *  <li>For <code>Enumeration</code> columns (ones that can only take one value from a pre-defined list, such as AdGroupStatus): <strong><pre class="prettyprint">=  !=  IN []  NOT_IN []</pre></strong></li>
   * </ul>
   *  Conditions using
   * <code>IN</code>
   * ,
   * <code>NOT_IN</code>
   * ,
   * <code>CONTAINS_ALL</code>
   * ,
   * <code>CONTAINS_ANY</code>
   *  and
   * <code>CONTAINS_NONE</code>
   *  operators look as follows:
   * <pre class="prettyprint">
   *  withCondition("AdGroupStatus IN [ENABLED, PAUSED]")</pre>
   *  Operators are case-sensitive:
   * <code>starts_with</code>
   *  won't work.
   * <h4>Columns</h4>
   *
   * <p>All column names are case-sensitive, and so are all values of enumerated columns (such as AdGroupStatus)</p>
   *
   * <table border="1" cellspacing="0" cellpadding="3">
   *  <tbody>
   *   <tr>
   *    <th>Column</th>
   *    <th>Type</th>
   *    <th>Example</th>
   *   </tr>
   *   <tr>
   *    <td colspan="3">
   *     <center>
   *      <strong><i> Excluded Topic attributes </i></strong>
   *     </center></td>
   *   </tr>
   *   <tr>
   *    <td>AdGroupName</td>
   *    <td>String</td>
   *    <td><code>withCondition("AdGroupName CONTAINS_IGNORE_CASE 'shoes'")</code></td>
   *   </tr>
   *   <tr>
   *    <td>AdGroupStatus</td>
   *    <td>Enumeration: <code>ENABLED</code>, <code>PAUSED</code>, <code>REMOVED</code></td>
   *    <td><code>withCondition("AdGroupStatus = ENABLED")</code>. Use to fetch excluded topics from only <code>ENABLED</code> ad groups.</td>
   *   </tr>
   *   <tr>
   *    <td>CampaignName</td>
   *    <td>String</td>
   *    <td><code>withCondition("CampaignName CONTAINS_IGNORE_CASE 'promotion'")</code></td>
   *   </tr>
   *   <tr>
   *    <td>CampaignStatus</td>
   *    <td>Enumeration: <code>ENABLED</code>, <code>PAUSED</code>, <code>REMOVED</code></td>
   *    <td><code>withCondition("CampaignStatus = ENABLED")</code>. Use to fetch excluded topics from only <code>ENABLED</code> campaigns.</td>
   *   </tr>
   *  </tbody>
   * </table>
   */
  def withCondition(condition: String): ExcludedTopicSelector = js.native
  /**
   *  Specifies limit for the selector to use. For instance,
   * <code>withLimit(50)</code>
   *  returns only the first 50 entities.
   */
  def withLimit(limit: Int): ExcludedTopicSelector = js.native
}