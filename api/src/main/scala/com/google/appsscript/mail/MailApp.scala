package com.google.appsscript.mail

import com.google.appsscript.base._

import scala.scalajs.js

/** MailApp Sends email. This service allows users to send emails with complete control over the content of the email. Unlike GmailApp, MailApp's sole purpose is sending email. MailApp cannot access a user's Gmail inbox. Changes to scripts written using GmailApp are more likely to trigger a re-authorization request from a user than MailApp scripts. */
trait MailApp extends js.Object {
  /** Returns the number of remaining emails a user can send for the rest of the day. Quotas are based on the number of email recipients. Specific quota information is available on the quota tab of the Apps Script dashboard. */
  def getRemainingDailyQuota(): Int = js.native
  /** Sends an email message. This variation of the method is much more flexible, allowing for many more options. */
  def sendEmail(message: AnyRef): Unit = js.native
  /** Sends an email message. */
  def sendEmail(recipient: String, subject: String, body: String): Unit = js.native
  /** Sends an email message with optional arguments. */
  def sendEmail(recipient: String, subject: String, body: String, options: AnyRef): Unit = js.native
  /** Sends an email message. This method allows a user to easily specify a Reply-To address for the sent message that can differ from the sender. */
  def sendEmail(to: String, replyTo: String, subject: String, body: String): Unit = js.native
}

/** Entry point for the Mcc API */
object MailApp extends MailApp {
  ()
}
