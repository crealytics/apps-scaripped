package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents an AdWords excluded audience.
 */
trait ExcludedAudience {
  /**  Returns the ad group to which this excluded audience belongs. */
  def getAdGroup: AdGroup = ???
  /**  Returns the audience ID of the excluded audience. */
  def getAudienceId: Long = ???
  /**
   *  Returns the type of the excluded audience, either 
   * <code>USER_INTEREST</code>
   *  or 
   * <code>USER_LIST</code>
   * .
   */
  def getAudienceType: String = ???
  /**  Returns the campaign to which this excluded audience belongs. */
  def getCampaign: Campaign = ???
  /**  Returns the ID of the excluded audience. */
  def getId: Long = ???
  /**
   *  Removes the excluded audience from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove: Unit = ???
}