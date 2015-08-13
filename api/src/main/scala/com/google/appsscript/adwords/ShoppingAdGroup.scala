package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents a shopping ad group. */
trait ShoppingAdGroup extends js.Object with HasStatistics {
  /** Returns the selector of all product ads in the shopping ad group. */
  def ads(): ProductAdSelector = js.native
  /**
   * Applies a label to the shopping ad group.
   * <code>name</code>
   * of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Note that the shopping ad group cannot not have more than 50 labels. </p>
   * <p>Returns nothing.</p>
   */
  def applyLabel(name: String): Unit = js.native
  /** Provides access to this shopping ad group's bidding fields. */
  def bidding(): ShoppingAdGroupBidding = js.native
  /**
   * Creates a new negative keyword with the specified text. Match type for the new negative keyword is specified as follows:
   * <ul>
   *  <li><code>createNegativeKeyword("shoes")</code> - broad match.</li>
   *  <li><code>createNegativeKeyword("\"shoes\"")</code> - phrase match.</li>
   *  <li><code>createNegativeKeyword("[leather shoes]")</code> - exact match.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def createNegativeKeyword(keywordText: String): Unit = js.native
  /** Creates the root product group of the shopping ad group (if one doesn't already exist). Newly constructed shopping ad groups as well as ones modified by other means may not have any product groups. */
  def createRootProductGroup(): Operation[ProductGroup] = js.native
  /**
   * Enables the shopping ad group.
   * <p>Returns nothing.</p>
   */
  def enable(): Unit = js.native
  /** Returns the shopping campaign to which this shopping ad group belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"ShoppingAdGroup"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the shopping ad group. */
  def getId(): Long = js.native
  /**
   * Returns the mobile bid modifier for this ad group.
   * <p> The bid modifier is a multiplier applied to the shopping ad group's bids on mobile devices. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to $5.50. </p>
   * <p> Note that when you set a mobile bid modifier at both campaign- and ad group-level in a single campaign, the shopping ad group mobile bid modifier will be used when determining your bid. </p>
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   */
  def getMobileBidModifier(): Double = js.native
  /** Returns the name of the shopping ad group. */
  def getName(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * if the shopping ad group is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the shopping ad group is paused.
   */
  def isPaused(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the shopping ad group is removed.
   */
  def isRemoved(): Boolean = js.native
  /** Creates a selector of all labels applied to the shopping ad group. */
  def labels(): LabelSelector = js.native
  /** Returns a product ad builder. */
  def newAdBuilder(): ProductAdBuilder = js.native
  /**
   * Pauses the shopping ad group.
   * <p>Returns nothing.</p>
   */
  def pause(): Unit = js.native
  /** Returns the selector of all product groups in the shopping ad group. */
  def productGroups(): ProductGroupSelector = js.native
  /**
   * Removes a label from the shopping ad group.
   * <code>name</code>
   * of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account.
   * <p>Returns nothing.</p>
   */
  def removeLabel(name: String): Unit = js.native
  /** Returns the root product group of the shopping ad group (if there is one). */
  def rootProductGroup(): ProductGroup = js.native
  /**
   * Sets the mobile bid modifier for this ad group to the specified value.
   * <p> The bid modifier is a multiplier applied to the shopping ad group's bids on mobile devices. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to $5.50. </p>
   * <p> Note that when you set a mobile bid modifier at both campaign- and ad group-level in a single campaign, the shopping ad group mobile bid modifier will be used when determining your bid. </p>
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   * <p>Returns nothing.</p>
   */
  def setMobileBidModifier(modifier: Double): Unit = js.native
  /**
   * Sets the name of the shopping ad group.
   * <p>Returns nothing.</p>
   */
  def setName(name: String): Unit = js.native
}
