package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of bidding strategies.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (biddingStrategyIterator.hasNext()) {
 *    var biddingStrategy = biddingStrategyIterator.next();
 *  }</pre>
 */
trait BiddingStrategyIterator extends SizeAwareIterator[BiddingStrategy]
