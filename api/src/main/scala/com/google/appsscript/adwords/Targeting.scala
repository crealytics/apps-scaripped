package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Access to campaign-level targeting criteria.
 * <p>For instance, to fetch all ad schedules in an account, you might use:</p>
 *
 * <pre class="prettyprint">
 *  var adSchedules = AdWordsApp.targeting().adSchedules().get();
 *  while (adSchedules.hasNext()) {
 *    var adSchedule = adSchedules.next();
 *  }</pre>
 *
 * <p>Or to select all locations targeted by a campaign:</p>
 *
 * <pre class="prettyprint">
 *  var campaign = AdWordsApp.campaigns().get().next();
 *  var locations = campaign.targeting().targetedLocations().get();
 *  while (locations.hasNext()) {
 *    var location = locations.next();
 *  }</pre>
 */
trait Targeting extends js.Object {
  /**
   *  Specializes this selector to return
   * <a href="adwordsapp_adschedule.html">AdSchedule</a>
   *  criteria.
   */
  def adSchedules: AdScheduleSelector = js.native
  /**
   *  Specializes this selector to return
   * <a href="adwordsapp_excludedlocation.html">ExcludedLocation</a>
   *  criteria.
   */
  def excludedLocations: ExcludedLocationSelector = js.native
  /**
   *  Specializes this selector to return
   * <a href="adwordsapp_platform.html">Platform</a>
   *  criteria.
   */
  def platforms: PlatformSelector = js.native
  /**
   *  Specializes this selector to return
   * <a href="adwordsapp_targetedlocation.html">TargetedLocation</a>
   *  criteria.
   */
  def targetedLocations: TargetedLocationSelector = js.native
  /**
   *  Specializes this selector to return
   * <a href="adwordsapp_targetedproximity.html">TargetedProximity</a>
   *  criteria.
   */
  def targetedProximities: TargetedProximitySelector = js.native
}