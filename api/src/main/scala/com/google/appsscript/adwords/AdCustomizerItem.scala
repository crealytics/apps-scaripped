package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents an ad customizer data item. Each ad customizer item can be seen as one row in an ad customizer source in the Business Data section of the Shared Library. Ad customizer items have attribute values, which are values that correspond to the attributes of the item's source (see 
 * <a href="adwordsapp_adcustomizersource.html">AdCustomizerSource</a>
 * ). These values can be substituted into an ad with placeholders of the form 
 * <code>{=SourceName.AttributeName}</code>
 * . See the 
 * <a href="/adwords/scripts/docs/features/ad-customizers">feature guide</a>
 *  for more information.
 */
trait AdCustomizerItem extends js.Object {
  /**
   *  Clears the set target ad group and campaign. Does nothing if target ad group is not set. 
   * <p>Returns nothing.</p>
   *  
   */
  def clearTargetAdGroup(): Unit = js.native
  /**
   *  Clears the set target campaign. Does nothing if the target ad group is set. 
   * <p>Returns nothing.</p>
   *  
   */
  def clearTargetCampaign(): Unit = js.native
  /**
   *  Clears the set target keyword. 
   * <p>Returns nothing.</p>
   *  
   */
  def clearTargetKeyword(): Unit = js.native
  /**
   *  Returns the value of the named attribute. Returns 
   * <code>null</code>
   *  if the attribute does not have a value. Throws an error if the item's source has no attribute with the given name. The return will match the type of the attribute. An attribute of type 
   * <code>number</code>
   *  will return a number, an attribute of type 
   * <code>text</code>
   *  will return a string, and an attribute of type 
   * <code>date</code>
   *  will return a string in 
   * <code>YYYYMMDD HHMMSS</code>
   *  format.
   */
  def getAttributeValue(name: String): AnyRef = js.native
  /**
   *  Returns a map from attribute name to attribute value. Attributes with no value are not included in the map. For instance, for an ad customizer item with attribute values 
   * <code>item</code>
   *  = 
   * <code>null</code>
   * , 
   * <code>numLeft</code>
   *  = 
   * <code>5</code>
   * , and 
   * <code>lowCost</code>
   *  = 
   * <code>"$0.99"</code>
   * , calling 
   * <code>adCustomizerItem.getAttributeValues()</code>
   *  would return 
   * <code>{numLeft: 5, lowCost: "$0.99"}</code>
   * .
   */
  def getAttributeValues(): AnyRef = js.native
  /**
   *  Returns the end date of the ad customizer item. For instance, if the end date of the ad customizer item is May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"AdCustomizerItem"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**  Returns the ID of the ad customizer item. */
  def getId(): Long = js.native
  /**  Returns the scheduling of the ad customizer item. */
  def getSchedules(): Seq[ExtensionSchedule] = js.native
  /**
   *  Returns the start date of the ad customizer item. For instance, if the start date of the ad customizer item is May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate(): AdWordsDate = js.native
  /**
   *  Returns the name of the target ad group, if it is set. Returns 
   * <code>null</code>
   *  otherwise.
   */
  def getTargetAdGroupName(): String = js.native
  /**
   *  Returns the name of the target campaign, if it is set. Returns 
   * <code>null</code>
   *  otherwise.
   */
  def getTargetCampaignName(): String = js.native
  /**
   *  Returns the ad customizer item's target keyword text, if it is set. Returns 
   * <code>null</code>
   *  otherwise. The text returned will be formatted as follows, depending on the match type: 
   * <ul> 
   *  <li><code>shoes</code> - broad match</li> 
   *  <li><code>"shoes"</code> - phrase match</li> 
   *  <li><code>[leather shoes]</code> - exact match</li> 
   * </ul>
   */
  def getTargetKeywordText(): String = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the ad customizer item specifies mobile device preference.
   */
  def isMobilePreferred(): Boolean = js.native
  /**
   *  Removes the ad customizer item from the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def remove(): Unit = js.native
  /**
   *  Sets the named attribute to the given value, or clears its value if 
   * <code>null</code>
   *  is given. The value must be consistent with the type of the attribute: 
   * <table border="1" cellspacing="0" cellpadding="3"> 
   *  <tbody>
   *   <tr> 
   *    <th>Type</th> 
   *    <th>Expected Value Format</th> 
   *    <th>Example</th> 
   *   </tr> 
   *   <tr> 
   *    <td>text</td> 
   *    <td>String</td> 
   *    <td><code>"leather shoes"</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>number</td> 
   *    <td>Number (Integer)</td> 
   *    <td><code>42</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>price</td> 
   *    <td>String</td> 
   *    <td><code>"$4.20"</code></td> 
   *   </tr> 
   *   <tr> 
   *    <td>date</td> 
   *    <td>String in <code>YYYYMMDD HHMMSS</code> format</td> 
   *    <td><code>"20130505 110000"</code>. Invalid dates such as <code>"20130005 110000"</code> will result in an error (there is no month 0).</td> 
   *   </tr> 
   *  </tbody>
   * </table>
   *  The special attribute 
   * <code>custom id</code>
   *  also requires that the new value is unique across all items in the ad customizer data source. 
   * <p>The change will fail and report an error if:</p>
   * <ul> 
   *  <li>this item's source has no attribute by the given name,</li> 
   *  <li>the value is not consistent with the type of the attribute, or</li> 
   *  <li>for the <code>custom id</code> attribute, another item in the data source has the same value.</li> 
   * </ul>
   * <p></p>
   *  Related: 
   * <ul> 
   *  <li><a href="adwordsapp_adcustomizeritem.html#setAttributeValues_1">AdCustomizerItem.setAttributeValues</a></li> 
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setAttributeValue(name: String, value: AnyRef): Unit = js.native
  /**
   *  Sets the named attributes to the respective values. A 
   * <code>null</code>
   *  value will clear any existing value for the attribute. The value must be consistent with the type of the attribute. See 
   * <a href="adwordsapp_adcustomizeritem.html#setAttributeValue_2">AdCustomizerItem.setAttributeValue</a>
   *  for more information on the expected values for each attribute type. The special attribute 
   * <code>custom id</code>
   *  also requires that the new value is unique across all items in the ad customizer data source. 
   * <p>Examples of the expected value formats for each valid attribute type: </p>
   * <pre class="prettyprint">
   *  var attributeValues = {
   *      item: "leather shoes"         // text
   *      numLeft: 5,                   // number
   *      lowCost: "$5.99",             // price
   *      endDate: "20130401 120000"};  // date
   *  adCustomizerItem.setAttributeValues(attributeValues);</pre>
   * <p></p>
   *  
   * <p>The change will fail and report an error if:</p>
   * <ul> 
   *  <li>this item's source has no attribute with one of the given names,</li> 
   *  <li>the value is not consistent with the type of the attribute, or</li> 
   *  <li>for the <code>custom id</code> attribute, another item in the data source has the same value.</li> 
   * </ul>
   * <p></p>
   *  Related: 
   * <ul> 
   *  <li><a href="adwordsapp_adcustomizeritem.html#setAttributeValue_2">AdCustomizerItem.setAttributeValue</a></li> 
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setAttributeValues(attributeValues: AnyRef): Unit = js.native
  /**
   *  Sets the ad customizer item's end date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>adCustomizerItem.setEndDate("20130503");</code>
   *  is equivalent to 
   * <code>adCustomizerItem.setEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the start date now comes after the end date, or</li> 
   *  <li>it's a date in the past.</li>
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setEndDate(date: AnyRef): Unit = js.native
  /**
   *  Sets the ad customizer item's device preference. 
   * <p>Returns nothing.</p>
   *  
   */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  /**
   *  Sets the ad customizer item scheduling. Scheduling of a ad customizer item allows you to control the days of week and times of day during which the ad customizer item will show alongside your ads. 
   * <p>Passing in an empty array clears the scheduling field, causing the ad customizer item to run at all times.</p>
   *  
   * <p>The following example sets the ad customizer item to run on Mondays and Tuesday from 8:00 to 11:00.</p>
   *  
   * <pre class="prettyprint">
   *  var mondayMorning = {
   *    dayOfWeek: "MONDAY",
   *    startHour: 8,
   *    startMinute: 0,
   *    endHour: 11,
   *    endMinute: 0
   *  };
   *  var tuesdayMorning = {
   *    dayOfWeek: "TUESDAY",
   *    startHour: 8,
   *    startMinute: 0,
   *    endHour: 11,
   *    endMinute: 0
   *  };
   * 
   *  adCustomizerItem.setSchedules([mondayMorning, tuesdayMorning]);</pre>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setSchedules(schedules: Seq[ExtensionSchedule]): Unit = js.native
  /**
   *  Sets the ad customizer item's start date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>adCustomizerItem.setStartDate("20130503");</code>
   *  is equivalent to 
   * <code>adCustomizerItem.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the given date is after the ad customizer item's end date.</li>
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setStartDate(date: AnyRef): Unit = js.native
  /**
   *  Sets the target ad group and campaign of the ad customizer item. This will fail if a target campaign exists. For instance, 
   * <pre class="prettyprint">
   *  adCustomizerItem.setTargetCampaign("Campaign");
   *  adCustomizerItem.setTargetAdGroup("Campaign", "Ad group");</pre>
   *  will fail on the second statement, while 
   * <pre class="prettyprint">
   *  adCustomizerItem.setTargetCampaign("Campaign");
   *  adCustomizerItem.clearTargetCampaign();
   *  adCustomizerItem.setTargetAdGroup("Campaign", "Ad group");</pre>
   *  will target the ad group "Ad group" and target the campaign "Campaign". 
   * <p>Returns nothing.</p>
   *  
   */
  def setTargetAdGroup(campaignName: String, adGroupName: String): Unit = js.native
  /**
   *  Sets the target campaign of the ad customizer item. This will fail if a target ad group exists. For instance, 
   * <pre class="prettyprint">
   *  adCustomizerItem.setTargetAdGroup("Campaign", "Ad group");
   *  adCustomizerItem.setTargetCampaign("Campaign");</pre>
   *  will fail on the second statement, while 
   * <pre class="prettyprint">
   *  adCustomizerItem.setTargetAdGroup("Campaign", "Ad group");
   *  adCustomizerItem.clearTargetAdGroup();
   *  adCustomizerItem.setTargetCampaign("Campaign");</pre>
   *  will target the campaign "Campaign". 
   * <p>Returns nothing.</p>
   *  
   */
  def setTargetCampaign(campaignName: String): Unit = js.native
  /**
   *  Sets the target keyword of the ad customizer item. Setting the target keyword to one that does not yet exist in your account will not cause an error, but will prevent the ad customizer item from being used to populate ads (until you create the keyword in your account). The keyword should be formatted based on its match type: 
   * <ul> 
   *  <li><code>setTargetKeyword('shoes')</code> - broad match</li> 
   *  <li><code>setTargetKeyword('"shoes"')</code> - phrase match</li> 
   *  <li><code>setTargetKeyword('[leather shoes]')</code> - exact match</li> 
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setTargetKeyword(keyword: String): Unit = js.native
}