package com.google.appsscript.ui

import scala.scalajs.js

/**
 * Anchor Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A widget that represents a simple <a> element. That is, a hyperlink to a different page. By design, these hyperlinks always open in a new page. Links that reload the current page are not allowed. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    // Creates a link to your favorite search engine.
 *    var anchor = app.createAnchor("a link", "http://www.google.com");
 *    app.add(anchor);
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the Anchor documentation here.
 */
trait Anchor extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setDirection(direction: Component): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHref(href: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTarget(target: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWordWrap(wordWrap: Boolean): Anchor = js.native
}