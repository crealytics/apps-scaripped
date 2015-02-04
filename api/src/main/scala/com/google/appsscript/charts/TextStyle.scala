package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/**
 * TextStyle A text style configuration object. Used in charts options to configure text style for elements that accepts it, such as title, horizontal axis, vertical axis, legend and tooltip. 
 *  
 * 
 *  // This example creates a chart specifying different text styles for the title and axes.
 *  function doGet() {
 *    var sampleData = Charts.newDataTable()
 *        .addColumn(Charts.ColumnType.STRING, "Seasons")
 *        .addColumn(Charts.ColumnType.NUMBER, "Rainy Days")
 *        .addRow(["Winter", 5])
 *        .addRow(["Spring", 12])
 *        .addRow(["Summer", 8])
 *        .addRow(["Fall", 8])
 *        .build();
 * 
 *    var titleTextStyleBuilder = Charts.newTextStyle()
 *        .setColor('#0000FF').setFontSize(26).setFontName('Ariel');
 *    var axisTextStyleBuilder = Charts.newTextStyle()
 *        .setColor('#3A3A3A').setFontSize(20).setFontName('Ariel');
 *    var titleTextStyle = titleTextStyleBuilder.build();
 *    var axisTextStyle = axisTextStyleBuilder.build();
 * 
 *    var chart = Charts.newLineChart()
 *        .setTitleTextStyle(titleTextStyle)
 *        .setXAxisTitleTextStyle(axisTextStyle)
 *        .setYAxisTitleTextStyle(axisTextStyle)
 *        .setTitle('Rainy Days Per Season')
 *        .setXAxisTitle('Season')
 *        .setYAxisTitle('Number of Rainy Days')
 *        .setDataTable(sampleData)
 *        .build();
 * 
 *    return UiApp.createApplication().add(chart);
 *  }
 */
trait TextStyle extends js.Object {
  /** Gets the color of the text style. */
  def getColor(): String = js.native
  /** Gets the font name of the text style. */
  def getFontName(): String = js.native
  /** Gets the font size of the text style. */
  def getFontSize(): Number = js.native
}