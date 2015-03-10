package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  The root object of the MCC API. Exposes methods for fetching and selecting 
 * <code>ManagedAccount</code>
 * .
 */
trait MccApp extends js.Object {
  /**  Returns the selector of all account labels in the account. */
  def accountLabels(): AccountLabelSelector = js.native
  /**
   *  Returns the selector of accounts managed by this MCC account. 
   * <p> MCC Accounts that manage other accounts (i.e. Client Managers) are not returned.</p>
   */
  def accounts(): ManagedAccountSelector = js.native
  /**
   *  Creates a new account label. 
   * <p> Usage examples: </p>
   *  
   * <pre class="prettyprint">
   *  MccApp.createAccountLabel("My Account Label");</pre>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def createAccountLabel(name: String): Unit = js.native
  /**
   *  Selects a 
   * <a href="mccapp_managedaccount.html">ManagedAccount</a>
   *  as the next account on which to operate. This can be used to make changes to an account managed by this MCC. 
   * <pre class="prettyprint">
   *   var mccAccount = AdWordsApp.currentAccount();
   *   var childAccounts = MccApp.accounts().withIds(['123-456-7890']).get();
   *   var childAccount = childAccounts.next();
   * 
   *   MccApp.select(childAccount);
   *   // Now in the child account.
   *   // Returns all the keywords in the account whose CustomerId is '123-456-7890'.
   *   var keywords = AdWordsApp.keywords().get();
   * 
   *   MccApp.select(mccAccount);
   *   // Now back in the mcc account.</pre>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def select(account: ManagedAccount): Unit = js.native
}
