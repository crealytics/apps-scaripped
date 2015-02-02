package com.google.appsscript.drive

import com.google.appsscript.base._

/**
 * DriveApp Allows scripts to create, find, and modify files and folders in Google Drive. 
 *  // Log the name of every file in the user's Drive.
 *  var files = DriveApp.getFiles();
 *  while (files.hasNext()) {
 *    var file = files.next();
 *    Logger.log(file.getName());
 *  }
 */
trait DriveApp {
  /** Adds the given file to the root of the user's Drive. This method does not move the file out of its existing parent folder; a file can have more than one parent simultaneously. */
  def addFile(child: File): Folder = ???
  /** Adds the given folder to the root of the user's Drive. This method does not move the folder out of its existing parent folder; a folder can have more than one parent simultaneously. */
  def addFolder(child: Folder): Folder = ???
  /** Resumes a file iteration using a continuation token from a previous iterator. This method is useful if processing an iterator in one execution would exceed the maximum execution time. Continuation tokens are generally valid for one week. */
  def continueFileIterator(continuationToken: String): FileIterator = ???
  /** Resumes a folder iteration using a continuation token from a previous iterator. This method is useful if processing an iterator in one execution would exceed the maximum execution time. Continuation tokens are generally valid for one week. */
  def continueFolderIterator(continuationToken: String): FolderIterator = ???
  /** Creates a file in the root of the user's Drive from a given Blob of arbitrary data. */
  def createFile(blob: BlobSource): File = ???
  /** Creates a text file in the root of the user's Drive with the given name and contents. Throws an exception if content is larger than 10MB. */
  def createFile(name: String, content: String): File = ???
  /** Creates a file in the root of the user's Drive with the given name, contents, and MIME type. Throws an exception if content is larger than 10MB. */
  def createFile(name: String, content: String, mimeType: String): File = ???
  /** Creates a folder in the root of the user's Drive with the given name. */
  def createFolder(name: String): Folder = ???
  /** Gets the file with the given ID. Throws a scripting exception if the file does not exist or the user does not have permission to access it. */
  def getFileById(id: String): File = ???
  /** Gets a collection of all files in the user's Drive. */
  def getFiles: FileIterator = ???
  /** Gets a collection of all files in the user's Drive that have the given name. */
  def getFilesByName(name: String): FileIterator = ???
  /** Gets a collection of all files in the user's Drive that have the given MIME type. */
  def getFilesByType(mimeType: String): FileIterator = ???
  /** Gets the folder with the given ID. Throws a scripting exception if the folder does not exist or the user does not have permission to access it. */
  def getFolderById(id: String): Folder = ???
  /** Gets a collection of all folders in the user's Drive. */
  def getFolders: FolderIterator = ???
  /** Gets a collection of all folders in the user's Drive that have the given name. */
  def getFoldersByName(name: String): FolderIterator = ???
  /** Gets the folder at the root of the user's Drive. */
  def getRootFolder: Folder = ???
  /** Gets the number of bytes the user is allowed to store in Drive. */
  def getStorageLimit: Int = ???
  /** Gets the number of bytes the user is currently storing in Drive. */
  def getStorageUsed: Int = ???
  /** Gets a collection of all the files in the trash of the user's Drive. */
  def getTrashedFiles: FileIterator = ???
  /** Gets a collection of all the folders in the trash of the user's Drive. */
  def getTrashedFolders: FolderIterator = ???
  /** Removes the given file from the root of the user's Drive. This method does not delete the file, but if a file is removed from all of its parents, it cannot be seen in Drive except by searching for it or using the "All items" view. */
  def removeFile(child: File): Folder = ???
  /** Removes the given folder from the root of the user's Drive. This method does not delete the folder or its contents, but if a folder is removed from all of its parents, it cannot be seen in Drive except by searching for it or using the "All items" view. */
  def removeFolder(child: Folder): Folder = ???
  /** Gets a collection of all files in the user's Drive that match the given search criteria. The search criteria are detailed the Google Drive SDK documentation. Note that the params argument is a query string that may contain string values, so take care to escape quotation marks correctly (for example "title contains 'Gulliver\\'s Travels'" or 'title contains "Gulliver\'s Travels"'). */
  def searchFiles(params: String): FileIterator = ???
  /** Gets a collection of all folders in the user's Drive that match the given search criteria. The search criteria are detailed the Google Drive SDK documentation. Note that the params argument is a query string that may contain string values, so take care to escape quotation marks correctly (for example "title contains 'Gulliver\\'s Travels'" or 'title contains "Gulliver\'s Travels"'). */
  def searchFolders(params: String): FolderIterator = ???
}