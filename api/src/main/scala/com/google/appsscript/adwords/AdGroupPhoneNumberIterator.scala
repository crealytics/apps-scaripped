package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An iterator of ad group-level phone numbers. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  while (adGroupPhoneNumberIterator.hasNext()) {
 *    var adGroupPhoneNumber = adGroupPhoneNumberIterator.next();
 *  }</pre>
 */
trait AdGroupPhoneNumberIterator extends SizeAwareIterator[AdGroupPhoneNumber]
