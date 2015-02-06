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
 * <a href="adwordsapp_phonenumber.html">PhoneNumber</a>
 *  objects. 
 * <p>Example usage:</p>
 *  
 * <pre class="prettyprint">
 *  // Create a phone number builder.
 *  var phoneNumberBuilder = AdWordsApp.extensions().newPhoneNumberBuilder();
 * 
 *  // Create a phone number operation.
 *  var phoneNumberOperation = phoneNumberBuilder
 *    .withCountry("US")                  // required
 *    .withPhoneNumber("1234567891")      // required
 *    .withCallOnly(false)                // required
 *    .withMobilePreferred(true)          // optional
 *    .build();
 * 
 *  // Optional: examine the outcome. The call to isSuccessful()
 *  // will block until the operation completes.
 *  if (phoneNumberOperation.isSuccessful()) {
 *    // Get the result.
 *    var phoneNumber = phoneNumberOperation.getResult();
 *  } else {
 *    // Handle the errors.
 *    var errors = phoneNumberOperation.getErrors();
 *  }</pre>
 */
trait PhoneNumberBuilder extends js.Object {
  /**
   *  Creates a 
   * <a href="adwordsapp_phonenumber.html">PhoneNumber</a>
   * . Returns a 
   * <a href="adwordsapp_phonenumberoperation.html">PhoneNumberOperation</a>
   *  that can be used to get the new phone number (or access any associated errors if creation failed).
   */
  def build(): PhoneNumberOperation = js.native
  /**
   *  Returns the newly created phone number.
   * <aside class="warning">
   *  <strong>Deprecated. </strong>This functionality has been deprecated. Please use 
   *  <a href="adwordsapp_phonenumberbuilder.html#build_0">PhoneNumberBuilder.build()</a> instead.
   * </aside>
   */
  def create(): PhoneNumber = js.native
  /**
   *  If set to 
   * <code>true</code>
   * , only the advertiser's phone number will get displayed. If set to 
   * <code>false</code>
   * , the link to the advertiser's website will be shown as well. This field is required.
   */
  def withCallOnly(callOnly: Boolean): PhoneNumberBuilder = js.native
  /**  Sets the two character country code of the advertiser's phone number. This field is required. */
  def withCountry(country: String): PhoneNumberBuilder = js.native
  /**
   *  Sets the phone number's end date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance, 
   * <code>phoneNumberBuilder.withEndDate("20130503");</code>
   *  is equivalent to 
   * <code>phoneNumberBuilder.withEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the start date now comes after the end date, or</li> 
   *  <li>it's a date in the past</li>
   * </ul>
   */
  def withEndDate(date: AnyRef): PhoneNumberBuilder = js.native
  /**
   *  Sets the phone number's device preference to mobile or clears it. This field is optional and defaults to 
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): PhoneNumberBuilder = js.native
  /**  Sets the advertiser's phone number that gets appended to the ad. This field is required. */
  def withPhoneNumber(phoneNumber: String): PhoneNumberBuilder = js.native
  /**
   *  Sets the phone number scheduling. Scheduling of a phone number allows you to control the days of week and times of day during which the phone number will show alongside your ads. 
   * <p>Passing in an empty array clears the scheduling field, causing the phone number to run at all times.</p>
   *  
   * <p>The following example sets the phone number to run on Mondays and Tuesday from 8:00 to 11:00.</p>
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
   *   phoneNumberBuilder.withSchedules([mondayMorning, tuesdayMorning]);</pre>
   */
  def withSchedules(schedules: js.Array[ExtensionSchedule]): PhoneNumberBuilder = js.native
  /**
   *  Sets the phone number's start date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance, 
   * <code>phoneNumberBuilder.withStartDate("20130503");</code>
   *  is equivalent to 
   * <code>phoneNumberBuilder.withStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the given date is after the phone number's end date,</li>
   * </ul>
   */
  def withStartDate(date: AnyRef): PhoneNumberBuilder = js.native
}
