package com.google.appsscript.ui

import scala.scalajs.js

/** SplitLayoutPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A panel that adds user-positioned splitters between each of its child widgets. This panel is similar to a DockLayoutPanel, but each pair of child widgets has a splitter between them that the user can drag. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the SplitLayoutPanel documentation here. */
trait SplitLayoutPanel extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addEast(widget: Widget, width: Number): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addNorth(widget: Widget, height: Number): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSouth(widget: Widget, height: Number): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addWest(widget: Widget, width: Number): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear(): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(index: Int): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(widget: Widget): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidgetMinSize(widget: Widget, minSize: Int): SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): SplitLayoutPanel = js.native
}