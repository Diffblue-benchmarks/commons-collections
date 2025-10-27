package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.Test;

public class LazySortedMapDiffblueTest {
  /**
   * Method under test: {@link LazySortedMap#lazySortedMap(SortedMap, Factory)}
   */
  @Test
  public void testLazySortedMap() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();

    // Act
    LazySortedMap<Object, Object> actualLazySortedMapResult = LazySortedMap.lazySortedMap(map,
        new ConstantFactory<>(AbstractHashedMap.NULL));

    // Assert
    assertTrue(actualLazySortedMapResult.isEmpty());
  }

  /**
   * Method under test: {@link LazySortedMap#LazySortedMap(SortedMap, Factory)}
   */
  @Test
  public void testNewLazySortedMap() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();

    // Act
    LazySortedMap<Object, Object> actualObjectObjectMap = new LazySortedMap<>(map,
        new ConstantFactory<>(AbstractHashedMap.NULL));

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
