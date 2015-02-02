package com.google.appsscript.ui

/**
 * SubmitButton Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A standard push-button widget which will automatically submit its enclosing FormPanel if any. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var form = app.createFormPanel();
 *    var flow = app.createFlowPanel();
 *    flow.add(app.createTextBox().setName("textBox"));
 *    flow.add(app.createSubmitButton("Submit"));
 *    form.add(flow);
 *    app.add(form);
 *    return app;
 *  }
 * 
 *  function doPost(eventInfo) {
 *    var app = UiApp.getActiveApplication();
 *    app.add(app.createLabel("Form submitted. The text box's value was '" +
 *        eventInfo.parameter.textBox + "'"));
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the SubmitButton documentation here.
 */
trait SubmitButton {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): SubmitButton = ???
}