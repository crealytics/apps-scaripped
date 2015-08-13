package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents a product category. */
trait ProductCategory extends ProductGroup {
  /** Returns the name of the country of the product category. */
  def getCountry(): String = js.native
  /** Returns the name of the product category. */
  def getName(): String = js.native
}
