package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.SortedBidiMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableSortedBidiMapDiffblueTest {
  /**
   * Test {@link UnmodifiableSortedBidiMap#unmodifiableSortedBidiMap(SortedBidiMap)}.
   * <p>
   * Method under test: {@link UnmodifiableSortedBidiMap#unmodifiableSortedBidiMap(SortedBidiMap)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedBidiMap(SortedBidiMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedBidiMap UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(SortedBidiMap)"})
  void testUnmodifiableSortedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> map = new DualTreeBidiMap<>();

    // Act
    SortedBidiMap<Object, Object> actualUnmodifiableSortedBidiMapResult = UnmodifiableSortedBidiMap
        .unmodifiableSortedBidiMap(map);

    // Assert
    assertEquals(map, actualUnmodifiableSortedBidiMapResult);
  }
}
