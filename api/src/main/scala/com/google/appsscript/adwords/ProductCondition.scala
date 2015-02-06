package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents a product condition.
 */
trait ProductCondition extends ProductGroup {
  /**
   *  Returns the name of the product condition. Possible values: 
   * <code>NEW</code>
   * , 
   * <code>USED</code>
   * , 
   * <code>REFURBISHED</code>
   */
  def getCondition(): String = js.native
}
