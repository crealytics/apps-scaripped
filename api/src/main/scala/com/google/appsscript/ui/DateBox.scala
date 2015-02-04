package com.google.appsscript.ui

import scala.scalajs.js

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
trait DateBox extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addValueChangeHandler(handler: Handler): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def hideDatePicker(): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFireEventsForInvalid(fireEvents: Boolean): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFormat(dateTimeFormat: DateTimeFormat): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(date: scala.scalajs.js.Date): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def showDatePicker(): DateBox = js.native
}
