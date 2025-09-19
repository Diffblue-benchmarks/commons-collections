package org.apache.commons.collections4.multimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HashSetValuedHashMapDiffblueTest {
  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap()}.
   *
   * <p>Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap()}
   */
  @Test
  @DisplayName("Test new HashSetValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>()"})
  void testNewHashSetValuedHashMap() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(int)}.
   *
   * <p>Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(int)}
   */
  @Test
  @DisplayName("Test new HashSetValuedHashMap(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(int)"})
  void testNewHashSetValuedHashMap2() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap = new HashSetValuedHashMap<>(1);

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(int, int)}.
   *
   * <p>Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(int, int)}
   */
  @Test
  @DisplayName("Test new HashSetValuedHashMap(int, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(int, int)"})
  void testNewHashSetValuedHashMap3() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap =
        new HashSetValuedHashMap<>(1, 1);

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return Map size is one.
   * </ul>
   *
   * <p>Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new HashSetValuedHashMap(Map); given '42'; when HashMap() '42' is '42'; then return Map size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(Map)"})
  void testNewHashSetValuedHashMap_given42_whenHashMap42Is42_thenReturnMapSizeIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap =
        new HashSetValuedHashMap<>(map);

    // Assert
    Map<Object, Set<Object>> map2 = actualHashSetValuedHashMap.getMap();
    assertEquals(1, map2.size());
    assertEquals(1, map2.get("42").size());
    assertEquals(1, actualHashSetValuedHashMap.size());
    assertFalse(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>Then return {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName(
      "Test new HashSetValuedHashMap(MultiValuedMap); then return ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(MultiValuedMap)"})
  void testNewHashSetValuedHashMap_thenReturnArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap =
        new HashSetValuedHashMap<>(map);

    // Assert
    assertEquals(map, actualHashSetValuedHashMap);
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(Map)}
   */
  @Test
  @DisplayName("Test new HashSetValuedHashMap(Map); when HashMap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(Map)"})
  void testNewHashSetValuedHashMap_whenHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap =
        new HashSetValuedHashMap<>(new HashMap<>());

    // Assert
    assertEquals(0, actualHashSetValuedHashMap.size());
    assertTrue(actualHashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualHashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test new HashSetValuedHashMap(MultiValuedMap); when HashSetValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(MultiValuedMap)"})
  void testNewHashSetValuedHashMap_whenHashSetValuedHashMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap =
        new HashSetValuedHashMap<>(map);

    // Assert
    assertEquals(map, actualHashSetValuedHashMap);
  }

  /**
   * Test {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link HashSetValuedHashMap#HashSetValuedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName(
      "Test new HashSetValuedHashMap(MultiValuedMap); when HashSetValuedHashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashSetValuedHashMap.<init>(MultiValuedMap)"})
  void testNewHashSetValuedHashMap_whenHashSetValuedHashMapKeyIsValue() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    HashSetValuedHashMap<Object, Object> actualHashSetValuedHashMap =
        new HashSetValuedHashMap<>(map);

    // Assert
    assertEquals(map, actualHashSetValuedHashMap);
  }

  /**
   * Test {@link HashSetValuedHashMap#createCollection()}.
   *
   * <ul>
   *   <li>Given {@link HashSetValuedHashMap#HashSetValuedHashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link HashSetValuedHashMap#createCollection()}
   */
  @Test
  @DisplayName("Test createCollection(); given HashSetValuedHashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.HashSet HashSetValuedHashMap.createCollection()"})
  void testCreateCollection_givenHashSetValuedHashMap_thenReturnEmpty() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.createCollection().isEmpty());
  }
}
