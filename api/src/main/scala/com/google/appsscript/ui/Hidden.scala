package com.google.appsscript.ui

import scala.scalajs.js

/**
 * Hidden Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. Represents a hidden field for storing data in the user's browser that can be passed back to a handler as a "callback element". Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    // Note that the name "appState" for callbacks, and the id "hidden" for
 *    // getting a reference to the widget, are not required to be the same.
 *    var hidden = app.createHidden("appState", "0").setId("hidden");
 *    app.add(hidden);
 *    var handler = app.createServerHandler("click").addCallbackElement(hidden);
 *    app.add(app.createButton("click me!", handler));
 *    app.add(app.createLabel("clicked 0 times").setId("label"));
 *    return app;
 *  }
 * 
 *  function click(eventInfo) {
 *    var app = UiApp.createApplication();
 *    // We have the value of the hidden field because it was a callback element.
 *    var numClicks = Number(eventInfo.parameter.appState);
 *    numClicks++;
 *    // Just store the number as a string. We could actually store arbitrarily complex data
 *    // here using JSON.stringify() to turn a JavaScript object into a string to store, and
 *    // JSON.parse() to turn the string back into an object.
 *    app.getElementById("hidden").setValue(String(numClicks));
 *    app.getElementById("label").setText("clicked " + numClicks + " times");
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the Hidden documentation here.
 */
trait Hidden extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setDefaultValue(value: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setID(id: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): Hidden = js.native
}