package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Fetches account labels. Supports filtering. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  var accountLabelSelector = MccApp.accountLabels()
 *      .withCondition("Name CONTAINS 'priority'");
 * 
 *  var accountLabelIterator = accountLabelSelector.get();
 *  while (accountLabelIterator.hasNext()) {
 *    var accountLabel = accountLabelIterator.next();
 *  }</pre>
 */
trait AccountLabelSelector extends Selector[AccountLabelSelector] {
  /**  Fetches the requested account labels and returns an iterator. */
  def get(): AccountLabelIterator = js.native
  /**
   *  Adds the specified condition to the selector in order to narrow down the results. 
   * <p>Multiple conditions may be added to the same selector: </p>
   * <pre class="prettyprint">
   *  selector = selector
   *      .withCondition("Name CONTAINS 'PRIORITY'")
   *      .withCondition("Name DOES_NOT_CONTAIN 'FINISHED'");</pre>
   *  All specified conditions are 
   * <code>AND</code>
   * -ed together. The above example will retrieve labels whose name contains PRIORITY but doesn't contain FINISHED. 
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
   *  </tbody>
   * </table>
   */
  override def withCondition(condition: String): AccountLabelSelector = js.native
  /**
   *  Restricts this selector to return only account labels with the given account label IDs. 
   * <pre class="prettyprint">
   *  var accountLabelIds = [12345, 23456, 34567];
   *  selector = selector.withIds(accountLabelIds);</pre>
   *  
   * <p>The resulting selector can be further refined by applying additional conditions to it. The ID-based condition will then be AND-ed together with all the other conditions, including any other ID-based conditions. So, for instance, the following selector: </p>
   * <pre class="prettyprint">
   *  MccApp.accountLabels()
   *     .withIds([12345, 23456, 34567])
   *     .withIds([34567, 45678, 56789]);</pre>
   *  will only get the account label with ID 
   * <code>34567</code>
   * , since it would be the only account label that satisfies both ID conditions.
   * <p></p>
   */
  def withIds(ids: Seq[Long]): AccountLabelSelector = js.native
}
