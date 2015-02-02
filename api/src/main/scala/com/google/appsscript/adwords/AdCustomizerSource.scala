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
 *  Represents an ad customizer data source as seen in the Business Data section of the Shared Library. Each ad customizer source has a unique name and a set of attributes. The attributes are defined by an attribute name, which must be unique across attributes within the data source, and a type, which must be one of the following:
 * <code>text, number, price, date</code>
 * . An ad customizer source can have many
 * <a href="adwordsapp_adcustomizeritem.html">AdCustomizerItems</a>
 *  in it, or it can have none. See the
 * <a href="/adwords/scripts/docs/features/ad-customizers">feature guide</a>
 *  for more information.
 */
trait AdCustomizerSource extends js.Object {
  /**  Returns a builder for a new item in this data source. */
  def adCustomizerItemBuilder: AdCustomizerItemBuilder = js.native
  /**
   *  Returns a map from attribute name to attribute type. Contains all of the attributes in this ad customizer data source. For instance, a data source that contains the item attributes
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
   * ) would return
   * <code>{item: 'text', numLeft: 'number', lowCost: 'price'}</code>
   * .
   */
  def getAttributes: AnyRef = js.native
  /**
   *  Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"AdCustomizerSource"</code>
   * .
   */
  def getEntityType: String = js.native
  /**  Returns the name of the ad customizer source. */
  def getName: String = js.native
  /**  Returns the selector of all items in this ad customizer data source. */
  def items: AdCustomizerItemSelector = js.native
}