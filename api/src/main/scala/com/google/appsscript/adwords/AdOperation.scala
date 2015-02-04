package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An operation representing creation of a new ad. Calling any method (
 * <a href="adwordsapp_adoperation.html#getErrors_0">getErrors</a>
 * , 
 * <a href="adwordsapp_adoperation.html#getResult_0">getResult</a>
 * , or 
 * <a href="adwordsapp_adoperation.html#isSuccessful_0">isSuccessful</a>
 * ) will cause the operation to execute and create the ad. To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed all the operations you want. 
 * <p>For instance, this is how you would assign a label to newly created ads in an efficient manner: </p>
 *  
 * <pre class="prettyprint">
 *  // For the purpose of this example, suppose that the fetchAdText() function
 *  // fetches text ad data from your data source of choice, so that
 *  // adsToCreate is an array where each element is an object describing an ad.
 *  var adgroup = AdWordsApp.adGroups().get().next();
 *  var adsToCreate = fetchAdText();
 *  var adOps = [];
 *  for (var i = 0; i &lt; adsToCreate.length; i++) {
 *      adOps.push(
 *          adGroup.newTextAdBuilder()
 *              .withHeadline(adsToCreate[i].headline)
 *              .withDescription1(adsToCreate[i].description1)
 *              .withDescription2(adsToCreate[i].description2)
 *              .withDisplayUrl(adsToCreate[i].displayUrl)
 *              .withDestinationUrl(adsToCreate[i].destinationUrl)
 *              .build());
 *  }
 *  for (var i = 0; i &lt; adOps.length; i++) {
 *    if (adOps[i].isSuccessful()) {
 *      adOps[i].getResult().applyLabel('myLabel');
 *    } else {
 *      Logger.log('Errors from Ad [' + adsToCreate[i].headline + ']: '
 *          + adOps[i].getErrors());
 *    }
 *  }</pre>
 */
trait AdOperation extends js.Object {
  /**  Returns an empty array if the operation was successful, otherwise returns the list of errors encountered when trying to create the Ad. */
  def getErrors(): Seq[String] = js.native
  /**
   *  Returns the newly created Ad, or 
   * <code>null</code>
   *  if the operation was unsuccessful.
   */
  def getResult(): Ad = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the operation was successful.
   */
  def isSuccessful(): Boolean = js.native
}