package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of ad params.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (adParamIterator.hasNext()) {
 *    var adParam = adParamIterator.next();
 *  }</pre>
 */
trait AdParamIterator extends SizeAwareIterator[AdParam]
