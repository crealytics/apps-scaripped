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
 *  Access to aggregated ad group-level display criteria for a campaign and campaign-level excluded display criteria for a campaign. For example, to access all display keywords in all ad groups in this campaign:
 * <pre class="prettyprint">
 *  var displayKeywordIterator = campaign.display().keywords().get();
 *  while (displayKeywordIterator.hasNext()) {
 *    var displayKeyword = displayKeywordIterator.next();
 *  }</pre>
 */
trait CampaignDisplay extends js.Object {
  /**  Returns the selector of all audiences in the campaign. */
  def audiences: AudienceSelector = js.native
  /**  Returns the selector of all excluded audiences in the campaign. */
  def excludedAudiences: ExcludedAudienceSelector = js.native
  /**  Returns the selector of all excluded display keywords in the campaign. */
  def excludedKeywords: ExcludedDisplayKeywordSelector = js.native
  /**  Returns the selector of all excluded placements in the campaign. */
  def excludedPlacements: ExcludedPlacementSelector = js.native
  /**  Returns the selector of all excluded topics in the campaign. */
  def excludedTopics: ExcludedTopicSelector = js.native
  /**  Returns the selector of all display keywords in all ad groups in the campaign. */
  def keywords: DisplayKeywordSelector = js.native
  /**
   *  Returns a new audience builder for this campaign. Only excluded audiences can be created at the campaign level. When
   * <a href="adwordsapp_audiencebuilder.html#exclude_0">AudienceBuilder.exclude()</a>
   *  is called, an excluded audience will be created in this campaign.
   */
  def newAudienceBuilder: AudienceBuilder = js.native
  /**
   *  Returns a new display keyword builder for this campaign. Only excluded display keywords can be created at the campaign level. When
   * <a href="adwordsapp_displaykeywordbuilder.html#exclude_0">DisplayKeywordBuilder.exclude()</a>
   *  is called, an excluded display keyword will be created in this campaign.
   */
  def newKeywordBuilder: DisplayKeywordBuilder = js.native
  /**
   *  Returns a new placement builder for this campaign. Only excluded placements can be created at the campaign level. When
   * <a href="adwordsapp_placementbuilder.html#exclude_0">PlacementBuilder.exclude()</a>
   *  is called, an excluded placement will be created in this campaign.
   */
  def newPlacementBuilder: PlacementBuilder = js.native
  /**
   *  Returns a new topic builder for this campaign. Only excluded topics can be created at the campaign level. When
   * <a href="adwordsapp_topicbuilder.html#exclude_0">TopicBuilder.exclude()</a>
   *  is called, an excluded topic will be created in this campaign.
   */
  def newTopicBuilder: TopicBuilder = js.native
  /**  Returns the selector of all placements in all ad groups in the campaign. */
  def placements: PlacementSelector = js.native
  /**  Returns the selector of all topics in all ad groups in the campaign. */
  def topics: TopicSelector = js.native
}