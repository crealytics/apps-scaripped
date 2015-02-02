package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

/**
 * ContainerInfo The chart's position within a sheet. Can be updated using the EmbeddedChart.modify() function. 
 *  
 * 
 *  chart = chart.modify().setPosition(5, 5, 0, 0).build();
 *  sheet.updateChart(chart);
 */
trait ContainerInfo {
  /** The chart's left side will be anchored in this column. */
  def getAnchorColumn: Int = ???
  /** The chart's top side will be anchored in this row. */
  def getAnchorRow: Int = ???
  /** The chart's upper left hand corner will be offset from the anchor column by this many pixels. */
  def getOffsetX: Int = ???
  /** Chart's upper left hand corner will be offset from the anchor row by this many pixels. */
  def getOffsetY: Int = ???
}