package com.google.appsscript.base

/** Blob A data interchange object for Apps Script services. */
trait Blob {
  /** Returns a copy of this blob. */
  def copyBlob: Blob = ???
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = ???
  /** Gets the data stored in this blob. */
  def getBytes: Seq[Byte] = ???
  /** Gets the content type of the bytes in this blob. */
  def getContentType: String = ???
  /** Gets the data of this blob as a String with UTF-8 encoding. */
  def getDataAsString: String = ???
  /** Gets the data of this blob as a string with the specified encoding. */
  def getDataAsString(charset: String): String = ???
  /** Gets the name of this blob. */
  def getName: String = ???
  /** Returns whether this blob is a Google Apps file (Sheets, Docs, etc.). */
  def isGoogleType: Boolean = ???
  /** Sets the data stored in this blob. */
  def setBytes(data: Seq[Byte]): Blob = ???
  /** Sets the content type of the bytes in this blob. */
  def setContentType(contentType: String): Blob = ???
  /** Sets the content type of the bytes in this blob based on the file extension. The contentType will be null if it cannot be guessed from its extension. */
  def setContentTypeFromExtension: Blob = ???
  /** Sets the data of this blob from a string with UTF-8 encoding. */
  def setDataFromString(string: String): Blob = ???
  /** Sets the data of this blob from a string with the specified encoding. */
  def setDataFromString(string: String)(charset: String): Blob = ???
  /** Sets the name of this blob. */
  def setName(name: String): Blob = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getAllBlobs: Seq[Blob] = ???
}