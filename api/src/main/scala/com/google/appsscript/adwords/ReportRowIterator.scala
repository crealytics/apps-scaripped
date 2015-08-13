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
trait ReportRowIterator extends SizeAwareIterator[ReportRow]
