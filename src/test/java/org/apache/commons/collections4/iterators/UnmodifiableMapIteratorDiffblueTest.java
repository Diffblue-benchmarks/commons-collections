package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableMapIteratorDiffblueTest {
  /**
   * Test {@link UnmodifiableMapIterator#unmodifiableMapIterator(MapIterator)}.
   * <ul>
   *   <li>Then return {@link UnmodifiableMapIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMapIterator#unmodifiableMapIterator(MapIterator)}
   */
  @Test
  @DisplayName("Test unmodifiableMapIterator(MapIterator); then return UnmodifiableMapIterator")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MapIterator UnmodifiableMapIterator.unmodifiableMapIterator(MapIterator)"})
  void testUnmodifiableMapIterator_thenReturnUnmodifiableMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualUnmodifiableMapIteratorResult = UnmodifiableMapIterator.unmodifiableMapIterator(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>())));

    // Assert
    assertTrue(actualUnmodifiableMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualUnmodifiableMapIteratorResult.hasNext());
  }
}
