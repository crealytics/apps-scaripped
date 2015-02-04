package com.google.appsscript.base

import scala.scalajs.js

/** BlobSource Interface for objects that can export their data as a Blob. Implementing classes Name Brief description Attachment A Sites Attachment such as a file attached to a page. Blob A data interchange object for Apps Script services. Chart A Chart object, which can be embedded into documents, UI elements, or used as a static image. Document A document, containing rich text and elements such as tables and lists. EmbeddedChart Represents a chart that has been embedded into a Spreadsheet. File This class contains methods to get information about the file and modify its contents. File A file in Google Drive. GmailAttachment An attachment from Gmail. HTTPResponse This class allows users to access specific information on HTTP responses. HtmlOutput An HtmlOutput object that can be served from a script. InlineImage An element representing an embedded image. JdbcBlob A JDBC Blob. JdbcClob A JDBC Clob. Spreadsheet This class allows users to access and modify Google Sheets files. StaticMap Allows for the creation and decoration of static map images. */
trait BlobSource extends js.Object {
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = js.native
  /** Return the data inside this object as a blob. */
  def getBlob(): Blob = js.native
}
