package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  An operation representing creation of a new ad group. Calling any method (
 * <a href="adwordsapp_adgroupoperation.html#getErrors_0">getErrors</a>
 * , 
 * <a href="adwordsapp_adgroupoperation.html#getResult_0">getResult</a>
 * , or 
 * <a href="adwordsapp_adgroupoperation.html#isSuccessful_0">isSuccessful</a>
 * ) will cause the operation to execute and create the ad group. To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed all the operations you want.
 */
trait AdGroupOperation extends Operation[AdGroup]
