package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of ad schedules.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (adScheduleIterator.hasNext()) {
 *    var adSchedule = adScheduleIterator.next();
 *  }</pre>
 */
trait AdScheduleIterator extends js.Object with SizeAwareIterator[AdSchedule]
