package com.google.appsscript.drive

import com.google.appsscript.base._

import scala.scalajs.js

/**
 * FolderIterator An object that allows scripts to iterate over a potentially large collection of folders. Folder iterators can be acccessed from DriveApp, a File, or a Folder. 
 *  // Log the name of every folder in the user's Drive.
 *  var folders = DriveApp.getFolders();
 *  while (folders.hasNext()) {
 *    var folder = folders.next();
 *    Logger.log(folder.getName());
 *  }
 */
trait FolderIterator extends js.Object {
  /** Gets a token that can be used to resume this iteration at a later time. This method is useful if processing an iterator in one execution would exceed the maximum execution time. Continuation tokens are generally valid for one week. */
  def getContinuationToken(): String = js.native
  /** Determines whether calling next() will return an item. */
  def hasNext(): Boolean = js.native
  /** Gets the next item in the collection of files or folders. Throws an exception if no items remain. */
  def next(): Folder = js.native
}
