package com.google.appsscript.ui

/**
 * CheckBox Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A standard check box widget. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var handler = app.createServerHandler("change");
 *    var check = app.createCheckBox("click me").addValueChangeHandler(handler);
 *    app.add(check);
 *    return app;
 *  }
 * 
 *  function change() {
 *    var app = UiApp.getActiveApplication();
 *    app.add(app.createLabel("The value changed!"));
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the CheckBox documentation here.
 */
trait CheckBox {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addValueChangeHandler(handler: Handler): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFormValue(formValue: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: Boolean): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: Boolean, fireEvents: Boolean): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): CheckBox = ???
}