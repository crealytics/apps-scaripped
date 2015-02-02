package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Root object of AdWords scripts API. Exposes methods for 
 * <ul> 
 *  <li>Fetching AdWords entities</li> 
 *  <li>Querying AdWords reports</li> 
 *  <li>Accessing information about the state of the current execution</li> 
 * </ul>
 */
trait AdWordsApp {
  /**  Returns the selector of all ad customizer data sources in the account. */
  def adCustomizerSources: AdCustomizerSourceSelector = ???
  /**  Returns the selector of all ad groups in the account. */
  def adGroups: AdGroupSelector = ???
  /**  Returns the selector of all ad params in the account. */
  def adParams: AdParamSelector = ???
  /**  Returns the selector of all ads in the account. */
  def ads: AdSelector = ???
  /**  Returns the selector of all flexible bidding strategies in the account. */
  def biddingStrategies: BiddingStrategySelector = ???
  /**  Returns the selector of all budgets in the account. */
  def budgets: BudgetSelector = ???
  /**
   *  Provides access to bulk uploads: 
   * <a href="adwordsapp_fileupload.html">FileUpload</a>
   * , 
   * <a href="adwordsapp_csvupload.html">CsvUpload</a>
   * .
   */
  def bulkUploads: BulkUploads = ???
  /**  Returns the selector of all campaigns in the account.  */
  def campaigns: CampaignSelector = ???
  /**
   *  Creates a new Label. You must always specify a name, but description and color are optional. 
   * <p>Note that you cannot create more than 100,000 labels per account. </p>
   * <p>Usage examples: </p>
   * <pre class="prettyprint">
   *  AdWordsApp.createLabel("My Label");
   * 
   *  AdWordsApp.createLabel("Modified by script", "These ads have been modified by a script");
   * 
   *  AdWordsApp.createLabel("Bad Keywords", "These keywords are performing poorly", "red");</pre>
   *  You must specify optional arguments in order, i.e. you cannot specify color without the description. 
   * <pre class="prettyprint">
   *  // <strong>CORRECT</strong>: This will set the color to '#0088FF':
   *  AdWordsApp.createLabel("Good", "", "#0088FF");
   * 
   *  // <strong>WRONG</strong>: This will set the description to '#0088FF':
   *  AdWordsApp.createLabel("Bad", "#0088FF");</pre>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def createLabel(name: String, description: String, backgroundColor: String): Unit = ???
  /**  Returns miscellaneous information about the AdWords account in which the script is currently running. */
  def currentAccount: Account = ???
  /**
   *  Provides access to display criteria that have been added to this account: 
   * <a href="adwordsapp_audience.html">Audience</a>
   * , 
   * <a href="adwordsapp_displaykeyword.html">DisplayKeyword</a>
   * , 
   * <a href="adwordsapp_placement.html">Placement</a>
   * , 
   * <a href="adwordsapp_topic.html">Topic</a>
   * .
   */
  def display: Display = ???
  /**
   *  Provides access to ad extensions that have been added to this account: 
   * <a href="adwordsapp_sitelink.html">Sitelink</a>
   * , 
   * <a href="adwordsapp_phonenumber.html">PhoneNumber</a>
   * , 
   * <a href="adwordsapp_mobileapp.html">MobileApp</a>
   * .
   */
  def extensions: Extensions = ???
  /**  Returns miscellaneous information about the current script execution. */
  def getExecutionInfo: ExecutionInfo = ???
  /**  Returns the selector of all keywords in the account. */
  def keywords: KeywordSelector = ???
  /**  Returns the selector of all labels in the account. */
  def labels: LabelSelector = ???
  /**
   *  Returns a new ad customizer source builder for this account. Once 
   * <code>builder.create()</code>
   *  is called, the ad customizer source will be created in this account.
   */
  def newAdCustomizerSourceBuilder: AdCustomizerSourceBuilder = ???
  /**  Returns the selector of all product ads in the account. */
  def productAds: ProductAdSelector = ???
  /**  Returns the selector of all product groups in the account. */
  def productGroups: ProductGroupSelector = ???
  /**
   *  Fetches an AdWords report. 
   * <p>Example usages: </p>
   * <pre class="prettyprint">
   *  var report1 = AdWordsApp.report(
   *      'SELECT Query, Ctr ' +
   *      'FROM   SEARCH_QUERY_PERFORMANCE_REPORT ' +
   *      'DURING 20130101,20130301');
   * 
   *  var report2 = AdWordsApp.report(
   *      'SELECT AdGroupId, Id, KeywordText, Impressions, Clicks ' +
   *      'FROM   KEYWORDS_PERFORMANCE_REPORT ' +
   *      'DURING 20130101,20130301', {
   *        includeZeroImpressions: false,
   *        returnMoneyInMicros: true,
   *        apiVersion: 'v201402'
   *      });</pre>
   *  
   * <p>Reports are specified via an AWQL query. For detailed information, please see <a href="/adwords/api/docs/guides/awql">the AWQL guide</a> and <a href="/adwords/api/docs/appendix/reports">the list of report types and fields.</a></p>
   *  
   * <p>This method also accepts an optional arguments object. The following optional arguments are supported:</p>
   *  
   * <table> 
   *  <tbody>
   *   <tr>
   *    <th>Name</th>
   *    <th>Type</th>
   *    <th>Description</th>
   *   </tr> 
   *   <tr> 
   *    <td>includeZeroImpressions</td> 
   *    <td><code>boolean</code></td> 
   *    <td> Whether or not to include entities that had zero impressions in the report. Defaults to <code>true</code>. </td> 
   *   </tr>
   *   <tr> 
   *    <td>returnMoneyInMicros</td> 
   *    <td><code>boolean</code></td> 
   *    <td> Whether or not to represent money in micros ('1370000') or in currency ('1.37'). Defaults to <code>false</code>. </td> 
   *   </tr>
   *   <tr> 
   *    <td>apiVersion</td> 
   *    <td><code>String</code></td> 
   *    <td> The AdWords API version to query. <a href="/adwords/api/docs/sunset-dates">Sunsetted versions</a> are not allowed. Defaults to the most recent supported version. </td> 
   *   </tr> 
   *  </tbody>
   * </table>
   */
  def report(query: String, optArgs: AnyRef): Report = ???
  /**  Returns the selector of all shopping ad groups in the account. */
  def shoppingAdGroups: ShoppingAdGroupSelector = ???
  /**  Returns the selector of all shopping campaigns in the account. */
  def shoppingCampaigns: ShoppingCampaignSelector = ???
  /**  Provides access to campaign-level targeting criteria: device targeting, ad scheduling, and location targeting. */
  def targeting: Targeting = ???
}