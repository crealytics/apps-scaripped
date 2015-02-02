package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

/** ChartOptions Exposes options currently configured for a Chart, such as height, color, etc. Please see the visualization reference documentation for information on what options are available. Specific options for each chart can be found by clicking on the specific chart in the chart gallery. These options are immutable. */
trait ChartOptions {
  /** Returns a configured option for this chart. */
  def get(option: String): AnyRef = ???
}