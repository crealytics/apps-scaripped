package com.google.appsscript.ui

import scala.scalajs.js

/** RadioButton Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A mutually-exclusive selection radio button widget. This widget fires click events when the radio button is clicked, and value change events when the button becomes checked. Note, however, that browser limitations prevent value change events from being sent when the radio button is cleared as a side effect of another in the group being clicked. RadioButtons are grouped according to the following rules: In the absence of a FormPanel, RadioButtons with the same name are part of the same group. Within a FormPanel, all unnamed RadioButtons are part of the same group. Within a FormPanel, all RadioButtons with the same name are part of the same group - but not part of the same group as RadioButtons with the same name outside of the FormPanel. Note that radio button selections within a group do not propagate to server handlers created with UiInstance#createServerHandler(). Instead, to capture values on the server, use doPost() or separate handlers for each RadioButton. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the RadioButton documentation here. */
trait RadioButton extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addBlurHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addFocusHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addValueChangeHandler(handler: Handler): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFormValue(formValue: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: Boolean): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: Boolean, fireEvents: Boolean): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): RadioButton = js.native
}
