package com.google.appsscript.ui

import scala.scalajs.js

/**
 * HTML Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A widget that contains arbitrary text, which is interpreted as HTML. Only basic HTML markup such as bold, italic, etc. are allowed; in particular, scripts will be stripped out completely. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    app.add(app.createHTML("<b>Hello World!</b>"));
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the HTML documentation here.
 */
trait HTML extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setDirection(direction: Component): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWordWrap(wordWrap: Boolean): HTML = js.native
}