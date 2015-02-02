package com.google.appsscript.ui

/** DecoratedStackPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A StackPanel that wraps each item in a 2x3 grid (six box), which allows users to add rounded corners. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the DecoratedStackPanel documentation here. */
trait DecoratedStackPanel {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget, text: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget, text: String, asHtml: Boolean): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(index: Int): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(widget: Widget): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStackText(index: Int, text: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStackText(index: Int, text: String, asHtml: Boolean): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): DecoratedStackPanel = ???
}