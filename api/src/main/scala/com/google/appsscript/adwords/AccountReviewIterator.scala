package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of account-level reviews.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (accountReviewIterator.hasNext()) {
 *    var accountReview = accountReviewIterator.next();
 *  }</pre>
 */
trait AccountReviewIterator extends js.Object with SizeAwareIterator[AccountReview]
