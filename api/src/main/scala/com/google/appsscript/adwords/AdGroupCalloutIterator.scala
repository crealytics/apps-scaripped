package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of ad group-level callouts.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (adGroupCalloutIterator.hasNext()) {
 *    var adGroupCallout = adGroupCalloutIterator.next();
 *  }</pre>
 */
trait AdGroupCalloutIterator extends js.Object with SizeAwareIterator[AdGroupCallout]
