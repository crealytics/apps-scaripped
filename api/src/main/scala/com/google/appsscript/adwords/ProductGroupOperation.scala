package com.google.appsscript.adwords
import scala.scalajs.js

trait ProductGroupOperation[T] extends js.Object {
  /**  Returns an empty array if the operation was successful, otherwise returns the list of errors encountered when trying to create the ProductItemId. */
  def getErrors(): Seq[String] = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the operation was successful.
   */
  def isSuccessful(): Boolean = js.native
  /**
   *  Returns the newly created group, or 
   * <code>null</code>
   *  if the operation was unsuccessful.
   */
  def getResult(): T = js.native
}