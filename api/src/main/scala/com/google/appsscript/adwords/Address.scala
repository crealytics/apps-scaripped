package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 *
 *  Represents the address of a geographical point. Contains information about the street address, country, province / state, and postal code.
 * <p>For instance, the address "1600 Amphitheatre Parkway, Mountain View, CA 94043" will have the following values: </p>
 * <ul>
 *  <li><code>getStreetAddress()</code>: "1600 Amphitheatre Parkway"</li>
 *  <li><code>getStreetAddress2()</code>: <code>null</code></li>
 *  <li><code>getCityName()</code>: "Mountain View"</li>
 *  <li><code>getProvinceCode()</code>: "CA"</li>
 *  <li><code>getProvinceName()</code>: "California"</li>
 *  <li><code>getPostalCode()</code>: "94043"</li>
 *  <li><code>getCountryCode()</code>: "US"</li>
 * </ul>
 * <p></p>
 */
trait Address extends js.Object {
  /**
   *  Returns the city name, or
   * <code>null</code>
   *  if not known.
   */
  def getCityName: String = js.native
  /**
   *  Returns the country code, or
   * <code>null</code>
   *  if not known.
   */
  def getCountryCode: String = js.native
  /**
   *  Returns the postal code, or
   * <code>null</code>
   *  if not known.
   */
  def getPostalCode: String = js.native
  /**
   *  Returns the province / state code, or
   * <code>null</code>
   *  if not known.
   * <p>For instance, addresses in California would return <code>"CA"</code>.</p>
   */
  def getProvinceCode: String = js.native
  /**
   *  Returns the province / state name, or
   * <code>null</code>
   *  if not known.
   */
  def getProvinceName: String = js.native
  /**
   *  Returns the street address, or
   * <code>null</code>
   *  if not known.
   */
  def getStreetAddress: String = js.native
  /**
   *  Returns the second line of the street address, or
   * <code>null</code>
   *  if not known.
   */
  def getStreetAddress2: String = js.native
}