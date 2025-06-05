package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedBidiMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableOrderedBidiMapDiffblueTest {
  /**
   * Test {@link UnmodifiableOrderedBidiMap#unmodifiableOrderedBidiMap(OrderedBidiMap)}.
   * <p>
   * Method under test: {@link UnmodifiableOrderedBidiMap#unmodifiableOrderedBidiMap(OrderedBidiMap)}
   */
  @Test
  @DisplayName("Test unmodifiableOrderedBidiMap(OrderedBidiMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"OrderedBidiMap UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(OrderedBidiMap)"})
  void testUnmodifiableOrderedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> map = new DualTreeBidiMap<>();

    // Act
    OrderedBidiMap<Object, Object> actualUnmodifiableOrderedBidiMapResult = UnmodifiableOrderedBidiMap
        .unmodifiableOrderedBidiMap(map);

    // Assert
    assertEquals(map, actualUnmodifiableOrderedBidiMapResult);
  }
}
