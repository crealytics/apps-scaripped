package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents an AdWords excluded placement.
 */
trait ExcludedPlacement {
  /**  Returns the ad group to which this excluded placement belongs. */
  def getAdGroup: AdGroup = ???
  /**  Returns the campaign to which this excluded placement belongs. */
  def getCampaign: Campaign = ???
  /**  Returns the ID of the excluded placement. */
  def getId: Long = ???
  /**  Returns the URL of the excluded placement. */
  def getUrl: String = ???
  /**
   *  Removes the excluded placement from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove: Unit = ???
}