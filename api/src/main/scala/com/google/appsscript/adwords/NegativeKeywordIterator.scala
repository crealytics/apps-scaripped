package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of negative keywords.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (negativeKeywordIterator.hasNext()) {
 *    var negativeKeyword = negativeKeywordIterator.next();
 *  }</pre>
 */
trait NegativeKeywordIterator extends js.Object with SizeAwareIterator[NegativeKeyword]
