package com.google.appsscript.ui

/** ServerHandler Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. An event handler that runs on the server. These will, in general, run much slower than ClientHandlers but they are not limited in what they can do. Any method that accepts a "Handler" parameter can accept a ServerHandler. When a ServerHandler is invoked, the function it refers to is called on the Apps Script server in a "fresh" script. This means that no variable values will have survived from previous handlers or from the initial script that loaded the app. Global variables in the script will be re-evaluated, which means that it's a bad idea to do anything slow (like opening a Spreadsheet or fetching a Calendar) in a global variable. If you need to save state on the server, you can try using ScriptProperties or UserProperties. You can also add a Hidden field to your app storing the information you want to save and pass it back explicitly to handlers as a "callback element." If you set validators on a ServerHandler, they will be checked before the handler calls the server. The server will only be called if the validators succeed. If you have multiple ServerHandlers for the same event on the same widget, they will be called simultaneously. */
trait ServerHandler {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addCallbackElement(widget: Widget): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setCallbackFunction(functionToInvoke: String): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateEmail(widget: Widget): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateInteger(widget: Widget): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateLength(widget: Widget, min: Int, max: Int): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateMatches(widget: Widget, pattern: String): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateMatches(widget: Widget, pattern: String, flags: String): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotEmail(widget: Widget): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotInteger(widget: Widget): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotLength(widget: Widget, min: Int, max: Int): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotMatches(widget: Widget, pattern: String): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotMatches(widget: Widget, pattern: String, flags: String): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotNumber(widget: Widget): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotOptions(widget: Widget, options: Seq[String]): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotRange(widget: Widget, min: Number, max: Number): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotSum(widgets: Seq[Widget], sum: Int): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNumber(widget: Widget): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateOptions(widget: Widget, options: Seq[String]): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateRange(widget: Widget, min: Number, max: Number): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateSum(widgets: Seq[Widget], sum: Int): ServerHandler = ???
}