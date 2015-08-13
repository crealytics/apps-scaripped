package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for
 * <a href="adwordsapp_producttype.html">ProductType</a>
 * objects.
 */
trait ProductTypeBuilder extends ProductGroupBuilder[ProductTypeOperation] {
  /** Specifies the bid of the product type. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductTypeBuilder = js.native
  /** Specifies the value of the product type. */
  def withValue(value: String): ProductTypeBuilder = js.native
}
