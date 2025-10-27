package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.Test;

public class HashSetValuedHashMapDiffblueTest {
  /**
   * Method under test: {@link HashSetValuedHashMap#createCollection()}
   */
  @Test
  public void testCreateCollection() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.createCollection().isEmpty());
  }

  /**
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap()}
   */
  @Test
  public void testNewHashSetValuedHashMap() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(int)}
   */
  @Test
  public void testNewHashSetValuedHashMap2() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>(1);

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link HashSetValuedHashMap#HashSetValuedHashMap(int, int)}
   */
  @Test
  public void testNewHashSetValuedHashMap3() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>(1, 1);

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}
   */
  @Test
  public void testNewHashSetValuedHashMap4() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>(new HashMap<>());

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}
   */
  @Test
  public void testNewHashSetValuedHashMap5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>(map);

    // Assert
    Map<Object, Set<Object>> map2 = actualHashSetValuedHashMap.getMap();
    assertEquals(1, map2.size());
    assertEquals(1, map2.get("42").size());
    assertEquals(1, actualHashSetValuedHashMap.size());
    assertFalse(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewHashSetValuedHashMap6() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new HashSetValuedHashMap<>(map));
  }

  /**
   * Method under test:
   * {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewHashSetValuedHashMap7() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new HashSetValuedHashMap<>(map));
  }

  /**
   * Method under test:
   * {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewHashSetValuedHashMap8() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(map, new HashSetValuedHashMap<>(map));
  }
}
