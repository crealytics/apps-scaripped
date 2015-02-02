package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Provides access to a keyword's bidding fields.
 */
trait KeywordBidding {
  /**  Returns the max CPC bid for this keyword. */
  def getCpc: Double = ???
  /**  Returns the max CPM bid for this keyword. */
  def getCpm: Double = ???
  /**
   *  Returns the flexible bidding strategy of the keyword. If this keyword has an anonymous bidding strategy, or no bidding strategy, 
   * <code>null</code>
   *  is returned.
   */
  def getStrategy: BiddingStrategy = ???
  /**
   *  Returns the bidding strategy source of this keyword. The bidding strategy source indicates where the bidding strategy came from: 
   * <code>'CAMPAIGN'</code>
   * , 
   * <code>'ADGROUP'</code>
   * , or 
   * <code>'CRITERION'</code>
   * .
   */
  def getStrategySource: String = ???
  /**
   *  Returns the bidding strategy type of this keyword. This may either be an anonymous bidding strategy, or the the 
   * <code>type</code>
   *  of a flexible bidding strategy.
   */
  def getStrategyType: String = ???
  /**
   *  Sets the max CPC bid for this keyword. 
   * <p>Please note that although this method will effectively set the max CPC bid for this keyword, the change may have no effect on actual bidding if this keyword has a <a href="adwordsapp_biddingstrategy.html">BiddingStrategy</a> which does not involve max CPC bids.</p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setCpc(cpc: Double): Unit = ???
  /**
   *  Sets the max CPM bid for this keyword. 
   * <p>Please note that although this method will effectively set the max CPM bid for this keyword, the change may have no effect on actual bidding if this keyword has a <a href="adwordsapp_biddingstrategy.html">BiddingStrategy</a> which does not involve max CPM bids.</p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setCpm(cpm: Double): Unit = ???
}