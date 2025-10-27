package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.BidiMap;
import org.junit.Test;

public class DualLinkedHashBidiMapDiffblueTest {
  /**
   * Method under test:
   * {@link DualLinkedHashBidiMap#createBidiMap(Map, Map, BidiMap)}
   */
  @Test
  public void testCreateBidiMap() {
    // Arrange
    DualLinkedHashBidiMap<Object, Object> objectObjectMap = new DualLinkedHashBidiMap<>();
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.createBidiMap(normalMap, reverseMap, new DualHashBidiMap<>()).isEmpty());
  }

  /**
   * Method under test: {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap()}
   */
  @Test
  public void testNewDualLinkedHashBidiMap() {
    // Arrange and Act
    DualLinkedHashBidiMap<Object, Object> actualObjectObjectMap = new DualLinkedHashBidiMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map, Map, BidiMap)}
   */
  @Test
  public void testNewDualLinkedHashBidiMap2() {
    // Arrange
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act
    DualLinkedHashBidiMap<Object, Object> actualObjectObjectMap = new DualLinkedHashBidiMap<>(normalMap, reverseMap,
        new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map)}
   */
  @Test
  public void testNewDualLinkedHashBidiMap3() {
    // Arrange and Act
    DualLinkedHashBidiMap<Object, Object> actualObjectObjectMap = new DualLinkedHashBidiMap<>(new HashMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
