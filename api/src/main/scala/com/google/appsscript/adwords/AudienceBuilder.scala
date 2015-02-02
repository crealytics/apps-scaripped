package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Builder for 
 * <a href="adwordsapp_audience.html">Audience</a>
 *  objects. 
 * <p>Example usage:</p>
 *  
 * <pre class="prettyprint">
 *  var audienceBuilder = adGroup.display().newAudienceBuilder();
 *  var audience = audienceBuilder
 *    .withAudienceType('USER_LIST')  // required
 *    .withAudienceId(3)              // required
 *    .withCpc(0.50)                  // optional
 *    .build()                        // create the audience</pre>
 */
trait AudienceBuilder {
  /**
   *  Builds the audience. Returns a 
   * <a href="adwordsapp_audienceoperation.html">AudienceOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_audience.html">Audience</a>
   * .
   */
  def build: AudienceOperation = ???
  /**
   *  Builds the excluded audience. Returns an 
   * <a href="adwordsapp_excludedaudienceoperation.html">ExcludedAudienceOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_excludedaudience.html">ExcludedAudience</a>
   * .
   */
  def exclude: ExcludedAudienceOperation = ???
  /**  Sets the audience ID of the audience. This field is required. User List IDs (List IDs) are available on the details page of a User List (found under the Audiences section of the Shared Library). */
  def withAudienceId(audienceId: Long): AudienceBuilder = ???
  /**
   *  Sets the type of the audience, either 
   * <code>USER_INTEREST</code>
   *  or 
   * <code>USER_LIST</code>
   * . This field is required.
   */
  def withAudienceType(audienceType: String): AudienceBuilder = ???
  /**  Sets the max CPC bid of the new audience to the specified value. */
  def withCpc(cpc: Double): AudienceBuilder = ???
  /**  Sets the max CPM bid of the new audience to the specified value. */
  def withCpm(cpm: Double): AudienceBuilder = ???
}