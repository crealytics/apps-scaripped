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
 *  Represents an AdWords device target (either desktop, mobile, or tablet).
 */
trait Platform extends js.Object {
  /**
   *  Returns the bid modifier for this platform.
   * <p>The bid modifier is a multiplier applied to bids which match this platform. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to a bid of $5.50.</p>
   * <p> </p>
   * <p>The bid modifiers for all matching criteria are multiplied together to calculate the actual bid modification. A campaign with the following bid modifiers: </p>
   * <table>
   *  <tbody>
   *   <tr>
   *    <th>Type</th>
   *    <th>Value</th>
   *    <th>Bid Modifier</th>
   *   </tr>
   *   <tr>
   *    <td>Location</td>
   *    <td>Laos</td>
   *    <td><code>1.3</code></td>
   *   </tr>
   *   <tr>
   *    <td>Ad Schedule</td>
   *    <td>Saturday 6AM-10AM</td>
   *    <td><code>0.9</code></td>
   *   </tr>
   *   <tr>
   *    <td>Platform</td>
   *    <td>Mobile</td>
   *    <td><code>1.1</code></td>
   *   </tr>
   *  </tbody>
   * </table>
   *  would have a combined bid modifier of
   * <code>1.3 * 0.9 * 1.1 = 1.287</code>
   * , so a bid of $10 would get increased to $12.87 for clicks by Laotian smartphone users on Saturday mornings in the account timezone.
   * <p></p>
   *
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   *
   * <p>Platform bid modifiers are only set for mobile targets.</p>
   *
   * <p>Desktop and tablet targets will always return a bid modifier of <code>1</code> to reflect that their bid is not modified.</p>
   */
  def getBidModifier: Double = js.native
  /**  Returns the campaign to which this platform belongs. */
  def getCampaign: Campaign = js.native
  /**
   *  Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Platform"</code>
   * .
   */
  def getEntityType: String = js.native
  /**
   *  Returns the ID of the platform.
   * <p>Platform IDs are shared across campaigns. Specifically, desktop targets have ID <code>30000</code>, mobile targets have ID <code>30001</code>, and tablet targets have ID <code>30002</code>. In order to uniquely identify a platform target, one must specify both its campaign ID and the platform ID. </p>
   */
  def getId: Long = js.native
  /**
   *  Returns the name of this platform.
   * <p>This will be <code>"Desktop"</code> for desktop targets, <code>"HighEndMobile"</code> for mobile targets, or <code>"Tablet"</code> for tablet targets.</p>
   * <p></p>
   */
  def getName: String = js.native
  /**
   *  Returns stats for the specified date range. Supported values:
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example:
   * <pre class="prettyprint">
   *  var stats = platform.getStatsFor("THIS_MONTH");</pre>
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
   *  Sets the bid modifier for this platform.
   * <p>The bid modifier is a multiplier applied to bids which match this platform. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of <code>$5.00</code> to a bid of <code>$5.50</code>.</p>
   * <p> </p>
   * <p>The bid modifiers for all matching criteria are multiplied together to calculate the actual bid modification. A campaign with the following bid modifiers: </p>
   * <table>
   *  <tbody>
   *   <tr>
   *    <th>Type</th>
   *    <th>Value</th>
   *    <th>Bid Modifier</th>
   *   </tr>
   *   <tr>
   *    <td>Location</td>
   *    <td>Laos</td>
   *    <td><code>1.3</code></td>
   *   </tr>
   *   <tr>
   *    <td>Ad Schedule</td>
   *    <td>Saturday 6AM-10AM</td>
   *    <td><code>0.9</code></td>
   *   </tr>
   *   <tr>
   *    <td>Platform</td>
   *    <td>Mobile</td>
   *    <td><code>1.1</code></td>
   *   </tr>
   *  </tbody>
   * </table>
   *  would have a combined bid modifier of
   * <code>1.3 * 0.9 * 1.1 = 1.287</code>
   * , so a bid of $10 would get increased to $12.87 for clicks by Laotian smartphone users on Saturday mornings in the account timezone.
   * <p></p>
   *
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   *
   * <p>For mobile targets, acceptable bid modifiers are either <code>0</code>, or in the range from <code>0.1</code> to <code>4</code>.</p>
   *
   * <p>Setting bid modifiers is only supported for mobile targets. Attempting to set a bid modifier for a desktop target or for a tablet target will fail.</p>
   *
   * <p>Returns nothing.</p>
   *
   */
  def setBidModifier(modifier: Double): Unit = js.native
}