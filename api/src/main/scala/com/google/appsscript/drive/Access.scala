package com.google.appsscript.drive

import com.google.appsscript.base._

import scala.scalajs.js

/**
 * Access An enum representing classes of users who can access a file or folder, besides any individual users who have been explicitly given access. These properties can be accessed from DriveApp.Access. 
 *  // Creates a folder that anyone on the Internet can read from and write to. (Domain
 *  // administrators can prohibit this setting for users of Google Apps for Business, Google Apps
 *  // for Education, or Google Apps for Your Domain.)
 *  var folder = DriveApp.createFolder('Shared Folder');
 *  folder.setSharing(DriveApp.Access.ANYONE, DriveApp.Permission.EDIT);
 */
trait Access extends js.Object {
  ()
}
