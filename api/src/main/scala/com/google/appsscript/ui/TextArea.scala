package com.google.appsscript.ui

import scala.scalajs.js

/**
 * TextArea Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A text box that allows multiple lines of text to be entered. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var text = app.createTextArea().setName("text");
 *    var handler = app.createServerHandler("count").addCallbackElement(text);
 *    app.add(text);
 *    app.add(app.createButton("Count", handler));
 *    app.add(app.createLabel("0 characters").setId("label"));
 *    return app;
 *  }
 * 
 *  function count(eventInfo) {
 *    var app = UiApp.createApplication();
 *    // Because the text area was named "text" and added as a callback element to the
 *    // button's click event, we have its value available in eventInfo.parameter.text.
 *    app.getElementById("label").setText(eventInfo.parameter.text.length + " characters");
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the TextArea documentation here.
 */
trait TextArea extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addChangeHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addValueChangeHandler(handler: Handler): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCharacterWidth(width: Int): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCursorPos(position: Int): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setDirection(direction: Component): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setReadOnly(readOnly: Boolean): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSelectionRange(position: Int, length: Int): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTextAlignment(textAlign: Component): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: String): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: String, fireEvents: Boolean): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisibleLines(lines: Int): TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): TextArea = js.native
}