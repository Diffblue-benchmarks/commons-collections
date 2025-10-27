package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.Test;

public class ArrayListValuedLinkedHashMapDiffblueTest {
  /**
   * Method under test: {@link ArrayListValuedLinkedHashMap#createCollection()}
   */
  @Test
  public void testCreateCollection() {
    // Arrange
    ArrayListValuedLinkedHashMap<Object, Object> arrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedLinkedHashMap.createCollection().isEmpty());
  }

  /**
   * Method under test:
   * {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap()}
   */
  @Test
  public void testNewArrayListValuedLinkedHashMap() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>();

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int)}
   */
  @Test
  public void testNewArrayListValuedLinkedHashMap2() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        1);

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int, int)}
   */
  @Test
  public void testNewArrayListValuedLinkedHashMap3() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        1, 1);

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}
   */
  @Test
  public void testNewArrayListValuedLinkedHashMap4() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        new HashMap<>());

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}
   */
  @Test
  public void testNewArrayListValuedLinkedHashMap5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        map);

    // Assert
    Map<Object, List<Object>> map2 = actualArrayListValuedLinkedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("42");
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
    assertEquals(1, actualArrayListValuedLinkedHashMap.size());
    assertFalse(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewArrayListValuedLinkedHashMap6() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedLinkedHashMap<>(map));
  }

  /**
   * Method under test:
   * {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewArrayListValuedLinkedHashMap7() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedLinkedHashMap<>(map));
  }

  /**
   * Method under test:
   * {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewArrayListValuedLinkedHashMap8() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        map);

    // Assert
    Map<Object, List<Object>> map2 = actualArrayListValuedLinkedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("Key");
    assertEquals(1, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals(1, actualArrayListValuedLinkedHashMap.size());
    assertFalse(actualArrayListValuedLinkedHashMap.isEmpty());
  }
}
