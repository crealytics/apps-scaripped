package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import java.util.Date

/**
 * DataValidationBuilder Builder for data-validation rules. 
 *  // Set the data validation for cell A1 to require a value from B1:B10.
 *  var cell = SpreadsheetApp.getActive().getRange('A1');
 *  var range = SpreadsheetApp.getActive().getRange('B1:B10');
 *  var rule = SpreadsheetApp.newDataValidation().requireValueInRange(range).build();
 *  cell.setDataValidation(rule);
 */
trait DataValidationBuilder {
  /** Constructs a data-validation rule from the settings applied to the builder. */
  def build: DataValidation = ???
  /** Creates a builder for a data-validation rule based on this rule's settings. */
  def copy: DataValidationBuilder = ???
  /** Returns true if the rule shows a warning when input fails data validation, or false if it rejects the input entirely. The default for new data-validation rules is true. */
  def getAllowInvalid: Boolean = ???
  /** Gets the rule's criteria type as defined in the DataValidationCriteria enum. To get the arguments for the criteria, use getCriteriaValues(). To use these values to create or modify a data-validation rule, see withCriteria(criteria, args). */
  def getCriteriaType: DataValidationCriteria = ???
  /** Gets an array of arguments for the rule's criteria. To get the criteria type, use getCriteriaType(). To use these values to create or modify a data-validation rule, see withCriteria(criteria, args). */
  def getCriteriaValues: Seq[Object] = ???
  /** Gets the rule's help text, or null if no help text is set. */
  def getHelpText: String = ???
  /** Sets the data-validation rule to require a date. */
  def requireDate: DataValidationBuilder = ???
  /** Sets the data-validation rule to require a date after the given value. The time fields of the Date object are ignored; only the day, month, and year fields are used. */
  def requireDateAfter(date: Date): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a date before the given value. The time fields of the Date object are ignored; only the day, month, and year fields are used. */
  def requireDateBefore(date: Date): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a date between the given values, inclusive of the values themselves. The time fields of the Date objects are ignored; only the day, month, and year fields are used. */
  def requireDateBetween(start: Date)(end: Date): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a date equal to the given value. The time fields of the Date object are ignored; only the day, month, and year fields are used. */
  def requireDateEqualTo(date: Date): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a date not between the given values, inclusive of the values themselves. The time fields of the Date objects are ignored; only the day, month, and year fields are used. */
  def requireDateNotBetween(start: Date)(end: Date): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a date on or after the given value. The time fields of the Date object are ignored; only the day, month, and year fields are used. */
  def requireDateOnOrAfter(date: Date): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a date on or before the given value. The time fields of the Date object are ignored; only the day, month, and year fields are used. */
  def requireDateOnOrBefore(date: Date): DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the given formula evaluates to true. This method is only available in the new version of Google Sheets. */
  def requireFormulaSatisfied(formula: String): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a number between the given values, inclusive of the values themselves. */
  def requireNumberBetween(start: Number)(end: Number): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a number equal to the given value. */
  def requireNumberEqualTo(number: Number): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a number greater than the given value. */
  def requireNumberGreaterThan(number: Number): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a number greater than or equal to the given value. */
  def requireNumberGreaterThanOrEqualTo(number: Number): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a number less than the given value. */
  def requireNumberLessThan(number: Number): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a number less than or equal to the given value. */
  def requireNumberLessThanOrEqualTo(number: Number): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a number not between the given values, inclusive of the values themselves. */
  def requireNumberNotBetween(start: Number)(end: Number): DataValidationBuilder = ???
  /** Sets the data-validation rule to require a number not equal to the given value. */
  def requireNumberNotEqualTo(number: Number): DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the input contains the given value. */
  def requireTextContains(text: String): DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the input does not contain the given value. */
  def requireTextDoesNotContain(text: String): DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the input is equal to the given value. */
  def requireTextEqualTo(text: String): DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the input is in the form of an email address. */
  def requireTextIsEmail: DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the input is in the form of a URL. */
  def requireTextIsUrl: DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the input is equal to one of the given values. */
  def requireValueInList(values: Seq[String]): DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the input is equal to one of the given values, with an option to hide the dropdown menu. */
  def requireValueInList(values: Seq[String])(showDropdown: Boolean): DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the input is equal to a value in the given range. */
  def requireValueInRange(range: Range): DataValidationBuilder = ???
  /** Sets the data-validation rule to require that the input is equal to a value in the given range, with an option to hide the dropdown menu. */
  def requireValueInRange(range: Range)(showDropdown: Boolean): DataValidationBuilder = ???
  /** Sets whether to show a warning when input fails data validation or whether to reject the input entirely. The default for new data-validation rules is true. */
  def setAllowInvalid(allowInvalidData: Boolean): DataValidationBuilder = ???
  /** Sets the help text shown when the user hovers over the cell on which data-validation is set. */
  def setHelpText(helpText: String): DataValidationBuilder = ???
  /** Sets the data-validation rule to require criteria defined in the DataValidationCriteria enum. This is an advanced method used primarily to create a new data-validation rule based on the criteria and arguments of an existing rule; in most other cases, the require...() methods are easier to use. */
  def withCriteria(criteria: DataValidationCriteria)(args: Seq[Object]): DataValidationBuilder = ???
}