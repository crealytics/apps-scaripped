package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Builder for 
 * <a href="adwordsapp_productcondition.html">ProductCondition</a>
 *  objects.
 */
trait ProductConditionBuilder {
  /**
   *  Builds the product condition. Returns a 
   * <a href="adwordsapp_productconditionoperation.html">ProductConditionOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_productcondition.html">ProductCondition</a>
   * .
   */
  def build: ProductConditionOperation = ???
  /**  Specifies the bid of the product condition. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductConditionBuilder = ???
  /**  Specifies the condition of the new product condition. If the condition is unspecified before calling 'build', the condition will fail to build. */
  def withCondition(condition: String): ProductConditionBuilder = ???
  /**  Specifies the value of the product condition. */
  def withValue(value: String): ProductConditionBuilder = ???
}