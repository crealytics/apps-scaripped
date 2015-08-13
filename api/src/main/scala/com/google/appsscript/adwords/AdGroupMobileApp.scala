package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a mobile app that has been added to an ad group as an ad app extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 * page for more information on mobile apps and other types of ad extensions.
 */
trait AdGroupMobileApp extends js.Object with MobileApp {
  /** Returns the ad group to which this ad group-level mobile app belongs. */
  def getAdGroup(): AdGroup = js.native
  /** Returns the campaign to which this ad group-level mobile app belongs. */
  def getCampaign(): Campaign = js.native
}
