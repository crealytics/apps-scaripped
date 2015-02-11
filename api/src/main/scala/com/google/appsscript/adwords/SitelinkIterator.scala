package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An iterator of sitelinks. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  while (sitelinkIterator.hasNext()) {
 *    var sitelink = sitelinkIterator.next();
 *  }</pre>
 */
trait SitelinkIterator extends SizeAwareIterator[Sitelink]
