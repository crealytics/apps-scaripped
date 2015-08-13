package com.google.appsscript.adwords

import scala.scalajs.js

trait AccountLike extends js.Any {
  def extensions(): AccountExtensions = js.native
  /**
  * Returns the currency code of the account. The returned values are in the three-letter ISO 4217 format, e.g.
  * <code>'USD'</code>
  * ,
  * <code>'CAD'</code>
  * ,
  * <code>'JPY'</code>
  * , etc.
  * <p>Please refer to <a href="/adwords/api/docs/appendix/currencycodes">AdWords API Currency Codes</a> for the full list of possible return values.</p>
  */
  def getCurrencyCode(): String = js.native
  /**
  * Returns the customer ID of the account.
  * <p>The returned value is in the standard AdWords format, e.g. <code>'123-456-7890'</code>.</p>
  */
  def getCustomerId(): String = js.native
  /**
  * Returns the type of this entity as a
  * <code>String</code>
  * , in this case,
  * <code>"Account"</code>
  * .
  */
  def getEntityType(): String = js.native
  /** Returns the name of the account. */
  def getName(): String = js.native
}
