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

public class HashSetValuedHashMapDiffblueTest {
  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap()}.
   * <p>
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>()"})
  public void testNewHashSetValuedHashMap() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(int)}.
   * <p>
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(int)"})
  public void testNewHashSetValuedHashMap2() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>(1);

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(int, int)}.
   * <p>
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(int, int)"})
  public void testNewHashSetValuedHashMap3() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>(1, 1);

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(Map)"})
  public void testNewHashSetValuedHashMap_given42_whenHashMap42Is42_thenReturnMapSizeIsOne() {
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
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>Then return {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(MultiValuedMap)"})
  public void testNewHashSetValuedHashMap_thenReturnArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new HashSetValuedHashMap<>(map));
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(Map)"})
  public void testNewHashSetValuedHashMap_whenHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>(new HashMap<>());

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(MultiValuedMap)"})
  public void testNewHashSetValuedHashMap_whenHashSetValuedHashMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new HashSetValuedHashMap<>(map));
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()} {@code Key} is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(MultiValuedMap)"})
  public void testNewHashSetValuedHashMap_whenHashSetValuedHashMapKeyIsValue() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(map, new HashSetValuedHashMap<>(map));
  }

  /**
   * Test {@link HashSetValuedHashMap#createCollection()}.
   * <ul>
   *   <li>Given {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashSetValuedHashMap#createCollection()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.HashSet HashSetValuedHashMap.createCollection()"})
  public void testCreateCollection_givenHashSetValuedHashMap_thenReturnEmpty() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.createCollection().isEmpty());
  }
}
