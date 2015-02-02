package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

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
trait ProductGroupBuilderSpace {
  /**  Returns a product brand builder. */
  def brandBuilder: ProductBrandBuilder = ???
  /**  Returns a product category builder. */
  def categoryBuilder: ProductCategoryBuilder = ???
  /**  Returns a product condition builder. */
  def conditionBuilder: ProductConditionBuilder = ???
  /**  Returns a product custom label builder. */
  def customLabelBuilder: ProductCustomLabelBuilder = ???
  /**  Returns a product item ID builder. */
  def itemIdBuilder: ProductItemIdBuilder = ???
  /**  Returns a product type builder. */
  def productTypeBuilder: ProductTypeBuilder = ???
}