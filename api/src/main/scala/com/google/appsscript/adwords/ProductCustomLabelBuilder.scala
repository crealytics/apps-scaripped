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
 * <a href="adwordsapp_productcustomlabel.html">ProductCustomLabel</a>
 *  objects.
 */
trait ProductCustomLabelBuilder {
  /**
   *  Builds the product custom label. Returns a 
   * <a href="adwordsapp_productcustomlabeloperation.html">ProductCustomLabelOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_productcustomlabel.html">ProductCustomLabel</a>
   * .
   */
  def build: ProductCustomLabelOperation = ???
  /**  Specifies the bid of the product custom label. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductCustomLabelBuilder = ???
  /**  Specifies the type of custom label and return the product custom label builder. */
  def withType(`type`: String): ProductCustomLabelBuilder = ???
  /**  Specifies the value of the product custom label. */
  def withValue(value: String): ProductCustomLabelBuilder = ???
}