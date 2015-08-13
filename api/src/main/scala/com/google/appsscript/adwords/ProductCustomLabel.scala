package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents a product custom label. */
trait ProductCustomLabel extends ProductGroup {
  /**
   * Returns the type of the product custom label. Possible values: *
   * <code>CUSTOM_LABEL_0</code>
   * ,
   * <code>CUSTOM_LABEL_1</code>
   * ,
   * <code>CUSTOM_LABEL_2</code>
   * ,
   * <code>CUSTOM_LABEL_3</code>
   * ,
   * <code>CUSTOM_LABEL_4</code>
   */
  def getType(): String = js.native
}
