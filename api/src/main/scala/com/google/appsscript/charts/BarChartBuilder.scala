package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/**
 * BarChartBuilder Builder for bar charts. For more details, see the Google Charts documentation. Here is an example that shows how to build a bar chart. The data is imported from a Google spreadsheet. 
 *  
 * 
 *  function doGet() {
 *   // Get sample data from a spreadsheet.
 *   var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=B1%3AC11' +
 *       '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=0&headers=-1';
 * 
 *   var chartBuilder = Charts.newBarChart()
 *       .setTitle('Top Grossing Films in US and Canada')
 *       .setXAxisTitle('USD')
 *       .setYAxisTitle('Film')
 *       .setDimensions(600, 500)
 *       .setLegendPosition(Charts.Position.BOTTOM)
 *       .setDataSourceUrl(dataSourceUrl);
 * 
 *   var chart = chartBuilder.build();
 *   return UiApp.createApplication().add(chart);
 *  }
 */
trait BarChartBuilder extends js.Object {
  /** Builds the chart. */
  def build(): Chart = js.native
  /** Reverses the drawing of series in the domain axis. For vertical-range charts (such as line, area or column charts), this means the horizontal axis is drawn from right to left. For horizontal-range charts (such as bar charts), this means the vertical axis is drawn from top to bottom. For pie charts, this means the slices are drawn counterclockwise. */
  def reverseCategories(): BarChartBuilder = js.native
  /** Reverses the direction in which the bars grow along the horizontal axis. By default, values grow from left to right. Calling this method will cause them to grow from right to left. */
  def reverseDirection(): BarChartBuilder = js.native
  /** Sets the background color for the chart. */
  def setBackgroundColor(cssValue: String): BarChartBuilder = js.native
  /** Sets the colors for the lines in the chart. */
  def setColors(cssValues: js.Array[String]): BarChartBuilder = js.native
  /** Sets the data source URL that will be used to pull data in from an external source, such as Google Sheets. If a data source URL and a DataTable are provided, the data source URL is ignored. For more information about querying data sources, check out the Google Charts documentation. */
  def setDataSourceUrl(url: String): BarChartBuilder = js.native
  /** Sets the data table to use for the chart using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): BarChartBuilder = js.native
  /** Sets the data table which contains the lines for the chart, as well as the X-axis labels. The first column should be a string, and contain the horizontal axis labels. Any number of columns can follow, all must be numeric. Each column is displayed as a separate line. */
  def setDataTable(table: DataTableSource): BarChartBuilder = js.native
  /** Sets the data view definition to use for the chart. */
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): BarChartBuilder = js.native
  /** Sets the dimensions for the chart. */
  def setDimensions(width: Int, height: Int): BarChartBuilder = js.native
  /** Sets the position of the legend with respect to the chart. By default, there will be no legend. */
  def setLegendPosition(position: Position): BarChartBuilder = js.native
  /** Sets the text style of the chart legend. */
  def setLegendTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  /**
   */
  def setOption(option: String, value: AnyRef): BarChartBuilder = js.native
  /** Sets the range for the chart. */
  def setRange(start: Number, end: Number): BarChartBuilder = js.native
  /** Uses stacked lines, meaning that line and bar values are stacked (accumulated). By default, there is no stacking. */
  def setStacked(): BarChartBuilder = js.native
  /** Sets the title of the chart. The title will be displayed centered above the chart. */
  def setTitle(chartTitle: String): BarChartBuilder = js.native
  /** Sets the text style of the chart title. */
  def setTitleTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  /** Sets the horizontal axis text style. */
  def setXAxisTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  /** Adds a title to the horizontal axis. The title will be centered and will appear below the axis value labels. */
  def setXAxisTitle(title: String): BarChartBuilder = js.native
  /** Sets the horizontal axis title text style. */
  def setXAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  /** Sets the vertical axis text style. */
  def setYAxisTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  /** Adds a title to the vertical axis. The title will be centered and will appear to the left of the value labels. */
  def setYAxisTitle(title: String): BarChartBuilder = js.native
  /** Sets the vertical axis title text style. */
  def setYAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  /** Makes the range axis into a logarithmic scale (requires all values to be positive). The range axis will be the vertical axis for vertical charts (line, area, column, etc.) and the horizontal axis for horizontal charts (bar, etc.) */
  def useLogScale(): BarChartBuilder = js.native
}
