package com.google.appsscript.ui

/**
 * HorizontalPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A panel that lays all of its widgets out in a single horizontal column. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var panel = app.createHorizontalPanel();
 *    panel.add(app.createButton("button 1"));
 *    panel.add(app.createButton("button 2"));
 *    app.add(panel);
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the HorizontalPanel documentation here.
 */
trait HorizontalPanel {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(index: Int): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(widget: Widget): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setBorderWidth(width: Int): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellHeight(widget: Widget, height: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellHorizontalAlignment(widget: Widget, horizontalAlignment: HorizontalAlignment): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellVerticalAlignment(widget: Widget, verticalAlignment: VerticalAlignment): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellWidth(widget: Widget, width: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSpacing(spacing: Int): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVerticalAlignment(verticalAlignment: VerticalAlignment): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): HorizontalPanel = ???
}