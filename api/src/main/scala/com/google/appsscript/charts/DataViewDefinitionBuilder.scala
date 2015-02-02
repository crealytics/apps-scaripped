package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/**
 * DataViewDefinitionBuilder Builder for DataViewDefinition objects. Here's an example of using the builder. The data is imported from a Google spreadsheet.
 *
 *
 *  function doGet() {
 *    // This example creates two table charts side by side. One uses a data view definition to
 *    // restrict the number of displayed columns.
 *    var app = UiApp.createApplication();
 *    // Get sample data from a spreadsheet.
 *    var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AF' +
 *        '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=4&headers=-1';
 *
 *    // Create a chart to display all of the data.
 *    var originalChart = Charts.newTableChart()
 *        .setDimensions(600, 500)
 *        .setDataSourceUrl(dataSourceUrl)
 *        .build();
 *
 *    // Create another chart to display a subset of the data (only columns 1 and 4).
 *    var dataViewDefinition = Charts.newDataViewDefinition().setColumns([0, 3]);
 *    var limitedChart = Charts.newTableChart()
 *        .setDimensions(200, 500)
 *        .setDataSourceUrl(dataSourceUrl)
 *        .setDataViewDefinition(dataViewDefinition)
 *        .build();
 *
 *    var panel = app.createHorizontalPanel().setSpacing(15);
 *    panel.add(originalChart).add(limitedChart);
 *    return app.add(panel);
 *  }
 */
trait DataViewDefinitionBuilder extends js.Object {
  /** Builds and returns the data view definition object that was built using this builder. */
  def build: DataViewDefinition = js.native
  /** Sets the indexes of the column to include in the data view. This subset of column indexes refer to the columns of the data source that the data view will be derived from. */
  def setColumns(columns: Seq[Int]): DataViewDefinitionBuilder = js.native
}