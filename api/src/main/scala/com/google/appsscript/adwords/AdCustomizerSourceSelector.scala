package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Fetches ad customizer sources. Does not support filtering or sorting. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  var adCustomizerSourceSelector = AdWordsApp.adCustomizerSources();
 * 
 *  var adCustomizerSourceIterator = adCustomizerSourceSelector.withLimit(5).get();
 *  while (adCustomizerSourceIterator.hasNext()) {
 *    var adCustomizerSource = adCustomizerSourceIterator.next();
 *  }</pre>
 */
trait AdCustomizerSourceSelector {
  /**  Fetches the requested ad customizer sources and returns an iterator. */
  def get: AdCustomizerSourceIterator = ???
  /**
   *  Specifies limit for the selector to use. For instance, 
   * <code>withLimit(50)</code>
   *  returns only the first 50 entities.
   */
  def withLimit(limit: Int): AdCustomizerSourceSelector = ???
}