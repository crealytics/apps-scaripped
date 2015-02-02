package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents one period of an AdWords ad schedule. 
 * <p>For instance, if a campaign were set up to show ads only on weekdays from 9AM to 6PM, it would have five <code>AdSchedule</code>s: one for Monday 9AM-6PM, one for Tuesday 9AM-6PM, and so on.</p>
 */
trait AdSchedule {
  /**
   *  Returns the bid modifier for this ad schedule. 
   * <p>The bid modifier is a multiplier applied to bids which match this ad schedule. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to a bid of $5.50.</p>
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
  def getBidModifier: Double = ???
  /**  Returns the campaign to which this ad schedule belongs. */
  def getCampaign: Campaign = ???
  /**
   *  Returns the day of week this ad schedule applies to. 
   * <p>This will be one of <code>"MONDAY"</code>, <code>"TUESDAY"</code>, <code>"WEDNESDAY"</code>, <code>"THURSDAY"</code>, <code>"FRIDAY"</code>, <code>"SATURDAY"</code>, or <code>"SUNDAY"</code>.</p>
   */
  def getDayOfWeek: String = ???
  /**
   *  Returns the ending hour of this ad schedule. 
   * <p>The time is based on a 24-hour clock. Valid ending times range from <code>00:15</code> to <code>24:00</code>. So, for instance, an ad schedule which ends at 3:30PM would return <code>15</code> as the value of <code>getEndHour()</code>.</p>
   */
  def getEndHour: Int = ???
  /**
   *  Returns the ending minute of this ad schedule. 
   * <p>For instance, an ad schedule which ends at 3:30PM would return <code>30</code> as the value of <code>getEndMinute()</code>. The only possible return values are <code>0</code>, <code>15</code>, <code>30</code>, and <code>45</code>.</p>
   */
  def getEndMinute: Int = ???
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"AdSchedule"</code>
   * .
   */
  def getEntityType: String = ???
  /**
   *  Returns the ID of the ad schedule. 
   * <p>Ad schedule IDs may be shared across campaigns. In order to uniquely identify an ad schedule target, one must specify both its campaign ID and the ad schedule ID. </p>
   */
  def getId: Long = ???
  /**
   *  Returns the starting hour of this ad schedule. 
   * <p>The time is based on a 24-hour clock. Valid starting times range from <code>00:00</code> to <code>23:45</code>. So, for instance, an ad schedule which starts at 3:30PM would return <code>15</code> as the value of <code>getStartHour()</code>.</p>
   */
  def getStartHour: Int = ???
  /**
   *  Returns the starting minute of this ad schedule. 
   * <p>For instance, an ad schedule which starts at 3:30PM would return <code>30</code> as the value of <code>getStartMinute()</code>. The only possible return values are <code>0</code>, <code>15</code>, <code>30</code>, and <code>45</code>.</p>
   */
  def getStartMinute: Int = ???
  /**
   *  Returns stats for the specified date range. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  var stats = adSchedule.getStatsFor("THIS_MONTH");</pre>
   */
  def getStatsFor(dateRange: String): Stats = ???
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
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = ???
  /**
   *  Removes the ad schedule from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove: Unit = ???
  /**
   *  Sets the bid modifier for this ad schedule. 
   * <p>The bid modifier is a multiplier applied to bids which match this ad schedule. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of <code>$5.00</code> to a bid of <code>$5.50</code>.</p>
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
   * <p>For ad schedules, acceptable bid modifiers are in the range <code>0.1</code> to <code>10</code>.</p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setBidModifier(modifier: Double): Unit = ???
}