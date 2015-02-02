package com.google.appsscript.drive

import com.google.appsscript.base._

/**
 * File A file in Google Drive. Files can be accessed or created from DriveApp. 
 *  // Trash every untitled spreadsheet that hasn't been updated in a week. 
 *  var files = DriveApp.getFilesByName('Untitled spreadsheet');
 *  while (files.hasNext()) {
 *    var file = files.next();
 *    if (new Date() - file.getLastUpdated() > 7 * 24 * 60 * 60 * 1000) {
 *      file.setTrashed(true);
 *    }
 *  }
 */
trait File {
  /** Add the given user to the list of commenters for the File. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addCommenter(emailAddress: String): File = ???
  /** Add the given user to the list of commenters for the File. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addCommenter(user: User): File = ???
  /** Add the given array of users to the list of commenters for the File. If any of the users were already on the list of viewers, this method promotes them out of the list of viewers. */
  def addCommenters(emailAddresses: Seq[String]): File = ???
  /** Adds the given user to the list of editors for the File. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(emailAddress: String): File = ???
  /** Adds the given user to the list of editors for the File. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(user: User): File = ???
  /** Adds the given array of users to the list of editors for the File. If any of the users were already on the list of viewers, this method promotes them out of the list of viewers. */
  def addEditors(emailAddresses: Seq[String]): File = ???
  /** Adds the given user to the list of viewers for the File. If the user was already on the list of editors, this method has no effect. */
  def addViewer(emailAddress: String): File = ???
  /** Adds the given user to the list of viewers for the File. If the user was already on the list of editors, this method has no effect. */
  def addViewer(user: User): File = ???
  /** Adds the given array of users to the list of viewers for the File. If any of the users were already on the list of editors, this method has no effect for them. */
  def addViewers(emailAddresses: Seq[String]): File = ???
  /** Gets the permission granted to the given user. */
  def getAccess(email: String): Permission = ???
  /** Gets the permission granted to the given user. */
  def getAccess(user: User): Permission = ???
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = ???
  /** Return the data inside this object as a blob. */
  def getBlob: Blob = ???
  /** Gets the date the File was created. */
  def getDateCreated: scala.scalajs.js.Date = ???
  /** Gets the description for the File. */
  def getDescription: String = ???
  /** Gets the URL that can be used to download the file. Only users with permission to open the file in Google Drive can access the URL. */
  def getDownloadUrl: String = ???
  /** Gets the list of editors for this File. If the user who executes the script does not have edit access to the File, this method returns an empty array. */
  def getEditors: Seq[User] = ???
  /** Gets the ID of the File. */
  def getId: String = ???
  /** Gets the date the File was last updated. */
  def getLastUpdated: scala.scalajs.js.Date = ???
  /** Gets the MIME type of the file. */
  def getMimeType: String = ???
  /** Gets the name of the File. */
  def getName: String = ???
  /** Gets the owner of the File. */
  def getOwner: User = ???
  /** Gets a collection of folders that are immediate parents of the File. */
  def getParents: FolderIterator = ???
  /** Gets which class of users can access the File, besides any individual users who have been explicitly given access. */
  def getSharingAccess: Access = ???
  /** Gets the permission granted to those users who can access the File, besides any individual users who have been explicitly given access. */
  def getSharingPermission: Permission = ???
  /** Gets the number of bytes used to store the File in Drive. Note that Google Apps files do not count toward Drive storage limits and thus return 0 bytes. */
  def getSize: Int = ???
  /** Gets a thumbnail image for the file, or null if no thumbnail exists. */
  def getThumbnail: Blob = ???
  /** Gets the URL that can be used to open the File in a Google App like Drive or Docs. */
  def getUrl: String = ???
  /** Gets the list of viewers and commenters for this File. If the user who executes the script does not have edit access to the File, this method returns an empty array. */
  def getViewers: Seq[User] = ???
  /** Determines whether users with edit permissions to the File are allowed to share with other users or change the permissions. */
  def isShareableByEditors: Boolean = ???
  /** Determines whether the File has been starred in the user's Drive. */
  def isStarred: Boolean = ???
  /** Determines whether the File is in the trash of the user's Drive. */
  def isTrashed: Boolean = ???
  /** Creates a copy of the file. */
  def makeCopy: File = ???
  /** Creates a copy of the file in the destination directory. */
  def makeCopy(destination: Folder): File = ???
  /** Creates a copy of the file and names it with the name provided. */
  def makeCopy(name: String): File = ???
  /** Creates a copy of the file in the destination directory and names it with the name provided. */
  def makeCopy(name: String, destination: Folder): File = ???
  /** Removes the given user from the list of commenters for the File. This method does not block users from access the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeCommenter(emailAddress: String): File = ???
  /** Removes the given user from the list of commenters for the File. This method does not block users from access the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeCommenter(user: User): File = ???
  /** Removes the given user from the list of editors for the File. This method does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeEditor(emailAddress: String): File = ???
  /** Removes the given user from the list of editors for the File. This method does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeEditor(user: User): File = ???
  /** Removes the given user from the list of viewers and commenters for the File. This method has no effect if the user is an editor, not a viewer or commenter. This method also does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeViewer(emailAddress: String): File = ???
  /** Removes the given user from the list of viewers and commenters for the File. This method has no effect if the user is an editor, not a viewer. This method also does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeViewer(user: User): File = ???
  /** Revokes the access to the File granted to the given user. This method does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def revokePermissions(user: String): File = ???
  /** Revokes the access to the File granted to the given user. This method does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def revokePermissions(user: User): File = ???
  /** Overwrites the content of the file with a given replacement. Throws an exception if content is larger than 10MB. */
  def setContent(content: String): File = ???
  /** Sets the description for the File. */
  def setDescription(description: String): File = ???
  /** Sets the name of the File. */
  def setName(name: String): File = ???
  /** Changes the owner of the File. This method also gives the previous owner explicit edit access to the File. */
  def setOwner(emailAddress: String): File = ???
  /** Changes the owner of the File. This method also gives the previous owner explicit edit access to the File. */
  def setOwner(user: User): File = ???
  /** Sets whether users with edit permissions to the File are allowed to share with other users or change the permissions. The default for a new File is true. */
  def setShareableByEditors(shareable: Boolean): File = ???
  /** Sets which class of users can access the File and what permissions those users are granted, besides any individual users who have been explicitly given access. */
  def setSharing(accessType: Access, permissionType: Permission): File = ???
  /** Sets whether the File is starred in the user's Drive. The default for new Files is false. */
  def setStarred(starred: Boolean): File = ???
  /** Sets whether the File is in the trash of the user's Drive. The default for new Files is false. */
  def setTrashed(trashed: Boolean): File = ???
}