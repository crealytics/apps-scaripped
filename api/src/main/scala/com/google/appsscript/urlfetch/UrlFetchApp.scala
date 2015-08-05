package com.google.appsscript.urlfetch

import com.google.appsscript.base._

import scala.scalajs.js

/** UrlFetchApp Fetch resources and communicate with other hosts over the Internet. This service allows scripts to communicate with other applications or access other resources on the web by fetching URLs. A script can use the URL Fetch service to issue HTTP and HTTPS requests and receive responses. The URL Fetch service uses Google's network infrastructure for efficiency and scaling purposes. See also OAuthConfig HTTPResponse */
trait UrlFetchApp extends js.Object {
  /** Makes a request to fetch a URL. This works over HTTP as well as HTTPS. */
  def fetch(url: String): HTTPResponse = js.native
  /** Makes a request to fetch a URL using optional advanced parameters. This works over HTTP as well as HTTPS. */
  def fetch(url: String, params: AnyRef): HTTPResponse = js.native
  /** Returns the request that would be made if the operation was invoked. This method does not actually issue the request. */
  def getRequest(url: String): AnyRef = js.native
  /** Returns the request that would be made if the operation were invoked. This method does not actually issue the request. */
  def getRequest(url: String, params: AnyRef): AnyRef = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addOAuthService(serviceName: String): OAuthConfig = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def removeOAuthService(serviceName: String): Unit = js.native
}
