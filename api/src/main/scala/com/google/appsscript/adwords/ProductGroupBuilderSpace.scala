package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Access to product group builders via the 
 * <a href="adwordsapp_productgroup.html#newChild_0">ProductGroup.newChild()</a>
 *  method. 
 * <p>For instance, to create a new product category, you might use:</p>
 *  
 * <pre class="prettyprint">
 *  var root = AdWordsApp.shoppingAdGroups().get().next().rootProductGroup();
 *  root.newChild().categoryBuilder().withName('Electronics').build();</pre>
 */
trait ProductGroupBuilderSpace extends js.Object {
  /**  Returns a product brand builder. */
  def brandBuilder(): ProductBrandBuilder = js.native
  /**  Returns a product category builder. */
  def categoryBuilder(): ProductCategoryBuilder = js.native
  /**  Returns a product condition builder. */
  def conditionBuilder(): ProductConditionBuilder = js.native
  /**  Returns a product custom label builder. */
  def customLabelBuilder(): ProductCustomLabelBuilder = js.native
  /**  Returns a product item ID builder. */
  def itemIdBuilder(): ProductItemIdBuilder = js.native
  /**  Returns a product type builder. */
  def productTypeBuilder(): ProductTypeBuilder = js.native
}