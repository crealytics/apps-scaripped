package com.google.appsscript.ui

/** MenuBar Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A standard menu bar widget. A menu bar can contain any number of menu items, each of which can either fire an event handler or open a cascaded menu bar. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the MenuBar documentation here. */
trait MenuBar {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addCloseHandler(handler: Handler): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(item: MenuItem): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String, asHtml: Boolean, command: Handler): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String, asHtml: Boolean, subMenu: MenuBar): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String, command: Handler): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String, subMenu: MenuBar): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSeparator: MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSeparator(separator: MenuItemSeparator): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAnimationEnabled(animationEnabled: Boolean): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAutoOpen(autoOpen: Boolean): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): MenuBar = ???
}