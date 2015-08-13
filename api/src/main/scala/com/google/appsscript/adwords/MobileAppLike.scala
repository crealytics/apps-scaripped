package com.google.appsscript.adwords

import scala.scalajs.js

trait MobileAppLike extends js.Any {
  /** Returns the start date of the account-level mobile app. For instance, if the start date of the account-level mobile app is May 3, 2013, this would return the following object:
  * <code>{year: 2013, month: 5, day: 3}</code>
  * .
  */
  def getStartDate(): AdWordsDate = js.native
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
  /**
  * Returns the application store to which the application belongs. Possible return values:
  * <code>"iOS", "Android"</code>
  * .
  */
  def getStore(): String = js.native
}
