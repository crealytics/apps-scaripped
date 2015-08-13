package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents an iterator of report rows.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var rows = report.rows();
 *  while (rows.hasNext()) {
 *    var row = rows.next();
 *  }</pre>
 */
trait ReportRowIterator extends SizeAwareIterator[ReportRow] {
  /**
   * Returns the next row in the report.
   * <p>Report rows are returned as plain Javascript objects — in other words, associative arrays. Individual columns can be accessed by indexing by AWQL column names: </p>
   * <pre class="prettyprint">
   *  var report = AdWordsApp.report(
   *      'SELECT Query, Ctr ' +
   *      'FROM   SEARCH_QUERY_PERFORMANCE_REPORT ' +
   *      'DURING 20130101,20130301');
   *  var rows = report.rows();
   *  while (rows.hasNext()) {
   *    var row = rows.next();
   *    var query = row['Query'];
   *    var ctr = row['Ctr'];
   *  }</pre>
   */
  def next(): ReportRow = js.native
}
