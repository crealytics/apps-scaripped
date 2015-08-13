package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches accounts (not including AdWords Express accounts). Supports filtering and sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var accountSelector = MccApp
 *      .accounts()
 *      .withCondition("Impressions &gt; 100")
 *      .forDateRange("LAST_MONTH")
 *      .orderBy("Clicks DESC");
 *  var accountIterator = accountSelector.get();
 *  while (accountIterator.hasNext()) {
 *    var account = accountIterator.next();
 *  }</pre>
 */
trait ManagedAccountSelector extends Selector[ManagedAccountSelector] {
  /**
   * Executes the function specified by
   * <code>functionName</code>
   * on each
   * <a href="mccapp_managedaccount.html">ManagedAccount</a>
   * that the
   * <code>AccountSelector</code>
   * matches. Once all the accounts have been processed, the callback function, if specified by
   * <code>optionalCallbackFunctionName</code>
   * , is executed once. The input, if specified by
   * <code>optionalInput</code>
   * , will be passed into the function specified by
   * <code>functionName</code>
   * . For example,
   * <pre class="prettyprint">
   *  accountSelector.executeInParallel(functionName, optionalCallbackFunctionName,
   *                                    optionalInput)</pre>
   * The input can then be accessed in the function like this:
   * <pre class="prettyprint">
   *  function functionName(optionalInput) {
   *    Logger.log(optionalInput);
   *  }</pre>
   * <p>The function specified by <code>functionName</code> can optionally return a string. For example, </p>
   * <ul>
   *  <li><code>return "Account name";</code></li>
   *  <li><code>return "$100.22";</code></li>
   *  <li><code>return "client@companyA.com";</code></li>
   *  <li><code>return "5";</code></li>
   * </ul>
   * <p></p>
   * <p><code>JSON.stringify(value)</code> can be used to convert a value to JSON and then return the string. For example, </p>
   * <pre class="prettyprint">
   *  return JSON.stringify({value:10, list:[1,2,3,4,5,6], name: "Joe Smith"});</pre>
   * <p></p>
   * <p>These will be passed into the callback function in a list of <a href="mccapp_executionresult.html">ExecutionResult</a> objects. If <code>JSON.stringify(value)</code> is used in the callback function, the value can then be turned back into a JavaScript object with <code>JSON.parse(returnValue)</code>. For example, </p>
   * <pre class="prettyprint">
   *  function optionalCallbackFunctionName(results) {
   *    for (var i = 0; i &lt; results.length; i++) {
   *      object = JSON.parse(results[i].getReturnValue());
   *    }
   *  }</pre>
   * <p></p>
   * <p><code>executeInParallel</code> can operate simultaneously on up to 50 accounts. If the selector contains more than 50 accounts, an exception is thrown and no accounts are processed. You can limit the number of accounts for the <code>executeInParallel</code> method using <code>accountSelector.withLimit(accountLimit)</code>.</p>
   * <p>The signature for the <code>optionalCallbackFunctionName</code> should be: </p>
   * <pre class="prettyprint">
   *  function callbackMethod(/*ExecutionResult[]*/ results) {
   *  }</pre>
   * <p></p>
   * <p>Returns nothing.</p>
   */
  def executeInParallel(functionName: String, optionalCallbackFunctionName: String, optionalInput: String): Unit = js.native
  /**
   * Sets a custom date range onto the selector. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * form. For instance,
   * <code>March 24th, 2013</code>
   * is represented as either
   * <code>{year: 2013, month: 3, day: 24}</code>
   * or
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so
   * <code>forDateRange("20130324", "20130324")</code>
   * sets the range of one day.
   * <p>Date range must be specified if the selector has conditions or ordering for a stat field. Note that only the last date range specified for the selector will take effect.</p>
   * <aside class="warning">
   *   Note that managed accounts only keep stats for the most recent 90 days. Statistics older than 90 days come back as
   *  <code>0</code>.
   * </aside>
   */
  def forDateRange(dateFrom: AnyRef, dateTo: AnyRef): ManagedAccountSelector = js.native
  /** Fetches the requested accounts and returns an iterator. */
  def get(): ManagedAccountIterator = js.native
  /**
   * Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   * parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("Cost")</code> - orders results by Cost, in ascending order.</li>
   *  <li><code>orderBy("Ctr ASC")</code> - orders results by Ctr, in ascending order.</li>
   *  <li><code>orderBy("MaxCpc DESC")</code> - orders results by MaxCpc, in descending order.</li>
   * </ul>
   * <p>See <a href="mccapp_managedaccountselector.html#withCondition_1">ManagedAccountSelector.withCondition(String)</a> for enumeration of columns that can be used.</p>
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   * <pre class="prettyprint">
   *  selector = selector.forDateRange("LAST_14_DAYS")
   *      .orderBy("Clicks DESC")
   *      .orderBy("CTR ASC");</pre>
   * <p>The results will be ordered by Clicks in descending order. Results with equal Clicks value will be ordered by Ctr in ascending order.</p>
   * <p>If a stats column is used in the ordering, date range must be specified via <a href="mccapp_managedaccountselector.html#forDateRange_1">ManagedAccountSelector.forDateRange(String)</a> or <a href="mccapp_managedaccountselector.html#forDateRange_2">ManagedAccountSelector.forDateRange(Object, Object)</a>.</p>
   * <p><code>LabelNames</code> column cannot be used for ordering.</p>
   */
  def orderBy(orderBy: String): ManagedAccountSelector = js.native
  /**
   * Adds the specified condition to the selector in order to narrow down the results.
   * <p>Multiple conditions may be added to the same selector: </p>
   * <pre class="prettyprint">
   *  selector = selector.forDateRange("LAST_MONTH")
   *      .withCondition("Clicks &gt; 5")
   *      .withCondition("Impressions &gt; 100");</pre>
   * All specified conditions are
   * <code>AND</code>
   * -ed together. The above example will retrieve entities that observed over 100 impressions AND more than 5 clicks.
   * <p></p>
   * <p>The parameter to be passed into this method must be of the following form: </p>
   * <pre class="prettyprint">
   *  "COLUMN_NAME OPERATOR VALUE"</pre>
   * <p></p>
   * <h4>Operators</h4>
   * The operator that can be used in a condition depends on the type of column.
   * <ul>
   *  <li>For <code>Integer</code> and <code>Long</code> columns (e.g. Impressions, Clicks): <strong><pre class="prettyprint">&lt;  &lt;=  &gt;  &gt;=  =  !=</pre></strong></li>
   *  <li>For <code>Double</code> columns (e.g. Ctr, AveragePosition): <strong><pre class="prettyprint">&lt;  &gt;</pre></strong></li>
   *  <li>For <code>String</code> columns (e.g. Name): <strong><pre class="prettyprint">=  !=  STARTS_WITH  STARTS_WITH_IGNORE_CASE  CONTAINS
   *  CONTAINS_IGNORE_CASE  DOES_NOT_CONTAIN  DOES_NOT_CONTAIN_IGNORE_CASE</pre></strong></li>
   *  <li>For <code>Enumeration</code> columns (ones that can only take one value from a predefined list, such as Status): <strong><pre class="prettyprint">=  !=  IN []  NOT_IN []</pre></strong></li>
   *  <li>For <code>Array</code> columns (e.g. LabelNames): <strong><pre class="prettyprint">CONTAINS  DOES_NOT_CONTAIN</pre> </strong><p>e.g., <code>LabelNames CONTAINS 'ACCOUNT_LABEL'</code></p></li>
   * </ul>
   * Conditions using
   * <code>IN</code>
   * ,
   * <code>NOT_IN</code>
   * ,
   * <code>CONTAINS</code>
   * , and
   * <code>DOES_NOT_CONTAIN</code>
   * operators look as follows:
   * <pre class="prettyprint">
   *  withCondition("ColumnName IN [Value1, Value2]")</pre>
   * Operators are case-sensitive:
   * <code>starts_with</code>
   * won't work.
   * <h4>Columns</h4>
   * <p>All column names are case-sensitive, and so are all values of enumerated columns (such as Status).</p>
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
   *    <td>ClickConversionRate</td>
   *    <td>Double</td>
   *    <td><code>withCondition("ClickConversionRate &gt; 0.1")</code></td>
   *   </tr>
   *   <tr>
   *    <td>Clicks</td>
   *    <td>Long</td>
   *    <td><code>withCondition("Clicks &gt;= 21")</code></td>
   *   </tr>
   *   <tr>
   *    <td>ConvertedClicks</td>
   *    <td>Long</td>
   *    <td><code>withCondition("ConvertedClicks &lt;= 4")</code></td>
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
   *   <tr>
   *    <td>LabelNames</td>
   *    <td>Array</td>
   *    <td><code>withCondition("LabelNames CONTAINS 'priority'")</code></td>
   *   </tr>
   *   <tr>
   *    <td>ManagerCustomerId</td>
   *    <td>Account ID</td>
   *    <td><code>withCondition("ManagerCustomerId IN ['123-456-7890']")</code> or <code>withCondition("ManagerCustomerId IN [1234567890]")</code>. Used to select child accounts belonging to a specific submanager.</td>
   *   </tr>
   *  </tbody>
   * </table>
   * <p>If a stats column is used in the condition, date range must be specified via <a href="mccapp_managedaccountselector.html#forDateRange_1">ManagedAccountSelector.forDateRange(String)</a> or <a href="mccapp_managedaccountselector.html#forDateRange_2">ManagedAccountSelector.forDateRange(Object, Object)</a>. </p>
   */
  override def withCondition(condition: String): ManagedAccountSelector = js.native
  /**
   * Restricts this selector to return only customers with the given customer IDs.
   * <pre class="prettyprint">
   *  var customerIds = ['123-456-7890', '234-567-8901', '345-678-9012'];
   *  selector = selector.withIds(customerIds);</pre>
   * <p>The resulting selector can be further refined by applying additional conditions to it. The ID-based condition will then be AND-ed together with all the other conditions, including any other ID-based conditions. So, for instance, the following selector: </p>
   * <pre class="prettyprint">
   *  MccApp.accounts()
   *     .withIds(['123-456-7890', '234-567-8901', '345-678-9012'])
   *     .withIds(['345-678-9012', '456-789-0123', '567-890-1234']);</pre>
   * will only get the customer with ID
   * <code>345-678-9012</code>
   * , since it would be the only customer that satisfies both ID conditions.
   * <p></p>
   * <p>The customer IDs can be passed in either as numbers, or as hyphen-separated strings. The following two calls do the same thing: </p>
   * <pre class="prettyprint">
   *  accounts.withIds(['123-456-7890', '234-567-8901', '345-678-9012']);
   *  accounts.withIds([1234567890, 2345678901, 3456789012]);</pre>
   * <p></p>
   * <aside class="warning">
   *   Note that only single-customer (non-MCC) accounts can be selected by ID. To select all accounts under a submanager, instead specify a condition on
   *  <code>ManagerCustomerId</code>; e.g.
   *  <code>withCondition("ManagerCustomerId IN ['123-456-7890']")</code>
   * </aside>
   */
  def withIds(ids: js.Array[Long]): ManagedAccountSelector = js.native
}
