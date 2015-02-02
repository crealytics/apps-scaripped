package com.google.appsscript.ui

/**
 * FocusPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A simple panel that makes its contents focusable, and adds the ability to catch mouse and keyboard events. Note that this panel can contain at most one direct child widget. To add more children, make the child of this panel a different panel that can contain more than one child. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var focus = app.createFocusPanel();
 *    var flow = app.createFlowPanel();
 *    flow.add(app.createButton("button 1"));
 *    flow.add(app.createButton("button 2"));
 *    focus.add(flow);
 *    app.add(focus);
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the FocusPanel documentation here.
 */
trait FocusPanel {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): FocusPanel = ???
}