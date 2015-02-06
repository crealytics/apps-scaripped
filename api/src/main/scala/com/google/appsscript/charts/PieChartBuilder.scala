package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/**
 * PieChartBuilder A builder for pie charts. For more details, see the Google Charts documentation. Here is an example that shows how to build a pie chart. The data is imported from a Google spreadsheet. 
 *  
 * 
 *  function doGet() {
 *    // Get sample data from a spreadsheet.
 *    var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AB8' +
 *        '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=3&headers=-1';
 *    
 *    var chartBuilder = Charts.newPieChart()
 *        .setTitle('World Population by Continent')
 *        .setDimensions(600, 500)
 *        .set3D()
 *        .setDataSourceUrl(dataSourceUrl);
 *    
 *    var chart = chartBuilder.build();
 *    return UiApp.createApplication().add(chart);
 *  }
 */
trait PieChartBuilder extends js.Object {
  /** Builds the chart. */
  def build(): Chart = js.native
  /** Reverses the drawing of series in the domain axis. For vertical-range charts (such as line, area or column charts), this means the horizontal axis is drawn from right to left. For horizontal-range charts (such as bar charts), this means the vertical axis is drawn from top to bottom. For pie charts, this means the slices are drawn counterclockwise. */
  def reverseCategories(): PieChartBuilder = js.native
  /** Sets the chart to be three-dimensional. */
  def set3D(): PieChartBuilder = js.native
  /** Sets the background color for the chart. */
  def setBackgroundColor(cssValue: String): PieChartBuilder = js.native
  /** Sets the colors for the lines in the chart. */
  def setColors(cssValues: js.Array[String]): PieChartBuilder = js.native
  /** Sets the data source URL that will be used to pull data in from an external source, such as Google Sheets. If a data source URL and a DataTable are provided, the data source URL is ignored. For more information about querying data sources, check out the Google Charts documentation. */
  def setDataSourceUrl(url: String): PieChartBuilder = js.native
  /** Sets the data table to use for the chart using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): PieChartBuilder = js.native
  /** Sets the data table which contains the lines for the chart, as well as the X-axis labels. The first column should be a string, and contain the horizontal axis labels. Any number of columns can follow, all must be numeric. Each column is displayed as a separate line. */
  def setDataTable(table: DataTableSource): PieChartBuilder = js.native
  /** Sets the data view definition to use for the chart. */
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): PieChartBuilder = js.native
  /** Sets the dimensions for the chart. */
  def setDimensions(width: Int, height: Int): PieChartBuilder = js.native
  /** Sets the position of the legend with respect to the chart. By default, there will be no legend. */
  def setLegendPosition(position: Position): PieChartBuilder = js.native
  /** Sets the text style of the chart legend. */
  def setLegendTextStyle(textStyle: TextStyle): PieChartBuilder = js.native
  /**
   */
  def setOption(option: String, value: AnyRef): PieChartBuilder = js.native
  /** Sets the title of the chart. The title will be displayed centered above the chart. */
  def setTitle(chartTitle: String): PieChartBuilder = js.native
  /** Sets the text style of the chart title. */
  def setTitleTextStyle(textStyle: TextStyle): PieChartBuilder = js.native
}
