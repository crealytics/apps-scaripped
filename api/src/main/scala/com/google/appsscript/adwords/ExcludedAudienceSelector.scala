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
trait ExcludedAudienceSelector extends Selector[ExcludedAudienceSelector] {
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
  /**
   * Adds the specified condition to the selector in order to narrow down the results.
   * <p>Multiple conditions may be added to the same selector: </p>
   * <pre class="prettyprint">
   *  selector = selector
   *      .withCondition("UserListName STARTS_WITH 'a'")
   *      .withCondition("CampaignName = 'Campaign 1'");</pre>
   * All specified conditions are
   * <code>AND</code>
   * -ed together. The above example will retrieve excluded audiences of type
   * <code>USER_LIST</code>
   * that start with 'a' and are in Campaign 1.
   * <p></p>
   * <p>The parameter to be passed into this method must be of the following form: </p>
   * <pre class="prettyprint">
   *  "COLUMN_NAME OPERATOR VALUE"</pre>
   * <p></p>
   * <h4>Operators</h4>
   * The operator that can be used in a condition depends on the type of column.
   * <ul>
   *  <li>For <code>String</code> columns (e.g. UserListName): <strong><pre class="prettyprint">=  !=  STARTS_WITH  STARTS_WITH_IGNORE_CASE  CONTAINS
   *  CONTAINS_IGNORE_CASE  DOES_NOT_CONTAIN  DOES_NOT_CONTAIN_IGNORE_CASE</pre></strong></li>
   *  <li>For <code>Enumeration</code> columns (ones that can only take one value from a pre-defined list, such as AdGroupStatus): <strong><pre class="prettyprint">=  !=  IN []  NOT_IN []</pre></strong></li>
   * </ul>
   * Conditions using
   * <code>IN</code>
   * ,
   * <code>NOT_IN</code>
   * ,
   * <code>CONTAINS_ALL</code>
   * ,
   * <code>CONTAINS_ANY</code>
   * and
   * <code>CONTAINS_NONE</code>
   * operators look as follows:
   * <pre class="prettyprint">
   *  withCondition("KeywordMatchType IN [Value1, Value2]")</pre>
   * Operators are case-sensitive:
   * <code>starts_with</code>
   * won't work.
   * <h4>Columns</h4>
   * <p>All column names are case-sensitive, and so are all values of enumerated columns (such as AdGroupStatus)</p>
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
   *      <strong><i> Excluded audience attributes </i></strong>
   *     </center></td>
   *   </tr>
   *   <tr>
   *    <td>UserListName</td>
   *    <td>String</td>
   *    <td><code>withCondition("UserListName STARTS_WITH 'leather'")</code></td>
   *   </tr>
   *   <tr>
   *    <td>AdGroupName</td>
   *    <td>String</td>
   *    <td><code>withCondition("AdGroupName CONTAINS_IGNORE_CASE 'shoes'")</code></td>
   *   </tr>
   *   <tr>
   *    <td>AdGroupStatus</td>
   *    <td>Enumeration: <code>ENABLED</code>, <code>PAUSED</code>, <code>REMOVED</code></td>
   *    <td><code>withCondition("AdGroupStatus = ENABLED")</code>. Use to fetch excluded audiences from only <code>ENABLED</code> ad groups.</td>
   *   </tr>
   *   <tr>
   *    <td>CampaignName</td>
   *    <td>String</td>
   *    <td><code>withCondition("CampaignName CONTAINS_IGNORE_CASE 'promotion'")</code></td>
   *   </tr>
   *   <tr>
   *    <td>CampaignStatus</td>
   *    <td>Enumeration: <code>ENABLED</code>, <code>PAUSED</code>, <code>REMOVED</code></td>
   *    <td><code>withCondition("CampaignStatus = ENABLED")</code>. Use to fetch excluded audiences from only <code>ENABLED</code> campaigns.</td>
   *   </tr>
   *  </tbody>
   * </table>
   */
  override def withCondition(condition: String): ExcludedAudienceSelector = js.native
}
