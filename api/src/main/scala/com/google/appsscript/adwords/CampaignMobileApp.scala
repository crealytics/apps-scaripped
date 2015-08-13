package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a mobile app that has been added to a campaign as an ad app extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 * page for more information on mobile apps and other types of ad extensions.
 */
trait CampaignMobileApp extends js.Object with MobileApp {
  /** Returns the campaign to which this campaign-level mobile app belongs. */
  def getCampaign(): Campaign = js.native
}
