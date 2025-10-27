package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.Test;

public class ArrayListValuedHashMapDiffblueTest {
  /**
   * Method under test: {@link ArrayListValuedHashMap#createCollection()}
   */
  @Test
  public void testCreateCollection() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.createCollection().isEmpty());
  }

  /**
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}
   */
  @Test
  public void testNewArrayListValuedHashMap() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int)}
   */
  @Test
  public void testNewArrayListValuedHashMap2() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(1);

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int, int)}
   */
  @Test
  public void testNewArrayListValuedHashMap3() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(1, 1);

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}
   */
  @Test
  public void testNewArrayListValuedHashMap4() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(new HashMap<>());

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}
   */
  @Test
  public void testNewArrayListValuedHashMap5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(map);

    // Assert
    Map<Object, List<Object>> map2 = actualArrayListValuedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("42");
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
    assertEquals(1, actualArrayListValuedHashMap.size());
    assertFalse(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewArrayListValuedHashMap6() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedHashMap<>(map));
  }

  /**
   * Method under test:
   * {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewArrayListValuedHashMap7() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedHashMap<>(map));
  }

  /**
   * Method under test:
   * {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}
   */
  @Test
  public void testNewArrayListValuedHashMap8() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(map);

    // Assert
    Map<Object, List<Object>> map2 = actualArrayListValuedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("Key");
    assertEquals(1, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals(1, actualArrayListValuedHashMap.size());
    assertFalse(actualArrayListValuedHashMap.isEmpty());
  }
}
