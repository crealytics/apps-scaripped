package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  An operation representing creation of a new phone number. Calling any method (
 * <a href="adwordsapp_phonenumberoperation.html#getErrors_0">getErrors</a>
 * ,
 * <a href="adwordsapp_phonenumberoperation.html#getResult_0">getResult</a>
 * , or
 * <a href="adwordsapp_phonenumberoperation.html#isSuccessful_0">isSuccessful</a>
 * ) will cause the operation to execute and create the phone number. To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed all the operations you want.
 */
trait PhoneNumberOperation extends js.Object {
  /**  Returns an empty array if the operation was successful, otherwise returns the list of errors encountered when trying to create the PhoneNumber. */
  def getErrors: Seq[String] = js.native
  /**
   *  Returns the newly created PhoneNumber, or
   * <code>null</code>
   *  if the operation was unsuccessful.
   */
  def getResult: PhoneNumber = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the operation was successful.
   */
  def isSuccessful: Boolean = js.native
}