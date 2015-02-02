package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  An operation representing creation of a new callout. Calling any method (
 * <a href="adwordsapp_calloutoperation.html#getErrors_0">getErrors</a>
 * ,
 * <a href="adwordsapp_calloutoperation.html#getResult_0">getResult</a>
 * , or
 * <a href="adwordsapp_calloutoperation.html#isSuccessful_0">isSuccessful</a>
 * ) will cause the operation to execute and create the callout. To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed all the operations you want.
 */
trait CalloutOperation extends js.Object {
  /**  Returns an empty array if the operation was successful, otherwise returns the list of errors encountered when trying to create the Callout. */
  def getErrors: Seq[String] = js.native
  /**
   *  Returns the newly created Callout, or
   * <code>null</code>
   *  if the operation was unsuccessful.
   */
  def getResult: Callout = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the operation was successful.
   */
  def isSuccessful: Boolean = js.native
}