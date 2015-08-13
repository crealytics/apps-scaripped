package com.google.appsscript.adwords

import scala.scalajs.js

trait HasBidModifier extends js.Any {
  /**
   * Returns the bid modifier for this proximity.
   * <p>The bid modifier is a multiplier applied to bids which match this proximity. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of $5.00 to a bid of $5.50.</p>
   * <p> </p>
   * <p>The bid modifiers for all matching criteria are multiplied together to calculate the actual bid modification. A campaign with the following bid modifiers: </p>
   * <table>
   *  <tbody>
   *   <tr>
   *    <th>Type</th>
   *    <th>Value</th>
   *    <th>Bid Modifier</th>
   *   </tr>
   *   <tr>
   *    <td>Location</td>
   *    <td>Laos</td>
   *    <td><code>1.3</code></td>
   *   </tr>
   *   <tr>
   *    <td>Ad Schedule</td>
   *    <td>Saturday 6AM-10AM</td>
   *    <td><code>0.9</code></td>
   *   </tr>
   *   <tr>
   *    <td>Platform</td>
   *    <td>Mobile</td>
   *    <td><code>1.1</code></td>
   *   </tr>
   *  </tbody>
   * </table>
   * would have a combined bid modifier of
   * <code>1.3 * 0.9 * 1.1 = 1.287</code>
   * , so a bid of $10 would get increased to $12.87 for clicks by Laotian smartphone users on Saturday mornings in the account timezone.
   * <p></p>
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   */
  def getBidModifier(): Double = js.native

  /**
   * Sets the bid modifier for this proximity.
   * <p>The bid modifier is a multiplier applied to bids which match this proximity. So, for instance, a bid modifier of <code>1.1</code> increases the bid to 110% of its original value, and changes a bid of <code>$5.00</code> to a bid of <code>$5.50</code>.</p>
   * <p> </p>
   * <p>The bid modifiers for all matching criteria are multiplied together to calculate the actual bid modification. A campaign with the following bid modifiers: </p>
   * <table>
   *  <tbody>
   *   <tr>
   *    <th>Type</th>
   *    <th>Value</th>
   *    <th>Bid Modifier</th>
   *   </tr>
   *   <tr>
   *    <td>Location</td>
   *    <td>Laos</td>
   *    <td><code>1.3</code></td>
   *   </tr>
   *   <tr>
   *    <td>Ad Schedule</td>
   *    <td>Saturday 6AM-10AM</td>
   *    <td><code>0.9</code></td>
   *   </tr>
   *   <tr>
   *    <td>Platform</td>
   *    <td>Mobile</td>
   *    <td><code>1.1</code></td>
   *   </tr>
   *  </tbody>
   * </table>
   * would have a combined bid modifier of
   * <code>1.3 * 0.9 * 1.1 = 1.287</code>
   * , so a bid of $10 would get increased to $12.87 for clicks by Laotian smartphone users on Saturday mornings in the account timezone.
   * <p></p>
   * <p>For more information about bid modifiers, please see the <a href="https://support.google.com/adwords/answer/2732132?hl=en">AdWords Help Center article</a>.</p>
   * <p>For proximities, acceptable bid modifiers are in the range <code>0.1</code> to <code>10</code>.</p>
   * <p>Returns nothing.</p>
   */
  def setBidModifier(modifier: Double): Unit = js.native

}
