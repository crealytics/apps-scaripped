package com.google.appsscript.ui

/**
 * DateBox Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A text box that shows a DatePicker when the user focuses on it. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var handler = app.createServerHandler("change");
 *    var dateBox = app.createDateBox().addValueChangeHandler(handler).setId("datebox");
 *    app.add(dateBox);
 *    return app;
 *  }
 * 
 *  function change(eventInfo) {
 *    var app = UiApp.getActiveApplication();
 *    app.add(app.createLabel("The value of the date box changed to " +
 *        eventInfo.parameter.datebox));
 *     return app;
 *   }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the DateBox documentation here.
 */
trait DateBox {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addValueChangeHandler(handler: Handler): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def hideDatePicker: DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFireEventsForInvalid(fireEvents: Boolean): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFormat(dateTimeFormat: DateTimeFormat): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(date: scala.scalajs.js.Date): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def showDatePicker: DateBox = ???
}