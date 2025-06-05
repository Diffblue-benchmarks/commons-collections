package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedSizeSortedMapDiffblueTest {
  /**
   * Test {@link FixedSizeSortedMap#fixedSizeSortedMap(SortedMap)}.
   * <p>
   * Method under test: {@link FixedSizeSortedMap#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test fixedSizeSortedMap(SortedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FixedSizeSortedMap FixedSizeSortedMap.fixedSizeSortedMap(SortedMap)"})
  void testFixedSizeSortedMap() {
    // Arrange and Act
    FixedSizeSortedMap<Object, Object> actualFixedSizeSortedMapResult = FixedSizeSortedMap
        .fixedSizeSortedMap(new TreeMap<>());

    // Assert
    assertEquals(actualFixedSizeSortedMapResult.map, actualFixedSizeSortedMapResult);
  }

  /**
   * Test {@link FixedSizeSortedMap#FixedSizeSortedMap(SortedMap)}.
   * <p>
   * Method under test: {@link FixedSizeSortedMap#FixedSizeSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test new FixedSizeSortedMap(SortedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FixedSizeSortedMap.<init>(SortedMap)"})
  void testNewFixedSizeSortedMap() {
    // Arrange and Act
    FixedSizeSortedMap<Object, Object> actualObjectObjectMap = new FixedSizeSortedMap<>(new TreeMap<>());

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link FixedSizeSortedMap#isFull()}.
   * <p>
   * Method under test: {@link FixedSizeSortedMap#isFull()}
   */
  @Test
  @DisplayName("Test isFull()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FixedSizeSortedMap.isFull()"})
  void testIsFull() {
    // Arrange
    FixedSizeSortedMap<Object, Object> fixedSizeSortedMapResult = FixedSizeSortedMap
        .fixedSizeSortedMap(new TreeMap<>());

    // Act and Assert
    assertTrue(fixedSizeSortedMapResult.isFull());
  }
}
