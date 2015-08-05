package com.google.appsscript.urlfetch

import com.google.appsscript.base._

import scala.scalajs.js

/** HTTPResponse This class allows users to access specific information on HTTP responses. See also UrlFetchApp */
trait HTTPResponse extends js.Object {
  /** Returns an attribute/value map of headers for the HTTP response, with headers that have multiple values returned as arrays. */
  def getAllHeaders(): AnyRef = js.native
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = js.native
  /** Return the data inside this object as a blob. */
  def getBlob(): Blob = js.native
  /** Gets the raw binary content of an HTTP response. */
  def getContent(): js.Array[Byte] = js.native
  /** Gets the content of an HTTP response encoded as a string. */
  def getContentText(): String = js.native
  /** Returns the content of an HTTP response encoded as a string of the given charset. */
  def getContentText(charset: String): String = js.native
  /** Returns an attribute/value map of headers for the HTTP response. */
  def getHeaders(): AnyRef = js.native
  /** Get the HTTP status code (200 for OK, etc.) of an HTTP response. */
  def getResponseCode(): Int = js.native
}
