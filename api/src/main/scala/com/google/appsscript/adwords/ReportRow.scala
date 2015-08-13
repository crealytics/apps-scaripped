package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a row of a report.
 * <p>NOTE: The <a href="adwordsapp_reportrow.html">ReportRow</a> works as an associative array indexed by AWQL column name. In addition to working as a normal associative array, <a href="adwordsapp_reportrow.html">ReportRow</a> also has a <a href="adwordsapp_reportrow.html#formatForUpload_0">ReportRow.formatForUpload()</a> method, for convenience when working with bulk uploads. </p>
 * <p>Typical usage: </p>
 * <pre class="prettyprint">
 *    var rows = report.rows();
 *    while (rows.hasNext()) {
 *      var row = rows.next();
 *      // The row works as an associative array
 *      var clicks = row['Clicks'];
 *      // Tweak the row and append it to a bulk upload.
 *      row['MaxCpc'] = row['MaxCpc'] + 1;
 *      upload.append(row.formatForUpload());
 *    }</pre>
 */
trait ReportRow extends js.Object {
  /**
   * Returns the report row as an associative array indexed by display column name.
   * <p>For detailed information about the display column name, please see the <code>Display Name</code> column in <a href="/adwords/api/docs/appendix/reports">all types of reports.</a> </p>
   * <p>NOTE: If you're generating a <a href="adwordsapp_csvupload.html">CsvUpload</a> with <a href="adwordsapp_report.html">Report</a>, make sure to use this method while appending rows. Typical usage: </p>
   * <pre class="prettyprint">
   *    var rows = report.rows();
   *    while (rows.hasNext()) {
   *      var row = rows.next();
   *      // ... tweak the row
   *      upload.append(row.formatForUpload());
   *    }</pre>
   */
  def formatForUpload(): AnyRef = js.native
}
