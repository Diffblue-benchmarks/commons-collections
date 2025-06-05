package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableOrderedMapDiffblueTest {
  /**
   * Test {@link UnmodifiableOrderedMap#unmodifiableOrderedMap(OrderedMap)}.
   * <p>
   * Method under test: {@link UnmodifiableOrderedMap#unmodifiableOrderedMap(OrderedMap)}
   */
  @Test
  @DisplayName("Test unmodifiableOrderedMap(OrderedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"OrderedMap UnmodifiableOrderedMap.unmodifiableOrderedMap(OrderedMap)"})
  void testUnmodifiableOrderedMap() {
    // Arrange and Act
    OrderedMap<Object, Object> actualUnmodifiableOrderedMapResult = UnmodifiableOrderedMap
        .unmodifiableOrderedMap(new DualTreeBidiMap<>());

    // Assert
    assertEquals(((AbstractMapDecorator<?, ?>) actualUnmodifiableOrderedMapResult).map,
        actualUnmodifiableOrderedMapResult);
  }
}
