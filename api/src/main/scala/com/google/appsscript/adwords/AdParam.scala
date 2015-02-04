package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents an AdWords ad param.
 */
trait AdParam extends js.Object {
  /**  Returns the ad group to which this ad param belongs. */
  def getAdGroup(): AdGroup = js.native
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"AdParam"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**  Returns the index of the ad param. */
  def getIndex(): Int = js.native
  /**  Returns the insertion text of the ad param. */
  def getInsertionText(): String = js.native
  /**
   *  Returns the 
   * <a href="adwordsapp_keyword.html">Keyword</a>
   *  the ad param belongs to.
   */
  def getKeyword(): Keyword = js.native
  /**
   *  Removes the ad param from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove(): Unit = js.native
  /**
   *  Sets the insertion text of the ad param to the specified value. 
   * <p>Returns nothing.</p>
   *  
   */
  def setInsertionText(insertionText: String): Unit = js.native
}
