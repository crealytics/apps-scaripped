package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import scala.scalajs.js

/**
 * EmbeddedChart Represents a chart that has been embedded into a Spreadsheet. This example shows how to modify an existing chart:
 *
 *
 *  var sheet = SpreadsheetApp.getActiveSheet();
 *  var range = sheet.getRange("A2:B8")
 *  var chart = sheet.getCharts()[0];
 *  chart = chart.modify()
 *      .addRange(range)
 *      .setOption('title', 'Updated!')
 *      .setOption('animation.duration', 500)
 *      .setPosition(2,2,0,0)
 *      .build();
 *  sheet.updateChart(chart);
 *
 *  This example shows how to create a new chart:
 *
 *  function newChart(range, sheet) {
 *    var sheet = SpreadsheetApp.getActiveSheet();
 *    var chartBuilder = sheet.newChart();
 *    chartBuilder.addRange(range)
 *        .setChartType(Charts.ChartType.LINE)
 *        .setOption('title', 'My Line Chart!');
 *    sheet.insertChart(chartBuilder.build());
 *  }
 */
trait EmbeddedChart extends js.Object {
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = js.native
  /** Return the data inside this object as a blob. */
  def getBlob: Blob = js.native
  /** Returns information about where the chart is positioned within a sheet. */
  def getContainerInfo: ContainerInfo = js.native
  /** Returns the id that has been assigned to this object. */
  def getId: String = js.native
  /** Returns the options for this chart, such as height, colors, axes, etc. */
  def getOptions: ChartOptions = js.native
  /** Returns the Ranges that this chart uses as a data source. */
  def getRanges: Seq[Range] = js.native
  /** Gets the type of this object. */
  def getType: String = js.native
  /** Returns an EmbeddedChartBuilder that can be used to modify this chart. Remember to invoke sheet.updateChart(chart) to save your changes. */
  def modify: EmbeddedChartBuilder = js.native
  /** Sets the id of this EmbeddedChart to be used with UiApp. */
  def setId(id: String): Chart = js.native
}