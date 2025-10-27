package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap;
import org.junit.Test;

public class UnmodifiableOrderedMapDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableOrderedMap#unmodifiableOrderedMap(OrderedMap)}
   */
  @Test
  public void testUnmodifiableOrderedMap() {
    // Arrange and Act
    OrderedMap<Object, Object> actualUnmodifiableOrderedMapResult = UnmodifiableOrderedMap
        .unmodifiableOrderedMap(new DualTreeBidiMap<>());

    // Assert
    assertTrue(actualUnmodifiableOrderedMapResult.isEmpty());
  }
}
