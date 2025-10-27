package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CountingLongPredicateDiffblueTest {
  /**
   * Method under test: {@link CountingLongPredicate#processRemaining()}
   */
  @Test
  public void testProcessRemaining() {
    // Arrange, Act and Assert
    assertTrue((new CountingLongPredicate(new long[]{}, null)).processRemaining());
  }
}
