package com.google.appsscript.ui

/**
 * DialogBox Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A form of popup that has a caption area at the top and can be dragged by the user. Unlike a PopupPanel, calls to setWidth(width) and setHeight(height) will set the width and height of the dialog box itself, even if a widget has not been added as yet. In general it's not recommended to add this panel as a child of another widget or of the app as that will make it behave like any other inline panel and not act as a popup. Instead, create the popup and then use its show() and hide() methods to show and hide it. See the example below. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the DialogBox documentation here. Here is an example showing how to use the dialog box widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    // Create a dialog box.
 *    var dialog = app.createDialogBox();
 *    // Set the position and dimensions.
 *    dialog.setPopupPosition(100, 100).setSize(500, 500);
 *    // Show the dialog. Note that it does not have to be "added" to the UiInstance.
 *    dialog.show();
 *    return app;
 *  }
 */
trait DialogBox {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addAutoHidePartner(partner: Component): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addCloseHandler(handler: Handler): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def hide: DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAnimationEnabled(animationEnabled: Boolean): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAutoHideEnabled(enabled: Boolean): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setGlassEnabled(enabled: Boolean): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setGlassStyleName(styleName: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setModal(modal: Boolean): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPopupPosition(left: Int, top: Int): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPopupPositionAndShow(a: Component): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPreviewingAllNativeEvents(previewing: Boolean): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def show: DialogBox = ???
}