package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Details passed into a callback function. The callback function is called when all the executions from an
 * <a href="mccapp_managedaccountselector.html#executeInParallel_2">ManagedAccountSelector.executeInParallel</a>
 * call finish.
 */
trait ExecutionResult extends js.Object {
  /**
   * Returns the customer ID of the account. The returned value will be in the standard AdWords format, e.g.
   * <code>'123-456-7890'</code>
   * .
   */
  def getCustomerId(): String = js.native
  /**
   * Returns
   * <code>null</code>
   * if the execution completed successfully. Otherwise, returns the encountered error.
   */
  def getError(): String = js.native
  /**
   * Returns
   * <code>null</code>
   * if no value was returned by the function that executed on the account. Otherwise, returns the value returned.
   */
  def getReturnValue(): String = js.native
  /**
   * Returns the status of the execution.
   * <p> Possible return values: </p>
   * <ul>
   *  <li><code>OK</code> - execution has finished successfully.</li>
   *  <li><code>ERROR</code> - execution has failed to finish due to an error.</li>
   *  <li><code>TIMEOUT</code> - execution has failed to finish because it ran out of time.</li>
   * </ul>
   * <p></p>
   */
  def getStatus(): String = js.native
}
