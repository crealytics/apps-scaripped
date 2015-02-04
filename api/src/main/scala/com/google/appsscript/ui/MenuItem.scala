package com.google.appsscript.ui

import scala.scalajs.js

/** MenuItem Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. An entry in a MenuBar. Menu items can either fire an event handler when they are clicked, or open a cascading sub-menu. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the MenuItem documentation here. */
trait MenuItem extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCommand(handler: Handler): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSubMenu(subMenu: MenuBar): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): MenuItem = js.native
}