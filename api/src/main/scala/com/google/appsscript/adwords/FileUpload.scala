package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents a Bulk Upload of an already-existing file, loaded from Blob, Google Sheet or Drive File.
 */
trait FileUpload extends js.Object {
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
   * <p>This is the default option, so this method doesn't need to be called except to override a previous call to <a href="adwordsapp_fileupload.html#forOfflineConversions_0">FileUpload.forOfflineConversions()</a>.</p>
   */
  def forCampaignManagement(): FileUpload = js.native
  /**
   *  Specifies that this upload is used for reporting offline conversions. 
   * <p>By default, uploads are used for Campaign Management entity changes, so it's necessary to call <a href="adwordsapp_fileupload.html#forOfflineConversions_0">FileUpload.forOfflineConversions()</a> to make offline conversion uploads work correctly.</p>
   */
  def forOfflineConversions(): FileUpload = js.native
  /**
   *  Uploads the file and previews the changes. 
   * <p>Returns nothing.</p>
   *  
   */
  def preview(): Unit = js.native
  /**  Sets the file name of the uploaded file. */
  def setFileName(fileName: String): FileUpload = js.native
}
