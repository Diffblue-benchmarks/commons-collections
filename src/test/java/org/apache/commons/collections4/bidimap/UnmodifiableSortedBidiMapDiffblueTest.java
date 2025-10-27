package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.SortedBidiMap;
import org.junit.Test;

public class UnmodifiableSortedBidiMapDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableSortedBidiMap#unmodifiableSortedBidiMap(SortedBidiMap)}
   */
  @Test
  public void testUnmodifiableSortedBidiMap() {
    // Arrange and Act
    SortedBidiMap<Object, Object> actualUnmodifiableSortedBidiMapResult = UnmodifiableSortedBidiMap
        .unmodifiableSortedBidiMap(new DualTreeBidiMap<>());

    // Assert
    assertTrue(actualUnmodifiableSortedBidiMapResult.isEmpty());
  }
}
