package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Provides access to a shopping campaign's bidding fields.
 */
trait ShoppingCampaignBidding extends js.Object {
  /**
   *  Returns the flexible bidding strategy of the shopping campaign. If this shopping campaign has an anonymous bidding strategy, or no bidding strategy,
   * <code>null</code>
   *  is returned.
   */
  def getStrategy: BiddingStrategy = js.native
  /**
   *  Returns the bidding strategy source of this shopping campaign. The bidding strategy source indicates where the bidding strategy came from:
   * <code>'CAMPAIGN'</code>
   * ,
   * <code>'ADGROUP'</code>
   * , or
   * <code>'CRITERION'</code>
   * .
   */
  def getStrategySource: String = js.native
  /**
   *  Returns the bidding strategy type of this shopping campaign. This may either be an anonymous bidding strategy, or the the
   * <code>type</code>
   *  of a flexible bidding strategy.
   */
  def getStrategyType: String = js.native
  /**
   *  Sets the bidding strategy of this shopping campaign to the specified anonymous bidding strategy.
   * <p>The supported anonymous bidding strategies are as follows: </p>
   * <ul>
   *  <li><code>"BUDGET_OPTIMIZER"</code>: In budget optimizer, Google automatically places bids for the user based on their daily/monthly budget.</li>
   *  <li><code>"CONVERSION_OPTIMIZER"</code>: Conversion optimizer bidding strategy helps you maximize your return on investment (ROI) by automatically getting you the most possible conversions for your budget. For more information on conversion optimizer, visit the <a href="https://support.google.com/adwords/answer/2471188">Conversion Optimizer help center</a></li>
   *  <li><code>"MANUAL_CPC"</code>: Manual click based bidding where user pays per click.</li>
   *  <li><code>"MANUAL_CPM"</code>: Manual impression based bidding where user pays per thousand impressions. This can only be used for "Display Network only" campaigns.</li>
   * </ul>
   *
   * <p></p>
   *
   * <p>Returns nothing.</p>
   *
   */
  def setStrategy(biddingStrategy: String): Unit = js.native
  /**
   *  Sets the bidding strategy of this shopping campaign to the provided flexible bidding strategy.
   * <p>Note that AdWordsApp does not support creating bidding strategies, so if the desired flexible bidding strategy does not already exist in your account, you should first create the bidding strategy through the AdWords user interface, and then access that bidding strategy using <a href="adwordsapp_biddingstrategyselector.html">BiddingStrategySelector</a> or <a href="adwordsapp_biddingstrategyiterator.html">BiddingStrategyIterator</a>.</p>
   *
   * <p>Returns nothing.</p>
   *
   */
  def setStrategy(biddingStrategy: BiddingStrategy): Unit = js.native
}