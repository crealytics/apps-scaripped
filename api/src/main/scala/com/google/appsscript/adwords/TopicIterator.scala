package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An iterator of topics. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  while (topicIterator.hasNext()) {
 *    var topic = topicIterator.next();
 *  }</pre>
 */
trait TopicIterator extends SizeAwareIterator[Topic]
