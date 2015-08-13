package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords audience. */
trait Audience extends js.Object with HasStatistics {
  /** Provides access to this audience's bidding fields. */
  def bidding(): AudienceBidding = js.native
  /** Returns the ad group to which this audience belongs. */
  def getAdGroup(): AdGroup = js.native
  /** Returns the audience ID of the audience. User List IDs (List IDs) are available on the details page of a User List (found under the Audiences section of the Shared Library). */
  def getAudienceId(): Long = js.native
  /**
   * Returns the type of the audience, either
   * <code>USER_INTEREST</code>
   * or
   * <code>USER_LIST</code>
   * .
   */
  def getAudienceType(): String = js.native
  /** Returns the campaign to which this audience belongs. */
  def getCampaign(): Campaign = js.native
  /** Returns the ID of the audience. */
  def getId(): Long = js.native
  /**
   * Returns
   * <code>true</code>
   * if the audience is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the audience is paused.
   */
  def isPaused(): Boolean = js.native
  /**
   * Removes the audience.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
}
