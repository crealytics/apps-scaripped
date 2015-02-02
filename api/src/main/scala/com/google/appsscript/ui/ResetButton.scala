package com.google.appsscript.ui

/**
 * ResetButton Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A standard push-button widget which will automatically reset its enclosing FormPanel if any. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var panel = app.createFlowPanel();
 *    panel.add(app.createTextBox().setText("some text"));
 *    panel.add(app.createResetButton("reset the textbox"));
 *    var form = app.createFormPanel();
 *    form.add(panel);
 *    app.add(form);
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the ResetButton documentation here.
 */
trait ResetButton {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): ResetButton = ???
}