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
trait BiddingStrategy extends js.Object {
  /** Returns the selector of all ad groups that use this bidding strategy. */
  def adGroups(): AdGroupSelector = js.native
  /** Returns the selector of all campaigns that use this bidding strategy. */
  def campaigns(): CampaignSelector = js.native
  /** Returns the ID of the bidding strategy. */
  def getId(): Long = js.native
  /** Returns the name of the bidding strategy. */
  def getName(): String = js.native
  /**
   * Returns stats for the specified custom date range. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * form. For instance,
   * <code>March 24th, 2013</code>
   * is represented as either
   * <code>{year: 2013, month: 3, day: 24}</code>
   * or
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so
   * <code>forDateRange("20130324", "20130324")</code>
   * defines a range of a single day.
   */
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = js.native
  /** Returns the type of the bidding strategy. */
  def getType(): String = js.native
  /** Returns the selector of all keywords that use this bidding strategy. */
  def keywords(): KeywordSelector = js.native
  /** Returns the selector of all shopping ad groups that use this bidding strategy. */
  def shoppingAdGroups(): ShoppingAdGroupSelector = js.native
  /** Returns the selector of all shopping campaigns that use this bidding strategy. */
  def shoppingCampaigns(): ShoppingCampaignSelector = js.native
}
