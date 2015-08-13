package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * An iterator of phone numbers.
 * <p>Typical usage:</p>
 * <pre class="prettyprint">
 *  while (phoneNumberIterator.hasNext()) {
 *    var phoneNumber = phoneNumberIterator.next();
 *  }</pre>
 */
trait PhoneNumberIterator extends js.Object with SizeAwareIterator[PhoneNumber]
