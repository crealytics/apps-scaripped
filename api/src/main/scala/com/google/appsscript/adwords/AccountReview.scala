package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Represents a review that has been added to an account as an ad review extension. Visit our
 * <a href="/adwords/scripts/docs/features/ad-extensions">Ad Extensions</a>
 * page for more information on reviews and other types of ad extensions.
 */
trait AccountReview extends js.Object with HasStatistics {
  /**
   * Returns the end date of the account-level review. For instance, if the end date of the account-level review is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"AccountReview"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the account-level review. */
  def getId(): Long = js.native
  /** Returns the scheduling of the account-level review. */
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  /** Returns the name of the source of the account-level review. */
  def getSourceName(): String = js.native
  /** Returns the source URL of the account-level review. */
  def getSourceUrl(): String = js.native
  /**
   * Returns the start date of the account-level review. For instance, if the start date of the account-level review is May 3, 2013, this would return the following object:
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate(): AdWordsDate = js.native
  /** Returns the text of the account-level review. */
  def getText(): String = js.native
  /**
   * Returns
   * <code>true</code>
   * if the text of the account-level review is exactly quoted, or
   * <code>false</code>
   * if the text is paraphrased.
   */
  def isExactlyQuoted(): Boolean = js.native
  /**
   * Returns
   * <code>true</code>
   * if the account-level review specifies mobile device preference.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   * Sets the account-level review's end date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>accountReview.setEndDate("20130503");</code>
   * is equivalent to
   * <code>accountReview.setEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the start date now comes after the end date, or</li>
   *  <li>it's a date in the past.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def setEndDate(date: AnyRef): Unit = js.native
  /**
   * Sets the exactly quoted value of the account-level review. Specify
   * <code>true</code>
   * if the text of the review is exactly quoted, which will result in the text being rendered with quotation marks. Specify
   * <code>false</code>
   * if the text of the review is paraphrased, which will result in the text being rendered without quotation marks.
   * <p>Returns nothing.</p>
   */
  def setExactlyQuoted(isExactlyQuoted: Boolean): Unit = js.native
  /**
   * Sets the account-level review's device preference.
   * <p>Returns nothing.</p>
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   * Sets the account-level review scheduling. Scheduling of a account-level review allows you to control the days of week and times of day during which the account-level review will show alongside your ads.
   * <p>Passing in an empty array clears the scheduling field, causing the account-level review to run at all times.</p>
   * <p>The following example sets the account-level review to run on Mondays and Tuesday from 8:00 to 11:00.</p>
   * <pre class="prettyprint">
   *  var mondayMorning = {
   *    dayOfWeek: "MONDAY",
   *    startHour: 8,
   *    startMinute: 0,
   *    endHour: 11,
   *    endMinute: 0
   *  };
   *  var tuesdayMorning = {
   *    dayOfWeek: "TUESDAY",
   *    startHour: 8,
   *    startMinute: 0,
   *    endHour: 11,
   *    endMinute: 0
   *  };
   *  accountReview.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   * <p>Returns nothing.</p>
   */
  def setSchedules(schedules: js.Array[ExtensionSchedule]): Unit = js.native
  /**
   * Sets the name of the source of the account-level review. The combined length of sourceName and text is limited to 67 characters.
   * <p>Returns nothing.</p>
   */
  def setSourceName(sourceName: String): Unit = js.native
  /**
   * Sets the source URL of the account-level review.
   * <p>Returns nothing.</p>
   */
  def setSourceUrl(sourceUrl: String): Unit = js.native
  /**
   * Sets the account-level review's start date from either an object containing year, month, and day fields, or an 8-digit string in
   * <code>YYYYMMDD</code>
   * format. For instance,
   * <code>accountReview.setStartDate("20130503");</code>
   * is equivalent to
   * <code>accountReview.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul>
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li>
   *  <li>the given date is after the account-level review's end date.</li>
   * </ul>
   * <p>Returns nothing.</p>
   */
  def setStartDate(date: AnyRef): Unit = js.native
  /**
   * Sets the text of the account-level review. The combined length of sourceName and text is limited to 67 characters.
   * <p>Returns nothing.</p>
   */
  def setText(text: String): Unit = js.native
}
