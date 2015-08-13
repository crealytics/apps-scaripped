package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of ad group-level reviews.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (adGroupReviewIterator.hasNext()) {
 *    var adGroupReview = adGroupReviewIterator.next();
 *  }</pre>
 */
trait AdGroupReviewIterator extends js.Object with SizeAwareIterator[AdGroupReview]
