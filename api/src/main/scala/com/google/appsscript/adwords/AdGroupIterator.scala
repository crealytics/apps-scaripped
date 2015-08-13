package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of ad groups.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (adGroupIterator.hasNext()) {
 *    var adGroup = adGroupIterator.next();
 *  }</pre>
 */
trait AdGroupIterator extends js.Object with SizeAwareIterator[AdGroup]
