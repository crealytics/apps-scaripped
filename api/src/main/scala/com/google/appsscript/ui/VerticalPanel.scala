package com.google.appsscript.ui

/**
 * VerticalPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A panel that lays all of its widgets out in a single vertical column. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var panel = app.createVerticalPanel();
 *    panel.add(app.createButton("button 1"));
 *    panel.add(app.createButton("button 2"));
 *    app.add(panel);
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the VerticalPanel documentation here.
 */
trait VerticalPanel {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(index: Int): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(widget: Widget): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setBorderWidth(width: Int): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellHeight(widget: Widget, height: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellHorizontalAlignment(widget: Widget, horizontalAlignment: HorizontalAlignment): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellVerticalAlignment(widget: Widget, verticalAlignment: VerticalAlignment): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellWidth(widget: Widget, width: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSpacing(spacing: Int): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVerticalAlignment(verticalAlignment: VerticalAlignment): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): VerticalPanel = ???
}