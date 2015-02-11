package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An iterator of ad customizer items. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  while (adCustomizerItemIterator.hasNext()) {
 *    var adCustomizerItem = adCustomizerItemIterator.next();
 *  }</pre>
 */
trait AdCustomizerItemIterator extends SizeAwareIterator[AdCustomizerItem]
