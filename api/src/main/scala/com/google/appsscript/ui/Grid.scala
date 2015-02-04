package com.google.appsscript.ui

import scala.scalajs.js

/**
 * Grid Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A rectangular grid that can contain text, html, or a child widget within its cells. It must be resized explicitly to the desired number of rows and columns. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    app.add(app.createGrid(3, 3)
 *        .setBorderWidth(1)
 *        .setCellSpacing(10)
 *        .setCellPadding(10)
 *        .setText(0, 0, "X")
 *        .setText(1, 1, "X")
 *        .setText(2, 2, "X")
 *        .setText(0, 1, "O")
 *        .setText(0, 2, "O")
 *        .setStyleAttribute(0, 0, "color", "red")
 *        .setStyleAttribute(1, 1, "color", "red")
 *        .setStyleAttribute(2, 2, "color", "red")
 *        .setStyleAttribute(0, 1, "color", "blue")
 *        .setStyleAttribute(0, 2, "color", "blue"));
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the Grid documentation here.
 */
trait Grid extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear(): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def resize(rows: Int, columns: Int): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setBorderWidth(width: Int): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellPadding(padding: Int): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellSpacing(spacing: Int): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setColumnStyleAttribute(column: Int, attribute: String, value: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setColumnStyleAttributes(column: Int, attributes: AnyRef): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setRowStyleAttribute(row: Int, attribute: String, value: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setRowStyleAttributes(row: Int, attributes: AnyRef): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(row: Int, column: Int, attribute: String, value: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(row: Int, column: Int, attributes: AnyRef): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(row: Int, column: Int, text: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(row: Int, column: Int, widget: Widget): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): Grid = js.native
}
