package com.google.appsscript.ui

import scala.scalajs.js

/**
 * AbsolutePanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. An absolute panel positions all of its children absolutely, allowing them to overlap. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var button = app.createButton("a button");
 *    var panel = app.createAbsolutePanel();
 *    // add a widget at position (10, 20)
 *    panel.add(button, 10, 20);
 *    app.add(panel);
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the AbsolutePanel documentation here.
 */
trait AbsolutePanel extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget, left: Int, top: Int): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear(): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(index: Int): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(widget: Widget): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidgetPosition(widget: Widget, left: Int, top: Int): AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): AbsolutePanel = js.native
}