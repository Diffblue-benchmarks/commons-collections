package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedSizeSortedMapDiffblueTest {
  /**
   * Test {@link FixedSizeSortedMap#fixedSizeSortedMap(SortedMap)}.
   *
   * <p>Method under test: {@link FixedSizeSortedMap#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test fixedSizeSortedMap(SortedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedSizeSortedMap FixedSizeSortedMap.fixedSizeSortedMap(SortedMap)"})
  void testFixedSizeSortedMap() {
    // Arrange and Act
    FixedSizeSortedMap<Object, Object> actualFixedSizeSortedMapResult =
        FixedSizeSortedMap.fixedSizeSortedMap(new TreeMap<>());

    // Assert
    Map<Object, Object> expectedFixedSizeSortedMapResult = actualFixedSizeSortedMapResult.map;
    assertEquals(expectedFixedSizeSortedMapResult, actualFixedSizeSortedMapResult);
  }

  /**
   * Test {@link FixedSizeSortedMap#FixedSizeSortedMap(SortedMap)}.
   *
   * <p>Method under test: {@link FixedSizeSortedMap#FixedSizeSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test new FixedSizeSortedMap(SortedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedSizeSortedMap.<init>(SortedMap)"})
  void testNewFixedSizeSortedMap() {
    // Arrange and Act
    FixedSizeSortedMap<Object, Object> actualObjectObjectMap =
        new FixedSizeSortedMap<>(new TreeMap<>());

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link FixedSizeSortedMap#isFull()}.
   *
   * <p>Method under test: {@link FixedSizeSortedMap#isFull()}
   */
  @Test
  @DisplayName("Test isFull()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FixedSizeSortedMap.isFull()"})
  void testIsFull() {
    // Arrange
    FixedSizeSortedMap<Object, Object> fixedSizeSortedMapResult =
        FixedSizeSortedMap.fixedSizeSortedMap(new TreeMap<>());

    // Act and Assert
    assertTrue(fixedSizeSortedMapResult.isFull());
  }
}
