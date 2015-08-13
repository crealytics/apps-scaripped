package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for a keyword under construction.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  var keywordOperation = adGroup.newKeywordBuilder()
 *     .withText("text")
 *     .withCpc(1.5)
 *     .withFinalUrl("http://www.example.com")
 *     .build();
 *  var keyword = keywordOperation.getResult();</pre>
 * <p> Note that it is only necessary to call <a href="adwordsapp_keywordoperation.html#getResult_0">KeywordOperation.getResult()</a> if you need to access the actual keyword for further processing (for instance, one can attach a label to the newly created keyword), otherwise, calling <a href="adwordsapp_keywordbuilder.html#build_0">KeywordBuilder.build()</a> on the <code>KeywordBuilder</code> is sufficient to ensure that the Keyword is created.</p>
 */
trait KeywordBuilder extends Builder[Keyword] {
  /**
   * Creates a
   * <a href="adwordsapp_keyword.html">Keyword</a>
   * . Returns a
   * <a href="adwordsapp_keywordoperation.html">KeywordOperation</a>
   * that can be used to get the new keyword (or access any associated errors if creation failed).
   */
  override def build(): Operation[Keyword] = js.native
  /** Sets the bidding strategy of the new keyword to the specified value. */
  def withBiddingStrategy(biddingStrategy: String): KeywordBuilder = js.native
  /** Sets the max CPC bid of the new keyword to the specified value. */
  def withCpc(cpc: Double): KeywordBuilder = js.native
  /**
   * Sets the CPM bid of the new keyword to the specified value.
   * <p>See <a href="https://support.google.com/adwords/answer/6310"> Cost-per-thousand impressions (CPM)</a> for more information.</p>
   */
  def withCpm(cpm: Double): KeywordBuilder = js.native
  /**
   * Sets the destination URL of the keyword to the specified value.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when destination URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_keywordbuilder.html#withFinalUrl_1">KeywordBuilder.withFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def withDestinationUrl(destinationUrl: String): KeywordBuilder = js.native
  /**
   * Sets the text of the new keyword to the specified value. This field is required. Match type for the new keyword is specified as follows:
   * <ul>
   *  <li><code>keywordBuilder.withText("shoes")</code> - broad match.</li>
   *  <li><code>keywordBuilder.withText("\"shoes\"")</code> - phrase match.</li>
   *  <li><code>keywordBuilder.withText("[leather shoes]")</code> - exact match.</li>
   * </ul>
   */
  def withText(text: String): KeywordBuilder = js.native
}
