package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of campaign-level callouts.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (campaignCalloutIterator.hasNext()) {
 *    var campaignCallout = campaignCalloutIterator.next();
 *  }</pre>
 */
trait CampaignCalloutIterator extends js.Object with SizeAwareIterator[CampaignCallout]
