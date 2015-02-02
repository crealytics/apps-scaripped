package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents a product brand.
 */
trait ProductBrand extends js.Object {
  /**  Returns this product group represented as a product brand. */
  def asBrand: ProductBrand = js.native
  /**  Returns this product group represented as a product category. */
  def asCategory: ProductCategory = js.native
  /**  Returns this product group represented as a product condition. */
  def asCondition: ProductCondition = js.native
  /**  Returns this product group represented as a product custom label. */
  def asCustomLabel: ProductCustomLabel = js.native
  /**  Returns this product group represented as a product item ID. */
  def asItemId: ProductItemId = js.native
  /**  Returns this product group represented as a product type. */
  def asProductType: ProductType = js.native
  /**  Returns a selector of the child product groups of this product group. */
  def children: ProductGroupSelector = js.native
  /**
   *  Converts the product group into a negative product group. Does nothing if the product group has children or is already excluded.
   * <p>Returns nothing.</p>
   *
   */
  def exclude: Unit = js.native
  /**  Returns the shopping ad group to which this product brand belongs. */
  def getAdGroup: ShoppingAdGroup = js.native
  /**  Returns the shopping campaign to which this product brand belongs. */
  def getCampaign: ShoppingCampaign = js.native
  /**
   *  Returns the dimension of the product group. Possible return values:
   * <p><code>ROOT, BRAND, CATEGORY, CONDITION, CUSTOM_LABEL, ITEM_ID, PRODUCT_TYPE</code></p>
   */
  def getDimension: String = js.native
  /**
   *  Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"ProductBrand"</code>
   * .
   */
  def getEntityType: String = js.native
  /**  Returns the ID of the product brand. */
  def getId: Long = js.native
  /**
   *  Returns the max cpc bid of the product brand, in the currency of the account. Returns
   * <code>null</code>
   *  if the
   * <a href="AdWordsApp_com.google.ads.scripty.documentation.adwordsapp.campaign.html">campaign's bidding strategy</a>
   *  is not
   * <code>MANUAL_CPC</code>
   *  or the product group is excluded.
   */
  def getMaxCpc: Double = js.native
  /**  Returns the name of the product brand. */
  def getName: String = js.native
  /**
   *  Returns stats for the specified date range. Supported values:
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example:
   * <pre class="prettyprint">
   *  var stats = productBrand.getStatsFor("THIS_MONTH");</pre>
   */
  def getStatsFor(dateRange: String): Stats = js.native
  /**
   *  Returns stats for the specified custom date range. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  form. For instance,
   * <code>March 24th, 2013</code>
   *  is represented as either
   * <code>{year: 2013, month: 3, day: 24}</code>
   *  or
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so
   * <code>forDateRange("20130324", "20130324")</code>
   *  defines a range of a single day.
   */
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = js.native
  /**
   *  Returns the value of the product brand or
   * <code>null</code>
   *  if this is the root product group.
   */
  def getValue: String = js.native
  /**
   *  Returns
   * <code>true</code>
   *  iff this product group has child product groups.
   */
  def hasChildren: Boolean = js.native
  /**
   *  Converts the product group into a positive product group. Does nothing if the product group is not excluded.
   * <p>Returns nothing.</p>
   *
   */
  def include: Unit = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if this is a negative product group.
   */
  def isExcluded: Boolean = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the product group is a catch-all product group. i.e.
   * <code>'Everything else'</code>
   * .
   */
  def isOtherCase: Boolean = js.native
  /**
   *  Returns access to the product group builder space or
   * <code>null</code>
   *  if the product group is excluded.
   */
  def newChild: ProductGroupBuilderSpace = js.native
  /**
   *  Returns the parent product group of this product group or
   * <code>null</code>
   *  if this is the root product group.
   */
  def parent: ProductGroup = js.native
  /**
   *  Removes the product brand from the account.
   * <p>Returns nothing.</p>
   *
   */
  def remove: Unit = js.native
  /**
   *  Will remove all child product groups of this product group.
   * <p>Returns nothing.</p>
   *
   */
  def removeAllChildren: Unit = js.native
  /**
   *  Sets the max cpc bid of the product group to the specified value. The change will take effect only if the
   * <a href="AdWordsApp_com.google.ads.scripty.documentation.adwordsapp.campaign.html">campaign's bidding strategy</a>
   *  is
   * <code>MANUAL_CPC</code>
   *  and the product group is not excluded.
   * <p>Returns nothing.</p>
   *
   */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}