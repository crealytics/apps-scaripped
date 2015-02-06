package com.google.appsscript.ui

import scala.scalajs.js

/** Handler Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. Base interface for client and server handlers. Implementing classes Name Brief description ClientHandler An event handler that runs in the user's browser without needing a call back to the server. ServerHandler An event handler that runs on the server. */
trait Handler extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateEmail(widget: Widget): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateInteger(widget: Widget): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateLength(widget: Widget, min: Int, max: Int): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateMatches(widget: Widget, pattern: String): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateMatches(widget: Widget, pattern: String, flags: String): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotEmail(widget: Widget): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotInteger(widget: Widget): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotLength(widget: Widget, min: Int, max: Int): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotMatches(widget: Widget, pattern: String): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotMatches(widget: Widget, pattern: String, flags: String): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotNumber(widget: Widget): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotOptions(widget: Widget, options: js.Array[String]): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotRange(widget: Widget, min: Number, max: Number): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotSum(widgets: js.Array[Widget], sum: Int): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNumber(widget: Widget): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateOptions(widget: Widget, options: js.Array[String]): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateRange(widget: Widget, min: Number, max: Number): Handler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateSum(widgets: js.Array[Widget], sum: Int): Handler = js.native
}
