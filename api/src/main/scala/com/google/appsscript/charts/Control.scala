package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/** Control A user interface control object, that drives the data displayed by a DashboardPanel. A control can be embedded in a UI application. Controls are user interface widgets (category pickers, range sliders, autocompleters, etc.) users interact with in order to drive the data managed by a dashboard and the charts that are part of it. Controls collect user input and use the information to decide which of the data the dashboard is managing should be made available to the charts that are part of it. Given a data table, a control will filter out the data that doesn't comply with the conditions implied by its current state, and will expose the filtered data table as an output. For more details, see the Gviz documentation. */
trait Control extends js.Object {
  /** Returns the id that has been assigned to this object. */
  def getId(): String = js.native
  /** Gets the type of this object. */
  def getType(): String = js.native
  /** Sets the id of this Control to be used with UiApp. */
  def setId(id: String): Control = js.native
}
