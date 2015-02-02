package com.google.appsscript.ui

/**
 * FileUpload Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A widget that wraps the HTML <input type='file'> element. This widget must be used within a FormPanel. The result of a FileUpload is a "Blob" which can we used in various other functions. Below is an example of how to use FileUpload. 
 *  
 * 
 *  function doGet(e) {
 * 
 *  var app = UiApp.createApplication().setTitle("Upload CSV to Sheet");
 *    var formContent = app.createVerticalPanel();
 *    formContent.add(app.createFileUpload().setName('thefile'));
 *    formContent.add(app.createSubmitButton());
 *    var form = app.createFormPanel();
 *    form.add(formContent);
 *    app.add(form);
 *    return app;
 *  }
 * 
 *  function doPost(e) {
 *    // data returned is a blob for FileUpload widget
 *    var fileBlob = e.parameter.thefile;
 *    var doc = DocsList.createFile(fileBlob);
 *  }
 *  
 *  Internally, UiApp widgets are built on top of the Google Web Toolkit, and it can sometimes be helpful to look at the GWT documentation directly. You can find the FileUpload documentation here.
 */
trait FileUpload {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addChangeHandler(handler: Handler): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleDependentName(styleName: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addStyleName(styleName: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getTag: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setEnabled(enabled: Boolean): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setId(id: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setLayoutData(layout: AnyRef): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setName(name: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setPixelSize(width: Int, height: Int): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setSize(width: String, height: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttributes(attributes: AnyRef): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleName(styleName: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStylePrimaryName(styleName: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTag(tag: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setVisible(visible: Boolean): FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: String): FileUpload = ???
}