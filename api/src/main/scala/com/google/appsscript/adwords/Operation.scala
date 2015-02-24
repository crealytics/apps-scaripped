package com.google.appsscript.adwords

import scala.scalajs.js

/** Unknown type which is not further specified in API */
trait Operation[T] extends js.Object {
  /**  Returns an empty array if the operation was successful, otherwise returns the list of errors encountered when trying to create the AdCustomizerItem. */
  def getErrors(): js.Array[String] = js.native
  /**
   *  Returns the newly created item, or
   * <code>null</code>
   *  if the operation was unsuccessful.
   */
  def getResult(): T = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the operation was successful.
   */
  def isSuccessful(): Boolean = js.native

}
