package com.google.appsscript.base

import scala.scalajs.js

/** Blob A data interchange object for Apps Script services. */
trait Blob extends js.Object {
  /** Returns a copy of this blob. */
  def copyBlob(): Blob = js.native
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = js.native
  /** Gets the data stored in this blob. */
  def getBytes(): js.Array[Byte] = js.native
  /** Gets the content type of the bytes in this blob. */
  def getContentType(): String = js.native
  /** Gets the data of this blob as a String with UTF-8 encoding. */
  def getDataAsString(): String = js.native
  /** Gets the data of this blob as a string with the specified encoding. */
  def getDataAsString(charset: String): String = js.native
  /** Gets the name of this blob. */
  def getName(): String = js.native
  /** Returns whether this blob is a Google Apps file (Sheets, Docs, etc.). */
  def isGoogleType(): Boolean = js.native
  /** Sets the data stored in this blob. */
  def setBytes(data: js.Array[Byte]): Blob = js.native
  /** Sets the content type of the bytes in this blob. */
  def setContentType(contentType: String): Blob = js.native
  /** Sets the content type of the bytes in this blob based on the file extension. The contentType will be null if it cannot be guessed from its extension. */
  def setContentTypeFromExtension(): Blob = js.native
  /** Sets the data of this blob from a string with UTF-8 encoding. */
  def setDataFromString(string: String): Blob = js.native
  /** Sets the data of this blob from a string with the specified encoding. */
  def setDataFromString(string: String, charset: String): Blob = js.native
  /** Sets the name of this blob. */
  def setName(name: String): Blob = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getAllBlobs(): js.Array[Blob] = js.native
}
