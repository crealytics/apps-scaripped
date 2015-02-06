package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Builder for 
 * <a href="adwordsapp_productcategory.html">ProductCategory</a>
 *  objects.
 */
trait ProductCategoryBuilder extends ProductGroupBuilder[ProductCategoryOperation] {
  /**  Specifies the bid of the product category. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductCategoryBuilder = js.native
  /**  Specifies the name of the new product category. If the name is unspecified before calling 'build', the category will fail to build. */
  def withName(productCategoryName: String): ProductCategoryBuilder = js.native
  /**  Specifies the value of the product category. */
  def withValue(value: String): ProductCategoryBuilder = js.native
}
