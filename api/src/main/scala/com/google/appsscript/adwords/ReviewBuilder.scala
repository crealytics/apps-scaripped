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
 * <a href="adwordsapp_review.html">Review</a>
 *  objects.
 * <p>Example usage:</p>
 *
 * <pre class="prettyprint">
 *  // Create a review builder.
 *  var reviewBuilder = AdWordsApp.extensions().newReviewBuilder();
 *
 *  // Create a review operation.
 *  var reviewOperation = reviewBuilder
 *    .withText("Amazing service.")                   // required
 *    .withSourceName("Example Site")                 // required
 *    .withSourceUrl("http://www.example.com/review") // required
 *    .withExactlyQuoted(true)                        // optional
 *    .withMobilePreferred(true)                      // optional
 *    .build();
 *
 *  // Optional: examine the outcome. The call to isSuccessful()
 *  // will block until the operation completes.
 *  if (reviewOperation.isSuccessful()) {
 *    // Get the result.
 *    var review = reviewOperation.getResult();
 *  } else {
 *    // Handle the errors.
 *    var errors = reviewOperation.getErrors();
 *  }</pre>
 */
trait ReviewBuilder extends js.Object {
  /**
   *  Creates a
   * <a href="adwordsapp_review.html">Review</a>
   * . Returns a
   * <a href="adwordsapp_reviewoperation.html">ReviewOperation</a>
   *  that can be used to get the new review (or access any associated errors if creation failed).
   */
  def build: ReviewOperation = js.native
  /**
   *  Sets the review's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance,
   * <code>reviewBuilder.withEndDate("20130503");</code>
   *  is equivalent to
   * <code>reviewBuilder.withEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the start date now comes after the end date, or</li>
   *  <li>it's a date in the past</li>
   * </ul>
   */
  def withEndDate(date: AnyRef): ReviewBuilder = js.native
  /**
   *  Sets the exactly quoted value of the new review to the specified value. Specify
   * <code>true</code>
   *  if the text of the new review is exactly quoted, which will result in the text being rendered with quotation marks. Specify
   * <code>false</code>
   *  if the text of the new review is paraphrased, which will result in the text being rendered without quotation marks. This field is optional and defaults to
   * <code>false</code>
   * .
   */
  def withExactlyQuoted(isExactlyQuoted: Boolean): ReviewBuilder = js.native
  /**
   *  Sets the review's device preference to mobile or clears it. This field is optional and defaults to
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): ReviewBuilder = js.native
  /**
   *  Sets the review scheduling. Scheduling of a review allows you to control the days of week and times of day during which the review will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the review to run at all times.</p>
   *
   * <p>The following example sets the review to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *   reviewBuilder.withSchedules([mondayMorning, tuesdayMorning]);</pre>
   */
  def withSchedules(schedules: Seq[ExtensionSchedule]): ReviewBuilder = js.native
  /**  Sets the name of the source of the new review to the specified value. The combined length of sourceName and text is limited to 67 characters. This field is required. */
  def withSourceName(sourceName: String): ReviewBuilder = js.native
  /**  Sets the source URL of the new review to the specified value. This field is required. */
  def withSourceUrl(sourceUrl: String): ReviewBuilder = js.native
  /**
   *  Sets the review's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance,
   * <code>reviewBuilder.withStartDate("20130503");</code>
   *  is equivalent to
   * <code>reviewBuilder.withStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the review's end date,</li>
   * </ul>
   */
  def withStartDate(date: AnyRef): ReviewBuilder = js.native
  /**  Sets the text of the new review to the specified value. The combined length of sourceName and text is limited to 67 characters.This field is required. */
  def withText(text: String): ReviewBuilder = js.native
}