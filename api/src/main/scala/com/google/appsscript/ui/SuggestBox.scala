package com.google.appsscript.ui

import scala.scalajs.js

/** SuggestBox Deprecated. This class is deprecated and should not be used in new scripts. A SuggestBox is a text box or text area which displays a pre-configured set of selections that match the user's input. This widget is not currently functional. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the SuggestBox documentation here. */
trait SuggestBox extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyDownHandler(handler: Handler): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyPressHandler(handler: Handler): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addKeyUpHandler(handler: Handler): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSelectionHandler(handler: Handler): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addValueChangeHandler(handler: Handler): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAccessKey(accessKey: Char): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAnimationEnabled(animationEnabled: Boolean): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAutoSelectEnabled(autoSelectEnabled: Boolean): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setFocus(focus: Boolean): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLimit(limit: Int): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPopupStyleName(styleName: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTabIndex(index: Int): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: String): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: String, fireEvents: Boolean): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): SuggestBox = js.native
}
