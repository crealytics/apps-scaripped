package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents one period of an AdWords ad extension schedule. For instance, if an ad extension were set up to only show on ads on weekdays from 09:00 to 18:00, it would have five ExtensionSchedules: one for Monday 09:00 - 18:00, one for Tuesday 09:00 - 18:00, and so on. 
 * <p></p>
 * <pre class="prettyprint">
 *   var monday = {
 *     dayOfWeek: "MONDAY",
 *     startHour: 9,
 *     startMinute: 0,
 *     endHour: 18,
 *     endMinute: 0
 *   };
 *   var tuesday = {
 *     dayOfWeek: "TUESDAY",
 *     startHour: 9,
 *     startMinute: 0,
 *     endHour: 18,
 *     endMinute: 0
 *   };
 * 
 *   sitelink.setSchedules([monday, tuesday]);</pre>
 * <p></p>
 */
trait ExtensionSchedule extends js.Object {
  /**
   *  Returns the day of week this schedule applies to. 
   * <p>Possible values: <code>"MONDAY"</code>, <code>"TUESDAY"</code>, <code>"WEDNESDAY"</code>, <code>"THURSDAY"</code>, <code>"FRIDAY"</code>, <code>"SATURDAY"</code>, or <code>"SUNDAY"</code>.</p>
   */
  def getDayOfWeek(): String = js.native
  /**
   *  Returns the ending hour of this schedule. 
   * <p>The time is based on a 24-hour clock. Valid ending times range from <code>00:15</code> to <code>24:00</code>. So, for instance, a schedule which ends at 15:30 would return <code>15</code> as the value of <code>getEndHour()</code>.</p>
   */
  def getEndHour(): Int = js.native
  /**
   *  Returns the ending minute of this schedule. 
   * <p>For instance, a schedule which ends at 15:30 would return <code>30</code> as the value of <code>getEndMinute()</code>. The only possible return values are <code>0</code>, <code>15</code>, <code>30</code>, and <code>45</code>.</p>
   */
  def getEndMinute(): Int = js.native
  /**
   *  Returns the starting hour of this schedule. 
   * <p>The time is based on a 24-hour clock. Valid starting times range from <code>00:00</code> to <code>23:45</code>. So, for instance, a schedule which starts at 15:30 would return <code>15</code> as the value of <code>getStartHour()</code>.</p>
   */
  def getStartHour(): Int = js.native
  /**
   *  Returns the starting minute of this schedule. 
   * <p>For instance, a schedule which starts at 15:30 would return <code>30</code> as the value of <code>getStartMinute()</code>. The only possible return values are <code>0</code>, <code>15</code>, <code>30</code>, and <code>45</code>.</p>
   */
  def getStartMinute(): Int = js.native
}