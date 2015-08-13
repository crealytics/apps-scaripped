package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents a product type. */
trait ProductType extends ProductGroup {
  /** Returns the name of the product type. */
  def getType(): String = js.native
}
