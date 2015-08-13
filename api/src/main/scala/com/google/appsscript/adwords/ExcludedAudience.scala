package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords excluded audience. */
trait ExcludedAudience extends js.Object {
  /** Returns the ad group to which this excluded audience belongs. */
  def getAdGroup(): AdGroup = js.native
  /** Returns the audience ID of the excluded audience. */
  def getAudienceId(): Long = js.native
  /**
   * Returns the type of the excluded audience, either
   * <code>USER_INTEREST</code>
   * or
   * <code>USER_LIST</code>
   * .
   */
  def getAudienceType(): String = js.native
  /** Returns the campaign to which this excluded audience belongs. */
  def getCampaign(): Campaign = js.native
  /** Returns the ID of the excluded audience. */
  def getId(): Long = js.native
  /**
   * Removes the excluded audience.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
}
