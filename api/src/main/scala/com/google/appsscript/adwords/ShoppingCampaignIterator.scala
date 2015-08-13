package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of shopping campaigns.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (shoppingCampaignIterator.hasNext()) {
 *    var shoppingCampaign = shoppingCampaignIterator.next();
 *  }</pre>
 */
trait ShoppingCampaignIterator extends SizeAwareIterator[ShoppingCampaign]
