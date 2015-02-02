package com.google.appsscript.ui

import scala.scalajs.js

/** TreeItem Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. An item that can be contained within a Tree. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the TreeItem documentation here. */
trait TreeItem extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(item: TreeItem): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(widget: Widget): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSelected(selected: Boolean): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setState(open: Boolean): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setState(open: Boolean, fireEvents: Boolean): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setUserObject(a: AnyRef): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): TreeItem = js.native
}