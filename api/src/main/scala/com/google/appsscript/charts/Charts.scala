package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

/**
 * Charts Entry point for creating Charts in scripts. This example creates a basic data table, populates an area chart with the data, and adds it into a UiApp: 
 *  
 * 
 *  function doGet() {
 *    var data = Charts.newDataTable()
 *        .addColumn(Charts.ColumnType.STRING, "Month")
 *        .addColumn(Charts.ColumnType.NUMBER, "In Store")
 *        .addColumn(Charts.ColumnType.NUMBER, "Online")
 *        .addRow(["January", 10, 1])
 *        .addRow(["February", 12, 1])
 *        .addRow(["March", 20, 2])
 *        .addRow(["April", 25, 3])
 *        .addRow(["May", 30, 4])
 *        .build();
 * 
 *    var chart = Charts.newAreaChart()
 *        .setDataTable(data)
 *        .setStacked()
 *        .setRange(0, 40)
 *        .setTitle("Sales per Month")
 *        .build();
 * 
 *    var uiApp = UiApp.createApplication().setTitle("My Chart");
 *    uiApp.add(chart);
 *    return uiApp;
 *  }
 */
trait Charts {
  /** Starts building an area chart, as described in the Google Chart Tools documentation. */
  def newAreaChart: AreaChartBuilder = ???
  /** Starts building a bar chart, as described in the Google Chart Tools documentation. */
  def newBarChart: BarChartBuilder = ???
  /** Starts building a category filter control, as described in the Google Chart Tools documentation. */
  def newCategoryFilter: CategoryFilterBuilder = ???
  /** Starts building a column chart, as described in the Google Chart Tools documentation. */
  def newColumnChart: ColumnChartBuilder = ???
  /** Starts building a dashboard panel, as described in the Google Chart Tools documentation. */
  def newDashboardPanel: DashboardPanelBuilder = ???
  /** Creates an empty data table, which can have its values set manually. */
  def newDataTable: DataTableBuilder = ???
  /** Creates a new data view definition. */
  def newDataViewDefinition: DataViewDefinitionBuilder = ???
  /** Starts building a line chart, as described in the Google Chart Tools documentation. */
  def newLineChart: LineChartBuilder = ???
  /** Starts building a number range filter control, as described in the Google Chart Tools documentation. */
  def newNumberRangeFilter: NumberRangeFilterBuilder = ???
  /** Starts building a pie chart, as described in the Google Chart Tools documentation. */
  def newPieChart: PieChartBuilder = ???
  /** Starts building a scatter chart, as described in the Google Chart Tools documentation. */
  def newScatterChart: ScatterChartBuilder = ???
  /** Starts building a string filter control, as described in the Google Chart Tools documentation. */
  def newStringFilter: StringFilterBuilder = ???
  /** Starts building a table chart, as described in the Google Chart Tools documentation. */
  def newTableChart: TableChartBuilder = ???
  /** Creates a new text style builder. */
  def newTextStyle: TextStyleBuilder = ???
}