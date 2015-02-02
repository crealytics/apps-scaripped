package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Represents an AdWords negative keyword. 
 * <p>Negative keywords can exist either at the ad group level or the campaign level.</p>
 * <p></p>
 */
trait NegativeKeyword {
  /**
   *  Returns the 
   * <a href="adwordsapp_adgroup.html">AdGroup</a>
   *  to which the negative keyword belongs. This will always return 
   * <code>null</code>
   *  for campaign-level negative keywords.
   */
  def getAdGroup: AdGroup = ???
  /**
   *  Returns the 
   * <a href="adwordsapp_campaign.html">Campaign</a>
   *  to which the negative keyword belongs.
   */
  def getCampaign: Campaign = ???
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"NegativeKeyword"</code>
   * .
   */
  def getEntityType: String = ???
  /**
   *  Returns the match type of the negative keyword. Possible values: 
   * <code>BROAD, PHRASE, EXACT</code>
   * .
   */
  def getMatchType: String = ???
  /**
   *  Returns the text of the negative keyword. The returned value will be formatted as follows, depending on the match type: 
   * <ul> 
   *  <li><code>shoes</code> - broad match</li> 
   *  <li><code>"shoes"</code> - phrase match</li> 
   *  <li><code>[leather shoes]</code> - exact match</li> 
   * </ul>
   */
  def getText: String = ???
  /**
   *  Removes the negative keyword from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove: Unit = ???
}