package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of keywords.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (keywordIterator.hasNext()) {
 *    var keyword = keywordIterator.next();
 *  }</pre>
 */
trait KeywordIterator extends js.Object with SizeAwareIterator[Keyword]
