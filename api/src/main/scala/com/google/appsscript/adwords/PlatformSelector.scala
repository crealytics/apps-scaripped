package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Fetches platforms. Supports filtering and sorting. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  var platformSelector = AdWordsApp.targeting()
 *      .platforms()
 *      .withCondition("Impressions &gt; 100")
 *      .forDateRange("LAST_MONTH")
 *      .orderBy("Clicks DESC");
 * 
 *  var platformIterator = platformSelector.get();
 *  while (platformIterator.hasNext()) {
 *    var platform = platformIterator.next();
 *  }</pre>
 */
trait PlatformSelector extends js.Object {
  /**  Restricts this selector to only select desktop targets. */
  def desktop(): PlatformSelector = js.native
  /**
   *  Sets a predefined date range onto the selector. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  selector.forDateRange("THIS_WEEK_SUN_TODAY");</pre>
   *  
   * <p>Date range must be specified if the selector has conditions or ordering for a stat field. Note that only the last date range specified for the selector will take effect.</p>
   */
  def forDateRange(dateRange: String): PlatformSelector = js.native
  /**
   *  Sets a custom date range onto the selector. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  form. For instance, 
   * <code>March 24th, 2013</code>
   *  is represented as either 
   * <code>{year: 2013, month: 3, day: 24}</code>
   *  or 
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so 
   * <code>forDateRange("20130324", "20130324")</code>
   *  sets the range of one day. 
   * <p>Date range must be specified if the selector has conditions or ordering for a stat field. Note that only the last date range specified for the selector will take effect.</p>
   */
  def forDateRange(dateFrom: AnyRef, dateTo: AnyRef): PlatformSelector = js.native
  /**  Fetches the requested platforms and returns an iterator. */
  def get(): PlatformIterator = js.native
  /**  Restricts this selector to only select mobile targets. */
  def mobile(): PlatformSelector = js.native
  /**
   *  Specifies the ordering of the resulting entities. 
   * <code>orderBy</code>
   *  parameter can have one of the following forms: 
   * <ul> 
   *  <li><code>orderBy("Cost")</code> - orders results by Cost, in ascending order.</li> 
   *  <li><code>orderBy("Ctr ASC")</code> - orders results by Ctr, in ascending order.</li> 
   *  <li><code>orderBy("MaxCpc DESC")</code> - orders results by MaxCpc, in descending order.</li> 
   * </ul>
   *  
   * <p>See <a href="adwordsapp_platformselector.html#withCondition_1">PlatformSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   *  
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   *  
   * <pre class="prettyprint">
   *  selector = selector.forDateRange("LAST_14_DAYS")
   *      .orderBy("Clicks DESC")
   *      .orderBy("CTR ASC");</pre>
   *  
   * <p>The results will be ordered by Clicks in descending order. Results with equal Clicks value will be ordered by Ctr in ascending order.</p>
   *  
   * <p>If a stats column is used in the ordering, date range must be specified via <a href="adwordsapp_platformselector.html#forDateRange_1">PlatformSelector.forDateRange(String)</a> or <a href="adwordsapp_platformselector.html#forDateRange_2">PlatformSelector.forDateRange(Object, Object)</a>.</p>
   *  
   * <p><code>LabelNames</code> column cannot be used for ordering.</p>
   */
  def orderBy(orderBy: String): PlatformSelector = js.native
  /**  Restricts this selector to only select tablet targets. */
  def tablet(): PlatformSelector = js.native
  /**
   *  Adds the specified condition to the selector in order to narrow down the results. 
   * <p>Multiple conditions may be added to the same selector: </p>
   * <pre class="prettyprint">
   *  selector = selector.forDateRange("LAST_MONTH")
   *      .withCondition("Clicks &gt; 5")
   *      .withCondition("Impressions &gt; 100");</pre>
   *  All specified conditions are 
   * <code>AND</code>
   * -ed together. The above example will retrieve entities that observed over 100 impressions AND more than 5 clicks. 
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
   *  <li>For <code>Integer</code> and <code>Long</code> columns (e.g. Impressions, Clicks): <strong><pre class="prettyprint">&lt;  &lt;=  &gt;  &gt;=  =  !=</pre></strong></li> 
   *  <li>For <code>Double</code> columns (e.g. Ctr, AveragePosition): <strong><pre class="prettyprint">&lt;  &gt;</pre></strong></li> 
   *  <li>For <code>String</code> columns (e.g. Name): <strong><pre class="prettyprint">=  !=  STARTS_WITH  STARTS_WITH_IGNORE_CASE  CONTAINS
   *  CONTAINS_IGNORE_CASE  DOES_NOT_CONTAIN  DOES_NOT_CONTAIN_IGNORE_CASE</pre></strong></li> 
   *  <li>For <code>Enumeration</code> columns (ones that can only take one value from a predefined list, such as Status): <strong><pre class="prettyprint">=  !=  IN []  NOT_IN []</pre></strong></li> 
   *  <li>For <code>StringSet</code> columns (e.g. LabelNames): <strong><pre class="prettyprint">CONTAINS_ALL []  CONTAINS_ANY []  CONTAINS_NONE []</pre> </strong></li> 
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
   *  withCondition("ColumnName IN [Value1, Value2]")</pre>
   *  Operators are case-sensitive: 
   * <code>starts_with</code>
   *  won't work. 
   * <h4>Columns</h4>
   *  
   * <p>All column names are case-sensitive, and so are all values of enumerated columns (such as Status).</p>
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
   *      <strong><i>Stats</i></strong>
   *     </center></td>
   *   </tr> 
   *   <tr> 
   *    <td>AverageCpc</td> 
   *    <td>Double</td> 
   *    <td><code>withCondition("AverageCpc &lt; 1.45")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>AverageCpm</td> 
   *    <td>Double</td> 
   *    <td><code>withCondition("AverageCpm &gt; 0.48")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>AveragePageviews</td> 
   *    <td>Double</td> 
   *    <td><code>withCondition("AveragePageviews &gt; 0")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>AveragePosition</td> 
   *    <td>Double</td> 
   *    <td><code>withCondition("AveragePosition &gt; 7.5")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>AverageTimeOnSite</td> 
   *    <td>Double</td> 
   *    <td><code>withCondition("AverageTimeOnSite &gt; 3.5")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>BounceRate</td> 
   *    <td>Double</td> 
   *    <td><code>withCondition("BounceRate &lt; 0.5")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>Clicks</td> 
   *    <td>Long</td> 
   *    <td><code>withCondition("Clicks &gt;= 21")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>ConversionRate</td> 
   *    <td>Double</td> 
   *    <td><code>withCondition("ConversionRate &gt; 0.1")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>Conversions</td> 
   *    <td>Long</td> 
   *    <td><code>withCondition("Conversions &lt;= 4")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>Cost</td> 
   *    <td>Double</td> 
   *    <td><code>withCondition("Cost &gt; 4.48")</code>. The value is in the currency of the account.</td> 
   *   </tr> 
   *   <tr> 
   *    <td>Ctr</td> 
   *    <td>Double</td> 
   *    <td><code>withCondition("Ctr &gt; 0.01")</code>. Note that Ctr is returned in <code>0..1</code> range, so 5% Ctr is represented as 0.05.</td> 
   *   </tr> 
   *   <tr> 
   *    <td>Impressions</td> 
   *    <td>Long</td> 
   *    <td><code>withCondition("Impressions != 0")</code></td> 
   *   </tr> 
   *  </tbody>
   * </table>
   *  
   * <p>If a stats column is used in the condition, date range must be specified via <a href="adwordsapp_platformselector.html#forDateRange_1">PlatformSelector.forDateRange(String)</a> or <a href="adwordsapp_platformselector.html#forDateRange_2">PlatformSelector.forDateRange(Object, Object)</a>. </p>
   */
  def withCondition(condition: String): PlatformSelector = js.native
  /**
   *  Restricts this selector to return only platforms with the given platform IDs. 
   * <p>All platforms are uniquely identified by the combination of their campaign ID and platform ID. The IDs for this selector are thus represented as two-element arrays, with the first element being the campaign ID and the second being the platform ID: </p>
   * <pre class="prettyprint">
   *  var platformIds = [
   *    [12345, 987987],
   *    [23456, 876876],
   *    [34567, 765765],
   *  ];
   *  selector = selector.withIds(platformIds);</pre>
   * <p></p>
   *  
   * <p>In cases where the campaign ID is already known, the IDs for this selector can then be just an array of platform IDs. Any provided campaign ID and platform ID combination will override the embedded campaign ID. For instance, the following will select the platforms with the given platform IDs in the given campaign: </p>
   * <pre class="prettyprint">
   *  var ids = [12345, 23456, 34567];
   *  var platforms = campaign.targeting().platforms().withIds(ids);</pre>
   * <p></p>
   *  
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
   *  AdWordsApp.platforms()
   *     .withIds(ids1)
   *     .withIds(ids2);</pre>
   *  will only get the platform with ID 
   * <code>[34567, 765765]</code>
   * , since it would be the only platform that satisfies both ID conditions.
   * <p></p>
   */
  def withIds(ids: Seq[Seq[Long]]): PlatformSelector = js.native
  /**
   *  Specifies limit for the selector to use. For instance, 
   * <code>withLimit(50)</code>
   *  returns only the first 50 entities.
   */
  def withLimit(limit: Int): PlatformSelector = js.native
}