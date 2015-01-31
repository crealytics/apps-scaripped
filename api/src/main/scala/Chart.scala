/** Chart A Chart object, which can be embedded into documents, UI elements, or used as a static image. For charts embedded in spreadsheets, see EmbeddedChart. */
trait Chart {
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = ???
  /** Return the data inside this object as a blob. */
  def getBlob: Blob = ???
  /** Returns the id that has been assigned to this object. */
  def getId: String = ???
  /** Returns the options for this chart, such as height, colors, axes, etc. */
  def getOptions: ChartOptions = ???
  /** Gets the type of this object. */
  def getType: String = ???
  /** Sets the id of this Chart to be used with UiApp. */
  def setId(id: String): Chart = ???
}