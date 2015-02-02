package com.google.appsscript.ui

/**
 * DatePicker Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A date picker widget. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var handler = app.createServerHandler("change");
 *    var picker = app.createDatePicker().addValueChangeHandler(handler).setId("picker");
 *    app.add(picker);
 *    return app;
 *  }
 * 
 *  function change(eventInfo) {
 *    var app = UiApp.getActiveApplication();
 *    app.add(app.createLabel("The value of the date picker changed to " +
 *        eventInfo.parameter.picker));
 *     return app;
 *   }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the DatePicker documentation here.
 */
trait DatePicker {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addValueChangeHandler(handler: Handler): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCurrentMonth(date: scala.scalajs.js.Date): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(date: scala.scalajs.js.Date): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): DatePicker = ???
}