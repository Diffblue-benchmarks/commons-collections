package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.Test;

public class UnmodifiableSortedMapDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableSortedMap#unmodifiableSortedMap(SortedMap)}
   */
  @Test
  public void testUnmodifiableSortedMap() {
    // Arrange and Act
    SortedMap<Object, Object> actualUnmodifiableSortedMapResult = UnmodifiableSortedMap
        .unmodifiableSortedMap(new TreeMap<>());

    // Assert
    assertTrue(actualUnmodifiableSortedMapResult.isEmpty());
  }
}
