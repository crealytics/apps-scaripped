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
 * <a href="adwordsapp_productbrand.html">ProductBrand</a>
 *  objects.
 */
trait ProductBrandBuilder extends js.Object {
  /**
   *  Builds the product brand. Returns a
   * <a href="adwordsapp_productbrandoperation.html">ProductBrandOperation</a>
   *  that corresponds to the creation of the
   * <a href="adwordsapp_productbrand.html">ProductBrand</a>
   * .
   */
  def build: ProductBrandOperation = js.native
  /**  Specifies the bid of the product brand. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductBrandBuilder = js.native
  /**
   *  Specifies the name of the new product brand. If the name is unspecified before calling
   * <a href="adwordsapp_productbrandbuilder.html#build_0">ProductBrandBuilder.build()</a>
   * , the brand will fail to build.
   */
  def withName(productBrandName: String): ProductBrandBuilder = js.native
  /**  Specifies the value of the product brand. */
  def withValue(value: String): ProductBrandBuilder = js.native
}