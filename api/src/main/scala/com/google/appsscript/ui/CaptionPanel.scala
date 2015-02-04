package com.google.appsscript.ui

import scala.scalajs.js

/**
 * CaptionPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A panel that wraps its contents in a border with a caption that appears in the upper left corner of the border. This is an implementation of the fieldset HTML element. Note that this panel can contain at most one direct child widget. To add more children, make the child of this panel a different panel that can contain more than one child. Note also that the placement of the caption in a caption panel will vary slightly from browser to browser, so this widget is not a good choice when precise cross-browser layout is needed. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var panel = app.createCaptionPanel("my caption!");
 *    panel.add(app.createButton("a button inside..."));
 *    app.add(panel);
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the CaptionPanel documentation here.
 */
trait CaptionPanel extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear(): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCaptionText(text: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setContentWidget(widget: Widget): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): CaptionPanel = js.native
}