package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents an AdWords targeted location.
 * <p>Targeted locations are used to only show your ads in specific geographic areas. For instance, a broadly-targeted campaign might have location targets for an entire country, whereas a more specifically-targeted campaign might break down its location targets at the city level.</p>
 * <p>For more information on locations, please see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>. </p>
 * <p>See also <a href="adwordsapp_excludedlocation.html">ExcludedLocation</a>.</p>
 */
trait TargetedLocation extends js.Object with HasBidModifier with Location with HasStatistics
