package com.google.appsscript.adwords

import scala.scalajs.js

trait OrderableSelector extends js.Any {
  /**
   * Specifies the ordering of the resulting entities.
   * <code>orderBy</code>
   * parameter can have one of the following forms:
   * <ul>
   *  <li><code>orderBy("Cost")</code> - orders results by Cost, in ascending order.</li>
   *  <li><code>orderBy("Ctr ASC")</code> - orders results by Ctr, in ascending order.</li>
   *  <li><code>orderBy("MaxCpc DESC")</code> - orders results by MaxCpc, in descending order.</li>
   * </ul>
   * <p>See withCondition(String) for enumeration of columns that can be used.</p>
   * <p><code>orderBy()</code> may be called multiple times. Consider the following example:</p>
   * <pre class="prettyprint">
   *  selector = selector.forDateRange("LAST_14_DAYS")
   *      .orderBy("Clicks DESC")
   *      .orderBy("CTR ASC");</pre>
   * <p>The results will be ordered by Clicks in descending order. Results with equal Clicks value will be ordered by Ctr in ascending order.</p>
   * <p>If a stats column is used in the ordering, date range must be specified via forDateRange(String) or forDateRange(Object, Object).</p>
   * <p><code>LabelNames</code> column cannot be used for ordering.</p>
   */
  def orderBy(orderBy: String): this.type = js.native

}
