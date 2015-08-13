package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Builder for
 * <a href="adwordsapp_mobileapp.html">MobileApp</a>
 * objects.
 * <p>Example usage:</p>
 * <pre class="prettyprint">
 *  // Create a mobile app builder.
 *  var mobileAppBuilder = AdWordsApp.extensions().newMobileAppBuilder();
 *  // Create a mobile app operation.
 *  var mobileAppOperation = mobileAppBuilder
 *    .withAppId("store specific app id")                 // required
 *    .withStore("Android")                               // required
 *    .withLinkText("Download Android App Here")          // required
 *    .withFinalUrl("http://wwww.example.com/androidApp") // required
 *    .withStartDate({day: 12, month: 9, year: 2013})     // optional
 *    .build();
 *  // Optional: examine the outcome. The call to isSuccessful()
 *  // will block until the operation completes.
 *  if (mobileAppOperation.isSuccessful()) {
 *    // Get the result.
 *    var mobileApp = mobileAppOperation.getResult();
 *  } else {
 *    // Handle the errors.
 *    var errors = mobileAppOperation.getErrors();
 *  }</pre>
 */
trait MobileAppBuilder extends Builder[MobileApp] {
  /**
   * Creates a
   * <a href="adwordsapp_mobileapp.html">MobileApp</a>
   * . Returns a
   * <a href="adwordsapp_mobileappoperation.html">MobileAppOperation</a>
   * that can be used to get the new mobile app (or access any associated errors if creation failed).
   */
  override def build(): Operation[MobileApp] = js.native
  /** Sets the mobile app's app ID. Takes a string representing the store-specific ID for the target application. This field is required. */
  def withAppId(appId: String): MobileAppBuilder = js.native
  /**
   * Sets the custom parameters of the new mobile app to the specified value.
   * <p>Custom parameters enable you to create your own <a href="//support.google.com/adwords/answer/2375447">ValueTrack</a> parameters that you can assign your own IDs to.</p>
   * <p>The name of a custom parameter can contain only alphanumeric characters, and custom parameter values may not contain white space. When referring to the custom parameter in final URLs and tracking template, you should surround the custom parameter in braces, and prefix an underscore to its name, e.g. <code>{_param}</code>.</p>
   * <p>You can have up to 3 custom parameters for an entity. The key and value must not exceed 16 and 200 bytes respectively.</p>
   * <p>Custom parameters specified at a lower level entity will override the setting specified at a higher level entity, e.g., setting custom parameters at the ad group level overrides the setting at the campaign level, and and custom parameters specified at the ad level override the setting at the ad group level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withCustomParameters(customParameters: AnyRef): MobileAppBuilder = js.native
  /**
   * Sets the mobile app's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. This field is optional. For instance,
   * <code>mobileAppBuilder.withEndDate("20130503");</code>
   * is equivalent to
   * <code>mobileAppBuilder.withEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the start date now comes after the end date, or</li>
   *  <li>it's a date in the past</li>
   * </ul>
   */
  def withEndDate(date: AnyRef): MobileAppBuilder = js.native
  /**
   * Sets the final URL of the new mobile app to the specified value.
   * <p>The final URL represents the actual landing page for your mobile app. The final URL must be the URL of the page that the user ends up on after clicking on your ad, once all the redirects have taken place.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * Final URLs are required.
   */
  def withFinalUrl(finalUrl: String): MobileAppBuilder = js.native
  /** Sets the link text of the mobile app. This field is required. */
  def withLinkText(linkText: String): MobileAppBuilder = js.native
  /**
   * Sets the link URL of the mobile app.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This method will be sunset when destination URLs become read-only on July 1, 2015. Please use
   *  <a href="adwordsapp_mobileappbuilder.html#withFinalUrl_1">MobileAppBuilder.withFinalUrl</a> instead. See
   *  <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.
   * </aside>
   */
  def withLinkUrl(linkUrl: String): MobileAppBuilder = js.native
  /**
   * Sets the mobile final URL of the new mobile app to the specified value.
   * <p>The mobile final URL represents the actual landing page for your mobile app on a mobile device. The final mobile URL must be the URL of the page that the user ends up on after clicking on your ad on a mobile device, once all the redirects have taken place.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def withMobileFinalUrl(mobileFinalUrl: String): MobileAppBuilder = js.native
  /**
   * Sets the mobile app's device preference to mobile or clears it. This field is optional and defaults to
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): MobileAppBuilder = js.native
  /**
   * Sets the mobile app scheduling. Scheduling of a mobile app allows you to control the days of week and times of day during which the mobile app will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the mobile app to run at all times.</p>
   * <p>The following example sets the mobile app to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *   mobileAppBuilder.withSchedules([mondayMorning, tuesdayMorning]);</pre>
   */
  def withSchedules(schedules: js.Array[ExtensionSchedule]): MobileAppBuilder = js.native
  /**
   * Sets the mobile app's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. This field is optional. For instance,
   * <code>mobileAppBuilder.withStartDate("20130503");</code>
   * is equivalent to
   * <code>mobileAppBuilder.withStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the mobile app's end date,</li>
   * </ul>
   */
  def withStartDate(date: AnyRef): MobileAppBuilder = js.native
  /** Sets the application store that this application belongs to. This accepts either "iOS" or "Android". This field is required. */
  def withStore(store: String): MobileAppBuilder = js.native
  /**
   * Sets the tracking template of the new mobile app to the specified value.
   * <p>You can optionally use the tracking template to specify additional tracking parameters or redirects. AdWords will use this template to assemble the actual destination URL to associate with the ad.</p>
   * <p>A tracking template specified at a lower level entity will override the setting specified at a higher level entity, e.g., a tracking template set at the ad group level overrides the setting at the campaign level, and a tracking template specified at the ad level overrides the setting at the ad group level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * If tracking template is not set, then tracking template will default to "{lpurl}" (no tracking).
   */
  def withTrackingTemplate(trackingTemplate: String): MobileAppBuilder = js.native
}
