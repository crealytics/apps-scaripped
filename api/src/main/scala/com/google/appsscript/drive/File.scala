package com.google.appsscript.drive

import com.google.appsscript.base._

import scala.scalajs.js

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
trait File extends js.Object {
  /** Add the given user to the list of commenters for the File. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addCommenter(emailAddress: String): File = js.native
  /** Add the given user to the list of commenters for the File. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addCommenter(user: User): File = js.native
  /** Add the given array of users to the list of commenters for the File. If any of the users were already on the list of viewers, this method promotes them out of the list of viewers. */
  def addCommenters(emailAddresses: js.Array[String]): File = js.native
  /** Adds the given user to the list of editors for the File. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(emailAddress: String): File = js.native
  /** Adds the given user to the list of editors for the File. If the user was already on the list of viewers, this method promotes the user out of the list of viewers. */
  def addEditor(user: User): File = js.native
  /** Adds the given array of users to the list of editors for the File. If any of the users were already on the list of viewers, this method promotes them out of the list of viewers. */
  def addEditors(emailAddresses: js.Array[String]): File = js.native
  /** Adds the given user to the list of viewers for the File. If the user was already on the list of editors, this method has no effect. */
  def addViewer(emailAddress: String): File = js.native
  /** Adds the given user to the list of viewers for the File. If the user was already on the list of editors, this method has no effect. */
  def addViewer(user: User): File = js.native
  /** Adds the given array of users to the list of viewers for the File. If any of the users were already on the list of editors, this method has no effect for them. */
  def addViewers(emailAddresses: js.Array[String]): File = js.native
  /** Gets the permission granted to the given user. */
  def getAccess(email: String): Permission = js.native
  /** Gets the permission granted to the given user. */
  def getAccess(user: User): Permission = js.native
  /** Return the data inside this object as a blob converted to the specified content type. This method adds the appropriate extension to the filename — for example, "myfile.pdf". However, it assumes that the part of the filename that follows the last period (if any) is an existing extension that should be replaced. Consequently, "ChristmasList.12.25.2014" will become "ChristmasList.12.25.pdf". */
  def getAs(contentType: String): Blob = js.native
  /** Return the data inside this object as a blob. */
  def getBlob(): Blob = js.native
  /** Gets the date the File was created. */
  def getDateCreated(): scala.scalajs.js.Date = js.native
  /** Gets the description for the File. */
  def getDescription(): String = js.native
  /** Gets the URL that can be used to download the file. Only users with permission to open the file in Google Drive can access the URL. */
  def getDownloadUrl(): String = js.native
  /** Gets the list of editors for this File. If the user who executes the script does not have edit access to the File, this method returns an empty array. */
  def getEditors(): js.Array[User] = js.native
  /** Gets the ID of the File. */
  def getId(): String = js.native
  /** Gets the date the File was last updated. */
  def getLastUpdated(): scala.scalajs.js.Date = js.native
  /** Gets the MIME type of the file. */
  def getMimeType(): String = js.native
  /** Gets the name of the File. */
  def getName(): String = js.native
  /** Gets the owner of the File. */
  def getOwner(): User = js.native
  /** Gets a collection of folders that are immediate parents of the File. */
  def getParents(): FolderIterator = js.native
  /** Gets which class of users can access the File, besides any individual users who have been explicitly given access. */
  def getSharingAccess(): Access = js.native
  /** Gets the permission granted to those users who can access the File, besides any individual users who have been explicitly given access. */
  def getSharingPermission(): Permission = js.native
  /** Gets the number of bytes used to store the File in Drive. Note that Google Apps files do not count toward Drive storage limits and thus return 0 bytes. */
  def getSize(): Int = js.native
  /** Gets a thumbnail image for the file, or null if no thumbnail exists. */
  def getThumbnail(): Blob = js.native
  /** Gets the URL that can be used to open the File in a Google App like Drive or Docs. */
  def getUrl(): String = js.native
  /** Gets the list of viewers and commenters for this File. If the user who executes the script does not have edit access to the File, this method returns an empty array. */
  def getViewers(): js.Array[User] = js.native
  /** Determines whether users with edit permissions to the File are allowed to share with other users or change the permissions. */
  def isShareableByEditors(): Boolean = js.native
  /** Determines whether the File has been starred in the user's Drive. */
  def isStarred(): Boolean = js.native
  /** Determines whether the File is in the trash of the user's Drive. */
  def isTrashed(): Boolean = js.native
  /** Creates a copy of the file. */
  def makeCopy(): File = js.native
  /** Creates a copy of the file in the destination directory. */
  def makeCopy(destination: Folder): File = js.native
  /** Creates a copy of the file and names it with the name provided. */
  def makeCopy(name: String): File = js.native
  /** Creates a copy of the file in the destination directory and names it with the name provided. */
  def makeCopy(name: String, destination: Folder): File = js.native
  /** Removes the given user from the list of commenters for the File. This method does not block users from access the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeCommenter(emailAddress: String): File = js.native
  /** Removes the given user from the list of commenters for the File. This method does not block users from access the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeCommenter(user: User): File = js.native
  /** Removes the given user from the list of editors for the File. This method does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeEditor(emailAddress: String): File = js.native
  /** Removes the given user from the list of editors for the File. This method does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeEditor(user: User): File = js.native
  /** Removes the given user from the list of viewers and commenters for the File. This method has no effect if the user is an editor, not a viewer or commenter. This method also does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeViewer(emailAddress: String): File = js.native
  /** Removes the given user from the list of viewers and commenters for the File. This method has no effect if the user is an editor, not a viewer. This method also does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def removeViewer(user: User): File = js.native
  /** Revokes the access to the File granted to the given user. This method does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def revokePermissions(user: String): File = js.native
  /** Revokes the access to the File granted to the given user. This method does not block users from accessing the File if they belong to a class of users who have general access — for example, if the File is shared with the user's entire domain. */
  def revokePermissions(user: User): File = js.native
  /** Overwrites the content of the file with a given replacement. Throws an exception if content is larger than 10MB. */
  def setContent(content: String): File = js.native
  /** Sets the description for the File. */
  def setDescription(description: String): File = js.native
  /** Sets the name of the File. */
  def setName(name: String): File = js.native
  /** Changes the owner of the File. This method also gives the previous owner explicit edit access to the File. */
  def setOwner(emailAddress: String): File = js.native
  /** Changes the owner of the File. This method also gives the previous owner explicit edit access to the File. */
  def setOwner(user: User): File = js.native
  /** Sets whether users with edit permissions to the File are allowed to share with other users or change the permissions. The default for a new File is true. */
  def setShareableByEditors(shareable: Boolean): File = js.native
  /** Sets which class of users can access the File and what permissions those users are granted, besides any individual users who have been explicitly given access. */
  def setSharing(accessType: Access, permissionType: Permission): File = js.native
  /** Sets whether the File is starred in the user's Drive. The default for new Files is false. */
  def setStarred(starred: Boolean): File = js.native
  /** Sets whether the File is in the trash of the user's Drive. The default for new Files is false. */
  def setTrashed(trashed: Boolean): File = js.native
}
