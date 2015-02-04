package com.google.appsscript.ui

import scala.scalajs.js

/** DecoratorPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A SimplePanel that wraps its contents in stylized boxes, which can be used to add rounded corners to a Widget. Note that this panel can contain at most one direct child widget. To add more children, make the child of this panel a different panel that can contain more than one child. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the DecoratorPanel documentation here. */
trait DecoratorPanel extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear(): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): DecoratorPanel = js.native
}