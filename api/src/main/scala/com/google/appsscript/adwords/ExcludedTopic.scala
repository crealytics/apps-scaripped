package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents an AdWords excluded topic.
 */
trait ExcludedTopic extends js.Object {
  /**  Returns the ad group to which this excluded topic belongs. */
  def getAdGroup: AdGroup = js.native
  /**  Returns the campaign to which this excluded topic belongs. */
  def getCampaign: Campaign = js.native
  /**  Returns the ID of the excluded topic. */
  def getId: Long = js.native
  /**
   *  Returns the topic ID of the excluded topic. The topic ID identifies the topic category. A list of valid topic IDs is available on our
   * <a href="/adwords/api/docs/appendix/verticals">Verticals</a>
   *  page.
   */
  def getTopicId: Long = js.native
  /**
   *  Removes the excluded topic from the account.
   * <p>Returns nothing.</p>
   *
   */
  def remove: Unit = js.native
}