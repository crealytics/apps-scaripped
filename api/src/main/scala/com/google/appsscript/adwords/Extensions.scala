package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Access to ad extensions that have been added to this account:
 * <a href="adwordsapp_callout.html">Callout</a>
 * ,
 * <a href="adwordsapp_mobileapp.html">MobileApp</a>
 * ,
 * <a href="adwordsapp_phonenumber.html">PhoneNumber</a>
 * ,
 * <a href="adwordsapp_review.html">Review</a>
 * , and
 * <a href="adwordsapp_sitelink.html">Sitelink</a>
 * .
 */
trait Extensions extends js.Object {
  /** Returns the selector of all callouts in the account. */
  def callouts(): CalloutSelector = js.native
  /** Returns the selector of all mobile apps in the account. */
  def mobileApps(): MobileAppSelector = js.native
  /**
   * Returns a new callout builder for this account. Once
   * <code>builder.build()</code>
   * is called, the callout will be created in this account.
   */
  def newCalloutBuilder(): CalloutBuilder = js.native
  /**
   * Returns a new mobile app builder for this account. Once
   * <code>builder.build()</code>
   * or
   * <code>builder.create()</code>
   * is called, the mobile app will be created in this account.
   */
  def newMobileAppBuilder(): MobileAppBuilder = js.native
  /**
   * Returns a new phone number builder for this account. Once
   * <code>builder.build()</code>
   * or
   * <code>builder.create()</code>
   * is called, the phone number will be created in this account.
   */
  def newPhoneNumberBuilder(): PhoneNumberBuilder = js.native
  /**
   * Returns a new review builder for this account. Once
   * <code>builder.build()</code>
   * is called, the review will be created in this account.
   */
  def newReviewBuilder(): ReviewBuilder = js.native
  /**
   * Returns a new sitelink builder for this account. Once
   * <code>builder.build()</code>
   * or
   * <code>builder.create()</code>
   * is called, the sitelink will be created in this account.
   */
  def newSitelinkBuilder(): SitelinkBuilder = js.native
  /** Returns the selector of all phone numbers in the account. */
  def phoneNumbers(): PhoneNumberSelector = js.native
  /** Returns the selector of all reviews in the account. */
  def reviews(): ReviewSelector = js.native
  /** Returns the selector of all sitelinks in the account. */
  def sitelinks(): SitelinkSelector = js.native
}
