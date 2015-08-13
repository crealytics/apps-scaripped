package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for a shopping ad group under construction.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var shoppingAdGroupBuilder = campaign.newAdGroupBuilder();
 *  var shoppingAdGroupOperation = shoppingAdGroupBuilder
 *     .withName("shopping ad group name")
 *     .withStatus("PAUSED")
 *     .build();
 *  var shoppingAdGroup = shoppingAdGroupOperation.getResult();</pre>
 */
trait ShoppingAdGroupBuilder extends Builder[ShoppingAdGroup] {
  /**
   * Creates a
   * <a href="adwordsapp_shoppingadgroup.html">ShoppingAdGroup</a>
   * . Returns a
   * <a href="adwordsapp_shoppingadgroupoperation.html">ShoppingAdGroupOperation</a>
   * that can be used to get the new shopping ad group (or access any associated errors if creation failed).
   */
  override def build(): Operation[ShoppingAdGroup] = js.native
  /** Sets the bidding strategy of the new shopping ad group to the specified value. */
  def withBiddingStrategy(biddingStrategy: BiddingStrategy): ShoppingAdGroupBuilder = js.native
  /** Sets the max CPC bid of the new shopping ad group to the specified value. */
  def withCpc(cpc: Double): ShoppingAdGroupBuilder = js.native
  /** Sets the name of the new shopping ad group to the specified value. If ad group name is not set, the shopping ad group will assume a default name ('Ad Group #5'). */
  def withName(name: String): ShoppingAdGroupBuilder = js.native
  /**
   * Sets the status of the new shopping ad group to the specified value. If the status is not set, it will default to
   * <code>ENABLED</code>
   * .
   */
  def withStatus(status: String): ShoppingAdGroupBuilder = js.native
}
