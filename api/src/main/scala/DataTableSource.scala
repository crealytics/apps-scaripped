/** DataTableSource Interface for objects that can represent their data as a DataTable. Implementing classes Name Brief description DataTable A Data Table to be used in charts. Range Access and modify spreadsheet ranges. */
trait DataTableSource {
  /** Return the data inside this object as a DataTable. */
  def getDataTable: DataTable = ???
}