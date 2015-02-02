package com.google.appsscript.ui

/**
 * TextBox Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A standard single-line text box. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var text = app.createTextBox().setName("text");
 *    var handler = app.createServerHandler("count").addCallbackElement(text);
 *    app.add(text);
 *    app.add(app.createButton("Count", handler));
 *    app.add(app.createLabel("0 characters").setId("label"));
 *    return app;
 *  }
 * 
 *  function count(eventInfo) {
 *    var app = UiApp.createApplication();
 *    // Because the text box was named "text" and added as a callback element to the
 *    // button's click event, we have its value available in eventInfo.parameter.text.
 *    app.getElementById("label").setText(eventInfo.parameter.text.length + " characters");
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the TextBox documentation here.
 */
trait TextBox {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addChangeHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addValueChangeHandler(handler: Handler): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCursorPos(position: Int): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setDirection(direction: Component): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setMaxLength(length: Int): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setReadOnly(readOnly: Boolean): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSelectionRange(position: Int, length: Int): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTextAlignment(textAlign: Component): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: String): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: String, fireEvents: Boolean): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisibleLength(length: Int): TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): TextBox = ???
}