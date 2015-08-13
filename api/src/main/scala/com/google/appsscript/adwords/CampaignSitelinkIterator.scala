package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of campaign-level sitelinks.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (campaignSitelinkIterator.hasNext()) {
 *    var campaignSitelink = campaignSitelinkIterator.next();
 *  }</pre>
 */
trait CampaignSitelinkIterator extends SizeAwareIterator[CampaignSitelink]
