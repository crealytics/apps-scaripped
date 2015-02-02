package com.google.appsscript.ui

/**
 * PopupPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A panel that can "pop up" over other widgets. It overlays the browser's client area (and any previously-created popups). In general it's not recommended to add this panel as a child of another widget or of the app as that will make it behave like any other inline panel and not act as a popup. Instead, create the popup and then use its show() and hide() methods to show and hide it. See the example below. To make the popup stay at a fixed location rather than scrolling with the page, try setting the 'position', 'fixed' style on it with setStyleAttribute(attribute, value). Note that this panel can contain at most one direct child widget. To add more children, make the child of this panel a different panel that can contain more than one child. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the PopupPanel documentation here. Here is an example showing how to use the popup panel widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    // Create a popup panel and set it to be modal.
 *    var popupPanel = app.createPopupPanel(false, true);
 *    // Add a button to the panel and set the dimensions and position.
 *    popupPanel.add(app.createButton()).setWidth("100px").setHeight("100px")
 *        .setPopupPosition(100, 100);
 *    // Show the panel. Note that it does not have to be "added" to the UiInstance.
 *    popupPanel.show();
 *    return app;
 *  }
 */
trait PopupPanel {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addAutoHidePartner(partner: Component): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addCloseHandler(handler: Handler): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear: PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def hide: PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAnimationEnabled(animationEnabled: Boolean): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAutoHideEnabled(enabled: Boolean): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setGlassEnabled(enabled: Boolean): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setGlassStyleName(styleName: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setModal(modal: Boolean): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPopupPosition(left: Int, top: Int): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPopupPositionAndShow(a: Component): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPreviewingAllNativeEvents(previewing: Boolean): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def show: PopupPanel = ???
}