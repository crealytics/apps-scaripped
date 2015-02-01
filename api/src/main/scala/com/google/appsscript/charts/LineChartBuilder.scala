package com.google.appsscript.charts

import com.google.appsscript.base._

/**
 * LineChartBuilder Builder for line charts. For more details, see the Google Charts documentation. Here is an example that shows how to build a line chart. The data is imported from a Google spreadsheet. 
 *  
 * 
 *  function doGet() {
 *    // Get sample data from a spreadsheet.
 *    var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AG5' +
 *        '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=2&headers=-1';
 *    
 *    var chartBuilder = Charts.newLineChart()
 *        .setTitle('Yearly Rainfall')
 *        .setXAxisTitle('Month')
 *        .setYAxisTitle('Rainfall (in)')
 *        .setDimensions(600, 500)
 *        .setCurveStyle(Charts.CurveStyle.SMOOTH)
 *        .setPointStyle(Charts.PointStyle.MEDIUM)
 *        .setDataSourceUrl(dataSourceUrl);
 *    
 *    var chart = chartBuilder.build();
 *    return UiApp.createApplication().add(chart);
 *  }
 */
trait LineChartBuilder {
  /** Builds the chart. */
  def build: Chart = ???
  /** Reverses the drawing of series in the domain axis. For vertical-range charts (such as line, area or column charts), this means the horizontal axis is drawn from right to left. For horizontal-range charts (such as bar charts), this means the vertical axis is drawn from top to bottom. For pie charts, this means the slices are drawn counterclockwise. */
  def reverseCategories: LineChartBuilder = ???
  /** Sets the background color for the chart. */
  def setBackgroundColor(cssValue: String): LineChartBuilder = ???
  /** Sets the colors for the lines in the chart. */
  def setColors(cssValues: Seq[String]): LineChartBuilder = ???
  /** Sets the style to use for curves in the chart. See CurveStyle for allowed curve styles. */
  def setCurveStyle(style: CurveStyle): LineChartBuilder = ???
  /** Sets the data source URL that will be used to pull data in from an external source, such as Google Sheets. If a data source URL and a DataTable are provided, the data source URL is ignored. For more information about querying data sources, check out the Google Charts documentation. */
  def setDataSourceUrl(url: String): LineChartBuilder = ???
  /** Sets the data table to use for the chart using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): LineChartBuilder = ???
  /** Sets the data table which contains the lines for the chart, as well as the X-axis labels. The first column should be a string, and contain the horizontal axis labels. Any number of columns can follow, all must be numeric. Each column is displayed as a separate line. */
  def setDataTable(table: DataTableSource): LineChartBuilder = ???
  /** Sets the data view definition to use for the chart. */
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): LineChartBuilder = ???
  /** Sets the dimensions for the chart. */
  def setDimensions(width: Int)(height: Int): LineChartBuilder = ???
  /** Sets the position of the legend with respect to the chart. By default, there will be no legend. */
  def setLegendPosition(position: Position): LineChartBuilder = ???
  /** Sets the text style of the chart legend. */
  def setLegendTextStyle(textStyle: TextStyle): LineChartBuilder = ???
  /**
   */
  def setOption(option: String)(value: Object): LineChartBuilder = ???
  /** Sets the style for points in the line. By default, points will have no particular styles, and only the line will be visible. */
  def setPointStyle(style: PointStyle): LineChartBuilder = ???
  /** Sets the range for the chart. */
  def setRange(start: Number)(end: Number): LineChartBuilder = ???
  /** Sets the title of the chart. The title will be displayed centered above the chart. */
  def setTitle(chartTitle: String): LineChartBuilder = ???
  /** Sets the text style of the chart title. */
  def setTitleTextStyle(textStyle: TextStyle): LineChartBuilder = ???
  /** Sets the horizontal axis text style. */
  def setXAxisTextStyle(textStyle: TextStyle): LineChartBuilder = ???
  /** Adds a title to the horizontal axis. The title will be centered and will appear below the axis value labels. */
  def setXAxisTitle(title: String): LineChartBuilder = ???
  /** Sets the horizontal axis title text style. */
  def setXAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder = ???
  /** Sets the vertical axis text style. */
  def setYAxisTextStyle(textStyle: TextStyle): LineChartBuilder = ???
  /** Adds a title to the vertical axis. The title will be centered and will appear to the left of the value labels. */
  def setYAxisTitle(title: String): LineChartBuilder = ???
  /** Sets the vertical axis title text style. */
  def setYAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder = ???
  /** Makes the range axis into a logarithmic scale (requires all values to be positive). The range axis will be the vertical axis for vertical charts (line, area, column, etc.) and the horizontal axis for horizontal charts (bar, etc.) */
  def useLogScale: LineChartBuilder = ???
}