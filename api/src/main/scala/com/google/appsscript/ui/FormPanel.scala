package com.google.appsscript.ui

import scala.scalajs.js

/**
 * FormPanel Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A panel that wraps its contents in an HTML <FORM> element. This panel can be used with a SubmitButton to post form values to the server. All children of this panel (direct, or even children of sub-panels) that have a setName function and have been given a name will have their values sent to the server when the form is submitted. The submit can be handled in the special "doPost" function, as shown in the example. Note that this panel can contain at most one direct child widget. To add more children, make the child of this panel a different panel that can contain more than one child. Here is an example of how to use this widget: 
 *  
 * 
 *  function doGet() {
 *    var app = UiApp.createApplication();
 *    var form = app.createFormPanel();
 *    var flow = app.createFlowPanel();
 *    flow.add(app.createTextBox().setName("textBox"));
 *    flow.add(app.createListBox().setName("listBox").addItem("option 1").addItem("option 2"));
 *    flow.add(app.createSubmitButton("Submit"));
 *    form.add(flow);
 *    app.add(form);
 *    return app;
 *  }
 * 
 *  function doPost(eventInfo) {
 *    var app = UiApp.getActiveApplication();
 *    app.add(app.createLabel("Form submitted. The text box's value was '" +
 *        eventInfo.parameter.textBox +
 *        "' and the list box's value was '" +
 *        eventInfo.parameter.listBox + "'"));
 *    return app;
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the FormPanel documentation here.
 */
trait FormPanel extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(widget: Widget): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSubmitCompleteHandler(handler: Handler): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSubmitHandler(handler: Handler): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def clear(): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType(): String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setAction(action: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEncoding(encoding: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setMethod(method: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidget(widget: Widget): FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): FormPanel = js.native
}
