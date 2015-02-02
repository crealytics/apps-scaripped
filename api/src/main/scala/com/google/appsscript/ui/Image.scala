package com.google.appsscript.ui

/**
 * Image Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A widget that displays the image at a given URL. The image can be in 'unclipped' mode (the default) or 'clipped' mode. In clipped mode, a viewport is overlaid on top of the image so that a subset of the image will be displayed. In unclipped mode, there is no viewport - the entire image will be visible. Whether an image is in clipped or unclipped mode depends on how the image is constructed, and how it is transformed after construction. Methods will operate differently depending on the mode that the image is in. These differences are detailed in the documentation for each method. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    // The very first Google Doodle!
 *    app.add(app.createImage("http://www.google.com/logos/googleburn.jpg"));
 *    // Just the man in the middle
 *    app.add(app.createImage("http://www.google.com/logos/googleburn.jpg", 118, 0, 50, 106));
 *    return app;
 *  }
 *  
 *  Due to browser-specific HTML constructions needed to achieve the clipping effect, certain CSS attributes, such as padding and background, may not work as expected when an image is in clipped mode. These limitations can usually be easily worked around by encapsulating the image in a container widget that can itself be styled. Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the Image documentation here.
 */
trait Image {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addClickHandler(handler: Handler): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addErrorHandler(handler: Handler): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addLoadHandler(handler: Handler): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseDownHandler(handler: Handler): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseMoveHandler(handler: Handler): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOutHandler(handler: Handler): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseOverHandler(handler: Handler): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseUpHandler(handler: Handler): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addMouseWheelHandler(handler: Handler): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setResource(resource: Component): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setUrl(url: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setUrlAndVisibleRect(url: String, left: Int, top: Int, width: Int, height: Int): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisibleRect(left: Int, top: Int, width: Int, height: Int): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): Image = ???
}