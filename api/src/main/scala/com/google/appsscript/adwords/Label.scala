package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Represents an AdWords label. */
trait Label extends js.Object {
  /** Returns the selector of all ad groups to which the label is applied. */
  def adGroups(): AdGroupSelector = js.native
  /** Returns the selector of all ads to which the label is applied. */
  def ads(): AdSelector = js.native
  /** Returns the selector of all campaigns to which the label is applied. */
  def campaigns(): CampaignSelector = js.native
  /** Returns the color code of the label. */
  def getColor(): String = js.native
  /** Returns the description of the label. */
  def getDescription(): String = js.native
  /**
   * Returns the type of this entity as a
   * <code>String</code>
   * , in this case,
   * <code>"Label"</code>
   * .
   */
  def getEntityType(): String = js.native
  /** Returns the ID of the label. */
  def getId(): String = js.native
  /** Returns the name of the label. */
  def getName(): String = js.native
  /** Returns the selector of all keywords to which the label is applied. */
  def keywords(): KeywordSelector = js.native
  /**
   * Removes the label.
   * <p>Returns nothing.</p>
   */
  def remove(): Unit = js.native
  /**
   * Sets the background color of the label.
   * <p>Returns nothing.</p>
   */
  def setColor(color: String): Unit = js.native
  /**
   * Sets the description for this label. The description may not be longer than 200 characters.
   * <p>Returns nothing.</p>
   */
  def setDescription(description: String): Unit = js.native
  /**
   * Changes the name of the Label. The name must be unique, non-empty, and may not be longer than 100 characters. Any leading or trailing white spaces will be trimmed.
   * <p>Returns nothing.</p>
   */
  def setName(name: String): Unit = js.native
}
