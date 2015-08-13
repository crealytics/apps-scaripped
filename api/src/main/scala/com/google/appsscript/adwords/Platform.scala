package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords device target (either desktop, mobile, or tablet). */
trait Platform extends js.Object with HasBidModifier with HasStatistics {
  /** Returns the campaign to which this platform belongs. */
  def getCampaign(): Campaign = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Platform"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**
   * Returns the ID of the platform.
   * <p>Platform IDs are shared across campaigns. Specifically, desktop targets have ID <code>30000</code>, mobile targets have ID <code>30001</code>, and tablet targets have ID <code>30002</code>. In order to uniquely identify a platform target, one must specify both its campaign ID and the platform ID. </p>
   */
  def getId(): Long = js.native
  /**
   * Returns the name of this platform.
   * <p>This will be <code>"Desktop"</code> for desktop targets, <code>"HighEndMobile"</code> for mobile targets, or <code>"Tablet"</code> for tablet targets.</p>
   * <p></p>
   */
  def getName(): String = js.native
}
