package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.Test;

public class FixedSizeSortedMapDiffblueTest {
  /**
   * Method under test: {@link FixedSizeSortedMap#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  public void testFixedSizeSortedMap() {
    // Arrange and Act
    FixedSizeSortedMap<Object, Object> actualFixedSizeSortedMapResult = FixedSizeSortedMap
        .fixedSizeSortedMap(new TreeMap<>());

    // Assert
    assertTrue(actualFixedSizeSortedMapResult.isEmpty());
  }

  /**
   * Method under test: {@link FixedSizeSortedMap#isFull()}
   */
  @Test
  public void testIsFull() {
    // Arrange
    FixedSizeSortedMap<Object, Object> fixedSizeSortedMapResult = FixedSizeSortedMap
        .fixedSizeSortedMap(new TreeMap<>());

    // Act and Assert
    assertTrue(fixedSizeSortedMapResult.isFull());
  }

  /**
   * Method under test: {@link FixedSizeSortedMap#FixedSizeSortedMap(SortedMap)}
   */
  @Test
  public void testNewFixedSizeSortedMap() {
    // Arrange and Act
    FixedSizeSortedMap<Object, Object> actualObjectObjectMap = new FixedSizeSortedMap<>(new TreeMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
