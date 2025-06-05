package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableSortedMapDiffblueTest {
  /**
   * Test {@link UnmodifiableSortedMap#unmodifiableSortedMap(SortedMap)}.
   * <p>
   * Method under test: {@link UnmodifiableSortedMap#unmodifiableSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedMap(SortedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedMap UnmodifiableSortedMap.unmodifiableSortedMap(SortedMap)"})
  void testUnmodifiableSortedMap() {
    // Arrange and Act
    SortedMap<Object, Object> actualUnmodifiableSortedMapResult = UnmodifiableSortedMap
        .unmodifiableSortedMap(new TreeMap<>());

    // Assert
    assertEquals(((AbstractMapDecorator<?, ?>) actualUnmodifiableSortedMapResult).map,
        actualUnmodifiableSortedMapResult);
  }
}
