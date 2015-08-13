package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of campaign-level reviews.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (campaignReviewIterator.hasNext()) {
 *    var campaignReview = campaignReviewIterator.next();
 *  }</pre>
 */
trait CampaignReviewIterator extends js.Object with SizeAwareIterator[CampaignReview]
