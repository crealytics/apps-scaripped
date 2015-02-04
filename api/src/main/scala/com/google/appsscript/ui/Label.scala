package com.google.appsscript.ui

import scala.scalajs.js

/**
 * Label Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A widget that contains arbitrary text, not interpreted as HTML. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    app.add(app.createLabel("Hello World!"));
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the Label documentation here.
 */
trait Label extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setDirection(direction: Component): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWordWrap(wordWrap: Boolean): Label = js.native
}