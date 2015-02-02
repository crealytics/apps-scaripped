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
 *  Represents an AdWords targeted location.
 * <p>Targeted locations are used to only show your ads in specific geographic areas. For instance, a broadly-targeted campaign might have location targets for an entire country, whereas a more specifically-targeted campaign might break down its location targets at the city level.</p>
 *
 * <p>For more information on locations, please see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>. </p>
 *
 * <p>See also <a href="adwordsapp_excludedlocation.html">ExcludedLocation</a>.</p>
 */
trait TargetedLocation extends js.Object {
  /**
   *  Returns the bid modifier for this location.
   * <p>The bid modifier is a multiplier applied to bids which match this location. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to a bid of $5.50.</p>
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
   */
  def getBidModifier: Double = js.native
  /**  Returns the campaign to which this location belongs. */
  def getCampaign: Campaign = js.native
  /**
   *  Returns the country code of this location.
   * <p>This is the standard two-letter country code, e.g. <code>"US"</code> or <code>"BR"</code>.</p>
   */
  def getCountryCode: String = js.native
  /**
   *  Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"TargetedLocation"</code>
   * .
   */
  def getEntityType: String = js.native
  /**
   *  Returns the ID of the location.
   * <p>Location IDs are shared across campaigns. In order to uniquely identify a location target, one must specify both its campaign ID and the location ID. </p>
   */
  def getId: Long = js.native
  /**  Returns the name of this location. */
  def getName: String = js.native
  /**
   *  Returns stats for the specified date range. Supported values:
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example:
   * <pre class="prettyprint">
   *  var stats = location.getStatsFor("THIS_MONTH");</pre>
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
   *  Returns the target type of this location.
   * <p>The target type is a generic description of the location, such as <code>"City"</code>, <code>"Postal Code"</code>, or <code>"Country"</code>. For a full list of target types, see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>.</p>
   */
  def getTargetType: String = js.native
  /**
   *  Returns the targeting status of this location.
   * <p>This can return one of three values: </p>
   * <ul>
   *  <li><code>"ACTIVE"</code>: indicates that the location can be targeted as normal. The vast majority of locations are active.</li>
   *  <li><code>"PHASING_OUT"</code>: indicates that the location can be targeted, but that support will soon be removed. To get a list of which locations are phasing out, please see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>.</li>
   *  <li><code>"OBSOLETE"</code>: indicates that the location cannot be targeted. </li>
   * </ul>
   */
  def getTargetingStatus: String = js.native
  /**
   *  Removes the location from the account.
   * <p>Returns nothing.</p>
   *
   */
  def remove: Unit = js.native
  /**
   *  Sets the bid modifier for this location.
   * <p>The bid modifier is a multiplier applied to bids which match this location. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of <code>$5.00</code> to a bid of <code>$5.50</code>.</p>
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
   * <p>For locations, acceptable bid modifiers are in the range <code>0.1</code> to <code>10</code>.</p>
   *
   * <p>Returns nothing.</p>
   *
   */
  def setBidModifier(modifier: Double): Unit = js.native
}