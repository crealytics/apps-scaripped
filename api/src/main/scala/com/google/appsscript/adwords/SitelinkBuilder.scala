package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for
 * <a href="adwordsapp_sitelink.html">Sitelink</a>
 * objects.
 * <p>Example usage:</p>
 * <pre class="prettyprint">
 *  // Create a sitelink builder.
 *  var sitelinkBuilder = AdWordsApp.extensions().newSitelinkBuilder();
 *  // Create a sitelink operation.
 *  var sitelinkOperation = sitelinkBuilder
 *    .withFinalUrl("http://www.example.com/join") // required
 *    .withLinkText("Join us now")                 // required
 *    .withMobilePreferred(true)                   // optional
 *    .build();
 *  // Optional: examine the outcome. The call to isSuccessful()
 *  // will block until the operation completes.
 *  if (sitelinkOperation.isSuccessful()) {
 *    // Get the result.
 *    var sitelink = sitelinkOperation.getResult();
 *  } else {
 *    // Handle the errors.
 *    var errors = sitelinkOperation.getErrors();
 *  }</pre>
 */
trait SitelinkBuilder extends js.Object with Builder[Sitelink] with BuilderWithCustomParameters {
  /** Sets the first description line of the new sitelink description to the specified value. */
  def withDescription1(description1: String): SitelinkBuilder = js.native
  /** Sets the second description line of the new sitelink description to the specified value. */
  def withDescription2(description2: String): SitelinkBuilder = js.native
  /**
   * Sets the sitelink's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. This field is optional. For instance,
   * <code>sitelinkBuilder.withEndDate("20130503");</code>
   * is equivalent to
   * <code>sitelinkBuilder.withEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the start date now comes after the end date, or</li>
   *  <li>it's a date in the past</li>
   * </ul>
   */
  def withEndDate(date: AnyRef): SitelinkBuilder = js.native
  /**
   * Sets the final URL of the new sitelink to the specified value.
   * <p>The final URL represents the actual landing page for your sitelink. The final URL must be the URL of the page that the user ends up on after clicking on your ad, once all the redirects have taken place.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * Final URLs are required.
   */
  def withFinalUrl(finalUrl: String): SitelinkBuilder = js.native
  /** Sets the link text of the new sitelink to the specified value. This field is required. */
  def withLinkText(linkText: String): SitelinkBuilder = js.native
  /**
   * Sets the link URL of the new sitelink to the specified value.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when destination URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_sitelinkbuilder.html#withFinalUrl_1">SitelinkBuilder.withFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def withLinkUrl(linkUrl: String): SitelinkBuilder = js.native
  /**
   * Sets the mobile final URL of the new sitelink to the specified value.
   * <p>The mobile final URL represents the actual landing page for your sitelink on a mobile device. The final mobile URL must be the URL of the page that the user ends up on after clicking on your ad on a mobile device, once all the redirects have taken place.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withMobileFinalUrl(mobileFinalUrl: String): SitelinkBuilder = js.native
  /**
   * Sets the sitelink's device preference to mobile or clears it. This field is optional and defaults to
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): SitelinkBuilder = js.native
  /**
   * Sets the sitelink scheduling. Scheduling of a sitelink allows you to control the days of week and times of day during which the sitelink will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the sitelink to run at all times.</p>
   * <p>The following example sets the sitelink to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *   sitelinkBuilder.withSchedules([mondayMorning, tuesdayMorning]);</pre>
   */
  def withSchedules(schedules: js.Array[ExtensionSchedule]): SitelinkBuilder = js.native
  /**
   * Sets the sitelink's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. This field is optional. For instance,
   * <code>sitelinkBuilder.withStartDate("20130503");</code>
   * is equivalent to
   * <code>sitelinkBuilder.withStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the sitelink's end date,</li>
   * </ul>
   */
  def withStartDate(date: AnyRef): SitelinkBuilder = js.native
  /**
   * Sets the tracking template of the new sitelink to the specified value.
   * <p>You can optionally use the tracking template to specify additional tracking parameters or redirects. AdWords will use this template to assemble the actual destination URL to associate with the ad.</p>
   * <p>A tracking template specified at a lower level entity will override the setting specified at a higher level entity, e.g., a tracking template set at the ad group level overrides the setting at the campaign level, and a tracking template specified at the ad level overrides the setting at the ad group level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withTrackingTemplate(trackingTemplate: String): SitelinkBuilder = js.native
}
