package com.google.appsscript.ui

import scala.scalajs.js

/**
 * SimplePanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A panel that can contain only one widget. This panel is useful for adding styling effects to the child widget. To add more children, make the child of this panel a different panel that can contain more than one child. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var simple = app.createSimplePanel();
 *    var flow = app.createFlowPanel();
 *    flow.add(app.createButton("button 1"));
 *    flow.add(app.createButton("button 2"));
 *    simple.add(flow);
 *    app.add(simple);
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the SimplePanel documentation here.
 */
trait SimplePanel extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear(): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): SimplePanel = js.native
}