package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of account-level mobile apps.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (accountMobileAppIterator.hasNext()) {
 *    var accountMobileApp = accountMobileAppIterator.next();
 *  }</pre>
 */
trait AccountMobileAppIterator extends SizeAwareIterator[AccountMobileApp]
