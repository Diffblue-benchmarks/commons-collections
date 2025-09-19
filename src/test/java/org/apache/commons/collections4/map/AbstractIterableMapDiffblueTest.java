package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractIterableMapDiffblueTest {
  /**
   * Test {@link AbstractIterableMap#mapIterator()}.
   *
   * <p>Method under test: {@link AbstractIterableMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator AbstractIterableMap.mapIterator()"})
  void testMapIterator() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EntrySetToMapIteratorAdapter);
    assertFalse(actualMapIteratorResult.hasNext());
  }
}
