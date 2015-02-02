package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import scala.scalajs.js

/** EmbeddedScatterChartBuilder Builder for scatter charts. For more details, see the Gviz documentation. */
trait EmbeddedScatterChartBuilder extends js.Object {
  /** Adds a Range to the chart represented by this builder. Will not add the Range if it has already been added to the chart. */
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  /** Sets the chart type to AreaChart and returns an EmbeddedAreaChartBuilder. */
  def asAreaChart: EmbeddedAreaChartBuilder = js.native
  /** Sets the chart type to BarChart and returns an EmbeddedBarChartBuilder. */
  def asBarChart: EmbeddedBarChartBuilder = js.native
  /** Sets the chart type to ColumnChart and returns an EmbeddedColumnChartBuilder. */
  def asColumnChart: EmbeddedColumnChartBuilder = js.native
  /** Sets the chart type to LineChart and returns an EmbeddedLineChartBuilder. */
  def asLineChart: EmbeddedLineChartBuilder = js.native
  /** Sets the chart type to PieChart and returns an EmbeddedPieChartBuilder. */
  def asPieChart: EmbeddedPieChartBuilder = js.native
  /** Sets the chart type to ScatterChart and returns an EmbeddedScatterChartBuilder. */
  def asScatterChart: EmbeddedScatterChartBuilder = js.native
  /** Sets the chart type to TableChart and returns an EmbeddedTableChartBuilder. */
  def asTableChart: EmbeddedTableChartBuilder = js.native
  /** Builds the chart to reflect all changes made to it. This method will not automatically draw the chart on top of the spreadsheet. A new chart must be inserted via sheet.insertChart(chart), and an existing chart should be updated via sheet.update(chart); */
  def build: EmbeddedChart = js.native
  /** Returns the current chart type. */
  def getChartType: ChartType = js.native
  /** Return the ContainerInfo, which encapsulates where the chart appears on the sheet. */
  def getContainer: ContainerInfo = js.native
  /** Returns a copy of the list of ranges currently providing data for this chart. Use addRange and removeRange to modify this list. */
  def getRanges: Seq[Range] = js.native
  /** Removes the specified Range from the chart represented by this builder. Will not throw an error if the Range is not in this chart. The range removed must match up with a range added via addRange(range), or it will not be removed, and it will not throw an exception. This method cannot be used to partially remove values from a range. */
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  /** Sets the background color for the chart. */
  def setBackgroundColor(cssValue: String): EmbeddedScatterChartBuilder = js.native
  /** Changes the type of chart. Not all embedded chart types are currently supported. See ChartType. */
  def setChartType(`type`: ChartType): EmbeddedChartBuilder = js.native
  /** Sets the colors for the lines in the chart. */
  def setColors(cssValues: Seq[String]): EmbeddedScatterChartBuilder = js.native
  /** Sets the position of the legend with respect to the chart. By default, there will be no legend. */
  def setLegendPosition(position: Position): EmbeddedScatterChartBuilder = js.native
  /** Sets the text style of the chart legend. */
  def setLegendTextStyle(textStyle: TextStyle): EmbeddedScatterChartBuilder = js.native
  /**
   */
  def setOption(option: String, value: AnyRef): EmbeddedChartBuilder = js.native
  /** Sets the style for points in the line. By default, points will have no particular styles, and only the line will be visible. */
  def setPointStyle(style: PointStyle): EmbeddedScatterChartBuilder = js.native
  /** Sets the position, changing where the chart appears on the sheet. AnchorRowPos and AnchorColPos are 1-indexed. */
  def setPosition(anchorRowPos: Int, anchorColPos: Int, offsetX: Int, offsetY: Int): EmbeddedChartBuilder = js.native
  /** Sets the title of the chart. The title will be displayed centered above the chart. */
  def setTitle(chartTitle: String): EmbeddedScatterChartBuilder = js.native
  /** Sets the text style of the chart title. */
  def setTitleTextStyle(textStyle: TextStyle): EmbeddedScatterChartBuilder = js.native
  /** Makes the horizontal axis into a logarithmic scale (requires all values to be positive). */
  def setXAxisLogScale: EmbeddedScatterChartBuilder = js.native
  /** Sets the range for the horizontal axis of the chart. */
  def setXAxisRange(start: Number, end: Number): EmbeddedScatterChartBuilder = js.native
  /** Sets the horizontal axis text style. */
  def setXAxisTextStyle(textStyle: TextStyle): EmbeddedScatterChartBuilder = js.native
  /** Adds a title to the horizontal axis. The title will be centered and will appear below the axis value labels. */
  def setXAxisTitle(title: String): EmbeddedScatterChartBuilder = js.native
  /** Sets the horizontal axis title text style. */
  def setXAxisTitleTextStyle(textStyle: TextStyle): EmbeddedScatterChartBuilder = js.native
  /** Makes the vertical axis into a logarithmic scale (requires all values to be positive). */
  def setYAxisLogScale: EmbeddedScatterChartBuilder = js.native
  /** Sets the range for the vertical axis of the chart. If any data points fall outside the range, the range will be expanded to include those data points. */
  def setYAxisRange(start: Number, end: Number): EmbeddedScatterChartBuilder = js.native
  /** Sets the vertical axis text style. */
  def setYAxisTextStyle(textStyle: TextStyle): EmbeddedScatterChartBuilder = js.native
  /** Adds a title to the vertical axis. The title will be centered and will appear to the left of the value labels. */
  def setYAxisTitle(title: String): EmbeddedScatterChartBuilder = js.native
  /** Sets the vertical axis title text style. */
  def setYAxisTitleTextStyle(textStyle: TextStyle): EmbeddedScatterChartBuilder = js.native
}