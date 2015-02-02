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
 *  Builder for
 * <a href="adwordsapp_adcustomizersource.html">AdCustomizerSource</a>
 *  objects. For example, to create an ad customizer source with name "Inventory", and attributes "item" (of type
 * <code>text</code>
 * ), "numLeft" (of type
 * <code>number</code>
 * ), and "lowCost" (of type
 * <code>price</code>
 * ):
 * <p></p>
 * <pre class="prettyprint">
 *  var adCustomizerSourceBuilder = AdWordsApp.newAdCustomizerSourceBuilder();
 *  var adCustomizerSourceOperation = adCustomizerSourceBuilder
 *    .withName("Inventory")                                 // required
 *    .addAttribute("item", "text")                          // at least one attribute is required
 *    .addAttributes({numLeft: "number", lowCost: "price"})
 *    .build();                                              // create the ad customizer source</pre>
 *
 * <p></p>
 */
trait AdCustomizerSourceBuilder extends js.Object {
  /**
   *  Adds an attribute of the given name and type to the new ad customizer source. Existing attributes are not modified.
   * <p>Valid types are <code>text, number, price, date</code>.</p>
   *
   * <p>An error will be thrown if the additional attribute's name is one of <code>start date, end date, device preference, scheduling, target campaign, target ad group, keyword text, match type, keyword, id</code>, case insensitive.</p>
   *
   * <p>An attribute named <code>custom id</code> (case insensitive) will be interpreted as a special attribute, which has the additional requirement of each item in the data source having unique value for that attribute.</p>
   */
  def addAttribute(name: String, `type`: String): AdCustomizerSourceBuilder = js.native
  /**
   *  Adds a set of attributes to the new ad customizer source. Existing attributes are not modified. The set of new attributes are specified by an object where the keys are the names and the values are the respective types of the attributes. For instance,
   * <p></p>
   * <pre class="prettyprint">
   *  var attributes = {item: "text", numLeft: "number", lowCost: "price"};
   *  var builder = AdWordsApp.newAdCustomizerSourceBuilder();
   *  var adCustomizerSource = builder
   *      .withName("Inventory")
   *      .addAttributes(attributes)
   *      .build();</pre>
   * <p></p>
   *  adds the attributes
   * <code>item</code>
   *  (of type
   * <code>text</code>
   * ),
   * <code>numLeft</code>
   *  (of type
   * <code>number</code>
   * ), and
   * <code>lowCost</code>
   *  (of type
   * <code>price</code>
   * ) to the new ad customizer data source named "Inventory".
   * <p>Valid attribute types are <code>text, number, price, date</code>.</p>
   *
   * <p>An error will be thrown if an additional attribute's name is one of <code>start date, end date, device preference, scheduling, target campaign, target ad group, keyword text, match type, keyword, id</code>, case insensitive.</p>
   */
  def addAttributes(attributes: AnyRef): AdCustomizerSourceBuilder = js.native
  /**
   *  Builds the ad customizer source. Returns an
   * <a href="adwordsapp_adcustomizersourceoperation.html">AdCustomizerSourceOperation</a>
   *  that corresponds to the creation of the
   * <a href="adwordsapp_adcustomizersource.html">AdCustomizerSource</a>
   * .
   */
  def build: AdCustomizerSourceOperation = js.native
  /**  Sets the name of the new ad customizer source to the specified value. This field is required. */
  def withName(name: String): AdCustomizerSourceBuilder = js.native
}