package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords display keyword. */
trait DisplayKeyword extends js.Object with HasStatistics {
  /** Provides access to this display keyword's bidding fields. */
  def bidding(): DisplayKeywordBidding = js.native
  /** Returns the ad group to which this display keyword belongs. */
  def getAdGroup(): AdGroup = js.native
  /** Returns the campaign to which this display keyword belongs. */
  def getCampaign(): Campaign = js.native
  /** Returns the ID of the display keyword. */
  def getId(): Long = js.native
  /** Returns the text of the display keyword. */
  def getText(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * if the display keyword is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the display keyword is paused.
   */
  def isPaused(): Boolean = js.native
  /**
   * Removes the display keyword.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
}
