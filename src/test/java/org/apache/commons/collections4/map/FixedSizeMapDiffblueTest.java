package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedSizeMapDiffblueTest {
  /**
   * Test {@link FixedSizeMap#fixedSizeMap(Map)}.
   *
   * <p>Method under test: {@link FixedSizeMap#fixedSizeMap(Map)}
   */
  @Test
  @DisplayName("Test fixedSizeMap(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedSizeMap FixedSizeMap.fixedSizeMap(Map)"})
  void testFixedSizeMap() {
    // Arrange and Act
    FixedSizeMap<Object, Object> actualFixedSizeMapResult =
        FixedSizeMap.fixedSizeMap(new HashMap<>());

    // Assert
    Map<Object, Object> expectedFixedSizeMapResult = actualFixedSizeMapResult.map;
    assertEquals(expectedFixedSizeMapResult, actualFixedSizeMapResult);
  }

  /**
   * Test {@link FixedSizeMap#FixedSizeMap(Map)}.
   *
   * <p>Method under test: {@link FixedSizeMap#FixedSizeMap(Map)}
   */
  @Test
  @DisplayName("Test new FixedSizeMap(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedSizeMap.<init>(Map)"})
  void testNewFixedSizeMap() {
    // Arrange and Act
    FixedSizeMap<Object, Object> actualObjectObjectMap = new FixedSizeMap<>(new HashMap<>());

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link FixedSizeMap#isFull()}.
   *
   * <p>Method under test: {@link FixedSizeMap#isFull()}
   */
  @Test
  @DisplayName("Test isFull()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FixedSizeMap.isFull()"})
  void testIsFull() {
    // Arrange
    FixedSizeMap<Object, Object> fixedSizeMapResult = FixedSizeMap.fixedSizeMap(new HashMap<>());

    // Act and Assert
    assertTrue(fixedSizeMapResult.isFull());
  }

  /**
   * Test {@link FixedSizeMap#put(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link FixedSizeMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object); given HashMap() NULL is NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FixedSizeMap.put(Object, Object)"})
  void testPut_givenHashMapNullIsNull_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    FixedSizeMap<Object, Object> objectObjectMap = new FixedSizeMap<>(map);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualPutResult = objectObjectMap.put(AbstractHashedMap.NULL, object);

    // Assert
    assertSame(object, actualPutResult);
  }

  /**
   * Test {@link FixedSizeMap#put(Object, Object)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FixedSizeMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FixedSizeMap.put(Object, Object)"})
  void testPut_thenThrowIllegalArgumentException() {
    // Arrange
    FixedSizeMap<Object, Object> objectObjectMap = new FixedSizeMap<>(new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }
}
