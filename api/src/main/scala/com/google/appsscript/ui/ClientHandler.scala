package com.google.appsscript.ui

/**
 * ClientHandler Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. An event handler that runs in the user's browser without needing a call back to the server. These will, in general, run much faster than ServerHandlers but they are also more limited in what they can do. Any method that accepts a "Handler" parameter can accept a ClientHandler. If you set validators on a ClientHandler, they will be checked before the handler performs its actions. The actions will only be performed if the validators succeed. If you have multiple ClientHandlers for the same event on the same widget, they will perform their actions in the order that they were added. An example of using client handlers: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var button = app.createButton("Say Hello");
 * 
 *    // Create a label with the "Hello World!" text and hide it for now
 *    var label = app.createLabel("Hello World!").setVisible(false);
 * 
 *    // Create a new handler that does not require the server.
 *    // We give the handler two actions to perform on different targets.
 *    // The first action disables the widget that invokes the handler
 *    // and the second displays the label.
 *    var handler = app.createClientHandler()
 *      .forEventSource().setEnabled(false)
 *      .forTargets(label).setVisible(true);
 * 
 *    // Add our new handler to be invoked when the button is clicked
 *    button.addClickHandler(handler);
 * 
 *    app.add(button);
 *    app.add(label);
 *    return app;
 *  }
 */
trait ClientHandler {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def forEventSource: ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def forTargets(widgets: AnyRef*): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHTML(html: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(row: Int, column: Int, attribute: String, value: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(row: Int, column: Int, attributes: AnyRef): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setText(text: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setValue(value: Boolean): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateEmail(widget: Widget): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateInteger(widget: Widget): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateLength(widget: Widget, min: Int, max: Int): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateMatches(widget: Widget, pattern: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateMatches(widget: Widget, pattern: String, flags: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotEmail(widget: Widget): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotInteger(widget: Widget): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotLength(widget: Widget, min: Int, max: Int): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotMatches(widget: Widget, pattern: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotMatches(widget: Widget, pattern: String, flags: String): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotNumber(widget: Widget): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotOptions(widget: Widget, options: Seq[String]): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotRange(widget: Widget, min: Number, max: Number): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNotSum(widgets: Seq[Widget], sum: Int): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateNumber(widget: Widget): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateOptions(widget: Widget, options: Seq[String]): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateRange(widget: Widget, min: Number, max: Number): ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def validateSum(widgets: Seq[Widget], sum: Int): ClientHandler = ???
}