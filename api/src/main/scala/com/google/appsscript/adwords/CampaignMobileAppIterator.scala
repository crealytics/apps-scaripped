package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of campaign-level mobile apps.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (campaignMobileAppIterator.hasNext()) {
 *    var campaignMobileApp = campaignMobileAppIterator.next();
 *  }</pre>
 */
trait CampaignMobileAppIterator extends js.Object with SizeAwareIterator[CampaignMobileApp]
