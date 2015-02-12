package com.google.appsscript.adwords

import scala.scalajs.js

trait Selector[T <: Selector[T]] extends js.Object {
  def withCondition(condition: String): T = js.native
  /**
   *  Specifies limit for the selector to use. For instance, 
   * <code>withLimit(50)</code>
   *  returns only the first 50 entities.
   */
  def withLimit(limit: Int): T = js.native
}

object Selector {
  implicit class RichSelector[T <: Selector[T]](val selector: T) extends AnyVal {
    def withCondition(keyValue: (String, String)): T = {
      val key = keyValue._1
      val properlyEscapedValue = keyValue._2.replace("'", "\\\'")
      selector.withCondition(s"$key = '$properlyEscapedValue'")
    }
  }
}