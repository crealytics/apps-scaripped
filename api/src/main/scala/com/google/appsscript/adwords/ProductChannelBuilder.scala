package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for
 * <a href="adwordsapp_productchannel.html">ProductChannel</a>
 * objects.
 */
trait ProductChannelBuilder extends js.Object with Builder[ProductChannel] {
  /** Specifies the bid of the product channel. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductChannelBuilder = js.native
  /**
   * Specifies the channel of the new product channel. This must be called before calling
   * <a href="adwordsapp_productchannelbuilder.html#build_0">ProductChannelBuilder.build()</a>
   * otherwise, creation of the
   * <a href="adwordsapp_productchannel.html">ProductChannel</a>
   * will fail.
   */
  def withChannel(channel: String): ProductChannelBuilder = js.native
  /** Specifies the value of the product channel. */
  def withValue(value: String): ProductChannelBuilder = js.native
}
