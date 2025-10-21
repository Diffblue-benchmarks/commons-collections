package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LinkedHashSetValuedLinkedHashMapDiffblueTest {
  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap()}.
   * <p>
   * Method under test: {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>()"})
  public void testNewLinkedHashSetValuedLinkedHashMap() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap = new LinkedHashSetValuedLinkedHashMap<>();

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int)}.
   * <p>
   * Method under test: {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(int)"})
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
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int, int)}.
   * <p>
   * Method under test: {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(int, int)"})
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
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(Map)"})
  public void testNewLinkedHashSetValuedLinkedHashMap_given42_thenReturnMapSizeIsOne() {
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
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>Then return {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(MultiValuedMap)"})
  public void testNewLinkedHashSetValuedLinkedHashMap_thenReturnArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new LinkedHashSetValuedLinkedHashMap<>(map));
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(Map)"})
  public void testNewLinkedHashSetValuedLinkedHashMap_whenHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap = new LinkedHashSetValuedLinkedHashMap<>(
        new HashMap<>());

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(MultiValuedMap)"})
  public void testNewLinkedHashSetValuedLinkedHashMap_whenHashSetValuedHashMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new LinkedHashSetValuedLinkedHashMap<>(map));
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()} {@code Key} is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(MultiValuedMap)"})
  public void testNewLinkedHashSetValuedLinkedHashMap_whenHashSetValuedHashMapKeyIsValue() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(map, new LinkedHashSetValuedLinkedHashMap<>(map));
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#createCollection()}.
   * <ul>
   *   <li>Given {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedHashSetValuedLinkedHashMap#createCollection()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.LinkedHashSet LinkedHashSetValuedLinkedHashMap.createCollection()"})
  public void testCreateCollection_givenLinkedHashSetValuedLinkedHashMap_thenReturnEmpty() {
    // Arrange
    LinkedHashSetValuedLinkedHashMap<Object, Object> linkedHashSetValuedLinkedHashMap = new LinkedHashSetValuedLinkedHashMap<>();

    // Act and Assert
    assertTrue(linkedHashSetValuedLinkedHashMap.createCollection().isEmpty());
  }
}
