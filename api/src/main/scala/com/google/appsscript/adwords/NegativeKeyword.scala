package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents an AdWords negative keyword. 
 * <p>Negative keywords can exist either at the ad group level or the campaign level.</p>
 * <p></p>
 */
trait NegativeKeyword extends js.Object {
  /**
   *  Returns the 
   * <a href="adwordsapp_adgroup.html">AdGroup</a>
   *  to which the negative keyword belongs. This will always return 
   * <code>null</code>
   *  for campaign-level negative keywords.
   */
  def getAdGroup(): AdGroup = js.native
  /**
   *  Returns the 
   * <a href="adwordsapp_campaign.html">Campaign</a>
   *  to which the negative keyword belongs.
   */
  def getCampaign(): Campaign = js.native
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"NegativeKeyword"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**
   *  Returns the match type of the negative keyword. Possible values: 
   * <code>BROAD, PHRASE, EXACT</code>
   * .
   */
  def getMatchType(): String = js.native
  /**
   *  Returns the text of the negative keyword. The returned value will be formatted as follows, depending on the match type: 
   * <ul> 
   *  <li><code>shoes</code> - broad match</li> 
   *  <li><code>"shoes"</code> - phrase match</li> 
   *  <li><code>[leather shoes]</code> - exact match</li> 
   * </ul>
   */
  def getText(): String = js.native
  /**
   *  Removes the negative keyword from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove(): Unit = js.native
}
