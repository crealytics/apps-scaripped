package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/**
 * TextStyleBuilder A builder used to create TextStyle objects. It allows configuration of the text's properties such as name, color, and size. The following example shows how to create a text style using the builder. For a more complete example, refer to the documentation for TextStyle. 
 *  
 * 
 *  // Creates a new text style that uses 26-point, blue, Ariel font.
 *  var textStyleBuilder = Charts.newTextStyle()
 *      .setColor('#0000FF').setFontName('Ariel').setFontSize(26);
 *  var style = textStyleBuilder.build();
 */
trait TextStyleBuilder extends js.Object {
  /** Builds and returns a text style configuration object that was built using this builder. */
  def build(): TextStyle = js.native
  /** Sets the color of the text style. */
  def setColor(cssValue: String): TextStyleBuilder = js.native
  /** Sets the font name of the text style */
  def setFontName(fontName: String): TextStyleBuilder = js.native
  /** Sets the font size of the text style. */
  def setFontSize(fontSize: Number): TextStyleBuilder = js.native
}