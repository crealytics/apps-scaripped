package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents an AdWords budget. Budgets are used for managing the amount of money spent on AdWords. Budgets may be shared among a number of campaigns; use
 * <a href="adwordsapp_budget.html#campaigns_0">Budget.campaigns()</a>
 * to find the campaigns that are using the budget. For more information on Shared Budgets, please see
 * <a href="/adwords/api/docs/guides/shared-budgets">AdWords API article</a>
 * .
 */
trait Budget extends js.Object with HasStatistics {
  /** Returns the selector of all campaigns that share this budget. */
  def campaigns(): CampaignSelector = js.native
  /** Returns the amount of the budget, in the currency of the account. */
  def getAmount(): Double = js.native
  /**
   * Returns the delivery method of the budget. Possible return values:
   * <p><code>STANDARD</code>, <code>ACCELERATED</code></p>
   * .
   */
  def getDeliveryMethod(): String = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Budget"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the budget. */
  def getId(): Long = js.native
  /** Returns the name of the budget. Every budget must have a non-empty name; all budget names in an account are distinct. */
  def getName(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * if the budget is explicitly shared, and
   * <code>false</code>
   * otherwise.
   * <ul>
   *  <li>If <code>true</code>, this budget was created through the BudgetService or through the UI shared library with the purpose of sharing this budgets across one or more campaigns.</li>
   *  <li>If <code>false</code>, this budget was created with the intention to be used with a single campaign, and the Budget's name will stay in the sync with the associated Campaign's name.</li>
   * </ul>
   */
  def isExplicitlyShared(): Boolean = js.native
  /**
   * Sets the budget's amount to the specified value, in the currency of the account.
   * <p>Returns nothing.</p>
   */
  def setAmount(amount: Double): Unit = js.native
}
