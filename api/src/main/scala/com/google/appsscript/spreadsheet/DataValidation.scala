package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import scala.scalajs.js

/**
 * DataValidation This class allows users to access existing data-validation rules. To create a new rule, see SpreadsheetApp.newDataValidation(), DataValidationBuilder, and Range.setDataValidation(rule).
 *  // Log information about the data-validation rule for cell A1.
 *  var cell = SpreadsheetApp.getActive().getRange('A1');
 *  var rule = cell.getDataValidation();
 *  if (rule != null) {
 *    var criteria = rule.getCriteriaType();
 *    var args = rule.getCriteriaValues();
 *    Logger.log('The data-validation rule is %s %s', criteria, args);
 *  } else {
 *    Logger.log('The cell does not have a data-validation rule.')
 *  }
 */
trait DataValidation extends js.Object {
  /** Creates a builder for a data-validation rule based on this rule's settings. */
  def copy: DataValidationBuilder = js.native
  /** Returns true if the rule shows a warning when input fails data validation, or false if it rejects the input entirely. The default for new data-validation rules is true. */
  def getAllowInvalid: Boolean = js.native
  /** Gets the rule's criteria type as defined in the DataValidationCriteria enum. To get the arguments for the criteria, use getCriteriaValues(). To use these values to create or modify a data-validation rule, see DataValidationBuilder.withCriteria(criteria, args). */
  def getCriteriaType: DataValidationCriteria = js.native
  /** Gets an array of arguments for the rule's criteria. To get the criteria type, use getCriteriaType(). To use these values to create or modify a data-validation rule, see DataValidationBuilder.withCriteria(criteria, args). */
  def getCriteriaValues: Seq[AnyRef] = js.native
  /** Gets the rule's help text, or null if no help text is set. */
  def getHelpText: String = js.native
}