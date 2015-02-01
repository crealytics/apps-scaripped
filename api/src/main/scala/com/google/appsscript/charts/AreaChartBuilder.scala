package com.google.appsscript.charts

import com.google.appsscript.base._

/**
 * AreaChartBuilder Builder for area charts. For more details, see the Google Charts documentation. Here is an example that shows how to build an area chart. 
 *  
 * 
 *  function doGet() {
 *    // Create a data table with some sample data.
 *    var sampleData = Charts.newDataTable()
 *        .addColumn(Charts.ColumnType.STRING, "Month")
 *        .addColumn(Charts.ColumnType.NUMBER, "Dining")
 *        .addColumn(Charts.ColumnType.NUMBER, "Total")
 *        .addRow(["Jan", 60, 520])
 *        .addRow(["Feb", 50, 430])
 *        .addRow(["Mar", 53, 440])
 *        .addRow(["Apr", 70, 410])
 *        .addRow(["May", 80, 390])
 *        .addRow(["Jun", 60, 500])
 *        .addRow(["Jul", 100, 450])
 *        .addRow(["Aug", 140, 431])
 *        .addRow(["Sep", 75, 488])
 *        .addRow(["Oct", 70, 521])
 *        .addRow(["Nov", 58, 388])
 *        .addRow(["Dec", 63, 400])
 *        .build();
 *    
 *    var chart = Charts.newAreaChart()
 *        .setTitle('Yearly Spending')
 *        .setXAxisTitle('Month')
 *        .setYAxisTitle('Spending (USD)')
 *        .setDimensions(600, 500)
 *        .setStacked()
 *        .setColors(['red', 'green'])
 *        .setDataTable(sampleData)
 *        .build();
 *    
 *    return UiApp.createApplication().add(chart);
 *  }
 */
trait AreaChartBuilder {
  /** Builds the chart. */
  def build: Chart = ???
  /** Reverses the drawing of series in the domain axis. For vertical-range charts (such as line, area or column charts), this means the horizontal axis is drawn from right to left. For horizontal-range charts (such as bar charts), this means the vertical axis is drawn from top to bottom. For pie charts, this means the slices are drawn counterclockwise. */
  def reverseCategories: AreaChartBuilder = ???
  /** Sets the background color for the chart. */
  def setBackgroundColor(cssValue: String): AreaChartBuilder = ???
  /** Sets the colors for the lines in the chart. */
  def setColors(cssValues: Seq[String]): AreaChartBuilder = ???
  /** Sets the data source URL that will be used to pull data in from an external source, such as Google Sheets. If a data source URL and a DataTable are provided, the data source URL is ignored. For more information about querying data sources, check out the Google Charts documentation. */
  def setDataSourceUrl(url: String): AreaChartBuilder = ???
  /** Sets the data table to use for the chart using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): AreaChartBuilder = ???
  /** Sets the data table which contains the lines for the chart, as well as the X-axis labels. The first column should be a string, and contain the horizontal axis labels. Any number of columns can follow, all must be numeric. Each column is displayed as a separate line. */
  def setDataTable(table: DataTableSource): AreaChartBuilder = ???
  /** Sets the data view definition to use for the chart. */
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): AreaChartBuilder = ???
  /** Sets the dimensions for the chart. */
  def setDimensions(width: Int)(height: Int): AreaChartBuilder = ???
  /** Sets the position of the legend with respect to the chart. By default, there will be no legend. */
  def setLegendPosition(position: Position): AreaChartBuilder = ???
  /** Sets the text style of the chart legend. */
  def setLegendTextStyle(textStyle: TextStyle): AreaChartBuilder = ???
  /**
   */
  def setOption(option: String)(value: Object): AreaChartBuilder = ???
  /** Sets the style for points in the line. By default, points will have no particular styles, and only the line will be visible. */
  def setPointStyle(style: PointStyle): AreaChartBuilder = ???
  /** Sets the range for the chart. */
  def setRange(start: Number)(end: Number): AreaChartBuilder = ???
  /** Uses stacked lines, meaning that line and bar values are stacked (accumulated). By default, there is no stacking. */
  def setStacked: AreaChartBuilder = ???
  /** Sets the title of the chart. The title will be displayed centered above the chart. */
  def setTitle(chartTitle: String): AreaChartBuilder = ???
  /** Sets the text style of the chart title. */
  def setTitleTextStyle(textStyle: TextStyle): AreaChartBuilder = ???
  /** Sets the horizontal axis text style. */
  def setXAxisTextStyle(textStyle: TextStyle): AreaChartBuilder = ???
  /** Adds a title to the horizontal axis. The title will be centered and will appear below the axis value labels. */
  def setXAxisTitle(title: String): AreaChartBuilder = ???
  /** Sets the horizontal axis title text style. */
  def setXAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder = ???
  /** Sets the vertical axis text style. */
  def setYAxisTextStyle(textStyle: TextStyle): AreaChartBuilder = ???
  /** Adds a title to the vertical axis. The title will be centered and will appear to the left of the value labels. */
  def setYAxisTitle(title: String): AreaChartBuilder = ???
  /** Sets the vertical axis title text style. */
  def setYAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder = ???
  /** Makes the range axis into a logarithmic scale (requires all values to be positive). The range axis will be the vertical axis for vertical charts (line, area, column, etc.) and the horizontal axis for horizontal charts (bar, etc.) */
  def useLogScale: AreaChartBuilder = ???
}