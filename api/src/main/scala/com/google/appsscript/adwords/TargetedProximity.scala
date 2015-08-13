package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords targeted proximity — some radius around a geographical point. */
trait TargetedProximity extends js.Object with HasBidModifier with HasStatistics {
  /**
   * Returns the address of the central point, or
   * <code>null</code>
   * if unknown.
   */
  def getAddress(): Address = js.native
  /** Returns the campaign to which this proximity belongs. */
  def getCampaign(): Campaign = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"TargetedProximity"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**
   * Returns the ID of the proximity.
   * <p>Proximity IDs may be shared across campaigns. In order to uniquely identify a proximity target, one must specify both its campaign ID and the proximity ID. </p>
   */
  def getId(): Long = js.native
  /** Returns the latitude in degrees of the central point of this proximity. */
  def getLatitude(): Double = js.native
  /** Returns the longitude in degrees of the central point of this proximity. */
  def getLongitude(): Double = js.native
  /**
   * Returns the radius around the central point to target.
   * <p>This just returns a number such as <code>40</code> and is intended to be used in tandem with <a href="adwordsapp_targetedproximity.html#getRadiusUnits_0">TargetedProximity.getRadiusUnits()</a>.</p>
   */
  def getRadius(): Double = js.native
  /**
   * Returns the units of
   * <a href="adwordsapp_targetedproximity.html#getRadius_0">TargetedProximity.getRadius()</a>
   * .
   * <p>This is either <code>"MILES"</code> or <code>"KILOMETERS"</code>.</p>
   */
  def getRadiusUnits(): String = js.native
  /**
   * Removes the proximity.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
}
