package com.google.appsscript.drive

import com.google.appsscript.base._

/**
 * Folder A folder in Google Drive. Folders can be accessed or created from DriveApp. 
 *  // Log the name of every folder in the user's Drive.
 *  var folders = DriveApp.getFolders();
 *  while (folders.hasNext()) {
 *    var folder = folders.next();
 *    Logger.log(folder.getName());
 *  }
 */
trait Folder {
  /** Adds the given user to the list of editors for the Folder. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(emailAddress: String): Folder = ???
  /** Adds the given user to the list of editors for the Folder. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(user: User): Folder = ???
  /** Adds the given array of users to the list of editors for the Folder. If any of the users were already on the list of viewers, this method promotes them out of the list of viewers. */
  def addEditors(emailAddresses: Seq[String]): Folder = ???
  /** Adds the given file to the current folder. This method does not move the file out of its existing parent folder; a file can have more than one parent simultaneously. */
  def addFile(child: File): Folder = ???
  /** Adds the given folder to the current folder. This method does not move the folder out of its existing parent folder; a folder can have more than one parent simultaneously. */
  def addFolder(child: Folder): Folder = ???
  /** Adds the given user to the list of viewers for the Folder. If the user was already on the list of editors, this method has no effect. */
  def addViewer(emailAddress: String): Folder = ???
  /** Adds the given user to the list of viewers for the Folder. If the user was already on the list of editors, this method has no effect. */
  def addViewer(user: User): Folder = ???
  /** Adds the given array of users to the list of viewers for the Folder. If any of the users were already on the list of editors, this method has no effect for them. */
  def addViewers(emailAddresses: Seq[String]): Folder = ???
  /** Creates a file in the current folder from a given Blob of arbitrary data. */
  def createFile(blob: BlobSource): File = ???
  /** Creates a text file in the current folder with the given name and contents. Throws an exception if content is larger than 10MB. */
  def createFile(name: String, content: String): File = ???
  /** Creates a file in the current folder with the given name, contents, and MIME type. Throws an exception if content is larger than 10MB. */
  def createFile(name: String, content: String, mimeType: String): File = ???
  /** Creates a folder in the current folder with the given name. */
  def createFolder(name: String): Folder = ???
  /** Gets the permission granted to the given user. */
  def getAccess(email: String): Permission = ???
  /** Gets the permission granted to the given user. */
  def getAccess(user: User): Permission = ???
  /** Gets the date the Folder was created. */
  def getDateCreated: scala.scalajs.js.Date = ???
  /** Gets the description for the Folder. */
  def getDescription: String = ???
  /** Gets the list of editors for this Folder. If the user who executes the script does not have edit access to the Folder, this method returns an empty array. */
  def getEditors: Seq[User] = ???
  /** Gets a collection of all files that are children of the current folder. */
  def getFiles: FileIterator = ???
  /** Gets a collection of all files that are children of the current folder and have the given name. */
  def getFilesByName(name: String): FileIterator = ???
  /** Gets a collection of all files that are children of the current folder and have the given MIME type. */
  def getFilesByType(mimeType: String): FileIterator = ???
  /** Gets a collection of all folders that are children of the current folder. */
  def getFolders: FolderIterator = ???
  /** Gets a collection of all folders that are children of the current folder and have the given name. */
  def getFoldersByName(name: String): FolderIterator = ???
  /** Gets the ID of the Folder. */
  def getId: String = ???
  /** Gets the date the Folder was last updated. */
  def getLastUpdated: scala.scalajs.js.Date = ???
  /** Gets the name of the Folder. */
  def getName: String = ???
  /** Gets the owner of the Folder. */
  def getOwner: User = ???
  /** Gets a collection of folders that are immediate parents of the Folder. */
  def getParents: FolderIterator = ???
  /** Gets which class of users can access the Folder, besides any individual users who have been explicitly given access. */
  def getSharingAccess: Access = ???
  /** Gets the permission granted to those users who can access the Folder, besides any individual users who have been explicitly given access. */
  def getSharingPermission: Permission = ???
  /** Gets the number of bytes used to store the Folder in Drive. Note that Google Apps files do not count toward Drive storage limits and thus return 0 bytes. */
  def getSize: Int = ???
  /** Gets the URL that can be used to open the Folder in a Google App like Drive or Docs. */
  def getUrl: String = ???
  /** Gets the list of viewers and commenters for this Folder. If the user who executes the script does not have edit access to the Folder, this method returns an empty array. */
  def getViewers: Seq[User] = ???
  /** Determines whether users with edit permissions to the Folder are allowed to share with other users or change the permissions. */
  def isShareableByEditors: Boolean = ???
  /** Determines whether the Folder has been starred in the user's Drive. */
  def isStarred: Boolean = ???
  /** Determines whether the Folder is in the trash of the user's Drive. */
  def isTrashed: Boolean = ???
  /** Removes the given user from the list of editors for the Folder. This method does not block users from accessing the Folder if they belong to a class of users who have general access — for example, if the Folder is shared with the user's entire domain. */
  def removeEditor(emailAddress: String): Folder = ???
  /** Removes the given user from the list of editors for the Folder. This method does not block users from accessing the Folder if they belong to a class of users who have general access — for example, if the Folder is shared with the user's entire domain. */
  def removeEditor(user: User): Folder = ???
  /** Removes the given file from the current folder. This method does not delete the file, but if a file is removed from all of its parents, it cannot be seen in Drive except by searching for it or using the "All items" view. */
  def removeFile(child: File): Folder = ???
  /** Removes the given folder from the current folder. This method does not delete the folder or its contents, but if a folder is removed from all of its parents, it cannot be seen in Drive except by searching for it or using the "All items" view. */
  def removeFolder(child: Folder): Folder = ???
  /** Removes the given user from the list of viewers and commenters for the Folder. This method has no effect if the user is an editor, not a viewer or commenter. This method also does not block users from accessing the Folder if they belong to a class of users who have general access — for example, if the Folder is shared with the user's entire domain. */
  def removeViewer(emailAddress: String): Folder = ???
  /** Removes the given user from the list of viewers and commenters for the Folder. This method has no effect if the user is an editor, not a viewer. This method also does not block users from accessing the Folder if they belong to a class of users who have general access — for example, if the Folder is shared with the user's entire domain. */
  def removeViewer(user: User): Folder = ???
  /** Revokes the access to the Folder granted to the given user. This method does not block users from accessing the Folder if they belong to a class of users who have general access — for example, if the Folder is shared with the user's entire domain. */
  def revokePermissions(user: String): Folder = ???
  /** Revokes the access to the Folder granted to the given user. This method does not block users from accessing the Folder if they belong to a class of users who have general access — for example, if the Folder is shared with the user's entire domain. */
  def revokePermissions(user: User): Folder = ???
  /** Gets a collection of all files that are children of the current folder and match the given search criteria. The search criteria are detailed the Google Drive SDK documentation. Note that the params argument is a query string that may contain string values, so take care to escape quotation marks correctly (for example "title contains 'Gulliver\\'s Travels'" or 'title contains "Gulliver\'s Travels"'). */
  def searchFiles(params: String): FileIterator = ???
  /** Gets a collection of all folders that are children of the current folder and match the given search criteria. The search criteria are detailed the Google Drive SDK documentation. Note that the params argument is a query string that may contain string values, so take care to escape quotation marks correctly (for example "title contains 'Gulliver\\'s Travels'" or 'title contains "Gulliver\'s Travels"'). */
  def searchFolders(params: String): FolderIterator = ???
  /** Sets the description for the Folder. */
  def setDescription(description: String): Folder = ???
  /** Sets the name of the Folder. */
  def setName(name: String): Folder = ???
  /** Changes the owner of the Folder. This method also gives the previous owner explicit edit access to the Folder. */
  def setOwner(emailAddress: String): Folder = ???
  /** Changes the owner of the Folder. This method also gives the previous owner explicit edit access to the Folder. */
  def setOwner(user: User): Folder = ???
  /** Sets whether users with edit permissions to the Folder are allowed to share with other users or change the permissions. The default for a new Folder is true. */
  def setShareableByEditors(shareable: Boolean): Folder = ???
  /** Sets which class of users can access the Folder and what permissions those users are granted, besides any individual users who have been explicitly given access. */
  def setSharing(accessType: Access, permissionType: Permission): Folder = ???
  /** Sets whether the Folder is starred in the user's Drive. The default for new Folders is false. */
  def setStarred(starred: Boolean): Folder = ???
  /** Sets whether the Folder is in the trash of the user's Drive. The default for new Folders is false. */
  def setTrashed(trashed: Boolean): Folder = ???
}