package com.google.appsscript.ui

import scala.scalajs.js

/**
 * PasswordTextBox Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A text box that visually masks its input to prevent eavesdropping. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var text = app.createPasswordTextBox().setName("text");
 *    var handler = app.createServerHandler("test").addCallbackElement(text);
 *    app.add(text);
 *    app.add(app.createButton("Test", handler));
 *    app.add(app.createLabel("0 characters").setId("label"));
 *    return app;
 *  }
 * 
 *  function test(eventInfo) {
 *    var app = UiApp.createApplication();
 *    // Because the text box was named "text" and added as a callback element to the
 *    // button's click event, we have its value available in eventInfo.parameter.text.
 *    var pass = eventInfo.parameter.text;
 *    var isStrong =
 *        pass.length >= 10 && /[A-Z]/.test(pass) && /[a-z]/.test(pass) && /[0-9]/.test(pass);
 *    var label = app.getElementById("label");
 *    if (isStrong) {
 *      label.setText("Strong! Well, not really, but this is just an example.")
 *          .setStyleAttribute("color", "green");
 *    } else {
 *      label.setText("Weak! Use at least 10 characters, with uppercase, lowercase, and digits")
 *          .setStyleAttribute("color", "red");
 *    }
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the PasswordTextBox documentation here.
 */
trait PasswordTextBox extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addChangeHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addValueChangeHandler(handler: Handler): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCursorPos(position: Int): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setDirection(direction: Component): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setMaxLength(length: Int): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setReadOnly(readOnly: Boolean): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSelectionRange(position: Int, length: Int): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTextAlignment(textAlign: Component): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: String): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: String, fireEvents: Boolean): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisibleLength(length: Int): PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): PasswordTextBox = js.native
}