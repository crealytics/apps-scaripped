package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of platforms.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (platformIterator.hasNext()) {
 *    var platform = platformIterator.next();
 *  }</pre>
 */
trait PlatformIterator extends js.Object with SizeAwareIterator[Platform]
