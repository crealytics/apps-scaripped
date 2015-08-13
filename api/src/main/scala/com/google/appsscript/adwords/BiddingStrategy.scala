package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a flexible bidding strategy. Bidding strategies store shared bidding configuration data and are account-level objects. For more information, refer to
 * <a href="https://support.google.com/adwords/answer/2979071"> Using flexible bid strategies</a>
 * .
 */
trait BiddingStrategy extends js.Object with HasStatistics {
  /** Returns the selector of all ad groups that use this bidding strategy. */
  def adGroups(): AdGroupSelector = js.native
  /** Returns the selector of all campaigns that use this bidding strategy. */
  def campaigns(): CampaignSelector = js.native
  /** Returns the ID of the bidding strategy. */
  def getId(): Long = js.native
  /** Returns the name of the bidding strategy. */
  def getName(): String = js.native
  /** Returns the type of the bidding strategy. */
  def getType(): String = js.native
  /** Returns the selector of all keywords that use this bidding strategy. */
  def keywords(): KeywordSelector = js.native
  /** Returns the selector of all shopping ad groups that use this bidding strategy. */
  def shoppingAdGroups(): ShoppingAdGroupSelector = js.native
  /** Returns the selector of all shopping campaigns that use this bidding strategy. */
  def shoppingCampaigns(): ShoppingCampaignSelector = js.native
}
