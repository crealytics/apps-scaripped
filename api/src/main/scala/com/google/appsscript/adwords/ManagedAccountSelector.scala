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
trait ManagedAccountSelector extends js.Object with Selector[ManagedAccountSelector] with Location with OrderableSelector with HasStatistics {
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
