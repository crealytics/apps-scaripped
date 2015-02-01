package com.google.appsscript.charts

import com.google.appsscript.base._

/** DashboardPanelBuilder A builder for a dashboard panel object. For an example of how to use DashboardPanelBuilder, refer to DashboardPanel. For more details, see the Gviz documentation. */
trait DashboardPanelBuilder {
  /** Binds a control to a chart, so that the chart is redrawn whenever the control collects a user interaction that affects the data managed by the dashboard. */
  def bind(control: Control)(chart: Chart): DashboardPanelBuilder = ???
  /** Binds multiple controls to multiple charts, so that the charts are redrawn whenever the controls collect a user interaction that affects the data managed by the dashboard. When binding multiple controls to a chart (or multiple charts), the data that's displayed in the chart is that which passes the filters of all of the controls (of this specific binding). */
  def bind(controls: Seq[Control])(charts: Seq[Chart]): DashboardPanelBuilder = ???
  /** Builds a dashboard. */
  def build: DashboardPanel = ???
  /** Sets the data table to use for the dashboard using a DataTableBuilder. This is a convenience method for setting the data table without needing to call build(). */
  def setDataTable(tableBuilder: DataTableBuilder): DashboardPanelBuilder = ???
  /** Sets the dashboard's data table, which will be the control's underlying data model. */
  def setDataTable(source: DataTableSource): DashboardPanelBuilder = ???
}