package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An operation representing creation of a new keyword. Calling any method (
 * <a href="adwordsapp_keywordoperation.html#getErrors_0">getErrors</a>
 * , 
 * <a href="adwordsapp_keywordoperation.html#getResult_0">getResult</a>
 * , or 
 * <a href="adwordsapp_keywordoperation.html#isSuccessful_0">isSuccessful</a>
 * ) will cause the operation to execute and create the keyword. To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed all the operations you want. 
 * <p>For instance, this is how you would assign a label to newly created keywords in an efficient manner:</p>
 *  
 * <pre class="prettyprint">
 *  // For the purpose of this example, suppose that the fetchKeywords()
 *  // function fetches keyword data from your data source of choice, so that
 *  // keywordsToCreate is an array of strings, where each string is the text
 *  // for a keyword.
 *  var adGroup = AdWordsApp.adGroups().get().next();
 *  var keywordsToCreate = fetchKeywords();
 *  var keywordOps = [];
 *  for (var i = 0; i &lt; keywordsToCreate.length; i++) {
 *    keywordOps.push(
 *        adGroup.newKeywordBuilder().withText(keywordsToCreate[i]).build());
 *  }
 *  for (var i = 0; i &lt; keywordOps.length; i++) {
 *    if (keywordOps[i].isSuccessful()) {
 *      keywordOps[i].getResult().applyLabel('myLabel');
 *    } else {
 *      Logger.log('Errors from Keyword [' + keywordsToCreate[i] + ']: '
 *          + keywordOps[i].getErrors());
 *    }
 *  }</pre>
 */
trait KeywordOperation extends js.Object {
  /**  Returns an empty array if the operation was successful, otherwise returns the list of errors encountered when trying to create the Keyword. */
  def getErrors(): js.Array[String] = js.native
  /**
   *  Returns the newly created Keyword, or 
   * <code>null</code>
   *  if the operation was unsuccessful.
   */
  def getResult(): Keyword = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the operation was successful.
   */
  def isSuccessful(): Boolean = js.native
}
