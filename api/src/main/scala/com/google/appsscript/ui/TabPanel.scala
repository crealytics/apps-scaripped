package com.google.appsscript.ui

/** TabPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A panel that represents a tabbed set of pages, each of which contains another widget. Its child widgets are shown as the user selects the various tabs associated with them. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the TabPanel documentation here. */
trait TabPanel {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget, text: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget, text: String, asHtml: Boolean): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget, tabWidget: Widget): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBeforeSelectionHandler(handler: Handler): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSelectionHandler(handler: Handler): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def selectTab(index: Int): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAnimationEnabled(animationEnabled: Boolean): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): TabPanel = ???
}