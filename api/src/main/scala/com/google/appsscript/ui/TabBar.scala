package com.google.appsscript.ui

import scala.scalajs.js

/** TabBar Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A horizontal bar of folder-style tabs, most commonly used as part of a TabPanel. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the TabBar documentation here. */
trait TabBar extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBeforeSelectionHandler(handler: Handler): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSelectionHandler(handler: Handler): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addTab(title: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addTab(title: String, asHtml: Boolean): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addTab(widget: Widget): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def selectTab(index: Int): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabEnabled(index: Int, enabled: Boolean): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabText(index: Int, text: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): TabBar = js.native
}