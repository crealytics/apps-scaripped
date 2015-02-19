package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An iterator of ad customizer sources. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  while (adCustomizerSourceIterator.hasNext()) {
 *    var adCustomizerSource = adCustomizerSourceIterator.next();
 *  }</pre>
 */
trait AdCustomizerSourceIterator extends SizeAwareIterator[AdCustomizerSource]
