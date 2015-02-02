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
 * <a href="adwordsapp_productitemid.html">ProductItemId</a>
 *  objects.
 */
trait ProductItemIdBuilder {
  /**
   *  Builds the product item id. Returns a 
   * <a href="adwordsapp_productitemidoperation.html">ProductItemIdOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_productitemid.html">ProductItemId</a>
   * .
   */
  def build: ProductItemIdOperation = ???
  /**  Specifies the bid of the product item id. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductItemIdBuilder = ???
  /**  Specifies the value of the product item id. */
  def withValue(value: String): ProductItemIdBuilder = ???
}