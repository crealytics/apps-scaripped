package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of account labels.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (accountLabelIterator.hasNext()) {
 *    var accountLabel = accountLabelIterator.next();
 *  }</pre>
 */
trait AccountLabelIterator extends js.Object with SizeAwareIterator[AccountLabel]
