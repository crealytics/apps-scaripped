package com.google.appsscript.lock

import com.google.appsscript.base._

import scala.scalajs.js

/**
 * Lock A representation of a mutual-exclusion lock. This class allows scripts to make sure that only one instance of the script is executing a given section of code at a time. This is particularly useful for callbacks and triggers, where a user action may cause changes to a shared resource and you want to ensure that aren't collisions. The following examples shows how to use a lock in a form submit handler. 
 *  
 * 
 *  // Generates a unique ticket number for every form submission.
 *  function onFormSubmit(e) {
 *    var targetCell = e.range.offset(0, e.range.getNumColumns(), 1, 1);
 * 
 *    // Get a script lock, because we're about to modify a shared resource.
 *    var lock = LockService.getScriptLock();
 *    // Wait for up to 30 seconds for other processes to finish.
 *    lock.waitLock(30000);
 * 
 *    var ticketNumber = Number(ScriptProperties.getProperty('lastTicketNumber')) + 1;
 *    ScriptProperties.setProperty('lastTicketNumber', ticketNumber);
 * 
 *    // Release the lock so that other processes can continue.
 *    lock.releaseLock();
 * 
 *    targetCell.setValue(ticketNumber);
 *  }
 *  
 *  Without the LockService, if two users submit the form at approximately the same time the ticket numbers could end up the same, since the lastTicketNumber property could change after it was read from the ScriptProperties but before the new value was written back.
 */
trait Lock extends js.Object {
  /** Returns true if the lock was aquired. This method will return false if tryLock(timeoutInMillis) or waitLock(timeoutInMillis) were never called, timed out before the lock could be retrieved, or if releaseLock() was called. */
  def hasLock(): Boolean = js.native
  /** Releases the lock, allowing other processes waiting on the lock to continue. The lock is automatically released when the script terminates, but for efficiency it is best to release it as soon as you no longer need exclusive access to a section of code. Note that if you are working with a spreadsheet, you should call SpreadsheetApp.flush() prior to releasing the lock, to commit all pending changes to the spreadsheet while you still have exclusive access to it. */
  def releaseLock(): Unit = js.native
  /** Attempts to aquire the lock, timing out after the provided number of milliseconds. This method has no effect if the lock has already been aquired. */
  def tryLock(timeoutInMillis: Int): Boolean = js.native
  /** Attempts to aquire the lock, timing out with an exception after the provided number of milliseconds. This method is the same as tryLock(timeoutInMillis) except that it throws an exception when the lock could not be aquired instead of returning false. */
  def waitLock(timeoutInMillis: Int): Unit = js.native
}
