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
 *  Fetches labels. Supports filtering and sorting.
 * <p>Typical usage:</p>
 *
 * <pre class="prettyprint">
 *  var labelSelector = AdWordsApp.labels()
 *      .withCondition("CampaignsCount &gt; 5")
 *      .orderBy("CampaignsCount DESC");
 *
 *  var labelIterator = labelSelector.get();
 *  while (labelIterator.hasNext()) {
 *    var label = labelIterator.next();
 *  }</pre>
 */
trait LabelSelector extends js.Object {
  /**  Fetches the requested labels and returns an iterator. */
  def get: LabelIterator = js.native
  /**
   *  Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   *  parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("Name")</code> - orders results by Name, in ascending order.</li>
   *  <li><code>orderBy("CampaignsCount ASC")</code> - orders results by the number of Campaigns this label is applied to, in ascending order.</li>
   *  <li><code>orderBy("AdGroupsCount DESC")</code> - orders results by the number of Ad Groups this label is applied to, in descending order.</li>
   * </ul>
   *
   * <p>See <a href="adwordsapp_labelselector.html#withCondition_1">LabelSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   *
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   *
   * <pre class="prettyprint">
   *  selector = selector.orderBy("CampaignsCount DESC").orderBy("Name");</pre>
   *
   * <p>The results will be ordered by CampaignsCount in descending order. Results with equal CampaignsCount value will be ordered by Name in ascending order.</p>
   */
  def orderBy(orderBy: String): LabelSelector = js.native
  /**
   *  Adds the specified condition to the selector in order to narrow down the results.
   * <p>Multiple conditions may be added to the same selector: </p>
   * <pre class="prettyprint">
   *  selector = selector
   *      .withCondition("CampaignsCount &gt; 5")
   *      .withCondition("KeywordsCount &gt; 100");</pre>
   *  All specified conditions are
   * <code>AND</code>
   * -ed together. The above example will retrieve labels that have over 5 campaigns and over 100 keywords associated with them.
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
   *  <li>For <code>Long</code> columns (e.g. CampaignsCount): <strong><pre class="prettyprint">&lt;  &lt;=  &gt;  &gt;=  =  !=</pre></strong></li>
   *  <li>For <code>String</code> columns (e.g. Name): <strong><pre class="prettyprint">=  !=  STARTS_WITH  STARTS_WITH_IGNORE_CASE
   *  CONTAINS  CONTAINS_IGNORE_CASE  DOES_NOT_CONTAIN  DOES_NOT_CONTAIN_IGNORE_CASE</pre> </strong></li>
   * </ul>
   *  Operators are case-sensitive:
   * <code>starts_with</code>
   *  won't work.
   * <h4>Columns</h4>
   *
   * <p>All column names are case-sensitive.</p>
   *
   * <table border="1" cellspacing="0" cellpadding="3">
   *  <tbody>
   *   <tr>
   *    <th>Column</th>
   *    <th>Type</th>
   *    <th>Example</th>
   *   </tr>
   *   <tr>
   *    <td>Name</td>
   *    <td>String</td>
   *    <td><code>withCondition("Name CONTAINS 'priority'")</code></td>
   *   </tr>
   *   <tr>
   *    <td>CampaignsCount</td>
   *    <td>Long</td>
   *    <td><code>withCondition("CampaignsCount = 2")</code></td>
   *   </tr>
   *   <tr>
   *    <td>AdGroupsCount</td>
   *    <td>Long</td>
   *    <td><code>withCondition("AdGroupsCount &gt; 10")</code></td>
   *   </tr>
   *   <tr>
   *    <td>AdsCount</td>
   *    <td>Long</td>
   *    <td><code>withCondition("AdsCount != 0")</code></td>
   *   </tr>
   *   <tr>
   *    <td>KeywordsCount</td>
   *    <td>Long</td>
   *    <td><code>withCondition("KeywordsCount &lt; 30")</code></td>
   *   </tr>
   *  </tbody>
   * </table>
   */
  def withCondition(condition: String): LabelSelector = js.native
  /**
   *  Specifies limit for the selector to use. For instance,
   * <code>withLimit(50)</code>
   *  returns only the first 50 entities.
   */
  def withLimit(limit: Int): LabelSelector = js.native
}