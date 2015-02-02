package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents an AdWords excluded display keyword.
 */
trait ExcludedDisplayKeyword {
  /**  Returns the ad group to which this excluded display keyword belongs. */
  def getAdGroup: AdGroup = ???
  /**  Returns the campaign to which this excluded display keyword belongs. */
  def getCampaign: Campaign = ???
  /**  Returns the ID of the excluded display keyword. */
  def getId: Long = ???
  /**  Returns the text of the excluded display keyword. */
  def getText: String = ???
  /**
   *  Removes the excluded display keyword from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove: Unit = ???
}