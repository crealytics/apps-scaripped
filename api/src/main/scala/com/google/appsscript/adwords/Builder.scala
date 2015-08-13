package com.google.appsscript.adwords

import scala.scalajs.js

trait Builder[I] extends js.Object {
  def build(): Operation[I] = js.native
}
