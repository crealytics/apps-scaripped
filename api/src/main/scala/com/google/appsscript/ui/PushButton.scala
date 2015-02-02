package com.google.appsscript.ui

/**
 * PushButton Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A normal push button with custom styling. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    // create a button and give it a click handler
 *    var button = app.createPushButton().setText("click me!").setId("button");
 *    button.addClickHandler(app.createServerHandler("handlerFunction"));
 *    app.add(button);
 *    return app;
 *  }
 * 
 *  function handlerFunction(eventInfo) {
 *    var app = UiApp.getActiveApplication();
 *    app.add(app.createLabel("The button was clicked!"));
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the PushButton documentation here.
 */
trait PushButton {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): PushButton = ???
}