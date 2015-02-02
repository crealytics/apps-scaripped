package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Builder for 
 * <a href="adwordsapp_topic.html">Topic</a>
 *  objects. 
 * <p>Example usage:</p>
 *  
 * <pre class="prettyprint">
 *  var topicBuilder = adGroup.display().newTopicBuilder();
 *  var topic = topicBuilder
 *    .withTopicId(3)                 // required
 *    .withCpc(0.50)                  // optional
 *    .build()                        // create the topic</pre>
 */
trait TopicBuilder {
  /**
   *  Builds the topic. Returns a 
   * <a href="adwordsapp_topicoperation.html">TopicOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_topic.html">Topic</a>
   * .
   */
  def build: TopicOperation = ???
  /**
   *  Builds the excluded topic. Returns an 
   * <a href="adwordsapp_excludedtopicoperation.html">ExcludedTopicOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_excludedtopic.html">ExcludedTopic</a>
   * .
   */
  def exclude: ExcludedTopicOperation = ???
  /**  Sets the max CPC bid of the new topic to the specified value. */
  def withCpc(cpc: Double): TopicBuilder = ???
  /**  Sets the max CPM bid of the new topic to the specified value. */
  def withCpm(cpm: Double): TopicBuilder = ???
  /**
   *  Sets the topic ID of the topic. This field is required. The topic ID identifies the topic category. A list of valid topic IDs is available on our 
   * <a href="/adwords/api/docs/appendix/verticals">Verticals</a>
   *  page.
   */
  def withTopicId(topicId: Long): TopicBuilder = ???
}