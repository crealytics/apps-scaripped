package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for
 * <a href="adwordsapp_productchannelexclusivity.html">ProductChannelExclusivity</a>
 * objects.
 */
trait ProductChannelExclusivityBuilder extends js.Object with Builder[ProductChannelExclusivity] {
  /** Specifies the bid of the product channel exclusivity. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductChannelExclusivityBuilder = js.native
  /**
   * Specifies the channel exclusivity of the new product channel exclusivity. This must be called before calling
   * <a href="adwordsapp_productchannelexclusivitybuilder.html#build_0">ProductChannelExclusivityBuilder.build()</a>
   * otherwise, creation of the
   * <a href="adwordsapp_productchannelexclusivity.html">ProductChannelExclusivity</a>
   * will fail.
   */
  def withChannelExclusivity(channelExclusivity: String): ProductChannelExclusivityBuilder = js.native
  /** Specifies the value of the product channel exclusivity. */
  def withValue(value: String): ProductChannelExclusivityBuilder = js.native
}
