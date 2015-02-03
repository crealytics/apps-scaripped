package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Fetches excluded locations. Unlike other selectors, does not support filtering or sorting.
 * <p>Typical usage:</p>
 *
 * <pre class="prettyprint">
 *  var locationSelector = AdWordsApp.targeting().excludedLocations();
 *
 *  var locationIterator = locationSelector.get();
 *  while (locationIterator.hasNext()) {
 *    var location = locationIterator.next();
 *  }</pre>
 */
trait ExcludedLocationSelector extends js.Object {
  /**  Fetches the requested excluded locations and returns an iterator. */
  def get: ExcludedLocationIterator = js.native
  /**
   *  Specifies limit for the selector to use. For instance,
   * <code>withLimit(50)</code>
   *  returns only the first 50 entities.
   */
  def withLimit(limit: Int): ExcludedLocationSelector = js.native
}