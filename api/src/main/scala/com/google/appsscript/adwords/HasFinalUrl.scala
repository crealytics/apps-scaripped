package com.google.appsscript.adwords

import scala.scalajs.js

trait HasFinalUrl extends js.Any {
  /**
   * Returns the final URL of the entity.
   * <p>The final URL represents the actual landing page for your entity. The final URL must be the URL of the page that the user ends up on after clicking on your ad, once all the redirects have taken place.</p>
   * <p>Final URLs follow the same override rules as destination URLs. For example, a final URL at the keyword level overrides a final URL at an ad level.</p>
   * <p>See <a href="//support.google.com/adwords/answer/6049217">Using Upgraded URLs</a> for more information.</p>
   */
  def getFinalUrl(): String = js.native
}
