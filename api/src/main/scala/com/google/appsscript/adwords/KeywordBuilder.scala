package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Builder for a keyword under construction. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  var keywordOperation = adGroup.newKeywordBuilder()
 *     .withText("text")
 *     .withCpc(1.5)
 *     .withDestinationUrl("http://www.example.com")
 *     .build();
 *  var keyword = keywordOperation.getResult();</pre>
 *  
 * <p> Note that it is only necessary to call <a href="adwordsapp_keywordoperation.html#getResult_0">KeywordOperation.getResult()</a> if you need to access the actual keyword for further processing (for instance, one can attach a label to the newly created keyword), otherwise, calling <a href="adwordsapp_keywordbuilder.html#build_0">KeywordBuilder.build()</a> on the <code>KeywordBuilder</code> is sufficient to ensure that the Keyword is created.</p>
 */
trait KeywordBuilder extends js.Object {
  /**
   *  Creates a 
   * <a href="adwordsapp_keyword.html">Keyword</a>
   * . Returns a 
   * <a href="adwordsapp_keywordoperation.html">KeywordOperation</a>
   *  that can be used to get the new keyword (or access any associated errors if creation failed).
   */
  def build(): KeywordOperation = js.native
  /**  Sets the bidding strategy of the new keyword to the specified value. */
  def withBiddingStrategy(biddingStrategy: BiddingStrategy): KeywordBuilder = js.native
  /**
   *  Sets the bidding strategy of the new keyword to the specified anonymous bidding strategy. 
   * <p>The supported anonymous bidding strategies are as follows: </p>
   * <ul> 
   *  <li><code>"BUDGET_OPTIMIZER"</code>: In budget optimizer, Google automatically places bids for the user based on their daily/monthly budget.</li> 
   *  <li><code>"CONVERSION_OPTIMIZER"</code>: Conversion optimizer bidding strategy helps you maximize your return on investment (ROI) by automatically getting you the most possible conversions for your budget. For more information on conversion optimizer, visit the <a href="https://support.google.com/adwords/answer/2471188">Conversion Optimizer help center</a></li> 
   *  <li><code>"MANUAL_CPC"</code>: Manual click based bidding where user pays per click.</li> 
   *  <li><code>"MANUAL_CPM"</code>: Manual impression based bidding where user pays per thousand impressions. This can only be used for "Display Network only" campaigns.</li> 
   * </ul>
   *  
   * <p></p>
   */
  def withBiddingStrategy(biddingStrategy: String): KeywordBuilder = js.native
  /**  Sets the max CPC bid of the new keyword to the specified value. */
  def withCpc(cpc: Double): KeywordBuilder = js.native
  /**  Sets the max CPM bid of the new keyword to the specified value. */
  def withCpm(cpm: Double): KeywordBuilder = js.native
  /**  Sets the destination URL of the keyword to the specified value. */
  def withDestinationUrl(destinationUrl: String): KeywordBuilder = js.native
  /**
   *  Sets the text of the new keyword to the specified value. This field is required. Match type for the new keyword is specified as follows: 
   * <ul> 
   *  <li><code>keywordBuilder.withText("shoes")</code> - broad match.</li> 
   *  <li><code>keywordBuilder.withText("\"shoes\"")</code> - phrase match.</li> 
   *  <li><code>keywordBuilder.withText("[leather shoes]")</code> - exact match.</li> 
   * </ul>
   */
  def withText(text: String): KeywordBuilder = js.native
}
