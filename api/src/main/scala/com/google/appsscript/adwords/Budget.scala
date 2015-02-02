package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents an AdWords budget. Budgets are used for managing the amount of money spent on AdWords. Budgets may be shared among a number of campaigns; use
 * <a href="adwordsapp_budget.html#campaigns_0">Budget.campaigns()</a>
 *  to find the campaigns that are using the budget. For more information on Shared Budgets, please see
 * <a href="/adwords/api/docs/guides/shared-budgets">AdWords API article</a>
 * .
 */
trait Budget extends js.Object {
  /**  Returns the selector of all campaigns that share this budget. */
  def campaigns: CampaignSelector = js.native
  /**  Returns the amount of the budget, in the currency of the account. */
  def getAmount: Double = js.native
  /**
   *  Returns the delivery method of the budget. Possible return values:
   * <p><code>STANDARD</code>, <code>ACCELERATED</code></p>
   * .
   */
  def getDeliveryMethod: String = js.native
  /**
   *  Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Budget"</code>
   * .
   */
  def getEntityType: String = js.native
  /**  Returns the ID of the budget. */
  def getId: Long = js.native
  /**  Returns the name of the budget. Every budget must have a non-empty name; all budget names in an account are distinct. */
  def getName: String = js.native
  /**
   *  Returns stats for the specified date range. Supported values:
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example:
   * <pre class="prettyprint">
   *  var stats = budget.getStatsFor("THIS_MONTH");</pre>
   */
  def getStatsFor(dateRange: String): Stats = js.native
  /**
   *  Returns stats for the specified custom date range. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  form. For instance,
   * <code>March 24th, 2013</code>
   *  is represented as either
   * <code>{year: 2013, month: 3, day: 24}</code>
   *  or
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so
   * <code>forDateRange("20130324", "20130324")</code>
   *  defines a range of a single day.
   */
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = js.native
  /**
   *  Returns
   * <code>true</code>
   *  if the budget is explicitly shared, and
   * <code>false</code>
   *  otherwise.
   * <ul>
   *  <li>If <code>true</code>, this budget was created through the BudgetService or through the UI shared library with the purpose of sharing this budgets across one or more campaigns.</li>
   *  <li>If <code>false</code>, this budget was created with the intention to be used with a single campaign, and the Budget's name will stay in the sync with the associated Campaign's name.</li>
   * </ul>
   */
  def isExplicitlyShared: Boolean = js.native
  /**
   *  Sets the budget's amount to the specified value, in the currency of the account.
   * <p>Returns nothing.</p>
   *
   */
  def setAmount(amount: Double): Unit = js.native
}