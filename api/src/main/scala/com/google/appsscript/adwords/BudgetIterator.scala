package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An iterator of budgets. 
 * <p>Typical usage:</p>
 *  
 * <pre class="prettyprint">
 *  while (budgetIterator.hasNext()) {
 *    var budget = budgetIterator.next();
 *  }</pre>
 */
trait BudgetIterator extends SizeAwareIterator[Budget]
