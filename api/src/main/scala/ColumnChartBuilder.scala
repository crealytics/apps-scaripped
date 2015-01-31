/**
 * ColumnChartBuilder Builder for column charts. For more details, see the Google Charts documentation. This example shows how to create a column chart with data from a data table. 
 *  
 * 
 *   function doGet() {
 *    var sampleData = Charts.newDataTable()
 *        .addColumn(Charts.ColumnType.STRING, "Year")
 *        .addColumn(Charts.ColumnType.NUMBER, "Sales")
 *        .addColumn(Charts.ColumnType.NUMBER, "Expenses")
 *        .addRow(["2004", 1000, 400])
 *        .addRow(["2005", 1170, 460])
 *        .addRow(["2006", 660, 1120])
 *        .addRow(["2007", 1030, 540])
 *        .addRow(["2008", 800, 600])
 *        .addRow(["2009", 943, 678])
 *        .addRow(["2010", 1020, 550])
 *        .addRow(["2011", 910, 700])
 *        .addRow(["2012", 1230, 840])
 *        .build();
 *    
 *    var chart = Charts.newColumnChart()
 *        .setTitle('Sales vs. Expenses')
 *        .setXAxisTitle('Year')
 *        .setYAxisTitle('Amount (USD)')
 *        .setDimensions(600, 500)
 *        .setDataTable(sampleData)
 *        .build();
 *    
 *    return UiApp.createApplication().add(chart);
 *  }
 */
trait ColumnChartBuilder {
  /** Builds the chart. */
  def build: Chart = ???
  /** Reverses the drawing of series in the domain axis. For vertical-range charts (such as line, area or column charts), this means the horizontal axis is drawn from right to left. For horizontal-range charts (such as bar charts), this means the vertical axis is drawn from top to bottom. For pie charts, this means the slices are drawn counterclockwise. */
  def reverseCategories: ColumnChartBuilder = ???
  /** Sets the background color for the chart. */
  def setBackgroundColor(cssValue: String): ColumnChartBuilder = ???
  /** Sets the colors for the lines in the chart. */
  def setColors(cssValues: Seq[String]): ColumnChartBuilder = ???
  /** Sets the data source URL that will be used to pull data in from an external source, such as Google Sheets. If a data source URL and a DataTable are provided, the data source URL is ignored. For more information about querying data sources, check out the Google Charts documentation. */
  def setDataSourceUrl(url: String): ColumnChartBuilder = ???
  /** Sets the data table to use for the chart using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): ColumnChartBuilder = ???
  /** Sets the data table which contains the lines for the chart, as well as the X-axis labels. The first column should be a string, and contain the horizontal axis labels. Any number of columns can follow, all must be numeric. Each column is displayed as a separate line. */
  def setDataTable(table: DataTableSource): ColumnChartBuilder = ???
  /** Sets the data view definition to use for the chart. */
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): ColumnChartBuilder = ???
  /** Sets the dimensions for the chart. */
  def setDimensions(width: Int)(height: Int): ColumnChartBuilder = ???
  /** Sets the position of the legend with respect to the chart. By default, there will be no legend. */
  def setLegendPosition(position: Position): ColumnChartBuilder = ???
  /** Sets the text style of the chart legend. */
  def setLegendTextStyle(textStyle: TextStyle): ColumnChartBuilder = ???
  /**
   */
  def setOption(option: String)(value: Object): ColumnChartBuilder = ???
  /** Sets the range for the chart. */
  def setRange(start: Number)(end: Number): ColumnChartBuilder = ???
  /** Uses stacked lines, meaning that line and bar values are stacked (accumulated). By default, there is no stacking. */
  def setStacked: ColumnChartBuilder = ???
  /** Sets the title of the chart. The title will be displayed centered above the chart. */
  def setTitle(chartTitle: String): ColumnChartBuilder = ???
  /** Sets the text style of the chart title. */
  def setTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder = ???
  /** Sets the horizontal axis text style. */
  def setXAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder = ???
  /** Adds a title to the horizontal axis. The title will be centered and will appear below the axis value labels. */
  def setXAxisTitle(title: String): ColumnChartBuilder = ???
  /** Sets the horizontal axis title text style. */
  def setXAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder = ???
  /** Sets the vertical axis text style. */
  def setYAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder = ???
  /** Adds a title to the vertical axis. The title will be centered and will appear to the left of the value labels. */
  def setYAxisTitle(title: String): ColumnChartBuilder = ???
  /** Sets the vertical axis title text style. */
  def setYAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder = ???
  /** Makes the range axis into a logarithmic scale (requires all values to be positive). The range axis will be the vertical axis for vertical charts (line, area, column, etc.) and the horizontal axis for horizontal charts (bar, etc.) */
  def useLogScale: ColumnChartBuilder = ???
}