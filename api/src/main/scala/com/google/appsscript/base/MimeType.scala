package com.google.appsscript.base

/**
 * MimeType An enumeration that provides access to MIME-type declarations without typing the strings explicitly. Any method that expects a MIME type rendered as a string (for example, 'image/png') will also accept one of the values below, so long as the method supports the underlying MIME type. 
 *  // Use MimeType enum to log the name of every Google Doc in the user's Drive.
 *  var docs = DriveApp.getFilesByType(MimeType.GOOGLE_DOCS);
 *  while (docs.hasNext()) {
 *   var doc = docs.next();
 *   Logger.log(doc.getName())
 *  }
 * 
 *  // Use plain string to log the size of every PNG in the user's Drive.
 *  var pngs = DriveApp.getFilesByType('image/png');
 *  while (pngs.hasNext()) {
 *   var png = pngs.next();
 *   Logger.log(png.getSize());
 *  }
 */
trait MimeType {
  ()
}