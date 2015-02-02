package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents an AdWords ad param.
 */
trait AdParam {
  /**  Returns the ad group to which this ad param belongs. */
  def getAdGroup: AdGroup = ???
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"AdParam"</code>
   * .
   */
  def getEntityType: String = ???
  /**  Returns the index of the ad param. */
  def getIndex: Int = ???
  /**  Returns the insertion text of the ad param. */
  def getInsertionText: String = ???
  /**
   *  Returns the 
   * <a href="adwordsapp_keyword.html">Keyword</a>
   *  the ad param belongs to.
   */
  def getKeyword: Keyword = ???
  /**
   *  Removes the ad param from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove: Unit = ???
  /**
   *  Sets the insertion text of the ad param to the specified value. 
   * <p>Returns nothing.</p>
   *  
   */
  def setInsertionText(insertionText: String): Unit = ???
}