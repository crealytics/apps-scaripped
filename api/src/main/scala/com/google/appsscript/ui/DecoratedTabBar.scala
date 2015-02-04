package com.google.appsscript.ui

import scala.scalajs.js

/** DecoratedTabBar Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A TabBar that wraps each tab in a 2x3 grid (six box), which allows users to add rounded corners. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the DecoratedTabBar documentation here. */
trait DecoratedTabBar extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBeforeSelectionHandler(handler: Handler): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSelectionHandler(handler: Handler): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addTab(title: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addTab(title: String, asHtml: Boolean): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addTab(widget: Widget): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def selectTab(index: Int): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabEnabled(index: Int, enabled: Boolean): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabText(index: Int, text: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): DecoratedTabBar = js.native
}
