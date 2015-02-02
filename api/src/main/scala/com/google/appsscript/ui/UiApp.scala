package com.google.appsscript.ui

/** UiApp Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. Create user interfaces for use inside Google Apps or as standalone services. */
trait UiApp {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createApplication: UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getActiveApplication: UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getUserAgent: String = ???
}