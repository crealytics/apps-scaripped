package com.google.appsscript.ui

/** TabBar Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A horizontal bar of folder-style tabs, most commonly used as part of a TabPanel. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the TabBar documentation here. */
trait TabBar {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBeforeSelectionHandler(handler: Handler): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSelectionHandler(handler: Handler): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addTab(title: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addTab(title: String, asHtml: Boolean): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addTab(widget: Widget): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def selectTab(index: Int): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabEnabled(index: Int, enabled: Boolean): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabText(index: Int, text: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): TabBar = ???
}