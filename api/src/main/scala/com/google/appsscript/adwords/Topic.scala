package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords topic. */
trait Topic extends js.Object with HasStatistics {
  /** Provides access to this topic's bidding fields. */
  def bidding(): TopicBidding = js.native
  /** Returns the ad group to which this topic belongs. */
  def getAdGroup(): AdGroup = js.native
  /** Returns the campaign to which this topic belongs. */
  def getCampaign(): Campaign = js.native
  /** Returns the ID of the topic. */
  def getId(): Long = js.native
  /**
   * Returns the topic ID of the topic. The topic ID identifies the topic category. A list of valid topic IDs is available on our
   * <a href="/adwords/api/docs/appendix/verticals">Verticals</a>
   * page.
   */
  def getTopicId(): Long = js.native
  /**
   * Returns
   * <code>true</code>
   * if the topic is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the topic is paused.
   */
  def isPaused(): Boolean = js.native
  /**
   * Removes the topic.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
}
