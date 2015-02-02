package com.google.appsscript.ui

/** TreeItem Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. An item that can be contained within a Tree. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the TreeItem documentation here. */
trait TreeItem {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(item: TreeItem): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(widget: Widget): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSelected(selected: Boolean): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setState(open: Boolean): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setState(open: Boolean, fireEvents: Boolean): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setUserObject(a: AnyRef): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): TreeItem = ???
}