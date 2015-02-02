package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Builder for
 * <a href="adwordsapp_displaykeyword.html">DisplayKeyword</a>
 *  objects.
 * <p>Example usage:</p>
 *
 * <pre class="prettyprint">
 *  var displayKeywordBuilder = adGroup.display().newKeywordBuilder();
 *  var displayKeyword = displayKeywordBuilder
 *    .withText("keyword text")     // required
 *    .withCpc(0.50)                // optional
 *    .build()                      // create the display keyword</pre>
 */
trait DisplayKeywordBuilder extends js.Object {
  /**
   *  Builds the display keyword. Returns a
   * <a href="adwordsapp_displaykeywordoperation.html">DisplayKeywordOperation</a>
   *  that corresponds to the creation of the
   * <a href="adwordsapp_displaykeyword.html">DisplayKeyword</a>
   * .
   */
  def build: DisplayKeywordOperation = js.native
  /**
   *  Builds the excluded display keyword. Returns an
   * <a href="adwordsapp_excludeddisplaykeywordoperation.html">ExcludedDisplayKeywordOperation</a>
   *  that corresponds to the creation of the
   * <a href="adwordsapp_excludeddisplaykeyword.html">ExcludedDisplayKeyword</a>
   * .
   */
  def exclude: ExcludedDisplayKeywordOperation = js.native
  /**  Sets the max CPC bid of the new display keyword to the specified value. */
  def withCpc(cpc: Double): DisplayKeywordBuilder = js.native
  /**  Sets the max CPM bid of the new display keyword to the specified value. */
  def withCpm(cpm: Double): DisplayKeywordBuilder = js.native
  /**  Sets the text of the display keyword. This field is required. */
  def withText(text: String): DisplayKeywordBuilder = js.native
}