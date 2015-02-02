package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents an AdWords report.
 */
trait Report extends js.Object {
  /**
   *  Exports the content of the report into a
   * <a href="https://developers.google.com/apps-script/reference/spreadsheet/sheet">SpreadsheetApp.Sheet</a>
   * .
   * <p>Typical usage:</p>
   *
   * <pre class="prettyprint">
   *    var spreadsheet = SpreadsheetApp.create("Report output");
   *    var report = AdWordsApp.report("SELECT Clicks, Impressions, AverageCpc, HourOfDay " +
   *        "FROM ACCOUNT_PERFORMANCE_REPORT " +
   *        "DURING LAST_MONTH");
   *    report.exportToSheet(spreadsheet.getActiveSheet());
   *    Logger.log("Report available at " + spreadsheet.getUrl());</pre>
   *
   * <p>Note that reports containing over 10,000 rows cannot be exported.</p>
   *
   * <p>Returns nothing.</p>
   *
   */
  def exportToSheet(sheet: Sheet): Unit = js.native
  /**
   *  Returns the column header of the report matching the given AWQL column name.
   * <p>AWQL names are the names of the selected columns as they appear in the generated report. For a full list of AWQL column names, and the display column names they correspond to, please see the <code>Name</code> and <code>Display Name</code> column in <a href="/adwords/api/docs/appendix/reports">all types of reports.</a> </p>
   * <pre class="prettyprint">
   *    var report = AdWordsApp.report("SELECT Clicks, Impressions, AverageCpc, HourOfDay " +
   *        "FROM ACCOUNT_PERFORMANCE_REPORT " +
   *        "DURING LAST_MONTH");
   *    var columnHeader1 = report.getColumnHeader("HourOfDay");
   *    // AWQL name: "HourOfDay"
   *    Logger.log(columnHeader1.getAwqlColumnName());
   *    // display name: "Hour of day"
   *    Logger.log(columnHeader1.getDisplayColumnName());
   *    var columnHeader2 = report.getColumnHeader("AverageCpc");
   *    // AWQL name: "AverageCpc"
   *    Logger.log(columnHeader2.getAwqlColumnName());
   *    // display name: "Avg. CPC"
   *    Logger.log(columnHeader2.getDisplayColumnName());</pre>
   */
  def getColumnHeader(awqlColumnName: String): ReportColumnHeader = js.native
  /**  Returns an iterator over the rows of the report. */
  def rows: ReportRowIterator = js.native
}