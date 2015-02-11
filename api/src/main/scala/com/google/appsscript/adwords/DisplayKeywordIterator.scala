package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An iterator of display keywords. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  while (displayKeywordIterator.hasNext()) {
 *    var displayKeyword = displayKeywordIterator.next();
 *  }</pre>
 */
trait DisplayKeywordIterator extends SizeAwareIterator[DisplayKeyword]
