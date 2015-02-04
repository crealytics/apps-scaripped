package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents a Bulk Upload which can be incrementally built up in CSV format and uploaded to the Bulk Uploads service.
 */
trait CsvUpload extends js.Object {
  /**
   *  Appends a row to the Bulk Upload. 
   * <p>The row object is a key-value map. For each key-value pair: </p>
   * <ul> 
   *  <li> If the key exists in the provided column headers, its value will fill into the cell corresponding to the matching column; </li>
   *  <li> If it doesn't exist, the key-value pair is ignored. </li>
   * </ul>
   *  
   * <pre class="prettyprint">
   *  // The resulting CSV bulk upload of the following code would be:
   *  // +-------------+-------------+----------------+
   *  // |   Campaign  | Campaign ID | Campaign state |
   *  // +-------------+-------------+----------------+
   *  // | Campaign #2 |  2001684997 |     enabled    |
   *  // +-------------+-------------+----------------+
   *  var bulkUpload = AdWordsApp.createBulkUpload([
   *      "Campaign", "Campaign ID", "Campaign state"]);
   *  bulkUpload.append({
   *      "Campaign":"Campaign #2",
   *      "Campaign ID":"2001684997",
   *      "Campaign state":"enabled"});</pre>
   */
  def append(row: AnyRef): CsvUpload = js.native
  /**
   *  Uploads the file and applies the changes. 
   * <aside class="warning">
   *  When previewing a script, 
   *  <code>apply()</code> previews the Bulk Upload instead of applying it.
   * </aside>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def apply(): Unit = js.native
  /**
   *  Specifies that this upload is used for Campaign Management entity changes. 
   * <p>This is the default option, so this method doesn't need to be called except to override a previous call to <a href="adwordsapp_csvupload.html#forOfflineConversions_0">CsvUpload.forOfflineConversions()</a>.</p>
   */
  def forCampaignManagement(): CsvUpload = js.native
  /**
   *  Specifies that this upload is used for reporting offline conversions. 
   * <p>By default, uploads are used for Campaign Management entity changes, so it's necessary to call <a href="adwordsapp_csvupload.html#forOfflineConversions_0">CsvUpload.forOfflineConversions()</a> to make offline conversion uploads work correctly.</p>
   */
  def forOfflineConversions(): CsvUpload = js.native
  /**
   *  Uploads the file and previews the changes. 
   * <p>Returns nothing.</p>
   *  
   */
  def preview(): Unit = js.native
  /**  Sets the file name of the uploaded file. */
  def setFileName(fileName: String): CsvUpload = js.native
}