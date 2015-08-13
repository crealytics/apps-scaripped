package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents an AdWords excluded location.
 * <p>Excluded locations are used to restrict your ads from showing in specific geographic areas. For instance, a campaign could show ads in all parts of a country except for a specific city by having a <a href="adwordsapp_targetedlocation.html">TargetedLocation</a> for the entire country and an <a href="adwordsapp_excludedlocation.html">ExcludedLocation</a> for that specific city.</p>
 * <p>For more information on locations, please see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>. </p>
 * <p>See also <a href="adwordsapp_targetedlocation.html">TargetedLocation</a>.</p>
 */
trait ExcludedLocation extends js.Object with Location
