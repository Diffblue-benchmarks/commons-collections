package org.apache.commons.collections4.multimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArrayListValuedLinkedHashMapDiffblueTest {
  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap()}.
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap()}
   */
  @Test
  @DisplayName("Test new ArrayListValuedLinkedHashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>()"})
  void testNewArrayListValuedLinkedHashMap() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>();

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int)}.
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedLinkedHashMap(int)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(int)"})
  void testNewArrayListValuedLinkedHashMap2() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        1);

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int, int)}.
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int, int)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedLinkedHashMap(int, int)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(int, int)"})
  void testNewArrayListValuedLinkedHashMap3() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        1, 1);

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedLinkedHashMap(Map); given '42'; then return Map size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(Map)"})
  void testNewArrayListValuedLinkedHashMap_given42_thenReturnMapSizeIsOne() {
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
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>Then return {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedLinkedHashMap(MultiValuedMap); then return HashSetValuedHashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(MultiValuedMap)"})
  void testNewArrayListValuedLinkedHashMap_thenReturnHashSetValuedHashMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedLinkedHashMap<>(map));
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>Then return Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedLinkedHashMap(MultiValuedMap); then return Map size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(MultiValuedMap)"})
  void testNewArrayListValuedLinkedHashMap_thenReturnMapSizeIsOne() {
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

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedLinkedHashMap(MultiValuedMap); when ArrayListValuedHashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(MultiValuedMap)"})
  void testNewArrayListValuedLinkedHashMap_whenArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedLinkedHashMap<>(map));
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}
   */
  @Test
  @DisplayName("Test new ArrayListValuedLinkedHashMap(Map); when HashMap(); then return size is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(Map)"})
  void testNewArrayListValuedLinkedHashMap_whenHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        new HashMap<>());

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#createCollection()}.
   * <ul>
   *   <li>Given {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#createCollection()}
   */
  @Test
  @DisplayName("Test createCollection(); given ArrayListValuedLinkedHashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.ArrayList ArrayListValuedLinkedHashMap.createCollection()"})
  void testCreateCollection_givenArrayListValuedLinkedHashMap_thenReturnEmpty() {
    // Arrange
    ArrayListValuedLinkedHashMap<Object, Object> arrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedLinkedHashMap.createCollection().isEmpty());
  }
}
