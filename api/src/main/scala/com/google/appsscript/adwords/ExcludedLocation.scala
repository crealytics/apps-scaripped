package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents an AdWords excluded location. 
 * <p>Excluded locations are used to restrict your ads from showing in specific geographic areas. For instance, a campaign could show ads in all parts of a country except for a specific city by having a <a href="adwordsapp_targetedlocation.html">TargetedLocation</a> for the entire country and an <a href="adwordsapp_excludedlocation.html">ExcludedLocation</a> for that specific city.</p>
 *  
 * <p>For more information on locations, please see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>. </p>
 *  
 * <p>See also <a href="adwordsapp_targetedlocation.html">TargetedLocation</a>.</p>
 */
trait ExcludedLocation extends js.Object {
  /**  Returns the campaign to which this location belongs. */
  def getCampaign(): Campaign = js.native
  /**
   *  Returns the country code of this location. 
   * <p>This is the standard two-letter country code, e.g. <code>"US"</code> or <code>"BR"</code>.</p>
   */
  def getCountryCode(): String = js.native
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"ExcludedLocation"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**
   *  Returns the ID of the location. 
   * <p>Location IDs are shared across campaigns. In order to uniquely identify a location exclusion, one must specify both its campaign ID and the location ID.</p>
   */
  def getId(): Long = js.native
  /**  Returns the name of this location. */
  def getName(): String = js.native
  /**
   *  Returns the target type of this location. 
   * <p>The target type is a generic description of the location, such as <code>"City"</code>, <code>"Postal Code"</code>, or <code>"Country"</code>. For a full list of target types, see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>.</p>
   */
  def getTargetType(): String = js.native
  /**
   *  Returns the targeting status of this location. 
   * <p>This can return one of three values: </p>
   * <ul> 
   *  <li><code>"ACTIVE"</code>: indicates that the location can be targeted as normal. The vast majority of locations are active.</li> 
   *  <li><code>"PHASING_OUT"</code>: indicates that the location can be targeted, but that support will soon be removed. To get a list of which locations are phasing out, please see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>.</li> 
   *  <li><code>"OBSOLETE"</code>: indicates that the location cannot be targeted. </li>
   * </ul>
   */
  def getTargetingStatus(): String = js.native
  /**
   *  Removes the location from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove(): Unit = js.native
}