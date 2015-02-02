package com.google.appsscript.ui

/**
 * FlexTable Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A flexible table that creates cells on demand. It can be jagged (that is, each row can contain a different number of cells) and individual cells can be set to span multiple rows or columns. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    app.add(app.createFlexTable()
 *      .insertRow(0).insertRow(0).insertRow(0)
 *      .insertCell(0, 0)
 *      .insertCell(0, 1)
 *      .insertCell(0, 2)
 *      .insertCell(1, 0)
 *      .insertCell(1, 1)
 *      .insertCell(2, 0)
 *      .setBorderWidth(5).setCellPadding(10).setCellSpacing(10));
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the FlexTable documentation here.
 */
trait FlexTable {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addCell(row: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def insertCell(beforeRow: Int, beforeColumn: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def insertRow(beforeRow: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def removeCell(row: Int, column: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def removeCells(row: Int, column: Int, num: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def removeRow(row: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setBorderWidth(width: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellPadding(padding: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCellSpacing(spacing: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setColumnStyleAttribute(column: Int, attribute: String, value: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setColumnStyleAttributes(column: Int, attributes: AnyRef): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setRowStyleAttribute(row: Int, attribute: String, value: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setRowStyleAttributes(row: Int, attributes: AnyRef): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(row: Int, column: Int, attribute: String, value: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(row: Int, column: Int, attributes: AnyRef): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(row: Int, column: Int, text: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(row: Int, column: Int, widget: Widget): FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): FlexTable = ???
}