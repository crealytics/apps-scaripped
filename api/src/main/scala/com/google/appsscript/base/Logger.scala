package com.google.appsscript.base

/** Logger This class allows the developer to write out text to the debugging logs. */
trait Logger {
  /** Clears the log. */
  def clear: Unit = ???
  /** Returns a complete list of messages in the current log. This method can be used to save or email the entire log output generated during script execution. */
  def getLog: String = ???
  /** Writes the string to the logging console. To view the logged output, select View > Show logs. This can be very useful for debugging scripts. */
  def log(data: AnyRef): Logger = ???
  /** Writes a formatted string to the logging console, using the format and values provided. The string can include multiple %s placeholders, which are replaced with corresponding values from the list of arguments, converted to strings. */
  def log(format: String, values: AnyRef*): Logger = ???
}