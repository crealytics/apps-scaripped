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
 * <a href="adwordsapp_mobileapp.html">MobileApp</a>
 *  objects. 
 * <p>Example usage:</p>
 *  
 * <pre class="prettyprint">
 *  // Create a mobile app builder.
 *  var mobileAppBuilder = AdWordsApp.extensions().newMobileAppBuilder();
 * 
 *  // Create a mobile app operation.
 *  var mobileAppOperation = mobileAppBuilder
 *    .withAppId("store specific app id")               // required
 *    .withStore("Android")                             // required
 *    .withLinkText("Download Android App Here")        // required
 *    .withLinkUrl("http://wwww.example.com/andoidApp") // required
 *    .withStartDate({day: 12, month: 9, year: 2013})   // optional
 *    .build();
 * 
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
trait MobileAppBuilder extends js.Object {
  /**
   *  Creates a 
   * <a href="adwordsapp_mobileapp.html">MobileApp</a>
   * . Returns a 
   * <a href="adwordsapp_mobileappoperation.html">MobileAppOperation</a>
   *  that can be used to get the new mobile app (or access any associated errors if creation failed).
   */
  def build(): MobileAppOperation = js.native
  /**
   *  Returns the newly created mobile app.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_mobileappbuilder.html#build_0">MobileAppBuilder.build()</a> instead.
   * </aside>
   */
  def create(): MobileApp = js.native
  /**  Sets the mobile app's app ID. Takes a string representing the store-specific ID for the target application. This field is required. */
  def withAppId(appId: String): MobileAppBuilder = js.native
  /**
   *  Sets the mobile app's end date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance, 
   * <code>mobileAppBuilder.withEndDate("20130503");</code>
   *  is equivalent to 
   * <code>mobileAppBuilder.withEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the start date now comes after the end date, or</li> 
   *  <li>it's a date in the past</li>
   * </ul>
   */
  def withEndDate(date: AnyRef): MobileAppBuilder = js.native
  /**  Sets the link text of the mobile app. This field is required. */
  def withLinkText(linkText: String): MobileAppBuilder = js.native
  /**  Sets the link URL of the mobile app. This field is required. */
  def withLinkUrl(linkUrl: String): MobileAppBuilder = js.native
  /**
   *  Sets the mobile app's device preference to mobile or clears it. This field is optional and defaults to 
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): MobileAppBuilder = js.native
  /**
   *  Sets the mobile app scheduling. Scheduling of a mobile app allows you to control the days of week and times of day during which the mobile app will show alongside your ads. 
   * <p>Passing in an empty array clears the scheduling field, causing the mobile app to run at all times.</p>
   *  
   * <p>The following example sets the mobile app to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *   mobileAppBuilder.withSchedules([mondayMorning, tuesdayMorning]);</pre>
   */
  def withSchedules(schedules: Seq[ExtensionSchedule]): MobileAppBuilder = js.native
  /**
   *  Sets the mobile app's start date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance, 
   * <code>mobileAppBuilder.withStartDate("20130503");</code>
   *  is equivalent to 
   * <code>mobileAppBuilder.withStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the given date is after the mobile app's end date,</li>
   * </ul>
   */
  def withStartDate(date: AnyRef): MobileAppBuilder = js.native
  /**  Sets the application store that this application belongs to. This accepts either "iOS" or "Android". This field is required. */
  def withStore(store: String): MobileAppBuilder = js.native
}