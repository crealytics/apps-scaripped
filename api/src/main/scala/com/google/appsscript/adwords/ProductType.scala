package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents a product type. */
trait ProductType extends js.Object with HasStatistics {
  /** Returns a selector of the child product groups of this product type. */
  def children(): ProductGroupSelector = js.native
  /**
   * Converts the product type into a negative product type. Does nothing if the product type has children or is already excluded.
   * <p>Returns nothing.</p>
   */
  def exclude(): Unit = js.native
  /** Returns the shopping ad group to which this product type belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  /** Returns the shopping campaign to which this product type belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"ProductType"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the product type. */
  def getId(): Long = js.native
  /**
   * Returns the max cpc bid of the product type, in the currency of the account. Returns
   * <code>null</code>
   * if the
   * <a href="AdWordsApp_com.google.ads.scripty.documentation.adwordsapp.campaign.html">campaign's bidding strategy</a>
   * is not
   * <code>MANUAL_CPC</code>
   * or the product type is excluded.
   */
  def getMaxCpc(): Double = js.native
  /** Returns the name of the product type. */
  def getType(): String = js.native
  /**
   * Returns the value of the product type or
   * <code>null</code>
   * if this is the root product group.
   */
  def getValue(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * iff this product type has child product groups.
   */
  def hasChildren(): Boolean = js.native
  /**
   * Converts the product type into a positive product type. Does nothing if the product type is not excluded.
   * <p>Returns nothing.</p>
   */
  def include(): Unit = js.native
  /**
   * Returns
   * <code>true</code>
   * if this is an excluded product type.
   */
  def isExcluded(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the product type is a catch-all product type. i.e.
   * <code>'Everything else'</code>
   * .
   */
  def isOtherCase(): Boolean = js.native
  /**
   * Returns access to the product group builder space or
   * <code>null</code>
   * if the product type is excluded.
   */
  def newChild(): ProductGroupBuilderSpace = js.native
  /**
   * Returns the parent product group of this product type or
   * <code>null</code>
   * if this is the root product group.
   */
  def parent(): ProductGroup = js.native
  /**
   * Removes the product type.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
  /**
   * Will remove all child product groups of this product type.
   * <p>Returns nothing.</p>
   */
  def removeAllChildren(): Unit = js.native
  /**
   * Sets the max cpc bid of the product type to the specified value. The change will take effect only if the
   * <a href="AdWordsApp_com.google.ads.scripty.documentation.adwordsapp.campaign.html">campaign's bidding strategy</a>
   * is
   * <code>MANUAL_CPC</code>
   * and the product type is not excluded.
   * <p>Returns nothing.</p>
   */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
