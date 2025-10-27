package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.Test;

public class LinkedHashSetValuedLinkedHashMapDiffblueTest {
  /**
   * Method under test:
   * {@link LinkedHashSetValuedLinkedHashMap#createCollection()}
   */
  @Test
  public void testCreateCollection() {
    // Arrange
    LinkedHashSetValuedLinkedHashMap<Object, Object> linkedHashSetValuedLinkedHashMap = new LinkedHashSetValuedLinkedHashMap<>();

    // Act and Assert
    assertTrue(linkedHashSetValuedLinkedHashMap.createCollection().isEmpty());
  }

  /**
   * Method under test:
   * {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap()}
   */
  @Test
  public void testNewLinkedHashSetValuedLinkedHashMap() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap = new LinkedHashSetValuedLinkedHashMap<>();

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int)}
   */
  @Test
  public void testNewLinkedHashSetValuedLinkedHashMap2() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap = new LinkedHashSetValuedLinkedHashMap<>(
        1);

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int, int)}
   */
  @Test
  public void testNewLinkedHashSetValuedLinkedHashMap3() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap = new LinkedHashSetValuedLinkedHashMap<>(
        1, 1);

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}
   */
  @Test
  public void testNewLinkedHashSetValuedLinkedHashMap4() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap = new LinkedHashSetValuedLinkedHashMap<>(
        new HashMap<>());

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}
   */
  @Test
  public void testNewLinkedHashSetValuedLinkedHashMap5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap = new LinkedHashSetValuedLinkedHashMap<>(
        map);

    // Assert
    Map<Object, Set<Object>> map2 = actualLinkedHashSetValuedLinkedHashMap.getMap();
    assertEquals(1, map2.size());
    assertEquals(1, map2.get("42").size());
    assertEquals(1, actualLinkedHashSetValuedLinkedHashMap.size());
    assertFalse(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewLinkedHashSetValuedLinkedHashMap6() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new LinkedHashSetValuedLinkedHashMap<>(map));
  }

  /**
   * Method under test:
   * {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewLinkedHashSetValuedLinkedHashMap7() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new LinkedHashSetValuedLinkedHashMap<>(map));
  }

  /**
   * Method under test:
   * {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewLinkedHashSetValuedLinkedHashMap8() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(map, new LinkedHashSetValuedLinkedHashMap<>(map));
  }
}
