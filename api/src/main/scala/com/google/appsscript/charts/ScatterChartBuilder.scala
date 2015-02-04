package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/**
 * ScatterChartBuilder Builder for scatter charts. For more details, see the Google Charts documentation. Here is an example that shows how to build a scatter chart. The data is imported from a Google spreadsheet. 
 *  
 * 
 *  function doGet() {
 *    // Get sample data from a spreadsheet.
 *    var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=C1%3AD' +
 *        '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=4&headers=-1';
 *    
 *    var chartBuilder = Charts.newScatterChart()
 *        .setTitle('Adjusted GDP vs. U.S. Population')
 *        .setXAxisTitle('U.S. Population (millions)')
 *        .setYAxisTitle('Adjusted GDP ($ billions)')
 *        .setDimensions(600, 500)
 *        .setLegendPosition(Charts.Position.NONE)
 *        .setDataSourceUrl(dataSourceUrl);
 *    
 *    var chart = chartBuilder.build();
 *    return UiApp.createApplication().add(chart);
 *  }
 */
trait ScatterChartBuilder extends js.Object {
  /** Builds the chart. */
  def build(): Chart = js.native
  /** Sets the background color for the chart. */
  def setBackgroundColor(cssValue: String): ScatterChartBuilder = js.native
  /** Sets the colors for the lines in the chart. */
  def setColors(cssValues: Seq[String]): ScatterChartBuilder = js.native
  /** Sets the data source URL that will be used to pull data in from an external source, such as Google Sheets. If a data source URL and a DataTable are provided, the data source URL is ignored. For more information about querying data sources, check out the Google Charts documentation. */
  def setDataSourceUrl(url: String): ScatterChartBuilder = js.native
  /** Sets the data table to use for the chart using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): ScatterChartBuilder = js.native
  /** Sets the data table which contains the lines for the chart, as well as the X-axis labels. The first column should be a string, and contain the horizontal axis labels. Any number of columns can follow, all must be numeric. Each column is displayed as a separate line. */
  def setDataTable(table: DataTableSource): ScatterChartBuilder = js.native
  /** Sets the data view definition to use for the chart. */
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): ScatterChartBuilder = js.native
  /** Sets the dimensions for the chart. */
  def setDimensions(width: Int, height: Int): ScatterChartBuilder = js.native
  /** Sets the position of the legend with respect to the chart. By default, there will be no legend. */
  def setLegendPosition(position: Position): ScatterChartBuilder = js.native
  /** Sets the text style of the chart legend. */
  def setLegendTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  /**
   */
  def setOption(option: String, value: AnyRef): ScatterChartBuilder = js.native
  /** Sets the style for points in the line. By default, points will have no particular styles, and only the line will be visible. */
  def setPointStyle(style: PointStyle): ScatterChartBuilder = js.native
  /** Sets the title of the chart. The title will be displayed centered above the chart. */
  def setTitle(chartTitle: String): ScatterChartBuilder = js.native
  /** Sets the text style of the chart title. */
  def setTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  /** Makes the horizontal axis into a logarithmic scale (requires all values to be positive). */
  def setXAxisLogScale(): ScatterChartBuilder = js.native
  /** Sets the range for the horizontal axis of the chart. */
  def setXAxisRange(start: Number, end: Number): ScatterChartBuilder = js.native
  /** Sets the horizontal axis text style. */
  def setXAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  /** Adds a title to the horizontal axis. The title will be centered and will appear below the axis value labels. */
  def setXAxisTitle(title: String): ScatterChartBuilder = js.native
  /** Sets the horizontal axis title text style. */
  def setXAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  /** Makes the vertical axis into a logarithmic scale (requires all values to be positive). */
  def setYAxisLogScale(): ScatterChartBuilder = js.native
  /** Sets the range for the vertical axis of the chart. If any data points fall outside the range, the range will be expanded to include those data points. */
  def setYAxisRange(start: Number, end: Number): ScatterChartBuilder = js.native
  /** Sets the vertical axis text style. */
  def setYAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  /** Adds a title to the vertical axis. The title will be centered and will appear to the left of the value labels. */
  def setYAxisTitle(title: String): ScatterChartBuilder = js.native
  /** Sets the vertical axis title text style. */
  def setYAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
}
