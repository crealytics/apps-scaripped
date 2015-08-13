package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of product groups.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (productGroupIterator.hasNext()) {
 *    var productGroup = productGroupIterator.next();
 *  }</pre>
 */
trait ProductGroupIterator extends SizeAwareIterator[ProductGroup]
