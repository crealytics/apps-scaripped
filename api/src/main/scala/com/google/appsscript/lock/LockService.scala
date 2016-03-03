package com.google.appsscript.lock

import com.google.appsscript.base._

import scala.scalajs.js

/** LockService Prevents concurrent access to sections of code. This can be useful when you have multiple users or processes modifying a shared resource and want to prevent collisions. */
trait LockService extends js.Object {
  /** Gets a lock that prevents any user of the current document from concurrently running a section of code. A code section guarded by a document lock can be executed simultaneously by script instances running in the context of different documents, but by no more than one execution for any given document. Note that the lock is not actually acquired until Lock.tryLock(timeoutInMillis) or Lock.waitLock(timeoutInMillis) is called. If this method is called outside of the context of a containing document (such as from a standalone script or webapp), null is returned. */
  def getDocumentLock(): Lock = js.native
  /** Gets a lock that prevents any user from concurrently running a section of code. A code section guarded by a script lock cannot be executed simultaneously regardless of the identity of the user. Note that the lock is not actually acquired until Lock.tryLock(timeoutInMillis) or Lock.waitLock(timeoutInMillis) is called. */
  def getScriptLock(): Lock = js.native
  /** Gets a lock that prevents the current user from concurrently running a section of code. A code section guarded by a user lock can be executed simultaneously by different users, but by no more than one execution for any given user. The lock is "private" to the user. Note that the lock is not actually acquired until Lock.tryLock(timeoutInMillis) or Lock.waitLock(timeoutInMillis) is called. */
  def getUserLock(): Lock = js.native
}
