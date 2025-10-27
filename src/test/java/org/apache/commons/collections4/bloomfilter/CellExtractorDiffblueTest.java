package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertTrue;
import java.util.function.IntPredicate;
import org.junit.Test;

public class CellExtractorDiffblueTest {
  /**
   * Method under test: {@link CellExtractor#processIndices(IntPredicate)}
   */
  @Test
  public void testProcessIndices() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter.processIndices(new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10))));
  }
}
