package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import scala.scalajs.js

/** EmbeddedPieChartBuilder Builder for pie charts. For more details, see the Gviz documentation. */
trait EmbeddedPieChartBuilder extends js.Object {
  /** Adds a Range to the chart represented by this builder. Will not add the Range if it has already been added to the chart. */
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  /** Sets the chart type to AreaChart and returns an EmbeddedAreaChartBuilder. */
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  /** Sets the chart type to BarChart and returns an EmbeddedBarChartBuilder. */
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  /** Sets the chart type to ColumnChart and returns an EmbeddedColumnChartBuilder. */
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  /** Sets the chart type to LineChart and returns an EmbeddedLineChartBuilder. */
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  /** Sets the chart type to PieChart and returns an EmbeddedPieChartBuilder. */
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  /** Sets the chart type to ScatterChart and returns an EmbeddedScatterChartBuilder. */
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  /** Sets the chart type to TableChart and returns an EmbeddedTableChartBuilder. */
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  /** Builds the chart to reflect all changes made to it. This method will not automatically draw the chart on top of the spreadsheet. A new chart must be inserted via sheet.insertChart(chart), and an existing chart should be updated via sheet.update(chart); */
  def build(): EmbeddedChart = js.native
  /** Returns the current chart type. */
  def getChartType(): ChartType = js.native
  /** Return the ContainerInfo, which encapsulates where the chart appears on the sheet. */
  def getContainer(): ContainerInfo = js.native
  /** Returns a copy of the list of ranges currently providing data for this chart. Use addRange and removeRange to modify this list. */
  def getRanges(): js.Array[Range] = js.native
  /** Removes the specified Range from the chart represented by this builder. Will not throw an error if the Range is not in this chart. The range removed must match up with a range added via addRange(range), or it will not be removed, and it will not throw an exception. This method cannot be used to partially remove values from a range. */
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  /** Reverses the drawing of series in the domain axis. For vertical-range charts (such as line, area or column charts), this means the horizontal axis is drawn from right to left. For horizontal-range charts (such as bar charts), this means the vertical axis is drawn from top to bottom. For pie charts, this means the slices are drawn counterclockwise. */
  def reverseCategories(): EmbeddedPieChartBuilder = js.native
  /** Sets the chart to be three-dimensional. */
  def set3D(): EmbeddedPieChartBuilder = js.native
  /** Sets the background color for the chart. */
  def setBackgroundColor(cssValue: String): EmbeddedPieChartBuilder = js.native
  /** Changes the type of chart. Not all embedded chart types are currently supported. See ChartType. */
  def setChartType(`type`: ChartType): EmbeddedChartBuilder = js.native
  /** Sets the colors for the lines in the chart. */
  def setColors(cssValues: js.Array[String]): EmbeddedPieChartBuilder = js.native
  /** Sets the position of the legend with respect to the chart. By default, there will be no legend. */
  def setLegendPosition(position: Position): EmbeddedPieChartBuilder = js.native
  /** Sets the text style of the chart legend. */
  def setLegendTextStyle(textStyle: TextStyle): EmbeddedPieChartBuilder = js.native
  /**
   */
  def setOption(option: String, value: AnyRef): EmbeddedChartBuilder = js.native
  /** Sets the position, changing where the chart appears on the sheet. AnchorRowPos and AnchorColPos are 1-indexed. */
  def setPosition(anchorRowPos: Int, anchorColPos: Int, offsetX: Int, offsetY: Int): EmbeddedChartBuilder = js.native
  /** Sets the title of the chart. The title will be displayed centered above the chart. */
  def setTitle(chartTitle: String): EmbeddedPieChartBuilder = js.native
  /** Sets the text style of the chart title. */
  def setTitleTextStyle(textStyle: TextStyle): EmbeddedPieChartBuilder = js.native
}
