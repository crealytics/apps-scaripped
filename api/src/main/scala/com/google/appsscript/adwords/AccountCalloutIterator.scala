package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of account-level callouts.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (accountCalloutIterator.hasNext()) {
 *    var accountCallout = accountCalloutIterator.next();
 *  }</pre>
 */
trait AccountCalloutIterator extends js.Object with SizeAwareIterator[AccountCallout]
