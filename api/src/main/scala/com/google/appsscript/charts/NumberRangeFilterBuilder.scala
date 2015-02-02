package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/**
 * NumberRangeFilterBuilder A builder for number range filter controls. A number range filter is a slider with two thumbs that lets the user select ranges of numeric values. Given a column of type number and matching options, this control will filter out the rows that don't match the range that was selected. This example creates a table chart bound to a number range filter:
 *
 *
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    // Get sample data from a spreadsheet.
 *    var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AF' +
 *        '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=4&headers=-1';
 *    var data = SpreadsheetApp.openByUrl(dataSourceUrl).getSheetByName('US_GDP').getRange("A1:F");
 *
 *    var chart = Charts.newTableChart()
 *        .setDimensions(600, 500)
 *        .build();
 *
 *    var numberRangeFilter = Charts.newNumberRangeFilter()
 *        .setFilterColumnLabel("Year")
 *        .setShowRangeValues(true)
 *        .setLabel("Restrict year range")
 *        .build();
 *
 *    var panel = app.createVerticalPanel().setSpacing(10);
 *    panel.add(numberRangeFilter).add(chart);
 *
 *    // Create a new dashboard panel to bind the filter and chart together.
 *    var dashboard = Charts.newDashboardPanel()
 *        .setDataTable(data)
 *        .bind(numberRangeFilter, chart)
 *        .build();
 *
 *    dashboard.add(panel);
 *    app.add(dashboard);
 *    return app;
 *  }
 *
 *  For more details, see the Gviz documentation
 */
trait NumberRangeFilterBuilder extends js.Object {
  /** Builds a control. */
  def build: Control = js.native
  /** Sets the data table to use for the control using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): NumberRangeFilterBuilder = js.native
  /** Sets the control data table, which will be the control's underlying data model. */
  def setDataTable(table: DataTableSource): NumberRangeFilterBuilder = js.native
  /** Sets the index of the data table column to filter on. The values of that column will determine whether or not each row should be filtered. It is mandatory to set either this or the column label using setFilterColumnLabel(columnLabel). */
  def setFilterColumnIndex(columnIndex: Int): NumberRangeFilterBuilder = js.native
  /** Sets the label of the data table column to filter on. The values of that column will determine whether or not each row should be filtered. It is mandatory to set either this or a column index using setFilterColumnIndex(columnIndex). */
  def setFilterColumnLabel(columnLabel: String): NumberRangeFilterBuilder = js.native
  /** Sets the label to display next to the slider. If unspecified, the label of the column the control operates on will be used. */
  def setLabel(label: String): NumberRangeFilterBuilder = js.native
  /** Sets a separator string appended to the label, to visually separate the label from the category picker. */
  def setLabelSeparator(labelSeparator: String): NumberRangeFilterBuilder = js.native
  /** Sets whether the label should display above (vertical stacking) or beside (horizontal stacking) the input field. */
  def setLabelStacking(orientation: Orientation): NumberRangeFilterBuilder = js.native
  /** Sets the maximum allowed value for the range lower extent. If undefined, the value will be inferred from the contents of the DataTable managed by the control. */
  def setMaxValue(maxValue: Int): NumberRangeFilterBuilder = js.native
  /** Sets the minimum allowed value for the range lower extent. If undefined, the value will be inferred from the contents of the DataTable managed by the control. */
  def setMinValue(minValue: Int): NumberRangeFilterBuilder = js.native
  /** Sets the slider orientation. */
  def setOrientation(orientation: Orientation): NumberRangeFilterBuilder = js.native
  /** Sets whether to have labels next to the slider displaying extents of the selected range. */
  def setShowRangeValues(showRangeValues: Boolean): NumberRangeFilterBuilder = js.native
  /** Sets the number of ticks (fixed positions in a range bar) a number range filter slider thumbs can fall in. */
  def setTicks(ticks: Int): NumberRangeFilterBuilder = js.native
}