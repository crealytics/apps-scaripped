package com.google.appsscript.charts

import com.google.appsscript.base._

/** DataViewDefinition A data view definition for visualizing chart data. Data view definition can be set for charts to visualize a view derived from the given data table and not the data table itself. For example if the view definition of a chart states that the view columns are [0, 3], only the first and the third columns of the data table will be taken into consideration when drawing the chart. See DataViewDefinitionBuilder for an example on how to define and use a DataViewDefinition. */
trait DataViewDefinition {
  ()
}