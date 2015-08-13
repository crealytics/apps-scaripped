package com.google.appsscript.adwords

import scala.scalajs.js

trait BuilderWithCustomParameters extends js.Any {
  /** Sets the custom parameters of the new ad to the specified value.
  * <p>Custom parameters enable you to create your own <a href="//support.google.com/adwords/answer/2375447">ValueTrack</a> parameters that you can assign your own IDs to.</p>
  * <p>The name of a custom parameter can contain only alphanumeric characters, and custom parameter values may not contain white space. When referring to the custom parameter in final URLs and tracking template, you should surround the custom parameter in braces, and prefix an underscore to its name, e.g. <code>{_param}</code>.</p>
  * <p>You can have up to 3 custom parameters for an entity. The key and value must not exceed 16 and 200 bytes respectively.</p>
  * <p>Custom parameters specified at a lower level entity will override the setting specified at a higher level entity, e.g., setting custom parameters at the ad group level overrides the setting at the campaign level, and and custom parameters specified at the ad level override the setting at the ad group level.</p>
  * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
  */
  def withCustomParameters(customParameters: AnyRef): AdBuilder = js.native
}
