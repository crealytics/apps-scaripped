package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An iterator of product ads. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  while (productAdIterator.hasNext()) {
 *    var productAd = productAdIterator.next();
 *  }</pre>
 */
trait ProductAdIterator extends SizeAwareIterator[ProductAd]
