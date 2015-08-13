package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents a shopping campaign. */
trait ShoppingCampaign extends js.Object with CampaignLike {
  /** Returns the selector of all shopping ad groups in the shopping campaign. */
  def adGroups(): ShoppingAdGroupSelector = js.native
  /** Returns the selector of all product ads in the shopping campaign. */
  def ads(): ProductAdSelector = js.native
  /** Provides access to this shopping campaign's bidding fields. */
  def bidding(): ShoppingCampaignBidding = js.native
  /**
   * Returns
   * <code>true</code>
   * if the shopping campaign is deleted.
   */
  def isDeleted(): Boolean = js.native
  /** Returns a new shopping ad group builder for this shopping campaign. */
  def newAdGroupBuilder(): ShoppingAdGroupBuilder = js.native
  /** Returns the selector of all product groups in the campaign. */
  def productGroups(): ProductGroupSelector = js.native
}
