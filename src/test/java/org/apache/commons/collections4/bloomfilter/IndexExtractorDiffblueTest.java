package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IndexExtractorDiffblueTest {
  /**
   * Method under test: {@link IndexExtractor#asIndexArray()}
   */
  @Test
  public void testAsIndexArray() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleBloomFilter(Shape.fromKM(19088743, 10))).asIndexArray().length);
    assertEquals(0, (new SimpleBloomFilter(Shape.fromNP(1000, 0.25d))).asIndexArray().length);
  }
}
