package com.google.appsscript.ui

import scala.scalajs.js

/** MenuBar Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A standard menu bar widget. A menu bar can contain any number of menu items, each of which can either fire an event handler or open a cascaded menu bar. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the MenuBar documentation here. */
trait MenuBar extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addCloseHandler(handler: Handler): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(item: MenuItem): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String, asHtml: Boolean, command: Handler): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String, asHtml: Boolean, subMenu: MenuBar): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String, command: Handler): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String, subMenu: MenuBar): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSeparator(): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSeparator(separator: MenuItemSeparator): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAnimationEnabled(animationEnabled: Boolean): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAutoOpen(autoOpen: Boolean): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): MenuBar = js.native
}
