package com.google.appsscript.adwords
import scala.scalajs.js

trait SizeAwareIterator[T] extends js.Object {
  /**
   *  Returns 
   * <code>true</code>
   *  if the iterator has more elements.
   */
  def hasNext(): Boolean = js.native
  /**
   *  Returns the next T in the iterator.
   */
  def next(): T = js.native
  /**
   *  Returns the total number of entities matched by the selector which generated this iterator. 
   * <p>Note that the returned number disregards limits, and that the iterator is not guaranteed to have this many elements — <code>hasNext</code> will start to return <code>false</code> and <code>next</code> will start to throw exceptions as soon as the limit for entity reads has been reached, even if the selector matched more entities.</p>
   */
  def totalNumEntities(): Int = js.native
}