package com.google.appsscript.ui

/**
 * DocsListDialog Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A "file-open" dialog for Google Drive. Unlike most UiApp objects, DocsListDialog should not be added to the UiInstance. The example below shows how to display a DocsListDialog in the new version of Google Sheets. Note that HTML service offers a similar but superior feature, Google Picker. In almost all cases, using Google Picker is preferable. 
 *  
 * 
 * 
 *  function onOpen() {
 *    SpreadsheetApp.getUi() // Or DocumentApp or FormApp.
 *        .createMenu('Custom Menu')
 *        .addItem('Select file', 'showDialog')
 *        .addToUi();
 *  }
 * 
 *  function showDialog() {
 *    // Dummy call to DriveApp to ensure the OAuth dialog requests Google Drive scope, so that the
 *    // getOAuthToken() call below returns a token with the necessary permissions.
 *    DriveApp.getRootFolder();
 * 
 *    var app = UiApp.createApplication()
 *        .setWidth(570)
 *        .setHeight(352);
 * 
 *    var serverHandler = app.createServerHandler('pickerHandler');
 * 
 *    app.createDocsListDialog()
 *       .addCloseHandler(serverHandler)
 *       .addSelectionHandler(serverHandler)
 *       .setOAuthToken(ScriptApp.getOAuthToken())
 *       .showDocsPicker();
 * 
 *    SpreadsheetApp.getUi() // Or DocumentApp or FormApp.
 *       .showModalDialog(app,' ');
 *  }
 * 
 *  function pickerHandler(e) {
 *    var action = e.parameter.eventType;
 *    var app = UiApp.getActiveApplication();
 * 
 *    if (action == 'selection') {
 *      var doc = e.parameter.items[0];
 *      var id = doc.id;
 *      var name = doc.name;
 *      var url = doc.url;
 *      app.add(app.createLabel('You picked '));
 *      app.add(app.createAnchor(name, url));
 *      app.add(app.createLabel('(ID: ' + id + ').'));
 *    } else if (action == 'close') {
 *      app.add(app.createLabel('You clicked "Cancel".'));
 *    }
 *  
 *    return app;
 *  }
 */
trait DocsListDialog {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addCloseHandler(handler: Handler): DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addSelectionHandler(handler: Handler): DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def addView(fileType: FileType): DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getType: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setDialogTitle(title: String): DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: Int): DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setInitialView(fileType: FileType): DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setMultiSelectEnabled(multiSelectEnabled: Boolean): DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setOAuthToken(oAuthToken: String): DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: Int): DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def showDocsPicker: DocsListDialog = ???
}