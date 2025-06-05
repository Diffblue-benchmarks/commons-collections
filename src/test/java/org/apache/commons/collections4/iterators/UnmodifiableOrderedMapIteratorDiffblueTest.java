package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableOrderedMapIteratorDiffblueTest {
  /**
   * Test {@link UnmodifiableOrderedMapIterator#unmodifiableOrderedMapIterator(OrderedMapIterator)}.
   * <ul>
   *   <li>Then return {@link UnmodifiableOrderedMapIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableOrderedMapIterator#unmodifiableOrderedMapIterator(OrderedMapIterator)}
   */
  @Test
  @DisplayName("Test unmodifiableOrderedMapIterator(OrderedMapIterator); then return UnmodifiableOrderedMapIterator")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "OrderedMapIterator UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(OrderedMapIterator)"})
  void testUnmodifiableOrderedMapIterator_thenReturnUnmodifiableOrderedMapIterator() {
    // Arrange and Act
    OrderedMapIterator<Object, Object> actualUnmodifiableOrderedMapIteratorResult = UnmodifiableOrderedMapIterator
        .unmodifiableOrderedMapIterator(new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Assert
    assertTrue(actualUnmodifiableOrderedMapIteratorResult instanceof UnmodifiableOrderedMapIterator);
    assertFalse(actualUnmodifiableOrderedMapIteratorResult.hasNext());
  }
}
