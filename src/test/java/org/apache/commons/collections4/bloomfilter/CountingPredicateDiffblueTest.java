package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CountingPredicateDiffblueTest {
  /**
   * Method under test: {@link CountingPredicate#processRemaining()}
   */
  @Test
  public void testProcessRemaining() {
    // Arrange
    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(new Object[]{}, null);

    // Act and Assert
    assertTrue(countingPredicate.processRemaining());
  }
}
