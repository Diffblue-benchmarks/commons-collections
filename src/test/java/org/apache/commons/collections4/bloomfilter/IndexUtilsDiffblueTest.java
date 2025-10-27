package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class IndexUtilsDiffblueTest {
  /**
   * Method under test: {@link IndexUtils#ensureCapacityForAdd(int[], int)}
   */
  @Test
  public void testEnsureCapacityForAdd() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[]{1, -1, 1, -1}, IndexUtils.ensureCapacityForAdd(new int[]{1, -1, 1, -1}, 1));
    assertArrayEquals(new int[]{0, 0}, IndexUtils.ensureCapacityForAdd(new int[]{}, 1));
  }
}
