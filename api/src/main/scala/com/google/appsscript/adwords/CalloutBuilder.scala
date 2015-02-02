package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Builder for
 * <a href="adwordsapp_callout.html">Callout</a>
 *  objects.
 * <p>Example usage:</p>
 *
 * <pre class="prettyprint">
 *  // Create a callout builder.
 *  var calloutBuilder = AdWordsApp.extensions().newCalloutBuilder();
 *
 *  // Create a callout operation.
 *  var calloutOperation = calloutBuilder
 *    .withText("Free Shipping")                // required
 *    .withMobilePreferred(true)                // optional
 *    .build();
 *
 *  // Optional: examine the outcome. The call to isSuccessful()
 *  // will block until the operation completes.
 *  if (calloutOperation.isSuccessful()) {
 *    // Get the result.
 *    var callout = calloutOperation.getResult();
 *  } else {
 *    // Handle the errors.
 *    var errors = calloutOperation.getErrors();
 *  }</pre>
 */
trait CalloutBuilder extends js.Object {
  /**
   *  Creates a
   * <a href="adwordsapp_callout.html">Callout</a>
   * . Returns a
   * <a href="adwordsapp_calloutoperation.html">CalloutOperation</a>
   *  that can be used to get the new callout (or access any associated errors if creation failed).
   */
  def build: CalloutOperation = js.native
  /**
   *  Sets the callout's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance,
   * <code>calloutBuilder.withEndDate("20130503");</code>
   *  is equivalent to
   * <code>calloutBuilder.withEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the start date now comes after the end date, or</li>
   *  <li>it's a date in the past</li>
   * </ul>
   */
  def withEndDate(date: AnyRef): CalloutBuilder = js.native
  /**
   *  Sets the callout's device preference to mobile or clears it. This field is optional and defaults to
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): CalloutBuilder = js.native
  /**
   *  Sets the callout scheduling. Scheduling of a callout allows you to control the days of week and times of day during which the callout will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the callout to run at all times.</p>
   *
   * <p>The following example sets the callout to run on Mondays and Tuesday from 8:00 to 11:00.</p>
   *
   * <pre class="prettyprint">
   *   var mondayMorning = {
   *     dayOfWeek: "MONDAY",
   *     startHour: 8,
   *     startMinute: 0,
   *     endHour: 11,
   *     endMinute: 0
   *   };
   *   var tuesdayMorning = {
   *     dayOfWeek: "TUESDAY",
   *     startHour: 8,
   *     startMinute: 0,
   *     endHour: 11,
   *     endMinute: 0
   *   };
   *
   *   calloutBuilder.withSchedules([mondayMorning, tuesdayMorning]);</pre>
   */
  def withSchedules(schedules: Seq[ExtensionSchedule]): CalloutBuilder = js.native
  /**
   *  Sets the callout's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance,
   * <code>calloutBuilder.withStartDate("20130503");</code>
   *  is equivalent to
   * <code>calloutBuilder.withStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the callout's end date,</li>
   * </ul>
   */
  def withStartDate(date: AnyRef): CalloutBuilder = js.native
  /**  Sets the text of the new callout to the specified value. This field is required. */
  def withText(text: String): CalloutBuilder = js.native
}