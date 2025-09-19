package org.apache.commons.collections4.multimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArrayListValuedHashMapDiffblueTest {
  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   *
   * <p>Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}
   */
  @Test
  @DisplayName("Test new ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>()"})
  void testNewArrayListValuedHashMap() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap =
        new ArrayListValuedHashMap<>();

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int)}.
   *
   * <p>Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedHashMap(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(int)"})
  void testNewArrayListValuedHashMap2() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap =
        new ArrayListValuedHashMap<>(1);

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int, int)}.
   *
   * <p>Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int, int)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedHashMap(int, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(int, int)"})
  void testNewArrayListValuedHashMap3() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap =
        new ArrayListValuedHashMap<>(1, 1);

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return Map size is one.
   * </ul>
   *
   * <p>Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new ArrayListValuedHashMap(Map); given '42'; when HashMap() '42' is '42'; then return Map size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(Map)"})
  void testNewArrayListValuedHashMap_given42_whenHashMap42Is42_thenReturnMapSizeIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap =
        new ArrayListValuedHashMap<>(map);

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
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>Then return {@link HashSetValuedHashMap#HashSetValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName(
      "Test new ArrayListValuedHashMap(MultiValuedMap); then return HashSetValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(MultiValuedMap)"})
  void testNewArrayListValuedHashMap_thenReturnHashSetValuedHashMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap =
        new ArrayListValuedHashMap<>(map);

    // Assert
    assertEquals(map, actualArrayListValuedHashMap);
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>Then return Map size is one.
   * </ul>
   *
   * <p>Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedHashMap(MultiValuedMap); then return Map size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(MultiValuedMap)"})
  void testNewArrayListValuedHashMap_thenReturnMapSizeIsOne() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap =
        new ArrayListValuedHashMap<>(map);

    // Assert
    Map<Object, List<Object>> map2 = actualArrayListValuedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("Key");
    assertEquals(1, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals(1, actualArrayListValuedHashMap.size());
    assertFalse(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedHashMap(MultiValuedMap); when ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(MultiValuedMap)"})
  void testNewArrayListValuedHashMap_whenArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap =
        new ArrayListValuedHashMap<>(map);

    // Assert
    assertEquals(map, actualArrayListValuedHashMap);
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedHashMap(Map); when HashMap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(Map)"})
  void testNewArrayListValuedHashMap_whenHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap =
        new ArrayListValuedHashMap<>(new HashMap<>());

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#createCollection()}.
   *
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ArrayListValuedHashMap#createCollection()}
   */
  @Test
  @DisplayName("Test createCollection(); given ArrayListValuedHashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.ArrayList ArrayListValuedHashMap.createCollection()"})
  void testCreateCollection_givenArrayListValuedHashMap_thenReturnEmpty() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.createCollection().isEmpty());
  }
}
