package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HashedMapDiffblueTest {
  /**
   * Method under test: {@link HashedMap#HashedMap()}
   */
  @Test
  public void testNewHashedMap() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link HashedMap#HashedMap(int)}
   */
  @Test
  public void testNewHashedMap2() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>(1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link HashedMap#HashedMap(int, float)}
   */
  @Test
  public void testNewHashedMap3() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>(1, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
