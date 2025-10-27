package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.BidiMap;
import org.junit.Test;

public class DualHashBidiMapDiffblueTest {
  /**
   * Method under test: {@link DualHashBidiMap#createBidiMap(Map, Map, BidiMap)}
   */
  @Test
  public void testCreateBidiMap() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.createBidiMap(normalMap, reverseMap, new DualHashBidiMap<>()).isEmpty());
  }

  /**
   * Method under test: {@link DualHashBidiMap#DualHashBidiMap()}
   */
  @Test
  public void testNewDualHashBidiMap() {
    // Arrange and Act
    DualHashBidiMap<Object, Object> actualObjectObjectMap = new DualHashBidiMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link DualHashBidiMap#DualHashBidiMap(Map, Map, BidiMap)}
   *   <li>{@link DualHashBidiMap#DualHashBidiMap()}
   * </ul>
   */
  @Test
  public void testNewDualHashBidiMap2() {
    // Arrange
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act
    DualHashBidiMap<Object, Object> actualObjectObjectMap = new DualHashBidiMap<>(normalMap, reverseMap,
        new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link DualHashBidiMap#DualHashBidiMap(Map)}
   */
  @Test
  public void testNewDualHashBidiMap3() {
    // Arrange and Act
    DualHashBidiMap<Object, Object> actualObjectObjectMap = new DualHashBidiMap<>(new HashMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
