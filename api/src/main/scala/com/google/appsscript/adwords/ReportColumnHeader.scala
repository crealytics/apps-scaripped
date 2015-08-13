package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents a column header of a report. */
trait ReportColumnHeader extends js.Object {
  /**
   * Returns the AWQL name of the column header.
   * <p>The AWQL names are the selectable columns in the query of <a href="adwordsapp.html#report_2">AdWordsApp.report(String, Object)</a>. For a full list of AWQL names, please see the <code>Name</code> column in <a href="/adwords/api/docs/appendix/reports">all types of reports.</a></p>
   */
  def getAwqlColumnName(): String = js.native
  /**
   * Returns the display name of the column header.
   * <p>The display names are the columns as they would appear in a report download from the AdWords UI, and as recognized in bulk uploads. For a full list of display names, and the AWQL column names they correspond to, please see the <code>Name</code> and <code>Display Name</code> columns in <a href="/adwords/api/docs/appendix/reports">all types of reports.</a> </p>
   * <p>For instance, in a <a href="/adwords/api/docs/appendix/reports#keywords">Keywords Performance Report</a>, selecting <code>AdGroupName</code> will result in a report column header with an AWQL name of <code>AdGroupName</code> and the display name of <code>Ad group</code>. </p>
   * <p>NOTE: If you're generating a <a href="adwordsapp_csvupload.html">CsvUpload</a> with <a href="adwordsapp_report.html">Report</a>, make sure to use this method in creation. Typical usage: </p>
   * <pre class="prettyprint">
   *    var upload = AdWordsApp.bulkUploads().newCsvUpload([
   *        report.getColumnHeader("AdGroupId").getDisplayColumnName(),
   *        report.getColumnHeader("AdGroupName").getDisplayColumnName()
   *        ...]);</pre>
   */
  def getDisplayColumnName(): String = js.native
}
