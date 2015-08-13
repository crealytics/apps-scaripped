package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents a product item ID. */
trait ProductItemId extends js.Object {
  /** Returns a selector of the child product groups of this product item id. */
  def children(): ProductGroupSelector = js.native
  /**
   * Converts the product item id into a negative product item id. Does nothing if the product item id has children or is already excluded.
   * <p>Returns nothing.</p>
   */
  def exclude(): Unit = js.native
  /** Returns the shopping ad group to which this product item id belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  /** Returns the shopping campaign to which this product item id belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"ProductItemId"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the product item id. */
  def getId(): Long = js.native
  /**
   * Returns the max cpc bid of the product item id, in the currency of the account. Returns
   * <code>null</code>
   * if the
   * <a href="AdWordsApp_com.google.ads.scripty.documentation.adwordsapp.campaign.html">campaign's bidding strategy</a>
   * is not
   * <code>MANUAL_CPC</code>
   * or the product item id is excluded.
   */
  def getMaxCpc(): Double = js.native
  /**
   * Returns stats for the specified custom date range. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * form. For instance,
   * <code>March 24th, 2013</code>
   * is represented as either
   * <code>{year: 2013, month: 3, day: 24}</code>
   * or
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so
   * <code>forDateRange("20130324", "20130324")</code>
   * defines a range of a single day.
   */
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = js.native
  /**
   * Returns the value of the product item id or
   * <code>null</code>
   * if this is the root product group.
   */
  def getValue(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * iff this product item id has child product groups.
   */
  def hasChildren(): Boolean = js.native
  /**
   * Converts the product item id into a positive product item id. Does nothing if the product item id is not excluded.
   * <p>Returns nothing.</p>
   */
  def include(): Unit = js.native
  /**
   * Returns
   * <code>true</code>
   * if this is an excluded product item id.
   */
  def isExcluded(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the product item id is a catch-all product item id. i.e.
   * <code>'Everything else'</code>
   * .
   */
  def isOtherCase(): Boolean = js.native
  /**
   * Returns access to the product group builder space or
   * <code>null</code>
   * if the product item id is excluded.
   */
  def newChild(): ProductGroupBuilderSpace = js.native
  /**
   * Returns the parent product group of this product item id or
   * <code>null</code>
   * if this is the root product group.
   */
  def parent(): ProductGroup = js.native
  /**
   * Removes the product item id.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
  /**
   * Will remove all child product groups of this product item id.
   * <p>Returns nothing.</p>
   */
  def removeAllChildren(): Unit = js.native
  /**
   * Sets the max cpc bid of the product item id to the specified value. The change will take effect only if the
   * <a href="AdWordsApp_com.google.ads.scripty.documentation.adwordsapp.campaign.html">campaign's bidding strategy</a>
   * is
   * <code>MANUAL_CPC</code>
   * and the product item id is not excluded.
   * <p>Returns nothing.</p>
   */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
