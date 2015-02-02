package com.google.appsscript.ui

import scala.scalajs.js

/**
 * ListBox Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A widget that presents a list of choices to the user, either as a list box or as a drop-down list. Here is an example usage, which should be executed from within a spreadsheet bound script.
 *
 *
 *  // execute this in a spreadsheet
 *  function show() {
 *    var doc = SpreadsheetApp.getActiveSpreadsheet();
 *    var app = UiApp.createApplication().setTitle('My Application');
 *    var panel = app.createVerticalPanel();
 *    var lb = app.createListBox(true).setId('myId').setName('myLbName');
 *
 *    // add items to ListBox
 *    lb.setVisibleItemCount(3);
 *    lb.addItem('first');
 *    lb.addItem('second');
 *    lb.addItem('third');
 *    lb.addItem('fourth');
 *    lb.addItem('fifth');
 *    lb.addItem('sixth');
 *
 *    panel.add(lb);
 *    var button = app.createButton('press me');
 *    var handler = app.createServerClickHandler('click').addCallbackElement(panel);
 *    button.addClickHandler(handler);
 *    panel.add(button);
 *    app.add(panel);
 *    doc.show(app);
 *  }
 *
 *
 *  function click(eventInfo) {
 *    var app = UiApp.getActiveApplication();
 *    // get values of ListBox
 *    var value = eventInfo.parameter.myLbName;
 *    // multi select box returns a comma separated string
 *    var n = value.split(',');
 *
 *    var doc = SpreadsheetApp.getActiveSpreadsheet();
 *    doc.getRange('a1').setValue(value);
 *    doc.getRange('b1').setValue('there are ' + n.length + ' items selected');
 *    return app;
 *  }
 *
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the ListBox documentation here.
 */
trait ListBox extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addChangeHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addItem(text: String, value: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def removeItem(index: Int): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setItemSelected(index: Int, selected: Boolean): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setItemText(index: Int, text: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSelectedIndex(index: Int): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(index: Int, value: String): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisibleItemCount(count: Int): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): ListBox = js.native
}