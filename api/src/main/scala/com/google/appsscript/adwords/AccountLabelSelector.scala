package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches account labels. Supports filtering.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var accountLabelSelector = MccApp.accountLabels()
 *      .withCondition("Name CONTAINS 'priority'");
 *  var accountLabelIterator = accountLabelSelector.get();
 *  while (accountLabelIterator.hasNext()) {
 *    var accountLabel = accountLabelIterator.next();
 *  }</pre>
 */
trait AccountLabelSelector extends js.Object with Selector[AccountLabelSelector] {
  /** Fetches the requested account labels and returns an iterator. */
  def get(): AccountLabelIterator = js.native
  /**
   * Restricts this selector to return only account labels with the given account label IDs.
   * <pre class="prettyprint">
   *  var accountLabelIds = [12345, 23456, 34567];
   *  selector = selector.withIds(accountLabelIds);</pre>
   * <p>The resulting selector can be further refined by applying additional conditions to it. The ID-based condition will then be AND-ed together with all the other conditions, including any other ID-based conditions. So, for instance, the following selector: </p>
   * <pre class="prettyprint">
   *  MccApp.accountLabels()
   *     .withIds([12345, 23456, 34567])
   *     .withIds([34567, 45678, 56789]);</pre>
   * will only get the account label with ID
   * <code>34567</code>
   * , since it would be the only account label that satisfies both ID conditions.
   * <p></p>
   * <p>The selector can only support up to 10,000 IDs. If more than 10,000 IDs are specified, the corresponding get() call will fail with a runtime error.</p>
   */
  def withIds(ids: js.Array[Long]): AccountLabelSelector = js.native
}
