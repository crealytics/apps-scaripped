package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Fetches ad params. Unlike other selectors, does not support filtering or sorting.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var adParamSelector = AdWordsApp.adParams();
 *  var adParamIterator = adParamSelector.get();
 *  while (adParamIterator.hasNext()) {
 *    var adParam = adParamIterator.next();
 *  }</pre>
 */
trait AdParamSelector extends js.Object with Selector[AdParamSelector] {
  /** Fetches the requested ad params and returns an iterator. */
  def get(): AdParamIterator = js.native
}
