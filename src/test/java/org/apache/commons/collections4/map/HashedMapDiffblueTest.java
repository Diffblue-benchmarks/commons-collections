package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HashedMapDiffblueTest {
  /**
   * Test {@link HashedMap#HashedMap()}.
   * <p>
   * Method under test: {@link HashedMap#HashedMap()}
   */
  @Test
  @DisplayName("Test new HashedMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void HashedMap.<init>()"})
  void testNewHashedMap() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link HashedMap#HashedMap(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashedMap#HashedMap(int)}
   */
  @Test
  @DisplayName("Test new HashedMap(int); when one; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void HashedMap.<init>(int)"})
  void testNewHashedMap_whenOne_thenReturnEmpty() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>(1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link HashedMap#HashedMap(int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashedMap#HashedMap(int, float)}
   */
  @Test
  @DisplayName("Test new HashedMap(int, float); when ten; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void HashedMap.<init>(int, float)"})
  void testNewHashedMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>(1, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link HashedMap#HashedMap(int, float)}.
   * <ul>
   *   <li>When two.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashedMap#HashedMap(int, float)}
   */
  @Test
  @DisplayName("Test new HashedMap(int, float); when two; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void HashedMap.<init>(int, float)"})
  void testNewHashedMap_whenTwo_thenReturnEmpty() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>(2, 1.0E-5f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
