package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.OrderedBidiMap;
import org.junit.Test;

public class UnmodifiableOrderedBidiMapDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableOrderedBidiMap#unmodifiableOrderedBidiMap(OrderedBidiMap)}
   */
  @Test
  public void testUnmodifiableOrderedBidiMap() {
    // Arrange and Act
    OrderedBidiMap<Object, Object> actualUnmodifiableOrderedBidiMapResult = UnmodifiableOrderedBidiMap
        .unmodifiableOrderedBidiMap(new DualTreeBidiMap<>());

    // Assert
    assertTrue(actualUnmodifiableOrderedBidiMapResult.isEmpty());
  }
}
