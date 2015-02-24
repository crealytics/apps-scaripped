package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Builder for 
 * <a href="adwordsapp_adcustomizeritem.html">AdCustomizerItem</a>
 *  objects. Example usage: 
 * <pre class="prettyprint">
 *  adCustomizerSource.adCustomizerItemBuilder()
 *    .withAttributeValues({numLeft: 5, lowCost: "$0.99"}) // at least one value is required
 *    .withTargetCampaign("Campaign name")                 //
 *    .withTargetKeyword("[keyword]")                      // optional
 *    .withMobilePreferred(true)                           // optional
 *    .build();                                            // create the ad customizer item</pre>
 */
trait AdCustomizerItemBuilder extends Builder[AdCustomizerItem] {
  /**
   *  Builds the ad customizer data item. Returns an 
   * <a href="adwordsapp_adcustomizeritemoperation.html">AdCustomizerItemOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_adcustomizeritem.html">AdCustomizerItem</a>
   * .
   */
  override def build(): Operation[AdCustomizerItem] = js.native
  /**
   *  Sets the value of the named attribute of the ad customizer item. The value must be consistent with the type of the attribute. See 
   * <a href="adwordsapp_adcustomizeritem.html#setAttributeValue_2">AdCustomizerItem.setAttributeValue</a>
   *  for more information on the expected values for all attribute types. As an example, an attribute of type 
   * <code>text</code>
   *  expects a string as the value, while an attribute of type 
   * <code>date</code>
   *  expects a string in 
   * <code>YYYYMMDD HHMMSS</code>
   *  format. 
   * <p>An error will be thrown if the item's source has no attribute of the given name.</p>
   *  
   * <p>At least one attribute is required to have a value in order to create the ad customizer item. For instance, </p>
   * <pre class="prettyprint">
   *  var adCustomizerItemOperation = adCustomizerItemBuilder
   *    .withAttributeValue("lowCost", "$0.99")
   *    .withTargetCampaign("Campaign")
   *    .build();</pre>
   *  will create an item with 
   * <code>lowCost = "$0.99"</code>
   *  and target the campaign named 
   * <code>Campaign</code>
   * , while 
   * <pre class="prettyprint">
   *  var adCustomizerItemOperation = adCustomizerItemBuilder
   *    .withTargetCampaign("Campaign")
   *    .build();</pre>
   *  or 
   * <pre class="prettyprint">
   *  var adCustomizerItemOperation = adCustomizerItemBuilder
   *    .withAttributeValue("lowCost", null)
   *    .withTargetCampaign("Campaign")
   *    .build();</pre>
   *  will result in an error.
   * <p></p>
   */
  def withAttributeValue(name: String, value: AnyRef): AdCustomizerItemBuilder = js.native
  /**
   *  Sets the values of the ad customizer item's attributes. Expects an object containing the name-value pairs of the attribute values to set. For instance, 
   * <code>adCustomizerItemBuilder.withAttributeValues({numLeft: 5, lowCost: "$0.99"})</code>
   *  sets the attribute 
   * <code>numLeft</code>
   *  to have the value 
   * <code>5</code>
   * , and 
   * <code>lowCost</code>
   *  to have value 
   * <code>"$0.99"</code>
   * . 
   * <p>At least one attribute is required to have a value in order to create the ad customizer item. For instance, </p>
   * <pre class="prettyprint">
   *  var adCustomizerItemOperation = adCustomizerItemBuilder
   *    .withAttributeValues({lowCost: "$0.99", numLeft: 5})
   *    .withTargetCampaign("Campaign")
   *    .build();</pre>
   *  will create an item with lowCost "$0.99", numLeft 5, and target campaign "Campaign", while 
   * <pre class="prettyprint">
   *  var adCustomizerItemOperation = adCustomizerItemBuilder
   *    .withTargetCampaign("Campaign")
   *    .build();</pre>
   *  or 
   * <pre class="prettyprint">
   *  var adCustomizerItemOperation = adCustomizerItemBuilder
   *    .withAttributeValues({lowCost: null, numLeft: null})
   *    .withTargetCampaign("Campaign")
   *    .build();</pre>
   *  will result in an error.
   * <p></p>
   */
  def withAttributeValues(attributeValues: AnyRef): AdCustomizerItemBuilder = js.native
  /**
   *  Sets the ad customizer item's end date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance, 
   * <code>adCustomizerItemBuilder.withEndDate("20130503");</code>
   *  is equivalent to 
   * <code>adCustomizerItemBuilder.withEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the start date now comes after the end date, or</li> 
   *  <li>it's a date in the past</li>
   * </ul>
   */
  def withEndDate(date: AnyRef): AdCustomizerItemBuilder = js.native
  /**
   *  Sets the ad customizer item's device preference to mobile or clears it. This field is optional and defaults to 
   * <code>false</code>
   * .
   */
  def withMobilePreferred(isMobilePreferred: Boolean): AdCustomizerItemBuilder = js.native
  /**
   *  Sets the ad customizer item scheduling. Scheduling of a ad customizer item allows you to control the days of week and times of day during which the ad customizer item will show alongside your ads. 
   * <p>Passing in an empty array clears the scheduling field, causing the ad customizer item to run at all times.</p>
   *  
   * <p>The following example sets the ad customizer item to run on Mondays and Tuesday from 8:00 to 11:00.</p>
   *  
   * <pre class="prettyprint">
   *   var mondayMorning = {
   *     dayOfWeek: "MONDAY",
   *     startHour: 8,
   *     startMinute: 0,
   *     endHour: 11,
   *     endMinute: 0
   *   };
   *   var tuesdayMorning = {
   *     dayOfWeek: "TUESDAY",
   *     startHour: 8,
   *     startMinute: 0,
   *     endHour: 11,
   *     endMinute: 0
   *   };
   * 
   *   adCustomizerItemBuilder.withSchedules([mondayMorning, tuesdayMorning]);</pre>
   */
  def withSchedules(schedules: js.Array[ExtensionSchedule]): AdCustomizerItemBuilder = js.native
  /**
   *  Sets the ad customizer item's start date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. This field is optional. For instance, 
   * <code>adCustomizerItemBuilder.withStartDate("20130503");</code>
   *  is equivalent to 
   * <code>adCustomizerItemBuilder.withStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the given date is after the ad customizer item's end date,</li>
   * </ul>
   */
  def withStartDate(date: AnyRef): AdCustomizerItemBuilder = js.native
  /**
   *  Sets the target ad group and campaign of the new ad customizer item. This will fail if there were any previous calls to 
   * <code>withTargetCampaign("previous campaign")</code>
   * . For instance, 
   * <pre class="prettyprint">
   *  adCustomizerItemBuilder
   *    .withTargetCampaign("Other campaign")
   *    .withTargetAdGroup("Campaign", "Ad group");</pre>
   *  will fail, while 
   * <pre class="prettyprint">
   *  adCustomizerItemBuilder
   *    .withTargetAdGroup("Campaign", "Old ad group")
   *    .withTargetAdGroup("Campaign", "Ad group");</pre>
   *  will result in an ad customizer item builder with target campaign "Campaign" and target ad group "Ad group".
   */
  def withTargetAdGroup(campaignName: String, adGroupName: String): AdCustomizerItemBuilder = js.native
  /**
   *  Sets the target campaign of the new ad customizer item. This will fail if there were any previous calls to 
   * <code>withTargetAdGroup("previous ad group", "campaign")</code>
   * . For instance, 
   * <pre class="prettyprint">
   *  adCustomizerItemBuilder
   *    .withTargetAdGroup("Campaign", "Ad group")
   *    .withTargetCampaign("Other campaign");</pre>
   *  will fail, while 
   * <pre class="prettyprint">
   *  adCustomizerItemBuilder
   *    .withTargetCampaign("Old campaign");
   *    .withTargetCampaign("Campaign");</pre>
   *  will result in an ad customizer item builder with target campaign "Campaign" and no target ad group.
   */
  def withTargetCampaign(campaignName: String): AdCustomizerItemBuilder = js.native
  /**
   *  Sets the target keyword of the new ad customizer item. The keyword includes its match type. For instance, 
   * <code>adCustomizerItemBuilder.withTargetKeyword("[shoes]");</code>
   *  will target exact matches to "shoes". Setting the target keyword to one that does not yet exist in your account will not cause an error, but will prevent the ad customizer item from being used to populate ads (until you create the keyword in your account).
   */
  def withTargetKeyword(keyword: String): AdCustomizerItemBuilder = js.native
}
