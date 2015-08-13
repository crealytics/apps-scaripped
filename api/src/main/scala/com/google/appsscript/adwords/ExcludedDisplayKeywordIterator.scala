package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of excluded display keywords.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (excludedDisplayKeywordIterator.hasNext()) {
 *    var excludedDisplayKeyword = excludedDisplayKeywordIterator.next();
 *  }</pre>
 */
trait ExcludedDisplayKeywordIterator extends SizeAwareIterator[ExcludedDisplayKeyword]
