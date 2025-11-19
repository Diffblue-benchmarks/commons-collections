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

class LinkedHashSetValuedLinkedHashMapDiffblueTest {
  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap()}.
   *
   * <p>Method under test: {@link
   * LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap()}
   */
  @Test
  @DisplayName("Test new LinkedHashSetValuedLinkedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>()"})
  void testNewLinkedHashSetValuedLinkedHashMap() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap =
        new LinkedHashSetValuedLinkedHashMap<>();

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int)}.
   *
   * <p>Method under test: {@link
   * LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int)}
   */
  @Test
  @DisplayName("Test new LinkedHashSetValuedLinkedHashMap(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(int)"})
  void testNewLinkedHashSetValuedLinkedHashMap2() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap =
        new LinkedHashSetValuedLinkedHashMap<>(1);

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int, int)}.
   *
   * <p>Method under test: {@link
   * LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(int, int)}
   */
  @Test
  @DisplayName("Test new LinkedHashSetValuedLinkedHashMap(int, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(int, int)"})
  void testNewLinkedHashSetValuedLinkedHashMap3() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap =
        new LinkedHashSetValuedLinkedHashMap<>(1, 1);

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>Then return Map size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new LinkedHashSetValuedLinkedHashMap(Map); given 'Key'; then return Map size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(Map)"})
  void testNewLinkedHashSetValuedLinkedHashMap_givenKey_thenReturnMapSizeIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap =
        new LinkedHashSetValuedLinkedHashMap<>(map);

    // Assert
    Map<Object, Set<Object>> map2 = actualLinkedHashSetValuedLinkedHashMap.getMap();
    assertEquals(1, map2.size());
    assertEquals(1, map2.get("Key").size());
    assertEquals(1, actualLinkedHashSetValuedLinkedHashMap.size());
    assertFalse(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>Then return {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName(
      "Test new LinkedHashSetValuedLinkedHashMap(MultiValuedMap); then return ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(MultiValuedMap)"})
  void testNewLinkedHashSetValuedLinkedHashMap_thenReturnArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap =
        new LinkedHashSetValuedLinkedHashMap<>(map);

    // Assert
    assertEquals(map, actualLinkedHashSetValuedLinkedHashMap);
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new LinkedHashSetValuedLinkedHashMap(Map); when HashMap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(Map)"})
  void testNewLinkedHashSetValuedLinkedHashMap_whenHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap =
        new LinkedHashSetValuedLinkedHashMap<>(new HashMap<>());

    // Assert
    assertEquals(0, actualLinkedHashSetValuedLinkedHashMap.size());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualLinkedHashSetValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName(
      "Test new LinkedHashSetValuedLinkedHashMap(MultiValuedMap); when HashSetValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(MultiValuedMap)"})
  void testNewLinkedHashSetValuedLinkedHashMap_whenHashSetValuedHashMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap =
        new LinkedHashSetValuedLinkedHashMap<>(map);

    // Assert
    assertEquals(map, actualLinkedHashSetValuedLinkedHashMap);
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName(
      "Test new LinkedHashSetValuedLinkedHashMap(MultiValuedMap); when HashSetValuedHashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedHashSetValuedLinkedHashMap.<init>(MultiValuedMap)"})
  void testNewLinkedHashSetValuedLinkedHashMap_whenHashSetValuedHashMapKeyIsValue() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    LinkedHashSetValuedLinkedHashMap<Object, Object> actualLinkedHashSetValuedLinkedHashMap =
        new LinkedHashSetValuedLinkedHashMap<>(map);

    // Assert
    assertEquals(map, actualLinkedHashSetValuedLinkedHashMap);
  }

  /**
   * Test {@link LinkedHashSetValuedLinkedHashMap#createCollection()}.
   *
   * <ul>
   *   <li>Given {@link LinkedHashSetValuedLinkedHashMap#LinkedHashSetValuedLinkedHashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHashSetValuedLinkedHashMap#createCollection()}
   */
  @Test
  @DisplayName(
      "Test createCollection(); given LinkedHashSetValuedLinkedHashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.LinkedHashSet LinkedHashSetValuedLinkedHashMap.createCollection()"})
  void testCreateCollection_givenLinkedHashSetValuedLinkedHashMap_thenReturnEmpty() {
    // Arrange
    LinkedHashSetValuedLinkedHashMap<Object, Object> linkedHashSetValuedLinkedHashMap =
        new LinkedHashSetValuedLinkedHashMap<>();

    // Act and Assert
    assertTrue(linkedHashSetValuedLinkedHashMap.createCollection().isEmpty());
  }
}
