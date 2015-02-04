package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Fetches negative keywords (except from shared libraries). 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  var adGroup = AdWordsApp.adGroups().get().next();
 *  var negativeKeywordSelector = adGroup.negativeKeywords();
 * 
 *  var negativeKeywordIterator = negativeKeywordSelector.get();
 *  while (negativeKeywordIterator.hasNext()) {
 *    var negativeKeyword = negativeKeywordIterator.next();
 *  }</pre>
 */
trait NegativeKeywordSelector extends js.Object {
  /**  Fetches the requested negative keywords and returns an iterator. */
  def get(): NegativeKeywordIterator = js.native
  /**
   *  Specifies the ordering of the resulting entities. 
   * <code>orderBy</code>
   *  parameter can have one of the following forms: 
   * <ul> 
   *  <li><code>orderBy("Text")</code> - orders results by Text, in ascending order.</li> 
   *  <li><code>orderBy("Text ASC")</code> - orders results by Text, in ascending order.</li> 
   *  <li><code>orderBy("Text DESC")</code> - orders results by Text, in descending order.</li> 
   * </ul>
   *  
   * <p>See <a href="adwordsapp_negativekeywordselector.html#withCondition_1">NegativeKeywordSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   *  
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   *  
   * <pre class="prettyprint">
   *  selector = selector.
   *      .orderBy("Text")
   *      .orderBy("KeywordMatchType");</pre>
   *  
   * <p>The results will be ordered by Text in ascending order. Results with equal Text value will be ordered by KeywordMatchType in ascending order.</p>
   */
  def orderBy(orderBy: String): NegativeKeywordSelector = js.native
  /**
   *  Adds the specified condition to the selector in order to narrow down the results. 
   * <p>Multiple conditions may be added to the same selector: </p>
   * <pre class="prettyprint">
   *  selector = selector
   *      .withCondition("Text STARTS_WITH 'a'")
   *      .withCondition("KeywordMatchType = BROAD");</pre>
   *  All specified conditions are 
   * <code>AND</code>
   * -ed together. The above example will retrieve negative keywords that start with the letter 'a' and are of broad match type. 
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
   *  <li>For <code>String</code> columns (e.g. Text): <strong><pre class="prettyprint">=  !=  STARTS_WITH  STARTS_WITH_IGNORE_CASE  CONTAINS
   *  CONTAINS_IGNORE_CASE  DOES_NOT_CONTAIN  DOES_NOT_CONTAIN_IGNORE_CASE</pre></strong></li> 
   *  <li>For <code>Enumeration</code> columns (ones that can only take one value from a pre-defined list, such as KeywordMatchType): <strong><pre class="prettyprint">=  !=  IN []  NOT_IN []</pre></strong></li> 
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
   *  withCondition("KeywordMatchType IN [Value1, Value2]")</pre>
   *  Operators are case-sensitive: 
   * <code>starts_with</code>
   *  won't work. 
   * <h4>Columns</h4>
   *  
   * <p>All column names are case-sensitive, and so are all values of enumerated columns (such as KeywordMatchType)</p>
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
   *      <strong><i> Negative keyword attributes </i></strong>
   *     </center></td>
   *   </tr> 
   *   <tr> 
   *    <td>Text</td> 
   *    <td>String</td> 
   *    <td><code>withCondition("Text STARTS_WITH 'leather'")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>KeywordMatchType</td> 
   *    <td>Enumeration: <code>BROAD</code>, <code>EXACT</code>, <code>PHRASE</code></td> 
   *    <td><code>withCondition("KeywordMatchType = PHRASE")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>AdGroupName</td> 
   *    <td>String</td> 
   *    <td><code>withCondition("AdGroupName CONTAINS_IGNORE_CASE 'shoes'")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>AdGroupStatus</td> 
   *    <td>Enumeration: <code>ENABLED</code>, <code>PAUSED</code>, <code>REMOVED</code></td> 
   *    <td><code>withCondition("AdGroupStatus = ENABLED")</code>. Use to fetch negative keywords from only <code>ENABLED</code> ad groups.</td> 
   *   </tr> 
   *   <tr> 
   *    <td>CampaignName</td> 
   *    <td>String</td> 
   *    <td><code>withCondition("CampaignName CONTAINS_IGNORE_CASE 'promotion'")</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>CampaignStatus</td> 
   *    <td>Enumeration: <code>ENABLED</code>, <code>PAUSED</code>, <code>REMOVED</code></td> 
   *    <td><code>withCondition("CampaignStatus = ENABLED")</code>. Use to fetch negative keywords from only <code>ENABLED</code> campaigns.</td> 
   *   </tr> 
   *  </tbody>
   * </table>
   */
  def withCondition(condition: String): NegativeKeywordSelector = js.native
  /**
   *  Specifies limit for the selector to use. For instance, 
   * <code>withLimit(50)</code>
   *  returns only the first 50 entities.
   */
  def withLimit(limit: Int): NegativeKeywordSelector = js.native
}
