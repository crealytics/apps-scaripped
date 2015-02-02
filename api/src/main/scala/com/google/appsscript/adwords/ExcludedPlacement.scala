package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents an AdWords excluded placement.
 */
trait ExcludedPlacement extends js.Object {
  /**  Returns the ad group to which this excluded placement belongs. */
  def getAdGroup: AdGroup = js.native
  /**  Returns the campaign to which this excluded placement belongs. */
  def getCampaign: Campaign = js.native
  /**  Returns the ID of the excluded placement. */
  def getId: Long = js.native
  /**  Returns the URL of the excluded placement. */
  def getUrl: String = js.native
  /**
   *  Removes the excluded placement from the account.
   * <p>Returns nothing.</p>
   *
   */
  def remove: Unit = js.native
}