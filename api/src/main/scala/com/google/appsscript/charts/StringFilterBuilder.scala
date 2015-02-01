package com.google.appsscript.charts

import com.google.appsscript.base._

/**
 * StringFilterBuilder A builder for string filter controls. A string filter is a simple text input field that lets the user filter data via string matching. Given a column of type string and matching options, this control will filter out the rows that don't match the term that's in the input field. This example creates a table chart and binds it to a string filter. Using the filter, it is possible to change the table chart to display a subset of its data. 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
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
 *    var chart = Charts.newTableChart()
 *        .setDimensions(600, 500)
 *        .build();
 *        
 *    var stringFilter = Charts.newStringFilter()
 *        .setFilterColumnLabel("Month")
 *        .setRealtimeTrigger(true)
 *        .setCaseSensitive(true)
 *        .setLabel("Filter months shown")
 *        .build();
 *    
 *    var panel = app.createVerticalPanel().setSpacing(10);
 *    panel.add(stringFilter).add(chart);
 *    
 *    // Create a dashboard panel to bind the filter and the chart together.
 *    var dashboard = Charts.newDashboardPanel()
 *        .setDataTable(sampleData)
 *        .bind(stringFilter, chart)
 *        .build();
 *        
 *    dashboard.add(panel);
 *    app.add(dashboard);
 *    return app;
 *  }
 *  
 *  For more details, see the Gviz documentation.
 */
trait StringFilterBuilder {
  /** Builds a control. */
  def build: Control = ???
  /** Sets whether matching should be case sensitive or not. */
  def setCaseSensitive(caseSensitive: Boolean): StringFilterBuilder = ???
  /** Sets the data table to use for the control using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): StringFilterBuilder = ???
  /** Sets the control data table, which will be the control's underlying data model. */
  def setDataTable(table: DataTableSource): StringFilterBuilder = ???
  /** Sets the index of the data table column to filter on. The values of that column will determine whether or not each row should be filtered. It is mandatory to set either this or the column label using setFilterColumnLabel(columnLabel). */
  def setFilterColumnIndex(columnIndex: Int): StringFilterBuilder = ???
  /** Sets the label of the data table column to filter on. The values of that column will determine whether or not each row should be filtered. It is mandatory to set either this or a column index using setFilterColumnIndex(columnIndex). */
  def setFilterColumnLabel(columnLabel: String): StringFilterBuilder = ???
  /** Sets the label to display next to the slider. If unspecified, the label of the column the control operates on will be used. */
  def setLabel(label: String): StringFilterBuilder = ???
  /** Sets a separator string appended to the label, to visually separate the label from the category picker. */
  def setLabelSeparator(labelSeparator: String): StringFilterBuilder = ???
  /** Sets whether the label should display above (vertical stacking) or beside (horizontal stacking) the input field. */
  def setLabelStacking(orientation: Orientation): StringFilterBuilder = ???
  /** Sets whether the control should match exact values only (MatchType.EXACT), prefixes starting from the beginning of the value (MatchType.PREFIX), or any substring (MatchType.ANY). */
  def setMatchType(matchType: MatchType): StringFilterBuilder = ???
  /** Sets whether the control should match any time a key is pressed or only when the input field 'changes' (loss of focus or pressing the Enter key). */
  def setRealtimeTrigger(realtimeTrigger: Boolean): StringFilterBuilder = ???
}