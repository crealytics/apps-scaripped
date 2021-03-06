package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * DataValidationCriteria An enumeration representing the data-validation criteria that can be set on a range. 
 * 
 *  // Change existing data-validation rules that require a date in 2013 to require a date in 2014.
 *  var oldDates = [new Date('1/1/2013'), new Date('12/31/2013')];
 *  var newDates = [new Date('1/1/2014'), new Date('12/31/2014')];
 *  var sheet = SpreadsheetApp.getActiveSheet();
 *  var range = sheet.getRange(1, 1, sheet.getMaxRows(), sheet.getMaxColumns());
 *  var rules = range.getDataValidations();
 * 
 *  for (var i = 0; i < rules.length; i++) {
 *    for (var j = 0; j < rules[i].length; j++) {
 *      var rule = rules[i][j];
 * 
 *      if (rule != null) {
 *        var criteria = rule.getCriteriaType();
 *        var args = rule.getCriteriaValues();
 *  
 *        if (criteria == SpreadsheetApp.DataValidationCriteria.DATE_BETWEEN
 *            && args[0].getTime() == oldDates[0].getTime()
 *            && args[1].getTime() == oldDates[1].getTime()) {
 *          // Create a builder from the existing rule, then change the dates.
 *          rules[i][j] = rule.copy().withCriteria(criteria, newDates).build();
 *        }
 *      }
 *    }
 *  }
 *  range.setDataValidations(rules);
 */
trait DataValidationCriteria extends js.Object {
  ()
}
