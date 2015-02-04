package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/**
 * DashboardPanel A dashboard is a visual structure that enables the organization and management of multiple charts that share the same underlying data. Controls are user interface widgets (category pickers, range sliders, autocompleters, etc.) users interact with in order to drive the data managed by a dashboard and the charts that are part of it. For example, a string filter control is a simple text input field that lets the user filter data via string matching. Given a column and matching options, the control will filter out the rows that don't match the term that's in the input field. The Gviz API defines a dashboard as a set of charts and controls bound together. The bindings between the different components define the data flow, the state of the controls filters views of the data which propagate in the dashboard and are eventually visualized with charts. For more details, see the Gviz documentation. The dashboard panel has two purposes, one is being a container for the charts and controls objects that compose the dashboard, and the other is holding the data and use as an interface for binding controls to charts. Here's an example of creating a dashboard and showing it in a UI app: 
 *  
 * 
 *  function doGet() {
 *    // Create a data table with some sample data.
 *    var data = Charts.newDataTable()
 *      .addColumn(Charts.ColumnType.STRING, "Name")
 *      .addColumn(Charts.ColumnType.NUMBER, "Age")
 *      .addRow(["Michael", 18])
 *      .addRow(["Elisa", 12])
 *      .addRow(["John", 20])
 *      .addRow(["Jessica", 25])
 *      .addRow(["Aaron", 14])
 *      .addRow(["Margareth", 19])
 *      .addRow(["Miranda", 22])
 *      .addRow(["May", 20])
 *      .build();
 * 
 *    var chart = Charts.newBarChart()
 *      .setTitle("Ages")
 *      .build();
 * 
 *    var control = Charts.newStringFilter()
 *      .setFilterColumnLabel("Name")
 *      .build();
 * 
 *    // Bind the control to the chart in a dashboard panel.
 *    var dashboard = Charts.newDashboardPanel()
 *      .setDataTable(data)
 *      .bind(control, chart)
 *      .build();
 * 
 *    var uiApp = UiApp.createApplication().setTitle("My Dashboard");
 * 
 *    var panel = uiApp.createHorizontalPanel()
 *      .setVerticalAlignment(UiApp.VerticalAlignment.MIDDLE)
 *      .setSpacing(50);
 * 
 *    panel.add(control);
 *    panel.add(chart);
 *    dashboard.add(panel);
 *    uiApp.add(dashboard);
 *    return uiApp;
 *  }
 */
trait DashboardPanel extends js.Object {
  /** Add a widget to the DashboardPanel. */
  def add(widget: Widget): DashboardPanel = js.native
  /** Returns the id that has been assigned to this object. */
  def getId(): String = js.native
  /** Gets the type of this object. */
  def getType(): String = js.native
  /** Sets the id of this DashboardPanel to be used with UiApp. */
  def setId(id: String): DashboardPanel = js.native
}