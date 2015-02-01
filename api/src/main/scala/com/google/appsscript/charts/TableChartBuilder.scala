package com.google.appsscript.charts

import com.google.appsscript.base._

/**
 * TableChartBuilder A builder for table charts. For more details, see the Google Charts documentation. Here is an example that shows how to build a table chart. The data is imported from a Google spreadsheet. 
 *  
 * 
 *  function doGet() {
 *    // Get sample data from a spreadsheet.
 *    var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AF' +
 *        '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=4&headers=-1';
 *    
 *    var chartBuilder = Charts.newTableChart()
 *        .setDimensions(600, 500)
 *        .enablePaging(20)
 *        .setDataSourceUrl(dataSourceUrl);
 *    
 *    var chart = chartBuilder.build();
 *    return UiApp.createApplication().add(chart);
 *  }
 */
trait TableChartBuilder {
  /** Builds the chart. */
  def build: Chart = ???
  /** Sets whether to enable paging through the data. */
  def enablePaging(enablePaging: Boolean): TableChartBuilder = ???
  /** Enables paging and sets the number of rows in each page. */
  def enablePaging(pageSize: Int): TableChartBuilder = ???
  /** Enables paging, sets the number of rows in each page and the first table page to display (page numbers are zero based). */
  def enablePaging(pageSize: Int)(startPage: Int): TableChartBuilder = ???
  /** Adds basic support for right-to-left languages (such as Arabic or Hebrew) by reversing the column order of the table, so that column zero is the right-most column, and the last column is the left-most column. */
  def enableRtlTable(rtlEnabled: Boolean): TableChartBuilder = ???
  /** Sets whether to sort columns when the user clicks a column heading. */
  def enableSorting(enableSorting: Boolean): TableChartBuilder = ???
  /** Sets the data source URL that will be used to pull data in from an external source, such as Google Sheets. If a data source URL and a DataTable are provided, the data source URL is ignored. For more information about querying data sources, check out the Google Charts documentation. */
  def setDataSourceUrl(url: String): TableChartBuilder = ???
  /** Sets the data table to use for the chart using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): TableChartBuilder = ???
  /** Sets the data table which contains the lines for the chart, as well as the X-axis labels. The first column should be a string, and contain the horizontal axis labels. Any number of columns can follow, all must be numeric. Each column is displayed as a separate line. */
  def setDataTable(table: DataTableSource): TableChartBuilder = ???
  /** Sets the data view definition to use for the chart. */
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): TableChartBuilder = ???
  /** Sets the dimensions for the chart. */
  def setDimensions(width: Int)(height: Int): TableChartBuilder = ???
  /** Sets the row number for the first row in the data table. */
  def setFirstRowNumber(number: Int): TableChartBuilder = ???
  /** Sets the index of the column according to which the table should be initially sorted (ascending). */
  def setInitialSortingAscending(column: Int): TableChartBuilder = ???
  /** Sets the index of the column according to which the table should be initially sorted (descending). */
  def setInitialSortingDescending(column: Int): TableChartBuilder = ???
  /**
   */
  def setOption(option: String)(value: Object): TableChartBuilder = ???
  /** Sets whether to show the row number as the first column of the table. */
  def showRowNumberColumn(showRowNumber: Boolean): TableChartBuilder = ???
  /** Sets whether alternating color style will be assigned to odd and even rows of a table chart. */
  def useAlternatingRowStyle(alternate: Boolean): TableChartBuilder = ???
}