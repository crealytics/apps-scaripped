package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents an AdWords website placement.
 * <p>Mobile app placements and mobile app category placements are not supported.</p>
 */
trait Placement extends js.Object with HasStatistics {
  /** Provides access to this placement's bidding fields. */
  def bidding(): PlacementBidding = js.native
  /** Returns the ad group to which this placement belongs. */
  def getAdGroup(): AdGroup = js.native
  /** Returns the campaign to which this placement belongs. */
  def getCampaign(): Campaign = js.native
  /**
   * Returns the ID of the placement. Returns
   * <code>0</code>
   * if the placement is automatic.
   */
  def getId(): Long = js.native
  /** Returns the URL of the placement. */
  def getUrl(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * if the placement is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the placement is managed. Returns
   * <code>false</code>
   * if the placement is automatic.
   */
  def isManaged(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the placement is paused.
   */
  def isPaused(): Boolean = js.native
  /**
   * Removes the placement.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
}
