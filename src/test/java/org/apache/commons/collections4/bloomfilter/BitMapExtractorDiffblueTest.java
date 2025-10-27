package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class BitMapExtractorDiffblueTest {
  /**
   * Method under test: {@link BitMapExtractor#asBitMapArray()}
   */
  @Test
  public void testAsBitMapArray() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[]{0L}, (new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).asBitMapArray());
    assertArrayEquals(
        new long[]{0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L},
        (new ArrayCountingBloomFilter(Shape.fromNP(1000, 0.25d))).asBitMapArray());
  }
}
