package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of excluded placements.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (excludedPlacementIterator.hasNext()) {
 *    var excludedPlacement = excludedPlacementIterator.next();
 *  }</pre>
 */
trait ExcludedPlacementIterator extends js.Object with SizeAwareIterator[ExcludedPlacement]
