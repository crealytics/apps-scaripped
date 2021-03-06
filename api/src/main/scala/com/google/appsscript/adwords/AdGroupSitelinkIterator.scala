package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of ad group-level sitelinks.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (adGroupSitelinkIterator.hasNext()) {
 *    var adGroupSitelink = adGroupSitelinkIterator.next();
 *  }</pre>
 */
trait AdGroupSitelinkIterator extends js.Object with SizeAwareIterator[AdGroupSitelink]
