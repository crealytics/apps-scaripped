package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * Provides access to sitelink URLs. See
 * <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a>
 * for more information.
 */
trait SitelinkUrls extends js.Object with HasFinalUrl {
  /**
   * Clears the mobile final URL of the sitelink.
   * <p>Clearing mobile final URL will cause the final URL to be used instead.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * <p>Returns nothing.</p>
   */
  def clearMobileFinalUrl(): Unit = js.native
  /**
   * Clears the tracking template of the sitelink.
   * <p> If you clear the tracking template specified at a lower level entity (e.g. a keyword), and you have also specified tracking template on a higher level entity, (e.g. the parent ad group), then AdWords will use the tracking template specified at the higher level entity (i.e. the ad group level tracking template will be used). To completely clear tracking template, it must be cleared at all levels of the hierarchy at which it was set.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * <p>Returns nothing.</p>
   */
  def clearTrackingTemplate(): Unit = js.native
  /**
   * Returns the custom parameters of the sitelink.
   * <p>Custom parameters enable you to create your own <a href="//support.google.com/adwords/answer/2375447">ValueTrack</a> parameters that you can assign your own IDs to.</p>
   * <p>The name of a custom parameter can contain only alphanumeric characters, and custom parameter values may not contain white space. When referring to the custom parameter in final URLs and tracking template, you should surround the custom parameter in braces, and prefix an underscore to its name, e.g. <code>{_param}</code>.</p>
   * <p>You can have up to 3 custom parameters for an entity. The key and value must not exceed 16 and 200 bytes respectively.</p>
   * <p>Custom parameters specified at a lower level entity will override the setting specified at a higher level entity, e.g., setting custom parameters at the ad group level overrides the setting at the campaign level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def getCustomParameters(): AnyRef = js.native
  /**
   * Returns the mobile final URL of the sitelink.
   * <p>The mobile final URL represents the actual landing page for your sitelink on a mobile device. The final mobile URL must be the URL of the page that the user ends up on after clicking on your ad on a mobile device, once all the redirects have taken place.</p>
   * <p>Mobile final URLs follow the same override rules as destination URLs. For example, a mobile final URL at the keyword level overrides a mobile final URL at an ad level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def getMobileFinalUrl(): String = js.native
  /**
   * Returns the tracking template of the sitelink.
   * <p>You can optionally use the tracking template to specify additional tracking parameters or redirects. AdWords will use this template to assemble the actual destination URL to associate with the ad.</p>
   * <p>A tracking template specified at a lower level entity will override the setting specified at a higher level entity, e.g., a tracking template at the ad group level overrides the setting at the campaign level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def getTrackingTemplate(): String = js.native
  /**
   * Sets the custom parameters of the sitelink.
   * <p>Custom parameters enable you to create your own <a href="//support.google.com/adwords/answer/2375447">ValueTrack</a> parameters that you can assign your own IDs to.</p>
   * <p>The name of a custom parameter can contain only alphanumeric characters, and custom parameter values may not contain white space. When referring to the custom parameter in final URLs and tracking template, you should surround the custom parameter in braces, and prefix an underscore to its name, e.g. <code>{_param}</code>.</p>
   * <p>You can have up to 3 custom parameters for an entity. The key and value must not exceed 16 and 200 bytes respectively.</p>
   * <p>Custom parameters specified at a lower level entity will override the setting specified at a higher level entity, e.g., setting custom parameters at the ad group level overrides the setting at the campaign level.</p>
   * <p>Note that this method will replace any existing custom parameters with the specified value. </p>
   * <p>You may pass an empty object, e.g. <code>setCustomParameters({})</code> to clear the custom parameters of the sitelink. If you clear the custom parameters specified at a lower level entity (e.g. a keyword), and you have also specified custom parameters on a higher level entity, (e.g. the parent ad group), then AdWords will use the custom parameters specified at the higher level entity (i.e. the ad-group-level custom parameters will be used). To completely clear custom parameters, it must be cleared at all levels of the hierarchy at which it was set.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * <p>Returns nothing.</p>
   */
  def setCustomParameters(customParameters: AnyRef): Unit = js.native
  /**
   * Sets the final URL of the sitelink.
   * <p>The final URL represents the actual landing page for your sitelink. The final URL must be the URL of the page that the user ends up on after clicking on your ad, once all the redirects have taken place.</p>
   * <p>Final URLs follow the same override rules as destination URLs. For example, a final URL at the keyword level overrides a final URL at an ad level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * <p>Returns nothing.</p>
   */
  def setFinalUrl(finalUrl: String): Unit = js.native
  /**
   * Sets the mobile final URL of the sitelink.
   * <p>The mobile final URL represents the actual landing page for your sitelink on a mobile device. The final mobile URL must be the URL of the page that the user ends up on after clicking on your ad on a mobile device, once all the redirects have taken place.</p>
   * <p>Mobile final URLs follow the same override rules as destination URLs. For example, a mobile final URL at the keyword level overrides a mobile final URL at an ad level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * <p>Returns nothing.</p>
   */
  def setMobileFinalUrl(mobileFinalUrl: String): Unit = js.native
  /**
   * Sets the tracking template of the sitelink.
   * <p>You can optionally use the tracking template to specify additional tracking parameters or redirects. AdWords will use this template to assemble the actual destination URL to associate with the ad.</p>
   * <p>A tracking template specified at a lower level entity will override the setting specified at a higher level entity, e.g., a tracking template at the ad group level overrides the setting at the campaign level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   * <p>Returns nothing.</p>
   */
  def setTrackingTemplate(trackingTemplate: String): Unit = js.native
}
