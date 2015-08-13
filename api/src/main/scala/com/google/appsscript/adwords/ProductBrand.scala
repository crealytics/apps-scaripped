package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents a product brand. */
trait ProductBrand extends js.Object with HasStatistics {
  /** Returns a selector of the child product groups of this product brand. */
  def children(): ProductGroupSelector = js.native
  /**
   * Converts the product brand into a negative product brand. Does nothing if the product brand has children or is already excluded.
   * <p>Returns nothing.</p>
   */
  def exclude(): Unit = js.native
  /** Returns the shopping ad group to which this product brand belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  /** Returns the shopping campaign to which this product brand belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"ProductBrand"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the product brand. */
  def getId(): Long = js.native
  /**
   * Returns the max cpc bid of the product brand, in the currency of the account. Returns
   * <code>null</code>
   * if the
   * <a href="AdWordsApp_com.google.ads.scripty.documentation.adwordsapp.campaign.html">campaign's bidding strategy</a>
   * is not
   * <code>MANUAL_CPC</code>
   * or the product brand is excluded.
   */
  def getMaxCpc(): Double = js.native
  /** Returns the name of the product brand. */
  def getName(): String = js.native
  /**
   * Returns the value of the product brand or
   * <code>null</code>
   * if this is the root product group.
   */
  def getValue(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * iff this [description.entityName] has child product groups.
   */
  def hasChildren(): Boolean = js.native
  /**
   * Converts the product brand into a positive product brand. Does nothing if the product brand is not excluded.
   * <p>Returns nothing.</p>
   */
  def include(): Unit = js.native
  /**
   * Returns
   * <code>true</code>
   * if this is an excluded product brand.
   */
  def isExcluded(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the product brand is a catch-all product brand. i.e.
   * <code>'Everything else'</code>
   * .
   */
  def isOtherCase(): Boolean = js.native
  /**
   * Returns access to the product group builder space or
   * <code>null</code>
   * if the product brand is excluded.
   */
  def newChild(): ProductGroupBuilderSpace = js.native
  /**
   * Returns the parent product group of this product brand or
   * <code>null</code>
   * if this is the root product group.
   */
  def parent(): ProductGroup = js.native
  /**
   * Removes the product brand.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
  /**
   * Will remove all child product groups of this product brand.
   * <p>Returns nothing.</p>
   */
  def removeAllChildren(): Unit = js.native
  /**
   * Sets the max cpc bid of the product brand to the specified value. The change will take effect only if the
   * <a href="AdWordsApp_com.google.ads.scripty.documentation.adwordsapp.campaign.html">campaign's bidding strategy</a>
   * is
   * <code>MANUAL_CPC</code>
   * and the product brand is not excluded.
   * <p>Returns nothing.</p>
   */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
