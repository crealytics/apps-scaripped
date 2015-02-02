package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Access to display criteria that have been added to ad groups in this account:
 * <a href="adwordsapp_audience.html">Audience</a>
 * ,
 * <a href="adwordsapp_displaykeyword.html">DisplayKeyword</a>
 * ,
 * <a href="adwordsapp_placement.html">Placement</a>
 * ,
 * <a href="adwordsapp_topic.html">Topic</a>
 * .
 */
trait Display extends js.Object {
  /**  Returns the selector of all audiences in the account. */
  def audiences: AudienceSelector = js.native
  /**  Returns the selector of all display keywords in the account. */
  def keywords: DisplayKeywordSelector = js.native
  /**  Returns the selector of all placements in the account. */
  def placements: PlacementSelector = js.native
  /**  Returns the selector of all topics in the account. */
  def topics: TopicSelector = js.native
}