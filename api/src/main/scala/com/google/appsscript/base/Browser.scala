package com.google.appsscript.base

/** Browser This class provides access to Google Apps specific dialog boxes. The methods in this class are only available for use in the context of a Google Spreadsheet. See also ButtonSet */
trait Browser {
  /** Pops up a dialog box with a text input box in the user's browser. The inputBox method raises a client-side input box that displays the given prompt to the user. Note that this function causes the server-side script to be suspended. It will resume automatically after the user clears the dialog, but JDBC connections will not persist across the suspension. */
  def inputBox(prompt: String): String = ???
  /** Pops up a dialog box with a text input box in the user's browser. The inputBox method raises a client-side input box that displays the given prompt to the user, and offers a choice of buttons to be displayed. Note that this function causes the server-side script to be suspended. It will resume automatically after the user clears the dialog, but JDBC connections will not persist across the suspension. */
  def inputBox(prompt: String)(buttons: ButtonSet): String = ???
  /** Pops up a dialog box with a text input box in the user's browser. The inputBox method raises a client side input box with the given title, that displays the given prompt to the user, and offers a choice of buttons to be displayed. Note that this function causes the server-side script to be suspended. It will resume automatically after the user clears the dialog, but JDBC connections will not persist across the suspension. */
  def inputBox(title: String)(prompt: String)(buttons: ButtonSet): String = ???
  /** Pops up a dialog box with the given message and an OK button in the user's browser. The msgBox method raises a client-side message box that displays the given message to the user. Note that this method causes the server-side script to be suspended. It will resume automatically after the user clears the dialog, but JDBC connections will not persist across the suspension. */
  def msgBox(prompt: String): String = ???
  /** Pops up a dialog box with the given message and specified buttons in the user's browser. The msgBox method raises a client-side message box that displays the given message to the user, and offers a choice of buttons to be displayed. Note that this method causes the server-side script to be suspended. It will resume automatically after the user clears the dialog, but JDBC connections will not persist across the suspension. */
  def msgBox(prompt: String)(buttons: ButtonSet): String = ???
  /** Pops up a dialog box with the given title, message and specified buttons in the user's browser. The msgBox method raises a client-side message box with the given title, that displays the given message to the user, and offers a choice of buttons to be displayed. Note that this method causes the server-side script to be suspended. It will resume automatically after the user clears the dialog, but JDBC connections will not persist across the suspension. */
  def msgBox(title: String)(prompt: String)(buttons: ButtonSet): String = ???
}