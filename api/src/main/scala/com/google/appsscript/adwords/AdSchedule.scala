package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents one period of an AdWords ad schedule.
 * <p>For instance, if a campaign were set up to show ads only on weekdays from 9AM to 6PM, it would have five <code>AdSchedule</code>s: one for Monday 9AM-6PM, one for Tuesday 9AM-6PM, and so on.</p>
 */
trait AdSchedule extends js.Object with HasBidModifier with HasStatistics {
  /** Returns the campaign to which this ad schedule belongs. */
  def getCampaign(): Campaign = js.native
  /**
   * Returns the day of week this ad schedule applies to.
   * <p>This will be one of <code>"MONDAY"</code>, <code>"TUESDAY"</code>, <code>"WEDNESDAY"</code>, <code>"THURSDAY"</code>, <code>"FRIDAY"</code>, <code>"SATURDAY"</code>, or <code>"SUNDAY"</code>.</p>
   */
  def getDayOfWeek(): String = js.native
  /**
   * Returns the ending hour of this ad schedule.
   * <p>The time is based on a 24-hour clock. Valid ending times range from <code>00:15</code> to <code>24:00</code>. So, for instance, an ad schedule which ends at 3:30PM would return <code>15</code> as the value of <code>getEndHour()</code>.</p>
   */
  def getEndHour(): Int = js.native
  /**
   * Returns the ending minute of this ad schedule.
   * <p>For instance, an ad schedule which ends at 3:30PM would return <code>30</code> as the value of <code>getEndMinute()</code>. The only possible return values are <code>0</code>, <code>15</code>, <code>30</code>, and <code>45</code>.</p>
   */
  def getEndMinute(): Int = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"AdSchedule"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**
   * Returns the ID of the ad schedule.
   * <p>Ad schedule IDs may be shared across campaigns. In order to uniquely identify an ad schedule target, one must specify both its campaign ID and the ad schedule ID. </p>
   */
  def getId(): Long = js.native
  /**
   * Returns the starting hour of this ad schedule.
   * <p>The time is based on a 24-hour clock. Valid starting times range from <code>00:00</code> to <code>23:45</code>. So, for instance, an ad schedule which starts at 3:30PM would return <code>15</code> as the value of <code>getStartHour()</code>.</p>
   */
  def getStartHour(): Int = js.native
  /**
   * Returns the starting minute of this ad schedule.
   * <p>For instance, an ad schedule which starts at 3:30PM would return <code>30</code> as the value of <code>getStartMinute()</code>. The only possible return values are <code>0</code>, <code>15</code>, <code>30</code>, and <code>45</code>.</p>
   */
  def getStartMinute(): Int = js.native
  /**
   * Removes the ad schedule.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
}
