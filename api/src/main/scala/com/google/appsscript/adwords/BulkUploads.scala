package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Access to bulk uploads: 
 * <a href="adwordsapp_fileupload.html">FileUpload</a>
 * , 
 * <a href="adwordsapp_csvupload.html">CsvUpload</a>
 * .
 */
trait BulkUploads extends js.Object {
  /**
   *  Creates a 
   * <a href="adwordsapp_csvupload.html">CsvUpload</a>
   *  with the given column headers. 
   * <p>This method accepts an optional arguments object. The following optional arguments are supported: </p>
   * <table> 
   *  <tbody>
   *   <tr>
   *    <th>Name</th>
   *    <th>Type</th>
   *    <th>Description</th>
   *   </tr> 
   *   <tr> 
   *    <td>fileLocale</td> 
   *    <td><code>String</code></td> 
   *    <td> File locale, specified in ISO format. Affects how numbers and dates are parsed. Defaults to <code>en_US</code>. See a full list in <a href="http://www.oracle.com/technetwork/java/javase/javase7locales-334809.html"> Supported Locales</a>. </td> 
   *   </tr>
   *   <tr> 
   *    <td>moneyInMicros</td> 
   *    <td><code>boolean</code></td> 
   *    <td> Whether or not to represent money in micros ('1370000') or in currency ('1.37'). Defaults to <code>true</code>. </td> 
   *   </tr>
   *   <tr> 
   *    <td>timeZone</td> 
   *    <td><code>String</code></td> 
   *    <td> The time zone to use for dates. No default. The following formats are supported: 
   *     <ul> 
   *      <li>A timezone in tz database (e.g. America/Los_Angeles etc.). See a full list in <a href="http://en.wikipedia.org/wiki/List_of_tz_database_time_zones">List of tz database time zones</a>; </li>
   *      <li>Standard offsets in the form <code>[+-]hhmm</code> (e.g. +0800, -0500). </li>
   *     </ul> </td> 
   *   </tr> 
   *  </tbody>
   * </table>
   *  
   * <p>Example usages: </p>
   * <pre class="prettyprint">
   *  // Creates a CsvUpload with 3 columns named 'columnA', 'columnB' and 'columnC', respectively.
   *  var upload1 = AdWordsApp.bulkUploads().newCsvUpload(
   *      ['columnA', 'columnB', 'columnC']);
   * 
   *  // Creates a CsvUpload which represents money in currency (e.g. 1.37) instead of in micros
   *  // (e.g. 137000).
   *  var upload2 = AdWordsApp.bulkUploads().newCsvUpload(
   *      ['columnA', 'columnB', 'columnC'], {
   *        moneyInMicros: false
   *      });</pre>
   */
  def newCsvUpload(columnNames: Seq[String], optArgs: AnyRef): CsvUpload = js.native
  /**
   *  Creates a 
   * <a href="adwordsapp_fileupload.html">FileUpload</a>
   *  with the given Google Sheet.
   */
  def newFileUpload(sheet: Sheet): FileUpload = js.native
  /**
   *  Creates a 
   * <a href="adwordsapp_fileupload.html">FileUpload</a>
   *  with the content in the given Blob. 
   * <p>This method only accepts Blobs with supported MIME types (<code>CSV</code>, <code>MICROSOFT_EXCEL</code>, <code>MICROSOFT_EXCEL_LEGACY</code>). </p>
   * <p>This method accepts an optional arguments object. The following optional arguments are supported: </p>
   * <table> 
   *  <tbody>
   *   <tr>
   *    <th>Name</th>
   *    <th>Type</th>
   *    <th>Description</th>
   *   </tr> 
   *   <tr> 
   *    <td>fileLocale</td> 
   *    <td><code>String</code></td> 
   *    <td> File locale, specified in ISO format. Affects how numbers and dates are parsed. Defaults to <code>en_US</code>. See a full list in <a href="/adwords/api/docs/appendix/locales">Supported Locales</a>. </td> 
   *   </tr> 
   *  </tbody>
   * </table>
   *  
   * <p>Example usages: </p>
   * <pre class="prettyprint">
   *  // Creates a bulk upload with the content fetched from url.
   *  var url = "www.example.com/content.csv";
   *  var blob = UrlFetchApp.fetch(url).getAs(MimeType.CSV);
   *  var upload = AdWordsApp.bulkUploads().newFileUpload(blob);</pre>
   */
  def newFileUpload(blob: Blob): FileUpload = js.native
  /**
   *  Creates a 
   * <a href="adwordsapp_fileupload.html">FileUpload</a>
   *  with the content in the given File in Drive. 
   * <p>This method only accepts files in supported formats (.csv, .tsv, .xls, .xlsx). </p>
   * <p>This method accepts an optional arguments object. The following optional arguments are supported: </p>
   * <table> 
   *  <tbody>
   *   <tr>
   *    <th>Name</th>
   *    <th>Type</th>
   *    <th>Description</th>
   *   </tr> 
   *   <tr> 
   *    <td>fileLocale</td> 
   *    <td><code>String</code></td> 
   *    <td> File locale, specified in ISO format. Affects how numbers and dates are parsed. Defaults to <code>en_US</code>. See a full list in <a href="http://www.oracle.com/technetwork/java/javase/javase7locales-334809.html"> Supported Locales</a>. </td> 
   *   </tr> 
   *  </tbody>
   * </table>
   *  
   * <p>Example usages: </p>
   * <pre class="prettyprint">
   *  // Creates a Bulk upload from an .xls file under the given Drive folder.
   *  var files = DriveApp.getFolderById("folder_id").getFilesByType(MimeType.MICROSOFT_EXCEL);
   *  if (files.hasNext()) {
   *    var file = files.next();
   *    var upload = AdWordsApp.bulkUploads().newFileUpload(file);
   *  }</pre>
   */
  def newFileUpload(file: File): FileUpload = js.native
}