package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  An iterator of campaigns. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  while (campaignIterator.hasNext()) {
 *    var campaign = campaignIterator.next();
 *  }</pre>
 */
trait CampaignIterator {
  /**
   *  Returns 
   * <code>true</code>
   *  if the iterator has more elements.
   */
  def hasNext: Boolean = ???
  /**
   *  Returns the next 
   * <a href="adwordsapp_campaign.html">Campaign</a>
   *  in the iterator.
   */
  def next: Campaign = ???
  /**
   *  Returns the total number of entities matched by the selector which generated this iterator. 
   * <p>Note that the returned number disregards limits, and that the iterator is not guaranteed to have this many elements — <code>hasNext</code> will start to return <code>false</code> and <code>next</code> will start to throw exceptions as soon as the limit for entity reads has been reached, even if the selector matched more entities.</p>
   */
  def totalNumEntities: Int = ???
}