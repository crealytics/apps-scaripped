package com.google.appsscript.ui

import scala.scalajs.js

/**
 * Button Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A standard push-button widget. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    // create a button and give it a click handler
 *    var button = app.createButton("click me!").setId("button");
 *    button.addClickHandler(app.createServerHandler("handlerFunction"));
 *    app.add(button);
 *    return app;
 *  }
 * 
 *  function handlerFunction(eventInfo) {
 *    var app = UiApp.getActiveApplication();
 *    app.getElementById("button").setText("I was clicked!");
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the Button documentation here.
 */
trait Button extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): Button = js.native
}