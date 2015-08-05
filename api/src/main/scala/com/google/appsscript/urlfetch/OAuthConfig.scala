package com.google.appsscript.urlfetch

import com.google.appsscript.base._

import scala.scalajs.js

/** OAuthConfig Deprecated. This class is deprecated and should not be used in new scripts. Represents configuration settings for an OAuth-enabled remote service. See also UrlFetchApp */
trait OAuthConfig extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getAccessTokenUrl(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getAuthorizationUrl(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getMethod(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getParamLocation(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getRequestTokenUrl(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getServiceName(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessTokenUrl(url: String): Unit = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAuthorizationUrl(url: String): Unit = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setConsumerKey(consumerKey: String): Unit = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setConsumerSecret(consumerSecret: String): Unit = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setMethod(method: String): Unit = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setParamLocation(location: String): Unit = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setRequestTokenUrl(url: String): Unit = js.native
}
