package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Provides access to a keyword's bidding fields. */
trait KeywordBidding extends js.Object {
  /**
   * Clears the max CPC bid for this keyword. This will allow this keyword to inherit its bid from the ad group level.
   * <p>Please note that although this method will effectively clear the max CPC bid for this keyword, the change may have no effect on actual bidding if this keyword has a <a href="adwordsapp_biddingstrategy.html">BiddingStrategy</a> which does not involve max CPC bids.</p>
   * <p>Returns nothing.</p>
   */
  def clearCpc(): Unit = js.native
  /**
   * Clears the CPM bid for this keyword. This will allow this keyword to inherit its bid from the ad group level.
   * <p>Please note that although this method will effectively clear the CPM bid for this keyword, the change may have no effect on actual bidding if this keyword has a <a href="adwordsapp_biddingstrategy.html">BiddingStrategy</a> which does not involve CPM bids.</p>
   * <p>See <a href="https://support.google.com/adwords/answer/6310"> Cost-per-thousand impressions (CPM)</a> for more information.</p>
   * <p>Returns nothing.</p>
   */
  def clearCpm(): Unit = js.native
  /**
   * Clears the bidding strategy for this keyword. This will allow this keyword to inherit its bidding strategy from the ad group level.
   * <p>Returns nothing.</p>
   */
  def clearStrategy(): Unit = js.native
  /** Returns the max CPC bid for this keyword. */
  def getCpc(): Double = js.native
  /**
   * Returns the CPM bid for this keyword.
   * <p>See <a href="https://support.google.com/adwords/answer/6310"> Cost-per-thousand impressions (CPM)</a> for more information.</p>
   */
  def getCpm(): Double = js.native
  /**
   * Returns the flexible bidding strategy of the keyword. If this keyword has an anonymous bidding strategy, or no bidding strategy,
   * <code>null</code>
   * is returned.
   */
  def getStrategy(): BiddingStrategy = js.native
  /**
   * Returns the bidding strategy source of this keyword. The bidding strategy source indicates where the bidding strategy came from:
   * <code>'CAMPAIGN'</code>
   * ,
   * <code>'ADGROUP'</code>
   * , or
   * <code>'CRITERION'</code>
   * .
   */
  def getStrategySource(): String = js.native
  /**
   * Returns the bidding strategy type of this keyword. This may either be an anonymous bidding strategy, or the the
   * <code>type</code>
   * of a flexible bidding strategy.
   */
  def getStrategyType(): String = js.native
  /**
   * Sets the max CPC bid for this keyword.
   * <p>Please note that although this method will effectively set the max CPC bid for this keyword, the change may have no effect on actual bidding if this keyword has a <a href="adwordsapp_biddingstrategy.html">BiddingStrategy</a> which does not involve max CPC bids.</p>
   * <p>Returns nothing.</p>
   */
  def setCpc(cpc: Double): Unit = js.native
  /**
   * Sets the CPM bid for this keyword.
   * <p>Please note that although this method will effectively set the CPM bid for this keyword, the change may have no effect on actual bidding if this keyword has a <a href="adwordsapp_biddingstrategy.html">BiddingStrategy</a> which does not involve CPM bids.</p>
   * <p>See <a href="https://support.google.com/adwords/answer/6310"> Cost-per-thousand impressions (CPM)</a> for more information.</p>
   * <p>Returns nothing.</p>
   */
  def setCpm(cpm: Double): Unit = js.native
  /**
   * Sets the bidding strategy of this keyword to the specified anonymous bidding strategy.
   * <p>The only supported anonymous bidding strategy for keywords is: </p>
   * <ul>
   *  <li><code>"MANUAL_CPC"</code>: Manual click-based bidding where user pays per click.</li>
   * </ul>
   * <p></p>
   * <p>Returns nothing.</p>
   */
  def setStrategy(biddingStrategy: String): Unit = js.native
}
