package com.google.appsscript.ui

import scala.scalajs.js

/** Tree Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A standard hierarchical tree widget. The tree contains a hierarchy of TreeItems that the user can open, close, and select. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the Tree documentation here. */
trait Tree extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addCloseHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(item: TreeItem): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(widget: Widget): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addOpenHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSelectionHandler(handler: Handler): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAnimationEnabled(animationEnabled: Boolean): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSelectedItem(item: TreeItem): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSelectedItem(item: TreeItem, fireEvents: Boolean): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): Tree = js.native
}