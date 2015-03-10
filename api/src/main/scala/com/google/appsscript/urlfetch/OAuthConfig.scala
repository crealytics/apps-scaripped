package com.google.appsscript.urlfetch

import com.google.appsscript.base._

import scala.scalajs.js

/** OAuthConfig Represents configuration settings for an OAuth-enabled remote service. See also UrlFetchApp */
trait OAuthConfig extends js.Object {
  /** Returns the URL used to get the access token from. */
  def getAccessTokenUrl(): String = js.native
  /** Returns the authorization URL. */
  def getAuthorizationUrl(): String = js.native
  /** Returns the HTTP method used to complete the OAuth protocol. */
  def getMethod(): String = js.native
  /** Returns the location of the parameters in the request when retreiving the request token. */
  def getParamLocation(): String = js.native
  /** Returns the URL used to get the request token. */
  def getRequestTokenUrl(): String = js.native
  /** Returns the name used to reference this service. */
  def getServiceName(): String = js.native
  /** Sets the URL to get an OAuth access token from. */
  def setAccessTokenUrl(url: String): Unit = js.native
  /** Sets the URL for the OAuth authorization service. */
  def setAuthorizationUrl(url: String): Unit = js.native
  /** Sets the consumer key (provided when you register with an OAuth service). */
  def setConsumerKey(consumerKey: String): Unit = js.native
  /** Sets the consumer secret (provided when you register with an OAuth service). */
  def setConsumerSecret(consumerSecret: String): Unit = js.native
  /** Sets the HTTP method used to complete the OAuth protocol. The default method is 'get'. */
  def setMethod(method: String): Unit = js.native
  /** Sets the parameter location in OAuth protocol requests. The default parameter location is 'auth-header'. */
  def setParamLocation(location: String): Unit = js.native
  /** Sets the request URL for the OAuth service. */
  def setRequestTokenUrl(url: String): Unit = js.native
}
