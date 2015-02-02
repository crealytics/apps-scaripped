package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

/**
 * CategoryFilterBuilder A builder for category filter controls. A category filter is a picker to choose one or more between a set of defined values. Given a column of type string, this control will filter out the rows that don't match any of the picked values. Here is an example that creates a table chart a binds a category filter to it. This allows the user to filter the data the table displays. 
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
 *    var categoryFilter = Charts.newCategoryFilter()
 *        .setFilterColumnLabel("Month")
 *        .setAllowMultiple(true)
 *        .setSortValues(true)
 *        .setLabelStacking(Charts.Orientation.VERTICAL)
 *        .setCaption('Choose categories...')
 *        .setSortValues(true)
 *        .build();
 *    
 *    var panel = app.createVerticalPanel().setSpacing(10);
 *    panel.add(categoryFilter).add(chart);
 *    
 *    var dashboard = Charts.newDashboardPanel()
 *        .setDataTable(sampleData)
 *        .bind(categoryFilter, chart)
 *        .build();
 *        
 *    dashboard.add(panel);
 *    app.add(dashboard);
 *    return app;
 *  }
 *  
 *  For more details, see the Gviz documentation
 */
trait CategoryFilterBuilder {
  /** Builds a control. */
  def build: Control = ???
  /** Sets whether multiple values can be selected, rather than just one. The default value of this option is true (allowing multiple selection). */
  def setAllowMultiple(allowMultiple: Boolean): CategoryFilterBuilder = ???
  /** Sets whether the user is allowed not to choose any value. If false the user must choose at least one value from the available ones. The default value of this option is true. */
  def setAllowNone(allowNone: Boolean): CategoryFilterBuilder = ???
  /** Sets whether the user is allowed to type in a text field to narrow down the list of possible choices (via an autocompleter), or not. The default value of this option is true (allowing the user to type in values in the picker). */
  def setAllowTyping(allowTyping: Boolean): CategoryFilterBuilder = ???
  /** Sets the caption to display inside the value picker widget when no item is selected. */
  def setCaption(caption: String): CategoryFilterBuilder = ???
  /** Sets the data table to use for the control using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): CategoryFilterBuilder = ???
  /** Sets the control data table, which will be the control's underlying data model. */
  def setDataTable(table: DataTableSource): CategoryFilterBuilder = ???
  /** Sets the index of the data table column to filter on. The values of that column will determine whether or not each row should be filtered. It is mandatory to set either this or the column label using setFilterColumnLabel(columnLabel). */
  def setFilterColumnIndex(columnIndex: Int): CategoryFilterBuilder = ???
  /** Sets the label of the data table column to filter on. The values of that column will determine whether or not each row should be filtered. It is mandatory to set either this or a column index using setFilterColumnIndex(columnIndex). */
  def setFilterColumnLabel(columnLabel: String): CategoryFilterBuilder = ???
  /** Sets the label to display next to the slider. If unspecified, the label of the column the control operates on will be used. */
  def setLabel(label: String): CategoryFilterBuilder = ???
  /** Sets a separator string appended to the label, to visually separate the label from the category picker. */
  def setLabelSeparator(labelSeparator: String): CategoryFilterBuilder = ???
  /** Sets whether the label should display above (vertical stacking) or beside (horizontal stacking) the input field. */
  def setLabelStacking(orientation: Orientation): CategoryFilterBuilder = ???
  /** Sets how to display selected values, when multiple selection is allowed. */
  def setSelectedValuesLayout(layout: PickerValuesLayout): CategoryFilterBuilder = ???
  /** Sets whether the values to choose from should be sorted. */
  def setSortValues(sortValues: Boolean): CategoryFilterBuilder = ???
  /** Sets the list of values (categories) the user can choose from. */
  def setValues(values: Seq[String]): CategoryFilterBuilder = ???
}