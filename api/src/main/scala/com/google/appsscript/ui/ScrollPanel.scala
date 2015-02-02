package com.google.appsscript.ui

/**
 * ScrollPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A panel that wraps its contents in a scrollable element. Note that this panel can contain at most one direct child widget. To add more children, make the child of this panel a different panel that can contain more than one child. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    // Create some long content.
 *    var vertical = app.createVerticalPanel();
 *    for (var i = 0; i < 100; ++i) {
 *      vertical.add(app.createButton("button " + i));
 *    }
 *    var scroll = app.createScrollPanel().setPixelSize(100, 100);
 *    scroll.add(vertical);
 *    app.add(scroll);
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the ScrollPanel documentation here.
 */
trait ScrollPanel {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addScrollHandler(handler: Handler): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAlwaysShowScrollBars(alwaysShow: Boolean): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHorizontalScrollPosition(position: Int): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setScrollPosition(position: Int): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): ScrollPanel = ???
}