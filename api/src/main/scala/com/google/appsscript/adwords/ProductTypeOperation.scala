package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An operation representing creation of a new product type. Calling any method (
 * <a href="adwordsapp_producttypeoperation.html#getErrors_0">getErrors</a>
 * , 
 * <a href="adwordsapp_producttypeoperation.html#getResult_0">getResult</a>
 * , or 
 * <a href="adwordsapp_producttypeoperation.html#isSuccessful_0">isSuccessful</a>
 * ) will cause the operation to execute and create the product type. To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed all the operations you want.
 */
trait ProductTypeOperation extends ProductGroupOperation[ProductType]
