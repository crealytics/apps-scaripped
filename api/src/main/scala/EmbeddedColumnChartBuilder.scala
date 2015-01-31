/** EmbeddedColumnChartBuilder Builder for column charts. For more details, see the Gviz documentation. */
trait EmbeddedColumnChartBuilder {
  /** Adds a Range to the chart represented by this builder. Will not add the Range if it has already been added to the chart. */
  def addRange(range: Range): EmbeddedChartBuilder = ???
  /** Sets the chart type to AreaChart and returns an EmbeddedAreaChartBuilder. */
  def asAreaChart: EmbeddedAreaChartBuilder = ???
  /** Sets the chart type to BarChart and returns an EmbeddedBarChartBuilder. */
  def asBarChart: EmbeddedBarChartBuilder = ???
  /** Sets the chart type to ColumnChart and returns an EmbeddedColumnChartBuilder. */
  def asColumnChart: EmbeddedColumnChartBuilder = ???
  /** Sets the chart type to LineChart and returns an EmbeddedLineChartBuilder. */
  def asLineChart: EmbeddedLineChartBuilder = ???
  /** Sets the chart type to PieChart and returns an EmbeddedPieChartBuilder. */
  def asPieChart: EmbeddedPieChartBuilder = ???
  /** Sets the chart type to ScatterChart and returns an EmbeddedScatterChartBuilder. */
  def asScatterChart: EmbeddedScatterChartBuilder = ???
  /** Sets the chart type to TableChart and returns an EmbeddedTableChartBuilder. */
  def asTableChart: EmbeddedTableChartBuilder = ???
  /** Builds the chart to reflect all changes made to it. This method will not automatically draw the chart on top of the spreadsheet. A new chart must be inserted via sheet.insertChart(chart), and an existing chart should be updated via sheet.update(chart); */
  def build: EmbeddedChart = ???
  /** Returns the current chart type. */
  def getChartType: ChartType = ???
  /** Return the ContainerInfo, which encapsulates where the chart appears on the sheet. */
  def getContainer: ContainerInfo = ???
  /** Returns a copy of the list of ranges currently providing data for this chart. Use addRange and removeRange to modify this list. */
  def getRanges: Seq[Range] = ???
  /** Removes the specified Range from the chart represented by this builder. Will not throw an error if the Range is not in this chart. The range removed must match up with a range added via addRange(range), or it will not be removed, and it will not throw an exception. This method cannot be used to partially remove values from a range. */
  def removeRange(range: Range): EmbeddedChartBuilder = ???
  /** Reverses the drawing of series in the domain axis. For vertical-range charts (such as line, area or column charts), this means the horizontal axis is drawn from right to left. For horizontal-range charts (such as bar charts), this means the vertical axis is drawn from top to bottom. For pie charts, this means the slices are drawn counterclockwise. */
  def reverseCategories: EmbeddedColumnChartBuilder = ???
  /** Sets the background color for the chart. */
  def setBackgroundColor(cssValue: String): EmbeddedColumnChartBuilder = ???
  /** Changes the type of chart. Not all embedded chart types are currently supported. See ChartType. */
  def setChartType(`type`: ChartType): EmbeddedChartBuilder = ???
  /** Sets the colors for the lines in the chart. */
  def setColors(cssValues: Seq[String]): EmbeddedColumnChartBuilder = ???
  /** Sets the position of the legend with respect to the chart. By default, there will be no legend. */
  def setLegendPosition(position: Position): EmbeddedColumnChartBuilder = ???
  /** Sets the text style of the chart legend. */
  def setLegendTextStyle(textStyle: TextStyle): EmbeddedColumnChartBuilder = ???
  /**
   */
  def setOption(option: String)(value: Object): EmbeddedChartBuilder = ???
  /** Sets the position, changing where the chart appears on the sheet. AnchorRowPos and AnchorColPos are 1-indexed. */
  def setPosition(anchorRowPos: Int)(anchorColPos: Int)(offsetX: Int)(offsetY: Int): EmbeddedChartBuilder = ???
  /** Sets the range for the chart. */
  def setRange(start: Number)(end: Number): EmbeddedColumnChartBuilder = ???
  /** Uses stacked lines, meaning that line and bar values are stacked (accumulated). By default, there is no stacking. */
  def setStacked: EmbeddedColumnChartBuilder = ???
  /** Sets the title of the chart. The title will be displayed centered above the chart. */
  def setTitle(chartTitle: String): EmbeddedColumnChartBuilder = ???
  /** Sets the text style of the chart title. */
  def setTitleTextStyle(textStyle: TextStyle): EmbeddedColumnChartBuilder = ???
  /** Sets the horizontal axis text style. */
  def setXAxisTextStyle(textStyle: TextStyle): EmbeddedColumnChartBuilder = ???
  /** Adds a title to the horizontal axis. The title will be centered and will appear below the axis value labels. */
  def setXAxisTitle(title: String): EmbeddedColumnChartBuilder = ???
  /** Sets the horizontal axis title text style. */
  def setXAxisTitleTextStyle(textStyle: TextStyle): EmbeddedColumnChartBuilder = ???
  /** Sets the vertical axis text style. */
  def setYAxisTextStyle(textStyle: TextStyle): EmbeddedColumnChartBuilder = ???
  /** Adds a title to the vertical axis. The title will be centered and will appear to the left of the value labels. */
  def setYAxisTitle(title: String): EmbeddedColumnChartBuilder = ???
  /** Sets the vertical axis title text style. */
  def setYAxisTitleTextStyle(textStyle: TextStyle): EmbeddedColumnChartBuilder = ???
  /** Makes the range axis into a logarithmic scale (requires all values to be positive). The range axis will be the vertical axis for vertical charts (line, area, column, etc.) and the horizontal axis for horizontal charts (bar, etc.) */
  def useLogScale: EmbeddedColumnChartBuilder = ???
}