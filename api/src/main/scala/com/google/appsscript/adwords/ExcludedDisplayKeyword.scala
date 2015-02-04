package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents an AdWords excluded display keyword.
 */
trait ExcludedDisplayKeyword extends js.Object {
  /**  Returns the ad group to which this excluded display keyword belongs. */
  def getAdGroup(): AdGroup = js.native
  /**  Returns the campaign to which this excluded display keyword belongs. */
  def getCampaign(): Campaign = js.native
  /**  Returns the ID of the excluded display keyword. */
  def getId(): Long = js.native
  /**  Returns the text of the excluded display keyword. */
  def getText(): String = js.native
  /**
   *  Removes the excluded display keyword from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove(): Unit = js.native
}