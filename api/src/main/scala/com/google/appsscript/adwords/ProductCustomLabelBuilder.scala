package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for
 * <a href="adwordsapp_productcustomlabel.html">ProductCustomLabel</a>
 * objects.
 */
trait ProductCustomLabelBuilder extends js.Object with Builder[ProductCustomLabel] {
  /** Specifies the bid of the product custom label. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductCustomLabelBuilder = js.native
  /** Specifies the type of custom label and return the product custom label builder. */
  def withType(`type`: String): ProductCustomLabelBuilder = js.native
  /** Specifies the value of the product custom label. */
  def withValue(value: String): ProductCustomLabelBuilder = js.native
}
