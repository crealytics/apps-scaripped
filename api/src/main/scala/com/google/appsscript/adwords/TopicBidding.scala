package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Provides access to a topic's bidding fields.
 */
trait TopicBidding extends js.Object {
  /**  Returns the max CPC bid for this topic. */
  def getCpc(): Double = js.native
  /**  Returns the max CPM bid for this topic. */
  def getCpm(): Double = js.native
  /**
   *  Returns the flexible bidding strategy of the topic. If this topic has an anonymous bidding strategy, or no bidding strategy, 
   * <code>null</code>
   *  is returned.
   */
  def getStrategy(): BiddingStrategy = js.native
  /**
   *  Returns the bidding strategy source of this topic. The bidding strategy source indicates where the bidding strategy came from: 
   * <code>'CAMPAIGN'</code>
   * , 
   * <code>'ADGROUP'</code>
   * , or 
   * <code>'CRITERION'</code>
   * .
   */
  def getStrategySource(): String = js.native
  /**
   *  Returns the bidding strategy type of this topic. This may either be an anonymous bidding strategy, or the the 
   * <code>type</code>
   *  of a flexible bidding strategy.
   */
  def getStrategyType(): String = js.native
  /**
   *  Sets the max CPC bid for this topic. 
   * <p>Please note that although this method will effectively set the max CPC bid for this topic, the change may have no effect on actual bidding if this topic has a <a href="adwordsapp_biddingstrategy.html">BiddingStrategy</a> which does not involve max CPC bids.</p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setCpc(cpc: Double): Unit = js.native
  /**
   *  Sets the max CPM bid for this topic. 
   * <p>Please note that although this method will effectively set the max CPM bid for this topic, the change may have no effect on actual bidding if this topic has a <a href="adwordsapp_biddingstrategy.html">BiddingStrategy</a> which does not involve max CPM bids.</p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setCpm(cpm: Double): Unit = js.native
}